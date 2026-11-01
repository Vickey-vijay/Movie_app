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
/* JADX INFO: loaded from: classes11.dex */
public final class v1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50880a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != 106642798) {
            if (iHashCode != 393594385) {
                if (iHashCode == 575402001 && string.equals("currency")) {
                    return new DivInputMask.b(this.f50880a.y2().getValue().deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("fixed_length")) {
                return new DivInputMask.c(this.f50880a.q3().getValue().deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("phone")) {
            return new DivInputMask.d(this.f50880a.N5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivInputMaskTemplate divInputMaskTemplate = orThrow instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) orThrow : null;
        if (divInputMaskTemplate != null) {
            return this.f50880a.x4().getValue().resolve(parsingContext, divInputMaskTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivInputMask divInputMask) throws ParsingException {
        if (divInputMask instanceof DivInputMask.c) {
            return this.f50880a.q3().getValue().serialize(parsingContext, ((DivInputMask.c) divInputMask).c());
        }
        if (divInputMask instanceof DivInputMask.b) {
            return this.f50880a.y2().getValue().serialize(parsingContext, ((DivInputMask.b) divInputMask).c());
        }
        if (divInputMask instanceof DivInputMask.d) {
            return this.f50880a.N5().getValue().serialize(parsingContext, ((DivInputMask.d) divInputMask).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public v1(JsonParserComponent jsonParserComponent) {
        this.f50880a = jsonParserComponent;
    }
}
