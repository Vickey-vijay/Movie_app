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

/* JADX INFO: compiled from: DivAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50884a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAnimatorTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivAnimatorTemplate divAnimatorTemplate = entityTemplate instanceof DivAnimatorTemplate ? (DivAnimatorTemplate) entityTemplate : null;
        if (divAnimatorTemplate != null && (type = divAnimatorTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "color_animator")) {
            return new DivAnimatorTemplate.a(this.f50884a.k2().getValue().deserialize(parsingContext, (DivColorAnimatorTemplate) (divAnimatorTemplate != null ? divAnimatorTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "number_animator")) {
            return new DivAnimatorTemplate.c(this.f50884a.i5().getValue().deserialize(parsingContext, (DivNumberAnimatorTemplate) (divAnimatorTemplate != null ? divAnimatorTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivAnimatorTemplate divAnimatorTemplate) throws ParsingException {
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.a) {
            return this.f50884a.k2().getValue().serialize(parsingContext, ((DivAnimatorTemplate.a) divAnimatorTemplate).b());
        }
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.c) {
            return this.f50884a.i5().getValue().serialize(parsingContext, ((DivAnimatorTemplate.c) divAnimatorTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public w(JsonParserComponent jsonParserComponent) {
        this.f50884a = jsonParserComponent;
    }
}
