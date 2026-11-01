package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class s3 implements TemplateResolver<JSONObject, DivSizeTemplate, DivSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50856a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSize resolve(ParsingContext parsingContext, DivSizeTemplate divSizeTemplate, JSONObject jSONObject) throws ParsingException {
        if (divSizeTemplate instanceof DivSizeTemplate.b) {
            return new DivSize.b(this.f50856a.y3().getValue().resolve(parsingContext, ((DivSizeTemplate.b) divSizeTemplate).b(), jSONObject));
        }
        if (divSizeTemplate instanceof DivSizeTemplate.c) {
            return new DivSize.c(this.f50856a.a5().getValue().resolve(parsingContext, ((DivSizeTemplate.c) divSizeTemplate).b(), jSONObject));
        }
        if (divSizeTemplate instanceof DivSizeTemplate.d) {
            return new DivSize.d(this.f50856a.B9().getValue().resolve(parsingContext, ((DivSizeTemplate.d) divSizeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public s3(JsonParserComponent jsonParserComponent) {
        this.f50856a = jsonParserComponent;
    }
}
