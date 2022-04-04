package br.ifce.lp2.core.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Accessors(fluent = true, chain = true)
public class Client {

    private String id;
    private String name;
    private String email;
    private String password;
    private boolean enabled;

    public static Client create() {
        return new Client();
    }

}
