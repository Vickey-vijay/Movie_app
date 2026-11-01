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
public final class d2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50602a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputValidator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "regex")) {
            return new DivInputValidator.c(this.f50602a.J4().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "expression")) {
            return new DivInputValidator.b(this.f50602a.D4().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivInputValidatorTemplate divInputValidatorTemplate = orThrow instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) orThrow : null;
        if (divInputValidatorTemplate != null) {
            return this.f50602a.I4().getValue().resolve(parsingContext, divInputValidatorTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInputValidator divInputValidator) throws ParsingException {
        if (divInputValidator instanceof DivInputValidator.c) {
            return this.f50602a.J4().getValue().serialize(parsingContext, ((DivInputValidator.c) divInputValidator).c());
        }
        if (divInputValidator instanceof DivInputValidator.b) {
            return this.f50602a.D4().getValue().serialize(parsingContext, ((DivInputValidator.b) divInputValidator).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public d2(JsonParserComponent jsonParserComponent) {
        this.f50602a = jsonParserComponent;
    }
}
