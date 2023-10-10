package rendafixa.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;
import jakarta.validation.constraints.NotBlank;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

import java.io.Serializable;

@Introspected
@DynamoDbBean
public class ProdutosDBModel implements Serializable {

    @NonNull
    @NotBlank
    private String codigoProduto;

    @NonNull
    @NotBlank
    private String nomeProduto;

    @NonNull
    @NotBlank
    private String tipoProduto;
}
