package uk.com.holychina;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String, String> pathVars){
		
		String country = pathVars.get("countryName");
		String userName = pathVars.get("userName");
		
		
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("welcomeMsg", "hello " + userName + " from " + country);
		return mv;
	}
	
}
