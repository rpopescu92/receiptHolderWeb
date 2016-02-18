package ro.rh.main;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by roxana on 18.02.2016.
 */
@Builder
@Getter
@Setter
@ToString(of = {"name","password"})
public class User {
    private String name;
    private String password;
}
