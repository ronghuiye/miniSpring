package io.ronghuiye.minispring.core.convert.support;

import io.ronghuiye.minispring.core.convert.converter.ConverterRegistry;

public class DefaultConversionService extends GenericConversionService{
    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }
}
