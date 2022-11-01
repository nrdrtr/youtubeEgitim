package youtubeEgitim;

public abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void calculate(); // her yerde değişken ortak değil

	@Override
	public void save() {// tamamlanmış operasyon her yerde aynı olduğu için bir kere yazıyoruz
						// bunun uzantısı olan sınıflar bu methodu kullanıyor
     System.out.println("kaydedildi.");

	}

}
