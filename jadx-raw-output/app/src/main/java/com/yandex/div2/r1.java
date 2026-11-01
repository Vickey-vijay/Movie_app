package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class r1 implements TemplateResolver<JSONObject, DivIndicatorItemPlacementTemplate, DivIndicatorItemPlacement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50844a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivIndicatorItemPlacement resolve(ParsingContext parsingContext, DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate, JSONObject jSONObject) throws ParsingException {
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.b) {
            return new DivIndicatorItemPlacement.b(this.f50844a.L2().getValue().resolve(parsingContext, ((DivIndicatorItemPlacementTemplate.b) divIndicatorItemPlacementTemplate).b(), jSONObject));
        }
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.c) {
            return new DivIndicatorItemPlacement.c(this.f50844a.B7().getValue().resolve(parsingContext, ((DivIndicatorItemPlacementTemplate.c) divIndicatorItemPlacementTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public r1(JsonParserComponent jsonParserComponent) {
        this.f50844a = jsonParserComponent;
    }
}
