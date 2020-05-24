package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {
    private static final long serialVersionUID = -4151666305013674348L;
    private String company;
	private String title;
}
