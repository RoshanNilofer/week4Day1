package week4.day1;

public class WebElement {
	public void click()
	{
		System.out.println("click");
	}
    public void setText(String text){
    	System.out.println("set the text as ");
    }

	public static void main(String[] args) {
		WebElement w = new WebElement();
		w.click();
		w.setText("Roshan");

	}

}
