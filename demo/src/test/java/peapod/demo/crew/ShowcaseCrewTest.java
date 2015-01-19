/*
 * Copyright 2015-Bay of Many
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
 * This project is derived from code in the Tinkerpop project under the following licenses:
 *
 * Tinkerpop3
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the TinkerPop nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL TINKERPOP BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package peapod.demo.crew;

import com.tinkerpop.gremlin.tinkergraph.structure.TinkerFactory;
import com.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.junit.Test;
import peapod.FramedGraph;

import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by Willem on 26/12/2014.
 */
public class ShowcaseCrewTest {

    @Test
    public void testGraph() {
        TinkerGraph g = TinkerFactory.createTheCrew();
        FramedGraph graph = new FramedGraph(g);

        Person marko = graph.v(1, Person.class);
        assertEquals("marko", marko.getName());

        Person stephen = graph.v(7, Person.class);
        assertEquals("stephen", stephen.getName());

        Person matthias = graph.v(8, Person.class);
        assertEquals("matthias", matthias.getName());

        Person daniel = graph.v(9, Person.class);
        assertEquals("daniel", daniel.getName());

        Software gremlin = graph.v(10, Software.class);
        assertEquals("gremlin", gremlin.getName());

        Software tinkergraph = graph.v(11, Software.class);
        assertEquals("tinkergraph", tinkergraph.getName());

        assertThat(marko.getDevelopedSoftware(), containsInAnyOrder(gremlin, tinkergraph));
        //assertEquals(2010, marko.getDevelops(tinkergraph).getSince());

    }
}
