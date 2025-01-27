package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    CurrencyType singaporeDollar;

    public SingaporeDollar() {
        singaporeDollar = CurrencyType.SINGAPORE_DOLLAR;
    }

    @Override
    public CurrencyType getType() {
        return singaporeDollar;
    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / singaporeDollar.getRate();
    }
}
