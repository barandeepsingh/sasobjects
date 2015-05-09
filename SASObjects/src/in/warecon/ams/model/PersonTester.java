/**
 * 
 */
package in.warecon.ams.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ebarasi
 *
 */
public class PersonTester {

	@Test
	public void test() {
		Person person = new Person();
		person.setPassword("Passw0rd");
		System.out.println(person.getPassword());
	}

}
