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
public final class a1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50563a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDrawable deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "shape_drawable")) {
            return new DivDrawable.b(this.f50563a.S6().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivDrawableTemplate divDrawableTemplate = orThrow instanceof DivDrawableTemplate ? (DivDrawableTemplate) orThrow : null;
        if (divDrawableTemplate != null) {
            return this.f50563a.X2().getValue().resolve(parsingContext, divDrawableTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivDrawable divDrawable) throws ParsingException {
        if (divDrawable instanceof DivDrawable.b) {
            return this.f50563a.S6().getValue().serialize(parsingContext, ((DivDrawable.b) divDrawable).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public a1(JsonParserComponent jsonParserComponent) {
        this.f50563a = jsonParserComponent;
    }
}
