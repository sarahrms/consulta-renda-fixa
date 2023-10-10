package rendafixa.service;

import jakarta.inject.Singleton;
import micronaut.model.ProdutoResponse;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class ProdutosService {

    private final ProdutosDynamoRepository produtosDynamoRepository;

    public List<ProdutoResponse> listarProdutos() {
        List<ProdutoResponse> aplicacaoResponseList = new ArrayList<>();

        List<ProdutosDBModel> aplicacoesDBModelList = produtosDynamoRepository.findAll();

    }
}