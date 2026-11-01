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
/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50562a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAppearanceTransitionTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivAppearanceTransitionTemplate divAppearanceTransitionTemplate = entityTemplate instanceof DivAppearanceTransitionTemplate ? (DivAppearanceTransitionTemplate) entityTemplate : null;
        if (divAppearanceTransitionTemplate != null && (type = divAppearanceTransitionTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case 113762:
                if (string.equals("set")) {
                    return new DivAppearanceTransitionTemplate.d(this.f50562a.x1().getValue().deserialize(parsingContext, (DivAppearanceSetTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.a() : null), jSONObject));
                }
                break;
            case 3135100:
                if (string.equals("fade")) {
                    return new DivAppearanceTransitionTemplate.b(this.f50562a.f3().getValue().deserialize(parsingContext, (DivFadeTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.a() : null), jSONObject));
                }
                break;
            case 109250890:
                if (string.equals("scale")) {
                    return new DivAppearanceTransitionTemplate.c(this.f50562a.B6().getValue().deserialize(parsingContext, (DivScaleTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.a() : null), jSONObject));
                }
                break;
            case 109526449:
                if (string.equals("slide")) {
                    return new DivAppearanceTransitionTemplate.e(this.f50562a.f7().getValue().deserialize(parsingContext, (DivSlideTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivAppearanceTransitionTemplate divAppearanceTransitionTemplate) throws ParsingException {
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.d) {
            return this.f50562a.x1().getValue().serialize(parsingContext, ((DivAppearanceTransitionTemplate.d) divAppearanceTransitionTemplate).b());
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.b) {
            return this.f50562a.f3().getValue().serialize(parsingContext, ((DivAppearanceTransitionTemplate.b) divAppearanceTransitionTemplate).b());
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.c) {
            return this.f50562a.B6().getValue().serialize(parsingContext, ((DivAppearanceTransitionTemplate.c) divAppearanceTransitionTemplate).b());
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.e) {
            return this.f50562a.f7().getValue().serialize(parsingContext, ((DivAppearanceTransitionTemplate.e) divAppearanceTransitionTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public a0(JsonParserComponent jsonParserComponent) {
        this.f50562a = jsonParserComponent;
    }
}
