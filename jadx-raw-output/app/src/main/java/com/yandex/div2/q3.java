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

/* JADX INFO: compiled from: DivSizeJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class q3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50833a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != 97445748) {
            if (iHashCode != 343327108) {
                if (iHashCode == 1386124388 && string.equals("match_parent")) {
                    return new DivSize.c(this.f50833a.Y4().getValue().deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("wrap_content")) {
                return new DivSize.d(this.f50833a.z9().getValue().deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("fixed")) {
            return new DivSize.b(this.f50833a.w3().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivSizeTemplate divSizeTemplate = orThrow instanceof DivSizeTemplate ? (DivSizeTemplate) orThrow : null;
        if (divSizeTemplate != null) {
            return this.f50833a.a7().getValue().resolve(parsingContext, divSizeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivSize divSize) throws ParsingException {
        if (divSize instanceof DivSize.b) {
            return this.f50833a.w3().getValue().serialize(parsingContext, ((DivSize.b) divSize).c());
        }
        if (divSize instanceof DivSize.c) {
            return this.f50833a.Y4().getValue().serialize(parsingContext, ((DivSize.c) divSize).c());
        }
        if (divSize instanceof DivSize.d) {
            return this.f50833a.z9().getValue().serialize(parsingContext, ((DivSize.d) divSize).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public q3(JsonParserComponent jsonParserComponent) {
        this.f50833a = jsonParserComponent;
    }
}
