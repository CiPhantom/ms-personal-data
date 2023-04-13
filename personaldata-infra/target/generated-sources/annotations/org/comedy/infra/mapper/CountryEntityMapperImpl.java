package org.comedy.infra.mapper;

import javax.annotation.processing.Generated;
import org.comedy.domain.data.Country;
import org.comedy.infra.entity.CountryEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-13T20:25:14+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CountryEntityMapperImpl implements CountryEntityMapper {

    @Override
    public CountryEntity map(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryEntity countryEntity = new CountryEntity();

        return countryEntity;
    }

    @Override
    public Country map(CountryEntity countryEntity) {
        if ( countryEntity == null ) {
            return null;
        }

        Country country = new Country();

        return country;
    }
}
