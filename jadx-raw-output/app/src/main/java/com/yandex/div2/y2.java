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
public final class y2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50923a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivotTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String optionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (optionalString == null) {
            optionalString = "pivot-fixed";
        }
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(optionalString);
        DivPivotTemplate divPivotTemplate = entityTemplate instanceof DivPivotTemplate ? (DivPivotTemplate) entityTemplate : null;
        if (divPivotTemplate != null && (type = divPivotTemplate.getType()) != null) {
            optionalString = type;
        }
        if (ck.p.e(optionalString, "pivot-fixed")) {
            return new DivPivotTemplate.b(this.f50923a.R5().getValue().deserialize(parsingContext, (DivPivotFixedTemplate) (divPivotTemplate != null ? divPivotTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(optionalString, "pivot-percentage")) {
            return new DivPivotTemplate.c(this.f50923a.X5().getValue().deserialize(parsingContext, (DivPivotPercentageTemplate) (divPivotTemplate != null ? divPivotTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", optionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPivotTemplate divPivotTemplate) throws ParsingException {
        if (divPivotTemplate instanceof DivPivotTemplate.b) {
            return this.f50923a.R5().getValue().serialize(parsingContext, ((DivPivotTemplate.b) divPivotTemplate).b());
        }
        if (divPivotTemplate instanceof DivPivotTemplate.c) {
            return this.f50923a.X5().getValue().serialize(parsingContext, ((DivPivotTemplate.c) divPivotTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public y2(JsonParserComponent jsonParserComponent) {
        this.f50923a = jsonParserComponent;
    }
}
