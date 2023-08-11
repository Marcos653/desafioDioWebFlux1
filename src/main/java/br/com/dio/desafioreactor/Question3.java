package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usuario é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user) {
        if (user.password().length() > 8) {
            return Mono.empty(); // Retorna um Mono que completa sem enviar nenhum valor
        } else {
            return Mono.error(new IllegalArgumentException("Senha inválida!"));
            // Retorna um Mono que dispara uma exceção
        }
    }
}
