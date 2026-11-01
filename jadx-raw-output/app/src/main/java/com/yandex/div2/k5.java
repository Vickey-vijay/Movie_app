package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class k5 implements TemplateResolver<JSONObject, DivVideoSourceTemplate, DivVideoSource> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50717a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVideoSource resolve(ParsingContext parsingContext, DivVideoSourceTemplate divVideoSourceTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivVideoSource(JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoSourceTemplate.f50047a, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divVideoSourceTemplate.f50048b, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (DivVideoSource.Resolution) JsonFieldResolver.resolveOptional(parsingContext, divVideoSourceTemplate.f50049c, jSONObject, "resolution", this.f50717a.v9(), this.f50717a.t9()), JsonFieldResolver.resolveExpression(parsingContext, divVideoSourceTemplate.f50050d, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    public k5(JsonParserComponent jsonParserComponent) {
        this.f50717a = jsonParserComponent;
    }
}
