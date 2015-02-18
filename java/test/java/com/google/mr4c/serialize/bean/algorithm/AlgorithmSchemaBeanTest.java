/**
  * Copyright 2014 Google Inc. All rights reserved.
  * 
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  * 
  *     http://www.apache.org/licenses/LICENSE-2.0
  * 
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
*/

package com.google.mr4c.serialize.bean.algorithm;

import com.google.mr4c.algorithm.AlgorithmSchema;
import com.google.mr4c.algorithm.AlgorithmDataTestUtils;

import org.junit.*;
import static org.junit.Assert.*;

public class AlgorithmSchemaBeanTest {

	private AlgorithmSchema m_algoSchema;

	@Before public void setup() throws Exception {
		m_algoSchema = AlgorithmDataTestUtils.buildAlgorithmSchema();
	}

	@Test public void testAlgorithmSchema() {
		AlgorithmSchemaBean bean = AlgorithmSchemaBean.instance(m_algoSchema);
		AlgorithmSchema algoSchema2 = bean.toAlgorithmSchema();
		assertEquals(m_algoSchema, algoSchema2);
	}


}

