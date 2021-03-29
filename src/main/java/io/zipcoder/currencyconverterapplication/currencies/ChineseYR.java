package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.omg.CORBA.Current;

public class ChineseYR implements ConvertableCurrency {
    CurrencyType chineseYR;

    public ChineseYR() {
        chineseYR = CurrencyType.CHINESE_YR;
    }

    @Override
    public CurrencyType getType() {
        return chineseYR;
    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / chineseYR.getRate();
    }
}
