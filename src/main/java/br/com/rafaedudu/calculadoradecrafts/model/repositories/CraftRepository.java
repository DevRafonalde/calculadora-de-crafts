package br.com.rafaedudu.calculadoradecrafts.model.repositories;

import br.com.rafaedudu.calculadoradecrafts.model.entities.Craft;
import br.com.rafaedudu.calculadoradecrafts.model.entities.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CraftRepository extends CrudRepository<Craft, Integer> {
    Craft findByItem(Item item);
}
