package f5_LocatingElements;

public class F01_Xpath {

	// Relative xpath

	//tagname[@attribute='value'] or *[@attribute='value']
	//tagname[@attribute='value' and @attribute='value'] or tagname[@attribute='value'][@attribute='value']
	//tagname[text()='exact text']
	//tagname[contains(text(),'part of the text')]
	//tagname[starts-with(text(),'starting text')]
	//tagname[contains(@attribute,'part of the value']
	//tagname[starts-with(@attribute,'starting value')]

	// Axes
	// known xpath with Axes

	//tagname[@attribute='value']/parent::tagname or *
	//tagname[@attribute='value']/child::tagname
	//tagname[@attribute='value']/ancestor::tagname
	//tagname[@attribute='value']/following::tagname[2][last()]
	//tagname[@attribute='value']/preceding::tagname
	//tagname[@attribute='value']/following-sibling::tagname
	//tagname[@attribute='value']/preceding-sibling::tagname
}
