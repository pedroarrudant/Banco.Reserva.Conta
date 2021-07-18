package Banco.Reserva.Conta.Domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
//import javax.validation.constraints.NotNull;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Conta")
public class Conta {

    @Id
    public int id;

    public int agencia;

    public int conta;

    public long saldo;
}
