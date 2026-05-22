package cl.duoc.cliente.service.impl;

import cl.duoc.cliente.dto.ClienteResponseDto;
import cl.duoc.cliente.model.Cliente;
import cl.duoc.cliente.repository.ClienteRepository;
import cl.duoc.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;

    ClienteResponseDto toDto(Cliente entity) {
        return new ClienteResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPhone()
        );
    }

    Cliente toEntity(ClienteResponseDto dto) {
        return new Cliente(
                dto.getId(),
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone    ()
        );
    }

    @Override
    public List<ClienteResponseDto> findAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    @Override
    public ClienteResponseDto findById(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }
}