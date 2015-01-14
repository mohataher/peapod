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
 * This project is derived from code in the Tinkerpop project under the following license:
 *
 *    Tinkerpop3
 *    http://www.apache.org/licenses/LICENSE-2.0
 */

package peapod.linkedvertex;

import peapod.FramedVertex;
import peapod.annotations.LinkedVertex;
import peapod.annotations.Vertex;

import java.util.List;

import static peapod.Direction.*;

/**
 * Test class to check @LinkedVertex constructs.
 * Created by Willem on 2/01/2015.
 */
@Vertex
public abstract class Person implements FramedVertex {

    public abstract String getName();

    public abstract List<Person> getFriends();

    @LinkedVertex(label = "friend")
    public abstract List<Person> getFriendsWithAnnotationDefault();

    @LinkedVertex(label = "friend", direction = OUT)
    public abstract List<Person> getFriendsWithAnnotationOut();

    @LinkedVertex(label = "friend", direction = IN)
    public abstract List<Person> getFriendsWithAnnotationIn();

    @LinkedVertex(label = "friend", direction = BOTH)
    public abstract List<Person> getFriendsWithAnnotationBoth();

}
