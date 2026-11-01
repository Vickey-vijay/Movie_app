package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class p3 implements TemplateResolver<JSONObject, DivShapeTemplate, DivShape> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50821a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShape resolve(ParsingContext parsingContext, DivShapeTemplate divShapeTemplate, JSONObject jSONObject) throws ParsingException {
        if (divShapeTemplate instanceof DivShapeTemplate.c) {
            return new DivShape.c(this.f50821a.z6().getValue().resolve(parsingContext, ((DivShapeTemplate.c) divShapeTemplate).b(), jSONObject));
        }
        if (divShapeTemplate instanceof DivShapeTemplate.a) {
            return new DivShape.a(this.f50821a.Z1().getValue().resolve(parsingContext, ((DivShapeTemplate.a) divShapeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public p3(JsonParserComponent jsonParserComponent) {
        this.f50821a = jsonParserComponent;
    }
}
