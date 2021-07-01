package Banco.Reserva.Conta.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    public int id;
    public int agencia;
    public String cliente;
    public long saldo;
}
