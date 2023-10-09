package rendafixa.configuration;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.annotation.ConfigurationProperties;
import jakarta.validation.constraints.NotBlank;

@Requires(property = "dynamodb.aplicacoes.table-name")
@ConfigurationProperties("dynamodb.aplicacoes")
public interface AplicacoesDynamoConfiguration {
    @NotBlank
    String getTableName();
}