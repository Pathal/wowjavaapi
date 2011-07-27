package org.halverson.wowapi.dao;

import com.google.gson.Gson;
import org.halverson.wowapi.connection.BlizzardApiConnection;
import org.halverson.wowapi.entity.Guild;
import org.halverson.wowapi.entity.GuildOptions;
import org.halverson.wowapi.entity.Region;
import org.halverson.wowapi.exception.CharacterNotFoundException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

@SuppressWarnings({"UnusedDeclaration"})
public class GuildDao {

    private final String GUILD_API_URL = "/api/wow/guild/%s/%s";
    private final String URL_BASE = "%s.battle.net";

    private Region region;

    public GuildDao() {
        this.region = Region.US;
    }

    public GuildDao(Region region) {
        this.region = region;
    }

    public Guild getGuild(Region region, String realm, String name) throws CharacterNotFoundException {

        return getGuild(region, realm, name, EnumSet.of(GuildOptions.BASE));
    }

    public Guild getGuild(String realm, String name) throws CharacterNotFoundException {
        return getGuild(region, realm, name, EnumSet.of(GuildOptions.BASE));
    }

    public Guild getGuild(String realm, String name, EnumSet<GuildOptions> options) throws CharacterNotFoundException {
        return getGuild(region, realm, name, options);
    }

    public Guild getGuild(String realm, String name, GuildOptions... options) throws CharacterNotFoundException {

        List<GuildOptions> o = Arrays.asList(options);
        return getGuild(region, realm, name, EnumSet.copyOf(o));
    }

    public Guild getGuild(Region region, String realm, String name, EnumSet<GuildOptions> options) throws CharacterNotFoundException {

        URI uri = null;
        try {
            uri = new URI("https", String.format(URL_BASE, region), String.format(GUILD_API_URL, realm, name), null);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        if(uri == null) {
            return null;
        }

        // We control the optional parts, and there aren't any issues with needing encoding
        String json = BlizzardApiConnection.getStringJSONFromRequest(uri.toString() + optionalQuery(options));
        System.out.println("JSON: " + json);
        Gson gson = new Gson();

        BlizzardErrorResponse errorResponse = gson.fromJson(json, BlizzardErrorResponse.class);

        if (!errorResponse.getStatus().equals("")) {
            // Would check for specific error here
            if("Character not found.".equals(errorResponse.getReason())) {
                throw new CharacterNotFoundException();
            }

        }

        return gson.fromJson(json, Guild.class);
    }

    private String optionalQuery(EnumSet<GuildOptions> options) {
        if (options.size() == 0 || (options.size() == 1) && options.contains(GuildOptions.BASE)) {
            return "";
        }

        List<String> strings = new ArrayList<String>();
        for (GuildOptions option : options) {
            strings.add(option.toString());
        }

        StringBuilder sb = new StringBuilder("?fields=");
        sb.append(join(strings, ","));
        return sb.toString();

    }

    // Just so I don't have to use another library
    private String join(Iterable<String> s, String delimiter) {
        if (s == null) return "";
        Iterator<String> iter = s.iterator();
        StringBuilder builder = new StringBuilder(iter.next());
        while (iter.hasNext()) {
            builder.append(delimiter).append(iter.next());
        }
        return builder.toString();
    }

    private static class BlizzardErrorResponse {
        private String status = "";
        private String reason = "";

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("BlizzardErrorResponse");
            sb.append("{status='").append(status).append('\'');
            sb.append(", reason='").append(reason).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
