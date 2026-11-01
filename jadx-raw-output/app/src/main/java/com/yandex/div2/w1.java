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

/* JADX INFO: compiled from: DivInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50886a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputMaskTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivInputMaskTemplate divInputMaskTemplate = entityTemplate instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) entityTemplate : null;
        if (divInputMaskTemplate != null && (type = divInputMaskTemplate.getType()) != null) {
            string = type;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 106642798) {
            if (iHashCode != 393594385) {
                if (iHashCode == 575402001 && string.equals("currency")) {
                    return new DivInputMaskTemplate.b(this.f50886a.z2().getValue().deserialize(parsingContext, (DivCurrencyInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.a() : null), jSONObject));
                }
            } else if (string.equals("fixed_length")) {
                return new DivInputMaskTemplate.c(this.f50886a.r3().getValue().deserialize(parsingContext, (DivFixedLengthInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.a() : null), jSONObject));
            }
        } else if (string.equals("phone")) {
            return new DivInputMaskTemplate.d(this.f50886a.O5().getValue().deserialize(parsingContext, (DivPhoneInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInputMaskTemplate divInputMaskTemplate) throws ParsingException {
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.c) {
            return this.f50886a.r3().getValue().serialize(parsingContext, ((DivInputMaskTemplate.c) divInputMaskTemplate).b());
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.b) {
            return this.f50886a.z2().getValue().serialize(parsingContext, ((DivInputMaskTemplate.b) divInputMaskTemplate).b());
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.d) {
            return this.f50886a.O5().getValue().serialize(parsingContext, ((DivInputMaskTemplate.d) divInputMaskTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public w1(JsonParserComponent jsonParserComponent) {
        this.f50886a = jsonParserComponent;
    }
}
