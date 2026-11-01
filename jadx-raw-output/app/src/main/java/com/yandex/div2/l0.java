package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l0 implements TemplateResolver<JSONObject, DivChangeTransitionTemplate, DivChangeTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50723a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivChangeTransition resolve(ParsingContext parsingContext, DivChangeTransitionTemplate divChangeTransitionTemplate, JSONObject jSONObject) throws ParsingException {
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.c) {
            return new DivChangeTransition.c(this.f50723a.T1().getValue().resolve(parsingContext, ((DivChangeTransitionTemplate.c) divChangeTransitionTemplate).b(), jSONObject));
        }
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.a) {
            return new DivChangeTransition.a(this.f50723a.Q1().getValue().resolve(parsingContext, ((DivChangeTransitionTemplate.a) divChangeTransitionTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public l0(JsonParserComponent jsonParserComponent) {
        this.f50723a = jsonParserComponent;
    }
}
