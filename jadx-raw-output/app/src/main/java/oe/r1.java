package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionSetVariable;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65275a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionSetVariable((DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f65275a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetVariable divActionSetVariable) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_variable");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionSetVariable.f46262a, this.f65275a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionSetVariable.f46263b);
        return jSONObject;
    }

    public r1(JsonParserComponent jsonParserComponent) {
        this.f65275a = jsonParserComponent;
    }
}
