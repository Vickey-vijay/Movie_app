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

/* JADX INFO: compiled from: DivRadialGradientCenterJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50565a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientCenter deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "fixed")) {
            return new DivRadialGradientCenter.b(this.f50565a.i6().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "relative")) {
            return new DivRadialGradientCenter.c(this.f50565a.r6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = orThrow instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) orThrow : null;
        if (divRadialGradientCenterTemplate != null) {
            return this.f50565a.e6().getValue().resolve(parsingContext, divRadialGradientCenterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientCenter divRadialGradientCenter) throws ParsingException {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            return this.f50565a.i6().getValue().serialize(parsingContext, ((DivRadialGradientCenter.b) divRadialGradientCenter).c());
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return this.f50565a.r6().getValue().serialize(parsingContext, ((DivRadialGradientCenter.c) divRadialGradientCenter).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public a3(JsonParserComponent jsonParserComponent) {
        this.f50565a = jsonParserComponent;
    }
}
