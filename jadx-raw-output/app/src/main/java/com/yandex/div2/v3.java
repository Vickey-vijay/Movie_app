package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSliderJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v3 implements TemplateResolver<JSONObject, DivSliderTemplate.RangeTemplate, DivSlider.Range> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50882a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSlider.Range resolve(ParsingContext parsingContext, DivSliderTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<Long>> field = rangeTemplate.f48972a;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        bk.l<Number, Long> lVar = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSlider.Range(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "end", typeHelper, lVar), (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f48973b, jSONObject, "margins", this.f50882a.a3(), this.f50882a.Y2()), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.f48974c, jSONObject, "start", typeHelper, lVar), (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f48975d, jSONObject, "track_active_style", this.f50882a.X2(), this.f50882a.V2()), (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.f48976e, jSONObject, "track_inactive_style", this.f50882a.X2(), this.f50882a.V2()));
    }

    public v3(JsonParserComponent jsonParserComponent) {
        this.f50882a = jsonParserComponent;
    }
}
