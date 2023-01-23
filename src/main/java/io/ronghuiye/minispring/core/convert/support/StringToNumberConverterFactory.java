package io.ronghuiye.minispring.core.convert.support;

import io.ronghuiye.minispring.core.convert.converter.Converter;
import io.ronghuiye.minispring.core.convert.converter.ConverterFactory;
import io.ronghuiye.minispring.util.NumberUtils;

public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {
    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {
        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }

}
