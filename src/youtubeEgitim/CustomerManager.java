package youtubeEgitim;

public class CustomerManager {

	private Customer customer;
    private ICreditManager creditManager;//reference tiptir bunun tuttuğu sınıfları kullanmak için bunu parametre olarak kullandık. 
	
	public CustomerManager(Customer customer,ICreditManager creditManager) {

		this.creditManager = creditManager;
		this.customer = customer;
	}

	public void save() {

		System.out.println("musteri kaydedildi");

	}

	public void delete() {

		System.out.println("musteri silindi.");

	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi.");
	}
}
