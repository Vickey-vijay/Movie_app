package oe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StrVariable;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class fd implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65200a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new StrVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, StrVariable strVariable) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", strVariable.f50527a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_STRING);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", strVariable.f50528b);
        return jSONObject;
    }

    public fd(JsonParserComponent jsonParserComponent) {
        this.f65200a = jsonParserComponent;
    }
}
