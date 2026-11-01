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
import com.yandex.div2.StrValue;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class cd implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65185a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new StrValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, StrValue strValue) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_STRING);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", strValue.f50520a);
        return jSONObject;
    }

    public cd(JsonParserComponent jsonParserComponent) {
        this.f65185a = jsonParserComponent;
    }
}
