package cl.twk.miprimerdesarrollo.flowwebpaycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebPayController {
	
	@GetMapping(value = "/webpay")
	public String poleras() {
		return "webpay";
		
	}
	
	
	
	
	
	

}
