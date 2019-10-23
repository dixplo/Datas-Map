package com.ntd.datasmap;

import java.util.Date;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.ntd.datasmap.models.Event;
import com.ntd.datasmap.repositories.EventRepository;


@Controller
@RequestMapping("/test/")
public class TestController {

	@Autowired
	private EventRepository eventRepo;
	
	/*Index*/ 
	@GetMapping("/datasmap")
	public String index() {
		return ("index");
	}
	
	
	@GetMapping("events")
	 public String displayEvent(ModelMap model) {
		 java.util.List<Event> events=eventRepo.findAll();
		 model.put("events", events);
		 return "events";
	}	 

	// Ajouter Event
	@GetMapping("AddEvent")
	public RedirectView addEvent(@RequestParam String name, @RequestParam String description, @RequestParam Date date)
	{
		Event events = new Event(name, description);
		events.setName(name);
		events.setDescription(description);
		events.setDate(date);
		eventRepo.save(events);
		return new RedirectView("events");
	}
	
	
}
