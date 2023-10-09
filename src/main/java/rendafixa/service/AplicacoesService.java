package rendafixa.service;

import jakarta.inject.Singleton;
import micronaut.model.AplicacaoResponse;
import rendafixa.model.AplicacaoDBModel;
import rendafixa.model.AplicacoesDBModel;
import rendafixa.repository.AplicacoesDynamoRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class AplicacoesService {

    private final AplicacoesDynamoRepository aplicacoesDynamoRepository;

    public AplicacoesService(AplicacoesDynamoRepository aplicacoesDynamoRepositoryParam) {
        this.aplicacoesDynamoRepository = aplicacoesDynamoRepositoryParam;
    }

    public List<AplicacaoResponse> listarAplicacoes(String contaCorrente) {
        List<AplicacaoResponse> aplicacaoResponseList = new ArrayList<>();

        List<AplicacoesDBModel> aplicacoesDBModelList = aplicacoesDynamoRepository.findByContaCorrente(contaCorrente);
        aplicacoesDBModelList.stream()
                .forEach(aplicacoesDBModel -> {
                    List<AplicacaoDBModel> aplicacoes = aplicacoesDBModel.getAplicacoes();
                    aplicacoes.stream().forEach(aplicacaoDBModel -> {
                        AplicacaoResponse aplicacaoResponse = new AplicacaoResponse();
                        aplicacaoResponse.setData(LocalDate.parse(aplicacaoDBModel.getDataAplicacao()));
                        aplicacaoResponse.setValor(aplicacaoDBModel.getValor().doubleValue());
                        aplicacaoResponse.setCodigoProduto(aplicacoesDBModel.getCodigoProduto());

                        aplicacaoResponseList.add(aplicacaoResponse);
                    });
                });
        return aplicacaoResponseList;
    }
}
