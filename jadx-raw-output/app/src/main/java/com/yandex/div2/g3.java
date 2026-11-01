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
public final class g3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50648a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRadiusTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate = entityTemplate instanceof DivRadialGradientRadiusTemplate ? (DivRadialGradientRadiusTemplate) entityTemplate : null;
        if (divRadialGradientRadiusTemplate != null && (type = divRadialGradientRadiusTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "fixed")) {
            return new DivRadialGradientRadiusTemplate.b(this.f50648a.x3().getValue().deserialize(parsingContext, (DivFixedSizeTemplate) (divRadialGradientRadiusTemplate != null ? divRadialGradientRadiusTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "relative")) {
            return new DivRadialGradientRadiusTemplate.c(this.f50648a.v6().getValue().deserialize(parsingContext, (DivRadialGradientRelativeRadiusTemplate) (divRadialGradientRadiusTemplate != null ? divRadialGradientRadiusTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate) throws ParsingException {
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.b) {
            return this.f50648a.x3().getValue().serialize(parsingContext, ((DivRadialGradientRadiusTemplate.b) divRadialGradientRadiusTemplate).b());
        }
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.c) {
            return this.f50648a.v6().getValue().serialize(parsingContext, ((DivRadialGradientRadiusTemplate.c) divRadialGradientRadiusTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public g3(JsonParserComponent jsonParserComponent) {
        this.f50648a = jsonParserComponent;
    }
}
