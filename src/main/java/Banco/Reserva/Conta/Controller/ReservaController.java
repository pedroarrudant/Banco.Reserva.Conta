package Banco.Reserva.Conta.Controller;

import Banco.Reserva.Conta.Domain.Conta;
import Banco.Reserva.Conta.Domain.Reserva;
import Banco.Reserva.Conta.Domain.Reservas;
import Banco.Reserva.Conta.Service.ContaService;
import Banco.Reserva.Conta.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@SpringBootApplication
@RestController
@RequestMapping("reserva")
public class ReservaController {

    @Autowired
    private ReservaService _service;

//    @RequestMapping(value = "{idreserva}", method = GET)
//    @ResponseBody
//    public ResponseEntity<Reservas> GetReserva(@PathVariable int idReserva) {
//        return ResponseEntity.status(HttpStatus.OK).body(_service.retornaReserva(idconta));
//    }

    @RequestMapping(value = "/", method = POST)
    @ResponseBody
    public ResponseEntity<Reservas> CreateReserva(@RequestBody Reserva reserva) {
        return ResponseEntity.status(HttpStatus.OK).body(_service.retornaReserva(reserva));
    }
}
