package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class q4 implements TemplateResolver<JSONObject, DivTextRangeBackgroundTemplate, DivTextRangeBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50834a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeBackground resolve(ParsingContext parsingContext, DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.c) {
            return new DivTextRangeBackground.c(this.f50834a.s7().getValue().resolve(parsingContext, ((DivTextRangeBackgroundTemplate.c) divTextRangeBackgroundTemplate).b(), jSONObject));
        }
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.a) {
            return new DivTextRangeBackground.a(this.f50834a.c2().getValue().resolve(parsingContext, ((DivTextRangeBackgroundTemplate.a) divTextRangeBackgroundTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public q4(JsonParserComponent jsonParserComponent) {
        this.f50834a = jsonParserComponent;
    }
}
