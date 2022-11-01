package youtubeEgitim;

public class Main {

	public static void main(String[] args) {

		int number1 = 34;
		int number2 = 58;
		number1 = number2;
		number2 = 6;
		System.out.println(number1);

		int[] numbers1 = { 1, 2, 3 };
		int[] numbers2 = { 10, 20, 30 };
		numbers2 = numbers1;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();// instance creation
		customer.setId(1);
		customer.setCity("");     
                                                                             //new TeacherCreditManager()'ı da kullanabiliriz
		CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
	
		customerManager.save();
		customerManager.delete();

		Company company = new Company();
		company.setId(23);
		company.setTaxNumber("46346546504");
		company.setCompanyName("Beko");

		Person person = new Person();
		person.setFirstName("onur");
		person.setNationalIdentity("28357952305");

	                                                     	//new Company()'i de kullanabiliriz.
		CustomerManager customerManager1 = new CustomerManager(new Person(),null);
		customerManager1.save();

	
		//reference type
		Customer c1 = new Customer();
		Customer c2 = new Company();
		Customer c3 = new Person();
		
	}
	

}
