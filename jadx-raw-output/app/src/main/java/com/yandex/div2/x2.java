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

/* JADX INFO: compiled from: DivPivotJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50905a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivot deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String optionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (optionalString == null) {
            optionalString = "pivot-fixed";
        }
        if (ck.p.e(optionalString, "pivot-fixed")) {
            return new DivPivot.b(this.f50905a.Q5().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(optionalString, "pivot-percentage")) {
            return new DivPivot.c(this.f50905a.W5().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(optionalString, jSONObject);
        DivPivotTemplate divPivotTemplate = orThrow instanceof DivPivotTemplate ? (DivPivotTemplate) orThrow : null;
        if (divPivotTemplate != null) {
            return this.f50905a.V5().getValue().resolve(parsingContext, divPivotTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", optionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPivot divPivot) throws ParsingException {
        if (divPivot instanceof DivPivot.b) {
            return this.f50905a.Q5().getValue().serialize(parsingContext, ((DivPivot.b) divPivot).c());
        }
        if (divPivot instanceof DivPivot.c) {
            return this.f50905a.W5().getValue().serialize(parsingContext, ((DivPivot.c) divPivot).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public x2(JsonParserComponent jsonParserComponent) {
        this.f50905a = jsonParserComponent;
    }
}
