package f5_LocatingElements;

public class F02_CSSselector {

	// Select By ID
	//tagname[attribute='value']
	//tagname#elementID

	// Select By Class
	//tagname[attribute='value']
	//tagname.elementClass

	// Select multiple attributes
	//tagname#elementID[attribute='value'][attribute='value']
	//tagname.elementClass[attribute='value'][attribute='value']

	// Substring for Dynamic elements
	//tagname[attribute^='value'] - prefix of the text
	//tagname[attribute$='value'] - sufix of the text
	//tagname[attribute*='value'] - sub-string of the text
	//also using multiple attributes
	//tagname[attribute^='value'][attribute$='value']

	// Finding Direct Child or Sub-child Elements
	//tagname[attribute='value']>tagname[attribute='value'] - is used to select direct child
	//tagname#elementID tagname - is used to select child or sub-child

	// Next Sibling Adjacent Sibling Combinator
	//tagname[attribute='value']+tagname

	// First-Child, Last-Child, Nth-Child, Nth-Last-Child
	//tagname[attribute='value']>tagname[attribute='value'] 
	//or 
	//space>:first-child :last-child :nth-child(2) :nth-last-child(2)
	//and also using tagname - space tagname:first-child

	// First-of-type, Last-of-type, Nth-of-type() for siblings
	//tagname#elementID>tagname:first-of-type
	//tagname#elementID>tagname:last-of-type
	//tagname#elementID>tagname:nth-of-type(2)

}
