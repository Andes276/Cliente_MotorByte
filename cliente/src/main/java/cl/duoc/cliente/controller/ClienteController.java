package cl.duoc.cliente.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import cl.duoc.cliente.dto.ClienteResponseDto;
import cl.duoc.cliente.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/clientes")

public class ClienteController {

    private final ClienteService Service;

    public ClienteController(ClienteService service) {
        this.Service = service;
    }

    @GetMapping
    public List<ClienteResponseDto> findAll() {
        return Service.findAll();
    }
    

    @GetMapping("/{id}")
    public ClienteResponseDto findById(@RequestParam Long id) {
        return Service.findById(id);
    }
    



}
