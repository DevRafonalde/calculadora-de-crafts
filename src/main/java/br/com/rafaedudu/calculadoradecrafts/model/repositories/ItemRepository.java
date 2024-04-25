package br.com.rafaedudu.calculadoradecrafts.model.repositories;

import br.com.rafaedudu.calculadoradecrafts.model.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
