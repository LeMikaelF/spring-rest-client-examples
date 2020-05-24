package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Card implements Serializable {
    private static final long serialVersionUID = 85665094818613760L;
    private String number;
    private String iban;
    private String type;
    private ExpirationDate expirationDate;
    private String swift;
}
