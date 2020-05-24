package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Login implements Serializable {
    private static final long serialVersionUID = 4283072061779314796L;
    private String sha1;
	private String password;
	private String sha256;
	private String username;
	private String md5;
}
