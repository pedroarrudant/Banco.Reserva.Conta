package Banco.Reserva.Conta.Controller;

import Banco.Reserva.Conta.Domain.Conta;
import Banco.Reserva.Conta.Domain.Reserva;
import Banco.Reserva.Conta.Domain.Reservas;
import Banco.Reserva.Conta.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@SpringBootApplication
@RestController
@RequestMapping("conta")
public class ContaController {

    @Autowired
    private ContaService _service;

    @RequestMapping(value = "{idconta}", method = GET)
    @ResponseBody
    public ResponseEntity<Conta> GetConta(@PathVariable int idconta) {
        return ResponseEntity.status(HttpStatus.OK).body(_service.retornaConta(idconta));
    }

    @RequestMapping(value = "/", method = POST)
    @ResponseBody
    public ResponseEntity<Conta> CreateConta(@RequestBody Conta conta) {
        return ResponseEntity.status(HttpStatus.OK).body(_service.createConta(conta));
    }
}
