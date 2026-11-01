package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class z2 implements TemplateResolver<JSONObject, DivPivotTemplate, DivPivot> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50945a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivot resolve(ParsingContext parsingContext, DivPivotTemplate divPivotTemplate, JSONObject jSONObject) throws ParsingException {
        if (divPivotTemplate instanceof DivPivotTemplate.b) {
            return new DivPivot.b(this.f50945a.S5().getValue().resolve(parsingContext, ((DivPivotTemplate.b) divPivotTemplate).b(), jSONObject));
        }
        if (divPivotTemplate instanceof DivPivotTemplate.c) {
            return new DivPivot.c(this.f50945a.Y5().getValue().resolve(parsingContext, ((DivPivotTemplate.c) divPivotTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public z2(JsonParserComponent jsonParserComponent) {
        this.f50945a = jsonParserComponent;
    }
}
