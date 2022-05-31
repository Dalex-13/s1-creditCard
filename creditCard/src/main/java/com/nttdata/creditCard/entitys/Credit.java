package com.nttdata.creditCard.entitys;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Credit")
public class Credit {

    @Id
    private String id;
    private String idCustomer;
    private String issuingBank;
    private String typeCredit;
    private String expirationDate;
    private String codeCvv;
    private String consumption;

}
