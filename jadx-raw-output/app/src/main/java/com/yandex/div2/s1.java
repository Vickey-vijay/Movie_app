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

/* JADX INFO: compiled from: DivInputFilterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class s1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50854a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilter deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "regex")) {
            return new DivInputFilter.c(this.f50854a.p4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "expression")) {
            return new DivInputFilter.b(this.f50854a.j4().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivInputFilterTemplate divInputFilterTemplate = orThrow instanceof DivInputFilterTemplate ? (DivInputFilterTemplate) orThrow : null;
        if (divInputFilterTemplate != null) {
            return this.f50854a.o4().getValue().resolve(parsingContext, divInputFilterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilter divInputFilter) throws ParsingException {
        if (divInputFilter instanceof DivInputFilter.c) {
            return this.f50854a.p4().getValue().serialize(parsingContext, ((DivInputFilter.c) divInputFilter).c());
        }
        if (divInputFilter instanceof DivInputFilter.b) {
            return this.f50854a.j4().getValue().serialize(parsingContext, ((DivInputFilter.b) divInputFilter).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public s1(JsonParserComponent jsonParserComponent) {
        this.f50854a = jsonParserComponent;
    }
}
