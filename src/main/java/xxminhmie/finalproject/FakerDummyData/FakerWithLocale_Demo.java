package xxminhmie.finalproject.FakerDummyData;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakerWithLocale_Demo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Faker vnFaker = new Faker(new Locale("vi"));
			String city = vnFaker.address().city();
			
			System.out.println(String.format("%s", city));
		}

	}

}
