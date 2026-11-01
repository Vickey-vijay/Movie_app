package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class u3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50876a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSliderTemplate.RangeTemplate deserialize(ParsingContext parsingContext, DivSliderTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field<Expression<Long>> field = rangeTemplate != null ? rangeTemplate.f48972a : null;
        bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSliderTemplate.RangeTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f48973b : null, this.f50876a.Z2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f48974c : null, lVar), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f48975d : null, this.f50876a.W2()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.f48976e : null, this.f50876a.W2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivSliderTemplate.RangeTemplate rangeTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", rangeTemplate.f48972a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "margins", rangeTemplate.f48973b, this.f50876a.Z2());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", rangeTemplate.f48974c);
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", rangeTemplate.f48975d, this.f50876a.W2());
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", rangeTemplate.f48976e, this.f50876a.W2());
        return jSONObject;
    }

    public u3(JsonParserComponent jsonParserComponent) {
        this.f50876a = jsonParserComponent;
    }
}
