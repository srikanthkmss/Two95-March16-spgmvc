package com.srikanth;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class NameEditor extends PropertiesEditor {
@Override
public void setAsText(String name){
	if(name.contains("Mr.") || name.contains("Mrs.")|| name.contains("Ms.")){
		setValue(name);
		
	}
	else
		name= "Mrs."+name;
	setValue(name);

}



}
