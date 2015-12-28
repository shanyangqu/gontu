package uk.com.holychina.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
 
	@RequestMapping(value = "/studentForm.html", method= RequestMethod.GET)
	public ModelAndView displayStudentForm(){
		ModelAndView mv = new ModelAndView("StudentForm");
		return mv;
	}
	
	@RequestMapping(value = "/submitStudentForm.html", method= RequestMethod.POST)
	public ModelAndView processStudentForm(@RequestParam(value = "studentName",  defaultValue="junchen liu") String studentName, @RequestParam("studentHobby") String studentHobby ){
		ModelAndView mv = new ModelAndView("StudentFormSuccess");
		mv.addObject("studentName", studentName);
		mv.addObject("studentHobby", studentHobby);

		return mv;
	}
	
}
