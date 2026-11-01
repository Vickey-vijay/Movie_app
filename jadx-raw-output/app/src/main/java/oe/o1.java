package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionSetStoredValue;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetStoredValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65253a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetStoredValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionSetStoredValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f65253a.h9()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetStoredValue divActionSetStoredValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "lifetime", divActionSetStoredValue.f46251a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", divActionSetStoredValue.f46252b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionSetStoredValue.f46253c, this.f65253a.h9());
        return jSONObject;
    }

    public o1(JsonParserComponent jsonParserComponent) {
        this.f65253a = jsonParserComponent;
    }
}
