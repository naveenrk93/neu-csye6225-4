package neu.edu.Entity;
// Generated Dec 9, 2016 12:13:39 AM by Hibernate Tools 5.1.0.CR1

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private String streetAddress;
	private String city;
	private String state;
	private String role;
	private String name;
	private Seller seller;
	private Admin admin;
	private Customer customer;

	public User() {
	}

	public User(String userName, String password, String email, String streetAddress, String city, String state,
			String role, String name, Seller seller, Admin admin, Customer customer) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.role = role;
		this.name = name;
		this.seller = seller;
		this.admin = admin;
		this.customer = customer;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}