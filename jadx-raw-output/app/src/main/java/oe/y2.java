package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivCurrencyInputMask;
import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65325a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCurrencyInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivCurrencyInputMask(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivCurrencyInputMask divCurrencyInputMask) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, CommonUrlParts.LOCALE, divCurrencyInputMask.f46858a);
        JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", divCurrencyInputMask.a());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "currency");
        return jSONObject;
    }

    public y2(JsonParserComponent jsonParserComponent) {
        this.f65325a = jsonParserComponent;
    }
}
