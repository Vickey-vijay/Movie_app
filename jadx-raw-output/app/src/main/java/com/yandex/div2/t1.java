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
public final class t1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50864a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivInputFilterTemplate divInputFilterTemplate = entityTemplate instanceof DivInputFilterTemplate ? (DivInputFilterTemplate) entityTemplate : null;
        if (divInputFilterTemplate != null && (type = divInputFilterTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "regex")) {
            return new DivInputFilterTemplate.c(this.f50864a.q4().getValue().deserialize(parsingContext, (DivInputFilterRegexTemplate) (divInputFilterTemplate != null ? divInputFilterTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "expression")) {
            return new DivInputFilterTemplate.b(this.f50864a.k4().getValue().deserialize(parsingContext, (DivInputFilterExpressionTemplate) (divInputFilterTemplate != null ? divInputFilterTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilterTemplate divInputFilterTemplate) throws ParsingException {
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.c) {
            return this.f50864a.q4().getValue().serialize(parsingContext, ((DivInputFilterTemplate.c) divInputFilterTemplate).b());
        }
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.b) {
            return this.f50864a.k4().getValue().serialize(parsingContext, ((DivInputFilterTemplate.b) divInputFilterTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public t1(JsonParserComponent jsonParserComponent) {
        this.f50864a = jsonParserComponent;
    }
}
