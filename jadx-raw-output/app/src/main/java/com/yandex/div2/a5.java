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

/* JADX INFO: compiled from: DivTooltipModeJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50567a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivTooltipModeTemplate divTooltipModeTemplate = entityTemplate instanceof DivTooltipModeTemplate ? (DivTooltipModeTemplate) entityTemplate : null;
        if (divTooltipModeTemplate != null && (type = divTooltipModeTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "non_modal")) {
            return new DivTooltipModeTemplate.c(this.f50567a.Z8().getValue().deserialize(parsingContext, (DivTooltipModeNonModalTemplate) (divTooltipModeTemplate != null ? divTooltipModeTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "modal")) {
            return new DivTooltipModeTemplate.b(this.f50567a.W8().getValue().deserialize(parsingContext, (DivTooltipModeModalTemplate) (divTooltipModeTemplate != null ? divTooltipModeTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeTemplate divTooltipModeTemplate) throws ParsingException {
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.c) {
            return this.f50567a.Z8().getValue().serialize(parsingContext, ((DivTooltipModeTemplate.c) divTooltipModeTemplate).b());
        }
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.b) {
            return this.f50567a.W8().getValue().serialize(parsingContext, ((DivTooltipModeTemplate.b) divTooltipModeTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public a5(JsonParserComponent jsonParserComponent) {
        this.f50567a = jsonParserComponent;
    }
}
