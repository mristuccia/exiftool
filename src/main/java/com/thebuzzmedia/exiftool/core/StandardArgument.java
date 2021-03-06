/**
 * Copyright 2020 Marco Ristuccia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.thebuzzmedia.exiftool.core;

import com.thebuzzmedia.exiftool.Argument;
import static java.util.Collections.singletonList;
import java.util.List;

/**
 *
 * @author marco
 */
public enum StandardArgument implements Argument
{
    IGNORE_MINOR {
        @Override
        public List<String> getArgs() {
                return singletonList("-m");
        }
    },

    FORMAT_METADATA_AS_EXIFTOOL_ARGUMENTS {
        @Override
        public List<String> getArgs() {
                return singletonList("-args");
        }
    },

    EXTRACT_UNKNOWN_TAGS {
        @Override
        public List<String> getArgs() {
                return singletonList("-u");
        }
    },

    NO_PRINT_CONVERSION {
        @Override
        public List<String> getArgs() {
                return singletonList("-n");
        }
    };
}