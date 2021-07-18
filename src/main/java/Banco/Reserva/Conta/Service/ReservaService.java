package Banco.Reserva.Conta.Service;

import Banco.Reserva.Conta.Domain.Reserva;
import Banco.Reserva.Conta.Domain.Reservas;
import Banco.Reserva.Conta.Repository.ReservaRepository;
import Banco.Reserva.Conta.Repository.ReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservasRepository _reservasRepository;

    @Autowired
    private ReservaRepository _reservaRepository;

    public Reservas retornaReserva(Reserva reserva) {
        _reservaRepository.save(reserva);

        Reservas reservas = new Reservas();

        if (_reservasRepository.findByReservas(reserva.idCliente).isPresent()) {
            var StoragedReservas = _reservasRepository.findByReservas(reserva.idCliente).get();

            for (var storagedReserva : StoragedReservas.reservaList) {
                reservas.reservaList.add(storagedReserva);
            }

            reservas.reservaList.add(reserva);
            _reservasRepository.delete(StoragedReservas);
            _reservasRepository.save(reservas);
        } else {
            reservas.reservaList.add(reserva);
            _reservasRepository.save(reservas);
        }

        return reservas;
    }
}
