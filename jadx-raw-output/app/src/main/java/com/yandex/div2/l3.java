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

/* JADX INFO: compiled from: DivSelectJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l3 implements TemplateResolver<JSONObject, DivSelectTemplate.OptionTemplate, DivSelect.Option> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50733a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSelect.Option resolve(ParsingContext parsingContext, DivSelectTemplate.OptionTemplate optionTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = optionTemplate.f48670a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivSelect.Option(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "text", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, optionTemplate.f48671b, jSONObject, "value", typeHelper));
    }

    public l3(JsonParserComponent jsonParserComponent) {
        this.f50733a = jsonParserComponent;
    }
}
