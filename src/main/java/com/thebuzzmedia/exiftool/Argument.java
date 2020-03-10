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

package com.thebuzzmedia.exiftool;

import java.util.List;

/**
 * Interface used to define different input flags.
 *
 * @author Marco Ristuccia (it-services@marcoristuccia.com)
 * @author Mickael Jeanroy
 * @since 2.5.1
 */
public interface Argument {

	/**
	 * List of arguments to pass to {@code exiftool}.
	 * This method should not return {@code null}, but an empty list if no arguments
	 * should be returned.
	 *
	 * @return List of arguments.
	 */
        List<String> getArgs();
        
}
