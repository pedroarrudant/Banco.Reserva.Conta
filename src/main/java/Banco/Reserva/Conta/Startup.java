package Banco.Reserva.Conta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Startup {
    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
        //SpringApplication.run(ContaController.class, args);
    }

    public void retornaConexaoMongo()
    {
//        final String uriString = "mongodb://applicationuser:$[password]@localhost:27017/test?authSource=$[authSource]";
//        MongoClientURI uri = new MongoClientURI(uriString);
//        MongoClient mongoClient = new MongoClient(uri);
    }
}
