package com.ntd.datasmap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test/")
public class TestController {
	
	
	/*Index*/ 
	@GetMapping("/datasmap")
	public String index() {
		return ("index");
		
	}
	
	
}
