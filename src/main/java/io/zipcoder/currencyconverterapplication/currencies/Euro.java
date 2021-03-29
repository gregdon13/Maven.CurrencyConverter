package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    CurrencyType euro;

    public Euro() {
        euro = CurrencyType.EURO;
    }

    @Override
    public CurrencyType getType() {
        return euro;
    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / euro.getRate();
    }
}
