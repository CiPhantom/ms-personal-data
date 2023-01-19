package org.comedy.infra.repository;

import jakarta.persistence.Cacheable;
import org.comedy.infra.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Cacheable
public interface CountryRepository extends CrudRepository<CountryEntity, Integer> {
    CountryEntity findFirstByEnglishName(String englishName);
}