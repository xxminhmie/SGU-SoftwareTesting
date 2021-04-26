package xxminhmie.DoAn;

import java.util.ArrayList;

import com.github.javafaker.Faker;

public class AccountModel_DummyData {
	ArrayList<Object> list = new ArrayList<Object>();
	public AccountModel_DummyData() {
		for(int i=0; i<10; i++) {
			Faker data = new Faker();
		}
	}
	
}
