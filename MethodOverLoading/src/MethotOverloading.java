
public class MethotOverloading {

	public static void main(String[] args) {
		DortIslem dortıslem = new DortIslem();
		System.out.println(dortıslem.topla(2, 4));
		dortıslem.topla(2, 3, 5);
		System.out.println(dortıslem.topla(2, 3, 5));
	}

}
