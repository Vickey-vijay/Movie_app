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

/* JADX INFO: compiled from: DivDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50570a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDrawableTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivDrawableTemplate divDrawableTemplate = entityTemplate instanceof DivDrawableTemplate ? (DivDrawableTemplate) entityTemplate : null;
        if (divDrawableTemplate != null && (type = divDrawableTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "shape_drawable")) {
            return new DivDrawableTemplate.b(this.f50570a.T6().getValue().deserialize(parsingContext, (DivShapeDrawableTemplate) (divDrawableTemplate != null ? divDrawableTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivDrawableTemplate divDrawableTemplate) throws ParsingException {
        if (divDrawableTemplate instanceof DivDrawableTemplate.b) {
            return this.f50570a.T6().getValue().serialize(parsingContext, ((DivDrawableTemplate.b) divDrawableTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public b1(JsonParserComponent jsonParserComponent) {
        this.f50570a = jsonParserComponent;
    }
}
