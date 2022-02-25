package stringlists;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Each instance of this class stores a list of strings.
 */
public class StringList {
	
	/**
	 * @invar | elements != null
	 * @invar | Arrays.stream(elements).allMatch(e -> e != null)
	 * @representationObject
	 */
	private String[] elements;
	
	/**
	 * @creates | result
	 */
	public String[] toArray() { return elements.clone(); }
	
	public String getConcatenation() {
		String result = "";
		for (String element : elements)
			result = result.concat(element);
		return result;
	}
	
	/**
	 * @pre | elements != null
	 * @throws IllegalArgumentException | Arrays.stream(elements).allMatch(e -> e != null)
	 * 
	 * @post | Arrays.equals(toArray(), elements)
	 */
	public StringList(String[] elements) {
		if (!Arrays.stream(elements).allMatch(e -> e != null))
			throw new IllegalArgumentException();
		this.elements = elements.clone();
	}
	
	/**
	 * Sets the element at the given index to the given value.
	 * 
	 * @pre | 0 <= index && index < toArray().length
	 * @throws IllegalArgumentException | value != null
	 *  
	 * @post | toArray().length == old(toArray().length)
	 * @post | toArray()[index] == value
	 * @post | IntStream.range(0, toArray().length).allMatch(i -> toArray()[i] == old(toArray())[i])
	 * 
	 * @mutates | this
	 */
	public void set(int index, String value) {
		if (value == null)
			throw new IllegalArgumentException();
		elements[index] = value;
	}

}
