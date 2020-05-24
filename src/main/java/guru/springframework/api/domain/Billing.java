package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Billing implements Serializable {
    private static final long serialVersionUID = -314976304521681647L;
    private Card card;
}
