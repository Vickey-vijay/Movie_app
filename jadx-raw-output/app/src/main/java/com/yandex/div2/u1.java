package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class u1 implements TemplateResolver<JSONObject, DivInputFilterTemplate, DivInputFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50874a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilter resolve(ParsingContext parsingContext, DivInputFilterTemplate divInputFilterTemplate, JSONObject jSONObject) throws ParsingException {
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.c) {
            return new DivInputFilter.c(this.f50874a.r4().getValue().resolve(parsingContext, ((DivInputFilterTemplate.c) divInputFilterTemplate).b(), jSONObject));
        }
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.b) {
            return new DivInputFilter.b(this.f50874a.l4().getValue().resolve(parsingContext, ((DivInputFilterTemplate.b) divInputFilterTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public u1(JsonParserComponent jsonParserComponent) {
        this.f50874a = jsonParserComponent;
    }
}
