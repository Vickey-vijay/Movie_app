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
public final class k4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50716a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextGradient deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "gradient")) {
            return new DivTextGradient.b(this.f50716a.V4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "radial_gradient")) {
            return new DivTextGradient.c(this.f50716a.l6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTextGradientTemplate divTextGradientTemplate = orThrow instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) orThrow : null;
        if (divTextGradientTemplate != null) {
            return this.f50716a.i8().getValue().resolve(parsingContext, divTextGradientTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTextGradient divTextGradient) throws ParsingException {
        if (divTextGradient instanceof DivTextGradient.b) {
            return this.f50716a.V4().getValue().serialize(parsingContext, ((DivTextGradient.b) divTextGradient).c());
        }
        if (divTextGradient instanceof DivTextGradient.c) {
            return this.f50716a.l6().getValue().serialize(parsingContext, ((DivTextGradient.c) divTextGradient).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public k4(JsonParserComponent jsonParserComponent) {
        this.f50716a = jsonParserComponent;
    }
}
