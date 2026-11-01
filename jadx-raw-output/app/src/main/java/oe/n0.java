package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionArrayInsertValue;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65244a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayInsertValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionArrayInsertValue(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f65244a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayInsertValue divActionArrayInsertValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", divActionArrayInsertValue.f46087a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionArrayInsertValue.f46088b, this.f65244a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionArrayInsertValue.f46089c);
        return jSONObject;
    }

    public n0(JsonParserComponent jsonParserComponent) {
        this.f65244a = jsonParserComponent;
    }
}
