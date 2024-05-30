package com.alam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alam.repo.UserRepo;
import com.alamentity.User;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;

@Controller
public class usercontroller {
	
	@Autowired
    private UserRepo userRepository;

    @GetMapping("/")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "index"; 
    }
    
    @PostMapping("/")
    public String registerUser(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               @RequestParam("mobileNumber") String mobileNumber,
                               @RequestParam("dateOfBirth") String dateOfBirth,
                               @RequestParam("address") String address,
                               @RequestParam("hasCreditCard") String hasCreditCard,
                               Model model) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setMobileNumber(mobileNumber);
        user.setDateOfBirth(dateOfBirth);
        user.setAddress(address);
        user.setHasCreditCard(hasCreditCard);

        userRepository.save(user);

        return "redirect:/success";
    }
    
    @GetMapping("/success")
    public String success(){
    	
    	return "success";
    }
}

    


