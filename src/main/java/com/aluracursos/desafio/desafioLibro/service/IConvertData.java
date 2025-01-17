package com.aluracursos.desafio.desafioLibro.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> modelClass) throws Exception;
}
