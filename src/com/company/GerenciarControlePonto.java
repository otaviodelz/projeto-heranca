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
        rpg.apresentarRegistroPonto();

        RegistroPonto rps = new RegistroPonto();
        rps.setFunc(secretaria);
        rps.setDataRegistro(LocalDate.of(2020, 6, 16));
        rps.setHoraEntrada(LocalDateTime.of(2020, 6, 16, 8, 00));
        rps.apresentarRegistroPonto();

        RegistroPonto rpo = new RegistroPonto();
        rpo.setFunc(operador);
        rpo.setDataRegistro(LocalDate.of(2020, 6, 17));
        rpo.setHoraEntrada(LocalDateTime.of(2020, 6, 17, 7, 45));
        rpo.apresentarRegistroPonto();

        RegistroPonto rpgSaida = new RegistroPonto();
        rpgSaida.setFunc(gerente);
        rpgSaida.setDataRegistro(LocalDate.of(2020, 6, 15));
        rpgSaida.setHoraEntrada(LocalDateTime.of(2020, 6, 15, 8, 15));
        rpgSaida.setHoraSaida(LocalDateTime.of(2020, 6, 15, 18, 00));
        rpgSaida.apresentarRegistroPonto();

        RegistroPonto rpsSaida = new RegistroPonto();
        rpsSaida.setFunc(secretaria);
        rpsSaida.setDataRegistro(LocalDate.of(2020, 6, 16));
        rpsSaida.setHoraEntrada(LocalDateTime.of(2020, 6, 16, 8, 00));
        rpsSaida.setHoraSaida(LocalDateTime.of(2020, 6, 16, 17, 45));
        rpsSaida.apresentarRegistroPonto();

        RegistroPonto rpoSaida = new RegistroPonto();
        rpoSaida.setFunc(operador);
        rpoSaida.setDataRegistro(LocalDate.of(2020, 6, 17));
        rpoSaida.setHoraEntrada(LocalDateTime.of(2020, 6, 17, 7, 45));
        rpoSaida.setHoraSaida(LocalDateTime.of(2020, 6, 17, 18, 15));
        rpoSaida.apresentarRegistroPonto();

    }
}
