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

/* JADX INFO: compiled from: DivStrokeStyleJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50566a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "solid")) {
            return new DivStrokeStyle.c(this.f50566a.L7().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "dashed")) {
            return new DivStrokeStyle.b(this.f50566a.F7().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivStrokeStyleTemplate divStrokeStyleTemplate = orThrow instanceof DivStrokeStyleTemplate ? (DivStrokeStyleTemplate) orThrow : null;
        if (divStrokeStyleTemplate != null) {
            return this.f50566a.K7().getValue().resolve(parsingContext, divStrokeStyleTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyle divStrokeStyle) throws ParsingException {
        if (divStrokeStyle instanceof DivStrokeStyle.c) {
            return this.f50566a.L7().getValue().serialize(parsingContext, ((DivStrokeStyle.c) divStrokeStyle).c());
        }
        if (divStrokeStyle instanceof DivStrokeStyle.b) {
            return this.f50566a.F7().getValue().serialize(parsingContext, ((DivStrokeStyle.b) divStrokeStyle).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public a4(JsonParserComponent jsonParserComponent) {
        this.f50566a = jsonParserComponent;
    }
}
