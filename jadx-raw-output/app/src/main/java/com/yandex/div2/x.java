package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x implements TemplateResolver<JSONObject, DivAnimatorTemplate, DivAnimator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50902a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAnimator resolve(ParsingContext parsingContext, DivAnimatorTemplate divAnimatorTemplate, JSONObject jSONObject) throws ParsingException {
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.a) {
            return new DivAnimator.a(this.f50902a.l2().getValue().resolve(parsingContext, ((DivAnimatorTemplate.a) divAnimatorTemplate).b(), jSONObject));
        }
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.c) {
            return new DivAnimator.c(this.f50902a.j5().getValue().resolve(parsingContext, ((DivAnimatorTemplate.c) divAnimatorTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public x(JsonParserComponent jsonParserComponent) {
        this.f50902a = jsonParserComponent;
    }
}
