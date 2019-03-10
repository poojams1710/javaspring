package com.gontuseries.studentaddmissioncontroller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAddmissionController {
	
	@RequestMapping( value="/admissionForm.html" , method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model1=new ModelAndView("AdmissionForm");
		 return model1;
	}
	
	
	@RequestMapping( value="/submitAdmissionForm.html" , method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @RequestParam( value= "studentname", defaultValue="abc")  String name,
			@RequestParam("studenthobby")  String hobby  ) throws Exception {
		 ModelAndView model2=new ModelAndView("AdmissionSuccess");
		 
		 model2.addObject("msg", " u are successfully submitted you form : name"+ name+ "hobby" + hobby);
		 
		 return model2;
	}

}
