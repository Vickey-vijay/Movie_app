package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerLayoutModeJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class s2 implements TemplateResolver<JSONObject, DivPagerLayoutModeTemplate, DivPagerLayoutMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50855a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPagerLayoutMode resolve(ParsingContext parsingContext, DivPagerLayoutModeTemplate divPagerLayoutModeTemplate, JSONObject jSONObject) throws ParsingException {
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.d) {
            return new DivPagerLayoutMode.d(this.f50855a.p5().getValue().resolve(parsingContext, ((DivPagerLayoutModeTemplate.d) divPagerLayoutModeTemplate).b(), jSONObject));
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.b) {
            return new DivPagerLayoutMode.b(this.f50855a.d5().getValue().resolve(parsingContext, ((DivPagerLayoutModeTemplate.b) divPagerLayoutModeTemplate).b(), jSONObject));
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.c) {
            return new DivPagerLayoutMode.c(this.f50855a.m5().getValue().resolve(parsingContext, ((DivPagerLayoutModeTemplate.c) divPagerLayoutModeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public s2(JsonParserComponent jsonParserComponent) {
        this.f50855a = jsonParserComponent;
    }
}
