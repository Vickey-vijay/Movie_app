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
public final class b3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50576a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientCenterTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = entityTemplate instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) entityTemplate : null;
        if (divRadialGradientCenterTemplate != null && (type = divRadialGradientCenterTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "fixed")) {
            return new DivRadialGradientCenterTemplate.b(this.f50576a.j6().getValue().deserialize(parsingContext, (DivRadialGradientFixedCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "relative")) {
            return new DivRadialGradientCenterTemplate.c(this.f50576a.s6().getValue().deserialize(parsingContext, (DivRadialGradientRelativeCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientCenterTemplate divRadialGradientCenterTemplate) throws ParsingException {
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.b) {
            return this.f50576a.j6().getValue().serialize(parsingContext, ((DivRadialGradientCenterTemplate.b) divRadialGradientCenterTemplate).b());
        }
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.c) {
            return this.f50576a.s6().getValue().serialize(parsingContext, ((DivRadialGradientCenterTemplate.c) divRadialGradientCenterTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public b3(JsonParserComponent jsonParserComponent) {
        this.f50576a = jsonParserComponent;
    }
}
