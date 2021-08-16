package hillel.elementary.homework15;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Country {
    private String name;
    private Integer countryNumberOnTheMap;

    public Country(String name, Integer countryNumberOnTheMap) {
        this.name = name;
        this.countryNumberOnTheMap = countryNumberOnTheMap;
    }
}
