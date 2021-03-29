package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    CurrencyType usDollar;

    public USDollar() {
        usDollar = CurrencyType.US_DOLLAR;
    }

    @Override
    public CurrencyType getType() {
        return usDollar;
    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / usDollar.getRate();
    }
}
