package io.ronghuiye.minispring.test.converter;

import io.ronghuiye.minispring.core.convert.converter.Converter;

public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
