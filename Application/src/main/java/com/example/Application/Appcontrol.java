package com.example.Application;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Appcontrol 
{
	static int train1 = 24;
	static int train2 = 24;
	static int train3 = 24;
	static int train4 = 24;
	
	@Autowired
 	private UserRepository userRepository;
	@RequestMapping("/")
	public ModelAndView HomePageDisplay()
	{
		ModelAndView mv = new ModelAndView("HomePage");
		return mv;
		
	}
	@RequestMapping("/AvailabilityPlaces")
	public ModelAndView en(@RequestParam String place1,@RequestParam int num)
	{ 
		ModelAndView mv = new ModelAndView();
		if(place1.equals("Chennai"))
		{
			if(train1>num)
				{mv.setViewName("BookingPage");
				 train1-=num;
				}
			
		}
		else if(place1.equals("Chennai"))
		{
			if(train2>num)
				{mv.setViewName("BookingPage");
				 train2-=num;
				}
			
		}
		else if(place1.equals("Chennai"))
		{
			if(train3>num)
				{mv.setViewName("BookingPage");
				 train3-=num;
				}
			
		}
		else if(place1.equals("Chennai"))
		{
			if(train4>num)
				mv.setViewName("BookingPage");
			
		}
		else 
		{
				mv.setViewName("FailurePage");
			
		}
		return mv;
		
		
	}
	@RequestMapping("/login")
	public ModelAndView LoginPageDisplay()
	{
		ModelAndView mv = new ModelAndView("login");
		return mv;
		
	}
	@RequestMapping("/Option")
	public ModelAndView BookingPageDisplay()
	{
		ModelAndView mv = new ModelAndView("BookingOption");
		return mv;
		
	}
	@RequestMapping("/Admin")
	public ModelAndView AdminPageDisplay()
	{
		ModelAndView mv = new ModelAndView("Admin");
		return mv;
	}
	@RequestMapping("/Mainpage")
	public ModelAndView MainpageDisplay()
	{
		ModelAndView mv = new ModelAndView("Mainpage");
		return mv;
		
	}
	@RequestMapping("/Display")
	public ModelAndView Newtrain()
	{
		ModelAndView mv = new ModelAndView("Display");
		return mv;
	}
	@RequestMapping("/passenger")
	public ModelAndView NewPass()
	{
		System.out.println("Passenger");
		ModelAndView mv = new ModelAndView("passenger");
		return mv;
	}

	
	@RequestMapping("/Register")
	public ModelAndView NewUser()
	{
		ModelAndView mv = new ModelAndView("Register");
		return mv;
	}

	@RequestMapping("/AddUser")
	public ModelAndView NewUserAdd(UserDetails user)
	{
		ModelAndView mv = new ModelAndView("login");
 		userRepository.save(user);	
		return mv;
	}
	
	@RequestMapping("/CheckUser")
	public ModelAndView CheckUser(@RequestParam int id)
	{
		ModelAndView mv;
		Optional<UserDetails> user = userRepository.findById(id);
		System.out.println(id);
 		if(user.isPresent())
 			 {
 			
 			mv = new ModelAndView("Display");
 			 mv.addObject("user",user);
 			 }
 		else
 		 {mv = new ModelAndView("Register");
 		
 		 }
		return mv;
	}
	
	
	
	

}
