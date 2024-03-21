package br.fiap.projeto.ponto.adapter.controller.port;

import br.fiap.projeto.ponto.adapter.controller.rest.response.PontoReportDTO;
import br.fiap.projeto.ponto.adapter.controller.rest.response.PontoResponseDTO;
import br.fiap.projeto.ponto.usecase.exception.EntidadeNaoEncontradaException;
import br.fiap.projeto.ponto.usecase.exception.EntradaInvalidaException;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface IPontoRestAdapterController {

    PontoReportDTO getPontosPorMesAno(UUID usuarioId, int mes, int ano) throws EntidadeNaoEncontradaException, EntradaInvalidaException;

    PontoResponseDTO insere(UUID usuarioID) throws EntradaInvalidaException, EntidadeNaoEncontradaException;

    PontoResponseDTO buscaPorData(Date data) throws EntidadeNaoEncontradaException;
}