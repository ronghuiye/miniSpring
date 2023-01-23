package io.ronghuiye.minispring.core.convert.converter;

public interface Converter<S, T> {
    T convert(S source);
}
