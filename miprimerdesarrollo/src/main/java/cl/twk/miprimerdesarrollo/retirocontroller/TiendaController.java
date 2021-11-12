package cl.twk.miprimerdesarrollo.retirocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TiendaController {
	
	@GetMapping (value = "/retirotienda")
	public String retirotienda () {
		return "retirotienda";
		
		
	}
	
	
	
	
	
	
	
	

}
