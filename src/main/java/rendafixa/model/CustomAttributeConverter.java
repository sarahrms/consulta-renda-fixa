package rendafixa.model;

import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.enhanced.dynamodb.internal.converter.attribute.EnhancedAttributeValue;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CustomAttributeConverter implements AttributeConverter<AplicacaoDBModel> {

    public CustomAttributeConverter() {
    }

    @Override
    public AttributeValue transformFrom(AplicacaoDBModel input) {
        Map map = new HashMap<String, String>();
        map.put("valor", input.getValor());
        map.put("dataAplicacao", input.getDataAplicacao());

        return EnhancedAttributeValue.fromMap(map).toAttributeValue();
    }

    @Override
    public AplicacaoDBModel transformTo(AttributeValue input) {
        return new AplicacaoDBModel(input.getValueForField("dataAplicacao", String.class).get(),
                input.getValueForField("valor", BigDecimal.class).get());
    }

    @Override
    public EnhancedType<AplicacaoDBModel> type() {
        return EnhancedType.of(AplicacaoDBModel.class);
    }

    @Override
    public AttributeValueType attributeValueType() {
        return AttributeValueType.S;
    }
}