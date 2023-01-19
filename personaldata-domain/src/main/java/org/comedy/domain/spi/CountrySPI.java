package org.comedy.domain.spi;

import org.comedy.domain.data.Country;

import java.util.Optional;

public interface CountrySPI {
    Optional<Country> getCountryIdByEnglishName(String englishName);
}
