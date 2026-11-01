package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.NumberVariable;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class uc implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65303a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new NumberVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, NumberVariable numberVariable) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", numberVariable.f50476a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", numberVariable.f50477b);
        return jSONObject;
    }

    public uc(JsonParserComponent jsonParserComponent) {
        this.f65303a = jsonParserComponent;
    }
}
