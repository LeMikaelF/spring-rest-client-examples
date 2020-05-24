package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExpirationDate implements Serializable {
    private static final long serialVersionUID = -1547971301924549803L;
    private String date;
	private String timezone;
	private Integer timezoneType;
}
