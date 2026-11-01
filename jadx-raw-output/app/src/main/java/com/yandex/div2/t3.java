package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class t3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50866a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSlider.Range deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSlider.Range(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, lVar), (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f50866a.Y2()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, lVar), (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_active_style", this.f50866a.V2()), (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_inactive_style", this.f50866a.V2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivSlider.Range range) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", range.f48900a);
        JsonPropertyParser.write(parsingContext, jSONObject, "margins", range.f48901b, this.f50866a.Y2());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", range.f48902c);
        JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", range.f48903d, this.f50866a.V2());
        JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", range.f48904e, this.f50866a.V2());
        return jSONObject;
    }

    public t3(JsonParserComponent jsonParserComponent) {
        this.f50866a = jsonParserComponent;
    }
}
