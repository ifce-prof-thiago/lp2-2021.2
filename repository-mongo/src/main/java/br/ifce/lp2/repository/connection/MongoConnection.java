package br.ifce.lp2.repository.connection;

import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoConnection {

    private static final MongoOperations connection;

    static {
        connection = new MongoTemplate(
                MongoClients.create(
                        "mongodb+srv://lp2:dzsFtjcWVm9WZFe0@cluster0.0dxsu.mongodb.net"
                ), "lp2"
        );
    }

    private MongoConnection() {

    }

    public static MongoOperations getConnection() {
        return connection;
    }

}
