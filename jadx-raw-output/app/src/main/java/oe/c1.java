package oe;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionDictSetValue;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDictSetValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65184a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDictSetValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, C3426d4.i.W, typeHelper), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value", this.f65184a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionDictSetValue divActionDictSetValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, C3426d4.i.W, divActionDictSetValue.f46139a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionDictSetValue.f46140b, this.f65184a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionDictSetValue.f46141c);
        return jSONObject;
    }

    public c1(JsonParserComponent jsonParserComponent) {
        this.f65184a = jsonParserComponent;
    }
}
