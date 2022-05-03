package br.edu.lp2;

import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoTemplate;

public class Main {

    public static void main(String[] args) {

        var mongoOperations =
                new MongoTemplate(
                        MongoClients.create(
                                "mongodb+srv://lp2:dzsFtjcWVm9WZFe0@cluster0.0dxsu.mongodb.net"
                        ), "lp2"
                );

        var p = new Person();
        p.setName("Thiago");
        p.setAge(12);

        mongoOperations.insert(p);

    }
}