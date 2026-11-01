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

/* JADX INFO: compiled from: DivPageTransformationJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class o2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50805a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageTransformationTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivPageTransformationTemplate divPageTransformationTemplate = entityTemplate instanceof DivPageTransformationTemplate ? (DivPageTransformationTemplate) entityTemplate : null;
        if (divPageTransformationTemplate != null && (type = divPageTransformationTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "slide")) {
            return new DivPageTransformationTemplate.c(this.f50805a.x5().getValue().deserialize(parsingContext, (DivPageTransformationSlideTemplate) (divPageTransformationTemplate != null ? divPageTransformationTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "overlap")) {
            return new DivPageTransformationTemplate.b(this.f50805a.u5().getValue().deserialize(parsingContext, (DivPageTransformationOverlapTemplate) (divPageTransformationTemplate != null ? divPageTransformationTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationTemplate divPageTransformationTemplate) throws ParsingException {
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.c) {
            return this.f50805a.x5().getValue().serialize(parsingContext, ((DivPageTransformationTemplate.c) divPageTransformationTemplate).b());
        }
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.b) {
            return this.f50805a.u5().getValue().serialize(parsingContext, ((DivPageTransformationTemplate.b) divPageTransformationTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public o2(JsonParserComponent jsonParserComponent) {
        this.f50805a = jsonParserComponent;
    }
}
