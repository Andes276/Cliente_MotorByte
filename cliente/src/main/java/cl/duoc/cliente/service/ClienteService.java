package cl.duoc.cliente.service;

import java.util.List;

import cl.duoc.cliente.dto.ClienteResponseDto;

public interface ClienteService {
    List<ClienteResponseDto> findAll();
    ClienteResponseDto findById(Long id);

}
