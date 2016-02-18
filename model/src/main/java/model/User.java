package model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by roxanap on 18.02.2016.
 */
@Builder
@Getter
@Setter
public class User implements Serializable {
    private long id;
    private String username;
    private String password;
}
