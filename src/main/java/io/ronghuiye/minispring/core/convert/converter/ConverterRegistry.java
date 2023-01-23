package io.ronghuiye.minispring.core.convert.converter;

public interface ConverterRegistry {
    void addConverter(Converter<?, ?> converter);

    void addConverter(GenericConverter converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);
}
