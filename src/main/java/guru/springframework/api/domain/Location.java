package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Location implements Serializable {
    private static final long serialVersionUID = 6603686953502584245L;
    private String city;
	private String street;
	private String postcode;
	private String state;
}
