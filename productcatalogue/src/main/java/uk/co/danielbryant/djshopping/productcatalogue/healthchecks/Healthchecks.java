package uk.co.danielbryant.djshopping.productcatalogue;

import java.util.Date;
import org.springframework.web.bin.annotation.GetMapping;
import org.springframework.web.bin.annotation.RestController;

@RestController
public class healthcheck {
    @GetMapping("/healthcheckSM")
	public String healthcheck() {
	    return "Hello User this response from Stock Maanger !! " + new Date();
	}
}
