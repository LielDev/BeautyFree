package it.personal.Service;

import it.personal.Converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public abstract class AbstractService<Entity,DTO> implements ServiceDTO<DTO> {


    protected CrudRepository<Entity,Long> repository;

    protected Converter<Entity,DTO> converter;

    @Override
    public DTO insert(DTO dto){
        System.out.println(dto.toString());
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }

    @Override
    public Iterable<DTO> getAll() {
        return converter.toDTOList(repository.findAll());
    }

    @Override
    public DTO read(long id) {
        return converter.toDTO(repository.findById(id).get());
    }

    @Override
    public DTO update(DTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
