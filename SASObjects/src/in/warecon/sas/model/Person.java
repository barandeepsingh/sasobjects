/**
 * 
 */
package in.warecon.sas.model;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.bind.DatatypeConverter;

/**
 * @author ebarasi
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// Surrogate key acts as PK
	private int id;
	private String username;
	private String password;
	private Salutation salutation;
	private String firstName;
	private String middleName;
	private String lastName;
	private String name;
	private String gender;
	private String email;
	@OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
	private Set<Address> address;
	private String mobile;
	private String fax;
	private String telephone;
	private Date dob;// Date of birth
	private String fatherName;
	private String motherName;
	private String spouseName;
	private int age;
	private Date doj;// Date of joining
	private Date dol;// Date of leaving
	private String organizationName;
	private boolean hasWhatsApp;
	private String whatsAppNumber;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the name
	 */
	public String getName() {

		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {

		if (middleName.trim().equalsIgnoreCase("") || middleName.trim() == null) {
			this.name = firstName.trim() + " " + lastName.trim();
		} else {
			this.name = firstName.trim() + " " + middleName.trim() + " "
					+ lastName.trim();
		}

	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public Set<Address> getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName
	 *            the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName
	 *            the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the organizationName
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * @param organizationName
	 *            the organizationName to set
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	/**
	 * @return the hasWhatsapp
	 */
	public boolean isHasWhatsapp() {
		return hasWhatsApp;
	}

	/**
	 * @param hasWhatsapp
	 *            the hasWhatsapp to set
	 */
	public void setHasWhatsapp(boolean hasWhatsapp) {
		this.hasWhatsApp = hasWhatsapp;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj
	 *            the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/**
	 * @return the dol
	 */
	public Date getDol() {
		return dol;
	}

	/**
	 * @param dol
	 *            the dol to set
	 */
	public void setDol(Date dol) {
		this.dol = dol;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {

		byte[] decodedPassword = DatatypeConverter.parseBase64Binary(password);

		return new String(decodedPassword);
	}

	/**
	 * @param password
	 *            the password to set encoded in Base64
	 */
	public void setPassword(String password) {
		byte[] message = null;
		try {
			message = password.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String encodedPassword = DatatypeConverter.printBase64Binary(message);
		System.out.println(encodedPassword);
		this.password = encodedPassword;
	}

	public Salutation getSalutation() {
		return salutation;
	}

	public void setSalutation(Salutation salutation) {
		this.salutation = salutation;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public boolean isHasWhatsApp() {
		return hasWhatsApp;
	}

	public void setHasWhatsApp(boolean hasWhatsApp) {
		this.hasWhatsApp = hasWhatsApp;
	}

	public String getWhatsAppNumber() {
		return whatsAppNumber;
	}

	public void setWhatsAppNumber(String whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}

}
