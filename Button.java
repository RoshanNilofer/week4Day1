package week4.day1;

public class Button extends WebElement{
	public void submit()
	{
		System.out.println("submit");
	}

	public static void main(String[] args) {
		Button b = new Button();
		b.submit();

	}

}
