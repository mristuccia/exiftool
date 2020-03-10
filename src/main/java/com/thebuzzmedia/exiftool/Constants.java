/**
 * Copyright 2011 The Buzz Media, LLC
 * Copyright 2015-2019 Mickael Jeanroy
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

package com.thebuzzmedia.exiftool;

/**
 * List of constants used with Exiftool.
 */
public final class Constants {

	// Ensure non instantiation.
	private Constants() {
	}

	/**
	 * Separator used to separate values.
	 * This separator should be enough to split values and be sure it is not
	 * reused anywhere.
	 */
	public static final String SEPARATOR = "|>☃";

	/**
	 * OS independent line break.
	 */
	public static final String BR = System.getProperty("line.separator");
        
        /**
         * Extra argument's separator
         */
        public static final String ARG_SEPARATOR = " ";
}
