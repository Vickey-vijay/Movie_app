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

/* JADX INFO: compiled from: DivTextGradientJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50734a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextGradientTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTextGradientTemplate divTextGradientTemplate = entityTemplate instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) entityTemplate : null;
        if (divTextGradientTemplate != null && (type = divTextGradientTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "gradient")) {
            return new DivTextGradientTemplate.b(this.f50734a.W4().getValue().deserialize(parsingContext, (DivLinearGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "radial_gradient")) {
            return new DivTextGradientTemplate.c(this.f50734a.m6().getValue().deserialize(parsingContext, (DivRadialGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTextGradientTemplate divTextGradientTemplate) throws ParsingException {
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.b) {
            return this.f50734a.W4().getValue().serialize(parsingContext, ((DivTextGradientTemplate.b) divTextGradientTemplate).b());
        }
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.c) {
            return this.f50734a.m6().getValue().serialize(parsingContext, ((DivTextGradientTemplate.c) divTextGradientTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public l4(JsonParserComponent jsonParserComponent) {
        this.f50734a = jsonParserComponent;
    }
}
