package Banco.Reserva.Conta.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Reserva")
public class Reserva {
    @Id
    public int id;
    public int idCliente;
    public String Nome;
    public long Saldo;
}
