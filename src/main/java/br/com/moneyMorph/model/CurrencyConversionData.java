package br.com.moneyMorph.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrencyConversionData(
        @JsonAlias("conversion_rate") double conversionRate,
        @JsonAlias("conversion_result") double amount,
        @JsonAlias("base_code") String fromCurrency,
        @JsonAlias("target_code") String toCurrency
) {
}
