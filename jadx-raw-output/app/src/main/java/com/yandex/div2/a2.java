package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a2 implements TemplateResolver<JSONObject, DivInputTemplate.NativeInterfaceTemplate, DivInput.NativeInterface> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50564a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInput.NativeInterface resolve(ParsingContext parsingContext, DivInputTemplate.NativeInterfaceTemplate nativeInterfaceTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivInput.NativeInterface(JsonFieldResolver.resolveExpression(parsingContext, nativeInterfaceTemplate.f47972a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    public a2(JsonParserComponent jsonParserComponent) {
        this.f50564a = jsonParserComponent;
    }
}
