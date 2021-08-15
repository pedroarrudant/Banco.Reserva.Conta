package Banco.Reserva.Conta.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Document(collection="Reservas")
public class Reservas {

    public Reservas()
    {
        reservaList = new ArrayList<Reserva>();
    }

    @Id
    public int id;
    public List<Reserva> reservaList;
}
