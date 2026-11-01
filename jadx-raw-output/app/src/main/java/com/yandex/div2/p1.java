package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class p1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50819a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivIndicatorItemPlacement deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "default")) {
            return new DivIndicatorItemPlacement.b(this.f50819a.J2().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "stretch")) {
            return new DivIndicatorItemPlacement.c(this.f50819a.z7().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate = orThrow instanceof DivIndicatorItemPlacementTemplate ? (DivIndicatorItemPlacementTemplate) orThrow : null;
        if (divIndicatorItemPlacementTemplate != null) {
            return this.f50819a.c4().getValue().resolve(parsingContext, divIndicatorItemPlacementTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivIndicatorItemPlacement divIndicatorItemPlacement) throws ParsingException {
        if (divIndicatorItemPlacement instanceof DivIndicatorItemPlacement.b) {
            return this.f50819a.J2().getValue().serialize(parsingContext, ((DivIndicatorItemPlacement.b) divIndicatorItemPlacement).c());
        }
        if (divIndicatorItemPlacement instanceof DivIndicatorItemPlacement.c) {
            return this.f50819a.z7().getValue().serialize(parsingContext, ((DivIndicatorItemPlacement.c) divIndicatorItemPlacement).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public p1(JsonParserComponent jsonParserComponent) {
        this.f50819a = jsonParserComponent;
    }
}
