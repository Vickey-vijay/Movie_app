package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.ColorVariable;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65259a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ColorVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new ColorVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ColorVariable colorVariable) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", colorVariable.f45913a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "color");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", colorVariable.f45914b, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }

    public p(JsonParserComponent jsonParserComponent) {
        this.f65259a = jsonParserComponent;
    }
}
