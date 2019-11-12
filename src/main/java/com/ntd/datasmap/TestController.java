package com.ntd.datasmap;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ntd.datasmap.models.User;
import com.ntd.datasmap.repositories.UserRepository;

@Controller
@RequestMapping("/test/")
public class TestController {
	@Autowired
	private UserRepository repo;

	/* Index */
	@GetMapping("/datasmap")
	public String index() {
		return ("index");

	}

	/* Register */
	@GetMapping("/register")
	public String register() {
		return ("register");
	}

	/* Dash */
	@GetMapping("/dash")
	public String dash() {
		return ("dash");
	}

	/* SaveUser */

	/*
	 * ATTENTION : L'annotation RequestBody sera necessaire en utilisant un moteur
	 * de template
	 */
	@PostMapping("/submit")
	public String inscription(User user) {
		repo.save(user);
		return ("dash");
	}

	/* Connexion */
	@PostMapping("/connexion")
	public String connexion(User user, HttpSession session) {
		List<User> users = repo.findByUserName(user.getUserName());

		if (users.isEmpty()) {
			// Si vide
			return ("Error");
		} else {
			for (User u : users) {
				if (u.getPassword().equals(user.getPassword())) {
					session.setAttribute("User", user); // On attribue l'utilisateur à la session
					return ("dash");
				}
			}

			return ("Error"); // Si mdp incorrect

		}
	}

}
