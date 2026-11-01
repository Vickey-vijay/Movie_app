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

/* JADX INFO: compiled from: DivBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50600a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -30518633:
                if (string.equals("nine_patch_image")) {
                    return new DivBackground.d(this.f50600a.e5().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 89650992:
                if (string.equals("gradient")) {
                    return new DivBackground.c(this.f50600a.V4().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new DivBackground.b(this.f50600a.U3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109618859:
                if (string.equals("solid")) {
                    return new DivBackground.f(this.f50600a.q7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1881846096:
                if (string.equals("radial_gradient")) {
                    return new DivBackground.e(this.f50600a.l6().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivBackgroundTemplate divBackgroundTemplate = orThrow instanceof DivBackgroundTemplate ? (DivBackgroundTemplate) orThrow : null;
        if (divBackgroundTemplate != null) {
            return this.f50600a.H1().getValue().resolve(parsingContext, divBackgroundTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivBackground divBackground) throws ParsingException {
        if (divBackground instanceof DivBackground.c) {
            return this.f50600a.V4().getValue().serialize(parsingContext, ((DivBackground.c) divBackground).c());
        }
        if (divBackground instanceof DivBackground.e) {
            return this.f50600a.l6().getValue().serialize(parsingContext, ((DivBackground.e) divBackground).c());
        }
        if (divBackground instanceof DivBackground.b) {
            return this.f50600a.U3().getValue().serialize(parsingContext, ((DivBackground.b) divBackground).c());
        }
        if (divBackground instanceof DivBackground.f) {
            return this.f50600a.q7().getValue().serialize(parsingContext, ((DivBackground.f) divBackground).c());
        }
        if (divBackground instanceof DivBackground.d) {
            return this.f50600a.e5().getValue().serialize(parsingContext, ((DivBackground.d) divBackground).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public d0(JsonParserComponent jsonParserComponent) {
        this.f50600a = jsonParserComponent;
    }
}
