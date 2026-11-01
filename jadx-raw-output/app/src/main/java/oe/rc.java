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
import com.yandex.div2.NumberValue;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class rc implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65280a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new NumberValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, NumberValue numberValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", numberValue.f50469a);
        return jSONObject;
    }

    public rc(JsonParserComponent jsonParserComponent) {
        this.f65280a = jsonParserComponent;
    }
}
