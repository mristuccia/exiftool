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
import com.thebuzzmedia.exiftool.Constants;
import com.thebuzzmedia.exiftool.commons.lang.ToStringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.thebuzzmedia.exiftool.commons.lang.PreConditions.notNull;

/**
 *
 * @author marco
 */
public final class UnspecifiedArgument implements Argument
{
    // the argument name and value as string
    private final String argumentAndValue;

    // the argument and value as string list
    private final List<String> argumentAndValueList;

    /**
     * The argument name and its value must be separated by the standard separator.
     * Only the first two items are parsed, all the others will be skipped.
     *
     * @param argAndVal argument and value separated by the default separator
     */
    public UnspecifiedArgument(String argAndVal)
    {
        notNull(argAndVal, "argAndVal must not be null");

        this.argumentAndValue = argAndVal;
        this.argumentAndValueList = new ArrayList<>();

        String[] splitArgs = argAndVal.split(Constants.ARG_SEPARATOR);

        if (splitArgs.length > 0)
        {
            argumentAndValueList.add(splitArgs[0]);
        }

        if (splitArgs.length > 1)
        {
            argumentAndValueList.add(splitArgs[1]);
        }
    }

    @Override
    public List<String> getArgs()
    {
        return argumentAndValueList;
    }

    @Override
    public String toString() {
            return ToStringBuilder.create(getClass())
                            .append("argument and value", this.argumentAndValue)
                            .build();
    }

    @Override
    public boolean equals(Object o) {
            if (this == o) {
                    return true;
            }

            if (o instanceof UnspecifiedArgument) {
                    UnspecifiedArgument t = (UnspecifiedArgument) o;
                    return Objects.equals(this.argumentAndValue, t.argumentAndValue);
            }

            return false;
    }

    @Override
    public int hashCode() {
            return Objects.hash(this.argumentAndValue);
    }
}