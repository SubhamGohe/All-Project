package com.api.marketing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LeadController {
	
	// localhost:2004/Marketing
	@RequestMapping("/Marketing")
  public String viewcreateLeadfrom(){
	  return"create_lead";//Requestdipatcher
  }
}   
