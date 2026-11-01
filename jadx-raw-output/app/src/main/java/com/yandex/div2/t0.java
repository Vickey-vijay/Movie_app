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

/* JADX INFO: compiled from: DivCountJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class t0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50863a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCountTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivCountTemplate divCountTemplate = entityTemplate instanceof DivCountTemplate ? (DivCountTemplate) entityTemplate : null;
        if (divCountTemplate != null && (type = divCountTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "infinity")) {
            return new DivCountTemplate.c(this.f50863a.h4().getValue().deserialize(parsingContext, (DivInfinityCountTemplate) (divCountTemplate != null ? divCountTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "fixed")) {
            return new DivCountTemplate.b(this.f50863a.o3().getValue().deserialize(parsingContext, (DivFixedCountTemplate) (divCountTemplate != null ? divCountTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivCountTemplate divCountTemplate) throws ParsingException {
        if (divCountTemplate instanceof DivCountTemplate.c) {
            return this.f50863a.h4().getValue().serialize(parsingContext, ((DivCountTemplate.c) divCountTemplate).b());
        }
        if (divCountTemplate instanceof DivCountTemplate.b) {
            return this.f50863a.o3().getValue().serialize(parsingContext, ((DivCountTemplate.b) divCountTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public t0(JsonParserComponent jsonParserComponent) {
        this.f50863a = jsonParserComponent;
    }
}
