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
public final class s0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50853a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCount deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "infinity")) {
            return new DivCount.c(this.f50853a.g4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "fixed")) {
            return new DivCount.b(this.f50853a.n3().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivCountTemplate divCountTemplate = orThrow instanceof DivCountTemplate ? (DivCountTemplate) orThrow : null;
        if (divCountTemplate != null) {
            return this.f50853a.x2().getValue().resolve(parsingContext, divCountTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivCount divCount) throws ParsingException {
        if (divCount instanceof DivCount.c) {
            return this.f50853a.g4().getValue().serialize(parsingContext, ((DivCount.c) divCount).c());
        }
        if (divCount instanceof DivCount.b) {
            return this.f50853a.n3().getValue().serialize(parsingContext, ((DivCount.b) divCount).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public s0(JsonParserComponent jsonParserComponent) {
        this.f50853a = jsonParserComponent;
    }
}
