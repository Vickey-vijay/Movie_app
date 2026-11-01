package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAppearanceTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements TemplateResolver<JSONObject, DivAppearanceTransitionTemplate, DivAppearanceTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50569a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAppearanceTransition resolve(ParsingContext parsingContext, DivAppearanceTransitionTemplate divAppearanceTransitionTemplate, JSONObject jSONObject) throws ParsingException {
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.d) {
            return new DivAppearanceTransition.d(this.f50569a.y1().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.d) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.b) {
            return new DivAppearanceTransition.b(this.f50569a.g3().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.b) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.c) {
            return new DivAppearanceTransition.c(this.f50569a.C6().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.c) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.e) {
            return new DivAppearanceTransition.e(this.f50569a.g7().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.e) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public b0(JsonParserComponent jsonParserComponent) {
        this.f50569a = jsonParserComponent;
    }
}
