package com.spicerack.framework.base;

import com.spicerack.framework.controls.api.ControlFactory;

public class Base {
 public static BasePage CurrentPage;
 
 public <TPage extends BasePage> TPage GetInstance(Class<TPage> page){
//	 Object obj = PageFactory.initElements(DriverContext.Driver, page);
//	 return page.cast(obj);
	 
	 Object obj = ControlFactory.initElements(DriverContext.Driver, page);
	 return page.cast(obj);
 }
}
