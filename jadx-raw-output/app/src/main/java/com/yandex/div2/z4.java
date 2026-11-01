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
/* JADX INFO: loaded from: classes11.dex */
public final class z4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50953a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipMode deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "non_modal")) {
            return new DivTooltipMode.c(this.f50953a.Y8().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "modal")) {
            return new DivTooltipMode.b(this.f50953a.V8().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTooltipModeTemplate divTooltipModeTemplate = orThrow instanceof DivTooltipModeTemplate ? (DivTooltipModeTemplate) orThrow : null;
        if (divTooltipModeTemplate != null) {
            return this.f50953a.U8().getValue().resolve(parsingContext, divTooltipModeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipMode divTooltipMode) throws ParsingException {
        if (divTooltipMode instanceof DivTooltipMode.c) {
            return this.f50953a.Y8().getValue().serialize(parsingContext, ((DivTooltipMode.c) divTooltipMode).c());
        }
        if (divTooltipMode instanceof DivTooltipMode.b) {
            return this.f50953a.V8().getValue().serialize(parsingContext, ((DivTooltipMode.b) divTooltipMode).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public z4(JsonParserComponent jsonParserComponent) {
        this.f50953a = jsonParserComponent;
    }
}
