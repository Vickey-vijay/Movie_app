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

/* JADX INFO: compiled from: DivTextRangeBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class o4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50807a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "solid")) {
            return new DivTextRangeBackground.c(this.f50807a.q7().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "cloud")) {
            return new DivTextRangeBackground.a(this.f50807a.a2().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate = orThrow instanceof DivTextRangeBackgroundTemplate ? (DivTextRangeBackgroundTemplate) orThrow : null;
        if (divTextRangeBackgroundTemplate != null) {
            return this.f50807a.u8().getValue().resolve(parsingContext, divTextRangeBackgroundTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBackground divTextRangeBackground) throws ParsingException {
        if (divTextRangeBackground instanceof DivTextRangeBackground.c) {
            return this.f50807a.q7().getValue().serialize(parsingContext, ((DivTextRangeBackground.c) divTextRangeBackground).c());
        }
        if (divTextRangeBackground instanceof DivTextRangeBackground.a) {
            return this.f50807a.a2().getValue().serialize(parsingContext, ((DivTextRangeBackground.a) divTextRangeBackground).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public o4(JsonParserComponent jsonParserComponent) {
        this.f50807a = jsonParserComponent;
    }
}
