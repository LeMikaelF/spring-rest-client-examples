package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Name implements Serializable {
    private static final long serialVersionUID = -902062416898255608L;
    private String last;
	private String title;
	private String first;
}
