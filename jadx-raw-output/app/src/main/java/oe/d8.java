package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivRadialGradientRelativeCenter;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d8 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65189a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRelativeCenter deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivRadialGradientRelativeCenter(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeCenter divRadialGradientRelativeCenter) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientRelativeCenter.f48478a);
        return jSONObject;
    }

    public d8(JsonParserComponent jsonParserComponent) {
        this.f65189a = jsonParserComponent;
    }
}
