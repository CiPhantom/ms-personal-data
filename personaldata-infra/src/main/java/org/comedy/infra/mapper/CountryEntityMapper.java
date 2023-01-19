package org.comedy.infra.mapper;

import org.comedy.domain.data.Country;
import org.comedy.infra.entity.CountryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CountryEntityMapper {
    CountryEntity map(Country country);

    Country map(CountryEntity countryEntity);
}
