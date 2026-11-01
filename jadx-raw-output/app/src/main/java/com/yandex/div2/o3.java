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

/* JADX INFO: compiled from: DivShapeJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class o3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50806a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShapeTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivShapeTemplate divShapeTemplate = entityTemplate instanceof DivShapeTemplate ? (DivShapeTemplate) entityTemplate : null;
        if (divShapeTemplate != null && (type = divShapeTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "rounded_rectangle")) {
            return new DivShapeTemplate.c(this.f50806a.y6().getValue().deserialize(parsingContext, (DivRoundedRectangleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "circle")) {
            return new DivShapeTemplate.a(this.f50806a.Y1().getValue().deserialize(parsingContext, (DivCircleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivShapeTemplate divShapeTemplate) throws ParsingException {
        if (divShapeTemplate instanceof DivShapeTemplate.c) {
            return this.f50806a.y6().getValue().serialize(parsingContext, ((DivShapeTemplate.c) divShapeTemplate).b());
        }
        if (divShapeTemplate instanceof DivShapeTemplate.a) {
            return this.f50806a.Y1().getValue().serialize(parsingContext, ((DivShapeTemplate.a) divShapeTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public o3(JsonParserComponent jsonParserComponent) {
        this.f50806a = jsonParserComponent;
    }
}
