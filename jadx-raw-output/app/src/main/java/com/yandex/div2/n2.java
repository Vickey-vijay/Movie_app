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
public final class n2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50781a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageTransformation deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "slide")) {
            return new DivPageTransformation.c(this.f50781a.w5().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "overlap")) {
            return new DivPageTransformation.b(this.f50781a.t5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivPageTransformationTemplate divPageTransformationTemplate = orThrow instanceof DivPageTransformationTemplate ? (DivPageTransformationTemplate) orThrow : null;
        if (divPageTransformationTemplate != null) {
            return this.f50781a.s5().getValue().resolve(parsingContext, divPageTransformationTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPageTransformation divPageTransformation) throws ParsingException {
        if (divPageTransformation instanceof DivPageTransformation.c) {
            return this.f50781a.w5().getValue().serialize(parsingContext, ((DivPageTransformation.c) divPageTransformation).c());
        }
        if (divPageTransformation instanceof DivPageTransformation.b) {
            return this.f50781a.t5().getValue().serialize(parsingContext, ((DivPageTransformation.b) divPageTransformation).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public n2(JsonParserComponent jsonParserComponent) {
        this.f50781a = jsonParserComponent;
    }
}
