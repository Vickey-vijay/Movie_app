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
public final class n3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50782a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShape deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "rounded_rectangle")) {
            return new DivShape.c(this.f50782a.x6().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "circle")) {
            return new DivShape.a(this.f50782a.X1().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivShapeTemplate divShapeTemplate = orThrow instanceof DivShapeTemplate ? (DivShapeTemplate) orThrow : null;
        if (divShapeTemplate != null) {
            return this.f50782a.X6().getValue().resolve(parsingContext, divShapeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivShape divShape) throws ParsingException {
        if (divShape instanceof DivShape.c) {
            return this.f50782a.x6().getValue().serialize(parsingContext, ((DivShape.c) divShape).c());
        }
        if (divShape instanceof DivShape.a) {
            return this.f50782a.X1().getValue().serialize(parsingContext, ((DivShape.a) divShape).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public n3(JsonParserComponent jsonParserComponent) {
        this.f50782a = jsonParserComponent;
    }
}
