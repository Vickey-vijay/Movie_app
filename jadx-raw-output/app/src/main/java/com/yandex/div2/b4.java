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

/* JADX INFO: compiled from: DivStrokeStyleJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50577a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyleTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivStrokeStyleTemplate divStrokeStyleTemplate = entityTemplate instanceof DivStrokeStyleTemplate ? (DivStrokeStyleTemplate) entityTemplate : null;
        if (divStrokeStyleTemplate != null && (type = divStrokeStyleTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "solid")) {
            return new DivStrokeStyleTemplate.c(this.f50577a.M7().getValue().deserialize(parsingContext, (DivStrokeStyleSolidTemplate) (divStrokeStyleTemplate != null ? divStrokeStyleTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "dashed")) {
            return new DivStrokeStyleTemplate.b(this.f50577a.G7().getValue().deserialize(parsingContext, (DivStrokeStyleDashedTemplate) (divStrokeStyleTemplate != null ? divStrokeStyleTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleTemplate divStrokeStyleTemplate) throws ParsingException {
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.c) {
            return this.f50577a.M7().getValue().serialize(parsingContext, ((DivStrokeStyleTemplate.c) divStrokeStyleTemplate).b());
        }
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.b) {
            return this.f50577a.G7().getValue().serialize(parsingContext, ((DivStrokeStyleTemplate.b) divStrokeStyleTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public b4(JsonParserComponent jsonParserComponent) {
        this.f50577a = jsonParserComponent;
    }
}
