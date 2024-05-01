package SeleniumSessions;

public class XpathAxes {
	
	public static void main(String [] args) {
		
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		
		//parent to direct child: use / single slash
		//form/div/input
				
		//parent to direct +  in-direct child: use // two slash
		//form/div/input
		//select[@id='Form_getForm_Country']//option
		
		//div[@id='content']//img  1 of 29
				
		//child to Parent:   backward traversing:    use --> /parent::div/parent::form
		//input[@id='input-email']/../../../../../../../../../..
		
		//there is another way for backward traversing:
		//input[@id='input-email']/parent::div/parent::form
		
		//directly jumping from child to grandparent and skipping parent:   use --> /ancestor::form
		//input[@id='input-email']/ancestor::form
				
		//its we have to decide from child where we need to jump directly to any ancestor or parent
		//input[@id='input-email']/ancestor::form/ancestor::body/parent::html
		
		//a[text()='Recurring payments']/parent::div/ancestor::aside
		
		//preceding-sibling concept:
		//a[text()='Recurring payments']/preceding-sibling::a[text()='Downloads']
		
		//following-sibling concept:
		//a[text()='Recurring payments']/following-sibling::a[text()='Returns']
		
		//we can use index also with following-sibling concept:
		// (//a[text()='Recurring payments']/following-sibling::a)[4]		
		
		//if you want to verify the label name of any text field. like above email add text field there is a label
		//input[@id='input-email']/preceding-sibling::label[@class='control-label']
		
		//if u want to find the text below lable then we can use following sibling in above xpath
		//label[text()='E-Mail Address']/following-sibling::input[@id='input-email']
		
		
		//https://selectorshub.com/xpath-practice-page/
		//child to immidiate parent -> parent sibling -> childSibling
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/parent::td/..//input[@type='checkbox']

		
		//child to grandparent -> parent sibling -> childSibling
		// //a[text()='Joe.Root']//ancestor::tr/td/input[@type='checkbox']
		
		//child to grandparent -> direct child  => this is better the shortest
		//a[text()='Joe.Root']//ancestor::tr//input[@type='checkbox']
		
	}

}
