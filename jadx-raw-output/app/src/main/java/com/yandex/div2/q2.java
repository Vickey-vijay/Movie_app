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

/* JADX INFO: compiled from: DivPagerLayoutModeJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class q2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50832a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPagerLayoutMode deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode != 97445748) {
                if (iHashCode == 343327108 && string.equals("wrap_content")) {
                    return new DivPagerLayoutMode.c(this.f50832a.k5().getValue().deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("fixed")) {
                return new DivPagerLayoutMode.b(this.f50832a.b5().getValue().deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("percentage")) {
            return new DivPagerLayoutMode.d(this.f50832a.n5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = orThrow instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) orThrow : null;
        if (divPagerLayoutModeTemplate != null) {
            return this.f50832a.E5().getValue().resolve(parsingContext, divPagerLayoutModeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPagerLayoutMode divPagerLayoutMode) throws ParsingException {
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.d) {
            return this.f50832a.n5().getValue().serialize(parsingContext, ((DivPagerLayoutMode.d) divPagerLayoutMode).c());
        }
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.b) {
            return this.f50832a.b5().getValue().serialize(parsingContext, ((DivPagerLayoutMode.b) divPagerLayoutMode).c());
        }
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.c) {
            return this.f50832a.k5().getValue().serialize(parsingContext, ((DivPagerLayoutMode.c) divPagerLayoutMode).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public q2(JsonParserComponent jsonParserComponent) {
        this.f50832a = jsonParserComponent;
    }
}
