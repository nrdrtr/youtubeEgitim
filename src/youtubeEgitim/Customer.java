package youtubeEgitim;

public class Customer {// class holding property

	private int id;
	private String city;

	public Customer() {
		System.out.println("musteri nesnesi baslatildi");
	}
//	public Customer(int id, String firstName, String lastName, String nationalIdentity) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.nationalIdentity = nationalIdentity;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
