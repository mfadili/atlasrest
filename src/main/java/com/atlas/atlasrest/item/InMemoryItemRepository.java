package com.atlas.atlasrest.item;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMemoryItemRepository extends CrudRepository<Item, Long> {}
