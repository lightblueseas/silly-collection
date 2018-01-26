package de.alpharogroup.collections;

import static org.testng.Assert.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.testng.annotations.Test;

import de.alpharogroup.collections.list.ListExtensions;

/**
 * The unit test class for the class {@link CollectionExtensions}.
 */
public class CollectionExtensionsTest
{

	/**
	 * Test the method for {@link CollectionExtensions#intersection(Collection...)}
	 */
	@Test
	public void testIntersection()
	{
		Collection<String> expected;
		Collection<String> actual;
		final Collection<String> nameList = new ArrayList<String>();

		nameList.add("Anton");
		nameList.add("Alex");
		nameList.add("Berta");
		nameList.add("Brad");
		nameList.add("Caesar");
		nameList.add("Leonardo");

		final Collection<String> otherNames = new ArrayList<String>();

		otherNames.add("Alex");
		otherNames.add("Berta");
		otherNames.add("Brad");
		otherNames.add("Caesar");
		otherNames.add("Leonardo");

		final Collection<String> vipNames = new ArrayList<String>();
		vipNames.add("Alex");
		vipNames.add("Brad");
		vipNames.add("Caesar");
		vipNames.add("Leonardo");
		vipNames.add("Jesus");

		expected = new ArrayList<String>();
		expected.add("Alex");
		expected.add("Brad");
		expected.add("Caesar");
		expected.add("Leonardo");
		actual = CollectionExtensions.intersection(vipNames, otherNames, nameList);
		assertNotNull(actual);
		assertEquals(expected.size(), actual.size());
		for (final String name : actual)
		{
			assertTrue(expected.contains(name));
		}
	}


	/**
	 * Test the method for {@link CollectionExtensions#intersection(Collection...)} with the
	 * scenario of lotto numbers
	 */
	@Test
	public void testIntersectionLottoNumbers()
	{
		Collection<Integer> expected;
		Collection<Integer> actual;
		Collection<Integer> yourNumbers;
		final Collection<Integer> lottoNumbers = ListExtensions.newArrayList(3, 7, 22, 23, 34, 45);
		yourNumbers = ListExtensions.newArrayList(3, 7, 23, 34, 22, 45);
		actual = CollectionExtensions.intersection(lottoNumbers, yourNumbers);
		expected = lottoNumbers;
		assertEquals(expected.size(), actual.size());
		for (final Integer number : actual)
		{
			assertTrue(expected.contains(number));
		}

		yourNumbers = ListExtensions.newArrayList(3, 7, 24, 35, 25, 46);
		actual = CollectionExtensions.intersection(lottoNumbers, yourNumbers);
		expected = ListExtensions.newArrayList(3, 7);
		assertEquals(expected.size(), actual.size());
		for (final Integer number : actual)
		{
			assertTrue(expected.contains(number));
		}

	}


}