package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    CurrencyType australianDollar;

    public AustralianDollar() {
        australianDollar = CurrencyType.AUSTRALIAN_DOLLAR;
    }

    @Override
    public CurrencyType getType() {
        return australianDollar;
    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / australianDollar.getRate();
    }
}
