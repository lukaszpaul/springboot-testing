package com.sprinttesting.springboottesting.entities;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document(collection= "receipts")
@Data
@Builder
public class Receipt {
    private int receiptId;
    private int numItem1;
    private int numItem2;
    private int numItem3;
    private double total;

}
