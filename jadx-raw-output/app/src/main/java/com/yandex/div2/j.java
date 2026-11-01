package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements TemplateResolver<JSONObject, DivActionScrollDestinationTemplate, DivActionScrollDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50696a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionScrollDestination resolve(ParsingContext parsingContext, DivActionScrollDestinationTemplate divActionScrollDestinationTemplate, JSONObject jSONObject) throws ParsingException {
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.d) {
            return new DivActionScrollDestination.d(this.f50696a.W9().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.d) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.c) {
            return new DivActionScrollDestination.c(this.f50696a.H9().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.c) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.e) {
            return new DivActionScrollDestination.e(this.f50696a.ca().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.e) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.b) {
            return new DivActionScrollDestination.b(this.f50696a.E9().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.b) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public j(JsonParserComponent jsonParserComponent) {
        this.f50696a = jsonParserComponent;
    }
}
