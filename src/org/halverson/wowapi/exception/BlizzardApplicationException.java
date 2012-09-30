/*
 * Copyright (c) 2011 Chris D. Halverson <cdh@halverson.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.halverson.wowapi.exception;

/**
 * Exception used for 5xx errors. These are application level errors.
 *
 */
public class BlizzardApplicationException extends WowApiException {
    public BlizzardApplicationException() {
    }

    public BlizzardApplicationException(String message) {
        super(message);
    }

    public BlizzardApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlizzardApplicationException(Throwable cause) {
        super(cause);
    }
}
