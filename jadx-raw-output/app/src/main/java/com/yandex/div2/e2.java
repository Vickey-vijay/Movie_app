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

/* JADX INFO: compiled from: DivInputValidatorJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50613a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputValidatorTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivInputValidatorTemplate divInputValidatorTemplate = entityTemplate instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) entityTemplate : null;
        if (divInputValidatorTemplate != null && (type = divInputValidatorTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "regex")) {
            return new DivInputValidatorTemplate.c(this.f50613a.K4().getValue().deserialize(parsingContext, (DivInputValidatorRegexTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "expression")) {
            return new DivInputValidatorTemplate.b(this.f50613a.E4().getValue().deserialize(parsingContext, (DivInputValidatorExpressionTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorTemplate divInputValidatorTemplate) throws ParsingException {
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.c) {
            return this.f50613a.K4().getValue().serialize(parsingContext, ((DivInputValidatorTemplate.c) divInputValidatorTemplate).b());
        }
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.b) {
            return this.f50613a.E4().getValue().serialize(parsingContext, ((DivInputValidatorTemplate.b) divInputValidatorTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public e2(JsonParserComponent jsonParserComponent) {
        this.f50613a = jsonParserComponent;
    }
}
