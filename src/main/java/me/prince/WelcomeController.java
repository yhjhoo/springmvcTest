package me.prince;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class WelcomeController {
	
	@RequestMapping(value="/person", method=RequestMethod.GET)
	public List<String> index(){
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		return list;
	}
	
}
