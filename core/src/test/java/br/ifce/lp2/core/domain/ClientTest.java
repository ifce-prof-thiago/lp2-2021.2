package br.ifce.lp2.core.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Client Unit Tests")
class ClientTest {

    @Test
    @DisplayName("throw illegal argument exception when email is invalid")
    public void throwIllegalArgumentExceptionWhenEmailIsInvalid() {

        assertThrows(IllegalArgumentException.class, () -> {
            Client.create("Thiago", "thiago", "123");
        });

    }

    @Test
    @DisplayName("create client with name and email and password")
    public void createClientWithNameAndEmailAndPassword() {

        final var client = Client.create(
                "Thiago",
                "thiago@lar.ifce.edu.br",
                "123"
        );

        assertNotNull(client);
        assertNotNull(client.name());
        assertNotNull(client.password());
        assertNotNull(client.email());
        assertEquals("Thiago", client.name());
        assertEquals( "thiago@lar.ifce.edu.br", client.email());
        assertEquals( "123", client.password());

    }
}