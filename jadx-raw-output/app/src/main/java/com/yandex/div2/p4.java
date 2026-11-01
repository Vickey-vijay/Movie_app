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
public final class p4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50822a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeBackgroundTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate = entityTemplate instanceof DivTextRangeBackgroundTemplate ? (DivTextRangeBackgroundTemplate) entityTemplate : null;
        if (divTextRangeBackgroundTemplate != null && (type = divTextRangeBackgroundTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "solid")) {
            return new DivTextRangeBackgroundTemplate.c(this.f50822a.r7().getValue().deserialize(parsingContext, (DivSolidBackgroundTemplate) (divTextRangeBackgroundTemplate != null ? divTextRangeBackgroundTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "cloud")) {
            return new DivTextRangeBackgroundTemplate.a(this.f50822a.b2().getValue().deserialize(parsingContext, (DivCloudBackgroundTemplate) (divTextRangeBackgroundTemplate != null ? divTextRangeBackgroundTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate) throws ParsingException {
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.c) {
            return this.f50822a.r7().getValue().serialize(parsingContext, ((DivTextRangeBackgroundTemplate.c) divTextRangeBackgroundTemplate).b());
        }
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.a) {
            return this.f50822a.b2().getValue().serialize(parsingContext, ((DivTextRangeBackgroundTemplate.a) divTextRangeBackgroundTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public p4(JsonParserComponent jsonParserComponent) {
        this.f50822a = jsonParserComponent;
    }
}
