/*
 * Copyright 2015 Bay of Many
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 * This project is derived from code in the TinkerPop project under the following license:
 *
 *    TinkerPop3
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package peapod.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * <p>Optional annotation to define an alternate name for vertex and edge properties.</p>
 * <p>The value must only be specified once for each group of methods that share the same JavaBean property name.
 * Abstraction is made of the singular and plural form, e.g. the methods {@code getName}, {@code setName}, {@code addName},
 * {@code removeName} and {@code getNames} all belong to the same method group.</p>
 * <pre>
 *     &#64;Property("name")
 *     public abstract String getLastName();
 *     public abstract void setLastName(String name);
 * </pre>
 *
 * @author Willem Salembier
 * @since 0.1
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Property {

    String value() default "";

}
