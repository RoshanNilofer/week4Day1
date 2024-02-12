package week4.day1;

public class TextField extends WebElement{
	public void getText()
	{
		System.out.println("Text");
	}

	public static void main(String[] args) {
		TextField t = new TextField();
		t.getText();

	}

}
