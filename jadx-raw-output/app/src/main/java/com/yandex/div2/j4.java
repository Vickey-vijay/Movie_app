package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class j4 implements TemplateResolver<JSONObject, DivTextTemplate.EllipsisTemplate, DivText.Ellipsis> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50701a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivText.Ellipsis resolve(ParsingContext parsingContext, DivTextTemplate.EllipsisTemplate ellipsisTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivText.Ellipsis(JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.f49761a, jSONObject, "actions", this.f50701a.w0(), this.f50701a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.f49762b, jSONObject, "images", this.f50701a.o8(), this.f50701a.m8()), JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.f49763c, jSONObject, "ranges", this.f50701a.A8(), this.f50701a.y8()), JsonFieldResolver.resolveExpression(parsingContext, ellipsisTemplate.f49764d, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public j4(JsonParserComponent jsonParserComponent) {
        this.f50701a = jsonParserComponent;
    }
}
