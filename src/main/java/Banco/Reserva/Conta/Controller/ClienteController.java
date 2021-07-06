package Banco.Reserva.Conta.Controller;

import Banco.Reserva.Conta.Domain.Cliente;
import Banco.Reserva.Conta.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@SpringBootApplication
@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService _service;

    @RequestMapping(value = "{idcliente}", method = GET)
    @ResponseBody
    public ResponseEntity<Cliente> GetCliente (@PathVariable int idcliente){
        return ResponseEntity.status(HttpStatus.OK).body(_service.retornaCliente(idcliente));
    }

    @RequestMapping(value = "/", method = POST)
    @ResponseBody
    public ResponseEntity<Cliente> CreateCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.status(HttpStatus.OK).body(_service.createCliente(cliente));
    }

}
