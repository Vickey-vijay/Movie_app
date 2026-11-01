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

/* JADX INFO: compiled from: DivRadialGradientRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50629a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRadius deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "fixed")) {
            return new DivRadialGradientRadius.b(this.f50629a.w3().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "relative")) {
            return new DivRadialGradientRadius.c(this.f50629a.u6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate = orThrow instanceof DivRadialGradientRadiusTemplate ? (DivRadialGradientRadiusTemplate) orThrow : null;
        if (divRadialGradientRadiusTemplate != null) {
            return this.f50629a.q6().getValue().resolve(parsingContext, divRadialGradientRadiusTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRadius divRadialGradientRadius) throws ParsingException {
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            return this.f50629a.w3().getValue().serialize(parsingContext, ((DivRadialGradientRadius.b) divRadialGradientRadius).c());
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
            return this.f50629a.u6().getValue().serialize(parsingContext, ((DivRadialGradientRadius.c) divRadialGradientRadius).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public f3(JsonParserComponent jsonParserComponent) {
        this.f50629a = jsonParserComponent;
    }
}
