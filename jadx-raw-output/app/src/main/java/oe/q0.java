package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionArrayRemoveValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65267a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayRemoveValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionArrayRemoveValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayRemoveValue divActionArrayRemoveValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", divActionArrayRemoveValue.f46098a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_remove_value");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionArrayRemoveValue.f46099b);
        return jSONObject;
    }

    public q0(JsonParserComponent jsonParserComponent) {
        this.f65267a = jsonParserComponent;
    }
}
