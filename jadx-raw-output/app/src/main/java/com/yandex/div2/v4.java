package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v4 implements TemplateResolver<JSONObject, DivTextRangeMaskTemplate, DivTextRangeMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50883a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeMask resolve(ParsingContext parsingContext, DivTextRangeMaskTemplate divTextRangeMaskTemplate, JSONObject jSONObject) throws ParsingException {
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.b) {
            return new DivTextRangeMask.b(this.f50883a.I8().getValue().resolve(parsingContext, ((DivTextRangeMaskTemplate.b) divTextRangeMaskTemplate).b(), jSONObject));
        }
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.c) {
            return new DivTextRangeMask.c(this.f50883a.L8().getValue().resolve(parsingContext, ((DivTextRangeMaskTemplate.c) divTextRangeMaskTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public v4(JsonParserComponent jsonParserComponent) {
        this.f50883a = jsonParserComponent;
    }
}
