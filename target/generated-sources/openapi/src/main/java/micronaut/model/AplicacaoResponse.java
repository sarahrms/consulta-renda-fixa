/*
 * API Consulta Renda Fixa
 * Uma API para listar aplicações e produtos Renda Fixa.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package micronaut.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.micronaut.core.annotation.Introspected;
import micronaut.invoker.annotation.HardNullable;
import jakarta.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AplicacaoResponse
 */
@Serdeable
@JsonPropertyOrder({
    AplicacaoResponse.JSON_PROPERTY_CODIGO_PRODUTO,
    AplicacaoResponse.JSON_PROPERTY_VALOR,
    AplicacaoResponse.JSON_PROPERTY_DATA
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class AplicacaoResponse {

    public static final String JSON_PROPERTY_CODIGO_PRODUTO = "codigoProduto";
    public static final String JSON_PROPERTY_VALOR = "valor";
    public static final String JSON_PROPERTY_DATA = "data";

    /**
     * O código do produto aplicado.
     */
    @HardNullable
    @Schema(name = "codigoProduto", description = "O código do produto aplicado.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CODIGO_PRODUTO)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String codigoProduto;

    /**
     * O valor da aplicação.
     */
    @HardNullable
    @Schema(name = "valor", description = "O valor da aplicação.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_VALOR)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Double valor;

    /**
     * A data da aplicação.
     */
    @HardNullable
    @Schema(name = "data", description = "A data da aplicação.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private LocalDate data;

    public AplicacaoResponse() {
    }

    /**
     * O código do produto aplicado.
     * @return the codigoProduto property value
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * Set the codigoProduto property value
     */
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * Set codigoProduto in a chainable fashion.
     * @return The same instance of AplicacaoResponse for chaining.
     */
    public AplicacaoResponse codigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
        return this;
    }

    /**
     * O valor da aplicação.
     * @return the valor property value
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Set the valor property value
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * Set valor in a chainable fashion.
     * @return The same instance of AplicacaoResponse for chaining.
     */
    public AplicacaoResponse valor(Double valor) {
        this.valor = valor;
        return this;
    }

    /**
     * A data da aplicação.
     * @return the data property value
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Set the data property value
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Set data in a chainable fashion.
     * @return The same instance of AplicacaoResponse for chaining.
     */
    public AplicacaoResponse data(LocalDate data) {
        this.data = data;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AplicacaoResponse aplicacaoResponse = (AplicacaoResponse) o;
        return Objects.equals(this.codigoProduto, aplicacaoResponse.codigoProduto) &&
            Objects.equals(this.valor, aplicacaoResponse.valor) &&
            Objects.equals(this.data, aplicacaoResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProduto, valor, data);
    }

    @Override
    public String toString() {
        return "AplicacaoResponse("
            + "codigoProduto: " + getCodigoProduto() + ", "
            + "valor: " + getValor() + ", "
            + "data: " + getData()
            + ")";
    }

}