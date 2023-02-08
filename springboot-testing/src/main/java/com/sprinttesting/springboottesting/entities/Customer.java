package com.sprinttesting.springboottesting.entities;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "customer")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {
    @Id
    private String password;
    private String email;
    private List<Receipt> receipts;


}
