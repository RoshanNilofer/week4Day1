package week4.day1;

public class TestData {
	public void enterCredentials()
	{
		System.out.println("enter the Credentials");
	}
	public void navigateToHomePage()
	{
		System.out.println("navigate To HomePage");
	}

	public static void main(String[] args) {
		TestData t = new TestData();
		t.enterCredentials();
		t.navigateToHomePage();

	}

}
