package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c1 implements TemplateResolver<JSONObject, DivDrawableTemplate, DivDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50585a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDrawable resolve(ParsingContext parsingContext, DivDrawableTemplate divDrawableTemplate, JSONObject jSONObject) throws ParsingException {
        if (divDrawableTemplate instanceof DivDrawableTemplate.b) {
            return new DivDrawable.b(this.f50585a.U6().getValue().resolve(parsingContext, ((DivDrawableTemplate.b) divDrawableTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public c1(JsonParserComponent jsonParserComponent) {
        this.f50585a = jsonParserComponent;
    }
}
