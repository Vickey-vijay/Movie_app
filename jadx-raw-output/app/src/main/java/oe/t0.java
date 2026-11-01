package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionArraySetValue;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArraySetValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65290a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArraySetValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionArraySetValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f65290a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionArraySetValue divActionArraySetValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", divActionArraySetValue.f46107a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionArraySetValue.f46108b, this.f65290a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionArraySetValue.f46109c);
        return jSONObject;
    }

    public t0(JsonParserComponent jsonParserComponent) {
        this.f65290a = jsonParserComponent;
    }
}
