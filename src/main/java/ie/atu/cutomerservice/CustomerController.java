package ie.atu.cutomerservice;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("/customers")
    public String createOrder (@RequestBody orderDetails)

}
