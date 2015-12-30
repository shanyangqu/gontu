package uk.com.holychina.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uk.com.holychina.student.model.Student;


@Controller
public class StudentController {
 
	@RequestMapping(value = "/studentForm.html", method= RequestMethod.GET)
	public ModelAndView displayStudentForm(){
		ModelAndView mv = new ModelAndView("StudentForm");
		return mv;
	}
	
	@RequestMapping(value = "/submitStudentForm.html", method= RequestMethod.POST)
	public ModelAndView processStudentForm(@ModelAttribute("student1") Student student1 ){
		ModelAndView mv = new ModelAndView("StudentFormSuccess");
		return mv;
	}
	
}
