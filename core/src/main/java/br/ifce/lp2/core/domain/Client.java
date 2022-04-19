package br.ifce.lp2.core.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Objects;
import java.util.regex.Pattern;

@Getter
@EqualsAndHashCode(of = {"id"})
@Accessors(fluent = true)
public class Client {

    private String id;
    private String name;
    private String email;
    private String password;
    private boolean enabled;

    private Client() {}

    public static Client create(String name, String email, String password) {
        return   new Client()
                .name(name)
                .email(email)
                .password(password)
                .disable();
    }

    public Client id(String id) {
        this.id = id;
        return this;
    }

    public Client password(String password) {
        this.password = password;
        return this;
    }

    public Client name(String name) {

        if(Objects.isNull(name))
            throw new IllegalArgumentException("Not be null");

        if(name.isBlank())
            throw new IllegalArgumentException("Not be blank");

        this.name = name;

        return this;
    }

    public Client email (String email) {

        var p = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

        if(!p.matcher(email).find())
            throw new IllegalArgumentException("Email is invalid");

        this.email = email;

        return this;

    }

    public Client enable() {
        this.enabled = true;
        return this;
    }

    public Client disable() {
        this.enabled = false;
        return this;
    }

}
