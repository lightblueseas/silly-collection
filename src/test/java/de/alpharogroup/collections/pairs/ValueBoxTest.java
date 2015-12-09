/**
 * The MIT License
 *
 * Copyright (C) 2007 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.collections.pairs;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

/**
 * The test class {@link ValueBoxTest} is for the class {@link ValueBox}.
 */
public class ValueBoxTest
{

	/**
	 * Test method for {@link ValueBox#equals(Object)}
	 */
	@Test
	public void testEqualsObject()
	{
		final ValueBox<Integer> expected = new ValueBox<>(2);
		final ValueBox<String> actual = new ValueBox<>("Hello");

		AssertJUnit.assertNotSame(expected, actual);
		final ValueBox<Integer> twoBox = new ValueBox<>(2);
		AssertJUnit.assertEquals(expected, twoBox);
		AssertJUnit.assertEquals(expected.hashCode(), twoBox.hashCode());
	}

}
