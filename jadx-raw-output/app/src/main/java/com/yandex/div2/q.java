package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements TemplateResolver<JSONObject, DivActionSubmitTemplate.RequestTemplate.HeaderTemplate, DivActionSubmit.Request.Header> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50823a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmit.Request.Header resolve(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate.HeaderTemplate headerTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = headerTemplate.f46318a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionSubmit.Request.Header(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "name", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, headerTemplate.f46319b, jSONObject, "value", typeHelper));
    }

    public q(JsonParserComponent jsonParserComponent) {
        this.f50823a = jsonParserComponent;
    }
}
