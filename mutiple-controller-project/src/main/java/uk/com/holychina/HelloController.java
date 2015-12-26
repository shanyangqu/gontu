package uk.com.holychina;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("welcomeMsg", "hello Junchen");
		return mv;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("welcomeMsg", "hi Junchen");
		return mv;
	}
	
}
