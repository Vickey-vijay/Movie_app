package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50673a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionScrollDestinationTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivActionScrollDestinationTemplate divActionScrollDestinationTemplate = entityTemplate instanceof DivActionScrollDestinationTemplate ? (DivActionScrollDestinationTemplate) entityTemplate : null;
        if (divActionScrollDestinationTemplate != null && (type = divActionScrollDestinationTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -1019779949:
                if (string.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    return new DivActionScrollDestinationTemplate.d(this.f50673a.V9().getValue().deserialize(parsingContext, (OffsetDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
            case 100571:
                if (string.equals("end")) {
                    return new DivActionScrollDestinationTemplate.b(this.f50673a.D9().getValue().deserialize(parsingContext, (EndDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
            case 100346066:
                if (string.equals("index")) {
                    return new DivActionScrollDestinationTemplate.c(this.f50673a.G9().getValue().deserialize(parsingContext, (IndexDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
            case 109757538:
                if (string.equals("start")) {
                    return new DivActionScrollDestinationTemplate.e(this.f50673a.ba().getValue().deserialize(parsingContext, (StartDestinationTemplate) (divActionScrollDestinationTemplate != null ? divActionScrollDestinationTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionScrollDestinationTemplate divActionScrollDestinationTemplate) throws ParsingException {
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.d) {
            return this.f50673a.V9().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.d) divActionScrollDestinationTemplate).b());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.c) {
            return this.f50673a.G9().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.c) divActionScrollDestinationTemplate).b());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.e) {
            return this.f50673a.ba().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.e) divActionScrollDestinationTemplate).b());
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.b) {
            return this.f50673a.D9().getValue().serialize(parsingContext, ((DivActionScrollDestinationTemplate.b) divActionScrollDestinationTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public i(JsonParserComponent jsonParserComponent) {
        this.f50673a = jsonParserComponent;
    }
}
