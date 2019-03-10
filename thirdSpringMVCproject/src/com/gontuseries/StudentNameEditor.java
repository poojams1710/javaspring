package com.gontuseries;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor  extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException{
		if(studentName.contains("Mr.")|| studentName.contains("Mrs.")) {
			setValue(studentName);
		}
		else {
			studentName="GEN"+studentName;
			setValue(studentName);
		}
	}
	

}
