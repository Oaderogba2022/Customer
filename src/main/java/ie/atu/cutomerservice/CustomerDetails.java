package ie.atu.cutomerservice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {
    private String CustomerId;
    private String name;
    private String age;
    private String email;
}
