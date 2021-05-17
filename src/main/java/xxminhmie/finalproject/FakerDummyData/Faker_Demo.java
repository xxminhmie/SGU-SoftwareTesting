package xxminhmie.finalproject.FakerDummyData;

import com.github.javafaker.Faker;

public class Faker_Demo {
	public static void main(String[] args) {
		Faker faker = new Faker();

		String streetName = faker.address().streetName();
		String number = faker.address().buildingNumber();
		String city = faker.address().city();
		String country = faker.address().country();
		
		String email = faker.internet().safeEmailAddress();

		System.out.println(String.format("%s\n%s\n%s\n%s", number, streetName, city, email));
		
	}

}
