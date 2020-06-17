package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        Gerente gerente = new Gerente();
        gerente.setNome("Roberto");
        gerente.setLogin("roberto");
        gerente.setSenha("123");

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Marisa");
        secretaria.setRamal("5001");
        secretaria.setTelefone("1234-5678");

        Operador operador = new Operador();
        operador.setNome("Tiago");
        operador.setValorHora(7.50);

        RegistroPonto rpg = new RegistroPonto();
        rpg.setFunc(gerente);
        rpg.setDataRegistro(LocalDate.of(2020, 6, 15));
        rpg.setHoraEntrada(LocalDateTime.of(2020, 6, 15, 8, 15));
        rpg.setHoraSaida(LocalDateTime.of(2020, 6, 15, 6, 00));
        rpg.apresentarRegistroPonto();

        RegistroPonto rps = new RegistroPonto();
        rps.setFunc(secretaria);
        rps.setDataRegistro(LocalDate.of(2020, 6, 16));
        rps.setHoraEntrada(LocalDateTime.of(2020, 6, 16, 8, 00));
        rps.setHoraSaida(LocalDateTime.of(2020, 6, 16, 5, 45));
        rps.apresentarRegistroPonto();

        RegistroPonto rpo = new RegistroPonto();
        rpo.setFunc(operador);
        rpo.setDataRegistro(LocalDate.of(2020, 6, 17));
        rpo.setHoraEntrada(LocalDateTime.of(2020, 6, 17, 7, 45));
        rpo.setHoraSaida(LocalDateTime.of(2020, 6, 17, 6, 15));
        rpo.apresentarRegistroPonto();

    }
}
