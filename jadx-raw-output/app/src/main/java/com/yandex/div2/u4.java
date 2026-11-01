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

/* JADX INFO: compiled from: DivTextRangeMaskJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class u4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50877a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeMaskTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTextRangeMaskTemplate divTextRangeMaskTemplate = entityTemplate instanceof DivTextRangeMaskTemplate ? (DivTextRangeMaskTemplate) entityTemplate : null;
        if (divTextRangeMaskTemplate != null && (type = divTextRangeMaskTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "particles")) {
            return new DivTextRangeMaskTemplate.b(this.f50877a.H8().getValue().deserialize(parsingContext, (DivTextRangeMaskParticlesTemplate) (divTextRangeMaskTemplate != null ? divTextRangeMaskTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "solid")) {
            return new DivTextRangeMaskTemplate.c(this.f50877a.K8().getValue().deserialize(parsingContext, (DivTextRangeMaskSolidTemplate) (divTextRangeMaskTemplate != null ? divTextRangeMaskTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskTemplate divTextRangeMaskTemplate) throws ParsingException {
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.b) {
            return this.f50877a.H8().getValue().serialize(parsingContext, ((DivTextRangeMaskTemplate.b) divTextRangeMaskTemplate).b());
        }
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.c) {
            return this.f50877a.K8().getValue().serialize(parsingContext, ((DivTextRangeMaskTemplate.c) divTextRangeMaskTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public u4(JsonParserComponent jsonParserComponent) {
        this.f50877a = jsonParserComponent;
    }
}
