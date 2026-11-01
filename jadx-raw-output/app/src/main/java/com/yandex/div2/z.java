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

/* JADX INFO: compiled from: DivAppearanceTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50932a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAppearanceTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case 113762:
                if (string.equals("set")) {
                    return new DivAppearanceTransition.d(this.f50932a.w1().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3135100:
                if (string.equals("fade")) {
                    return new DivAppearanceTransition.b(this.f50932a.e3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109250890:
                if (string.equals("scale")) {
                    return new DivAppearanceTransition.c(this.f50932a.A6().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109526449:
                if (string.equals("slide")) {
                    return new DivAppearanceTransition.e(this.f50932a.e7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivAppearanceTransitionTemplate divAppearanceTransitionTemplate = orThrow instanceof DivAppearanceTransitionTemplate ? (DivAppearanceTransitionTemplate) orThrow : null;
        if (divAppearanceTransitionTemplate != null) {
            return this.f50932a.B1().getValue().resolve(parsingContext, divAppearanceTransitionTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivAppearanceTransition divAppearanceTransition) throws ParsingException {
        if (divAppearanceTransition instanceof DivAppearanceTransition.d) {
            return this.f50932a.w1().getValue().serialize(parsingContext, ((DivAppearanceTransition.d) divAppearanceTransition).c());
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.b) {
            return this.f50932a.e3().getValue().serialize(parsingContext, ((DivAppearanceTransition.b) divAppearanceTransition).c());
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.c) {
            return this.f50932a.A6().getValue().serialize(parsingContext, ((DivAppearanceTransition.c) divAppearanceTransition).c());
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.e) {
            return this.f50932a.e7().getValue().serialize(parsingContext, ((DivAppearanceTransition.e) divAppearanceTransition).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public z(JsonParserComponent jsonParserComponent) {
        this.f50932a = jsonParserComponent;
    }
}
