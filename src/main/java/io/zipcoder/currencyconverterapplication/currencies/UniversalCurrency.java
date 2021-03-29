package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    CurrencyType universalCurrency;

    public UniversalCurrency() {
        universalCurrency = CurrencyType.UNIVERSAL_CURRENCY;
    }

    @Override
    public CurrencyType getType() {
        return universalCurrency;
    }
}
