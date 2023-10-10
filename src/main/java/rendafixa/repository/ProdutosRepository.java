package rendafixa.repository;

import io.micronaut.core.annotation.NonNull;
import rendafixa.model.ProdutosDBModel;

import java.util.List;

public interface ProdutosRepository {

    @NonNull
    List<ProdutosDBModel> findAll();
}
