package week4.day1;

public class LoginTestData extends TestData{
	public void userName()
	{
		System.out.println("Roshan Nilofer");
	}
	public void password()
	{
		System.out.println("12343");
	}

public static void main(String[] args) {
		LoginTestData l = new LoginTestData();
		l.enterCredentials();
		l.navigateToHomePage();
		l.userName();
		l.password();

	}

}
