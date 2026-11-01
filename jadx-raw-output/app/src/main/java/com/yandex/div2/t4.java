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

/* JADX INFO: compiled from: DivTextRangeMaskJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class t4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50867a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "particles")) {
            return new DivTextRangeMask.b(this.f50867a.G8().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "solid")) {
            return new DivTextRangeMask.c(this.f50867a.J8().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTextRangeMaskTemplate divTextRangeMaskTemplate = orThrow instanceof DivTextRangeMaskTemplate ? (DivTextRangeMaskTemplate) orThrow : null;
        if (divTextRangeMaskTemplate != null) {
            return this.f50867a.F8().getValue().resolve(parsingContext, divTextRangeMaskTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMask divTextRangeMask) throws ParsingException {
        if (divTextRangeMask instanceof DivTextRangeMask.b) {
            return this.f50867a.G8().getValue().serialize(parsingContext, ((DivTextRangeMask.b) divTextRangeMask).c());
        }
        if (divTextRangeMask instanceof DivTextRangeMask.c) {
            return this.f50867a.J8().getValue().serialize(parsingContext, ((DivTextRangeMask.c) divTextRangeMask).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public t4(JsonParserComponent jsonParserComponent) {
        this.f50867a = jsonParserComponent;
    }
}
