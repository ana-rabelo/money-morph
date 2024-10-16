package br.com.moneyMorph.service;

public interface IDataConversion {
    <T> T convert(String jsonData, Class<T> clazz);
}
