package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b5 implements TemplateResolver<JSONObject, DivTooltipModeTemplate, DivTooltipMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50578a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipMode resolve(ParsingContext parsingContext, DivTooltipModeTemplate divTooltipModeTemplate, JSONObject jSONObject) throws ParsingException {
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.c) {
            return new DivTooltipMode.c(this.f50578a.a9().getValue().resolve(parsingContext, ((DivTooltipModeTemplate.c) divTooltipModeTemplate).b(), jSONObject));
        }
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.b) {
            return new DivTooltipMode.b(this.f50578a.X8().getValue().resolve(parsingContext, ((DivTooltipModeTemplate.b) divTooltipModeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public b5(JsonParserComponent jsonParserComponent) {
        this.f50578a = jsonParserComponent;
    }
}
