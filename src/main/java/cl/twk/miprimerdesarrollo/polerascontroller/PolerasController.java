package cl.twk.miprimerdesarrollo.polerascontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PolerasController {

	@GetMapping(value = "/poleras")
	public String poleras() {
		return "poleras";
		
	}
	
	
	
	
	
	
}
