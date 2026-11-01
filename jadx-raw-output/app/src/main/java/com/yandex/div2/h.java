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
public final class h implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50656a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionScrollDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1019779949:
                if (string.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    return new DivActionScrollDestination.d(this.f50656a.U9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100571:
                if (string.equals("end")) {
                    return new DivActionScrollDestination.b(this.f50656a.C9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100346066:
                if (string.equals("index")) {
                    return new DivActionScrollDestination.c(this.f50656a.F9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757538:
                if (string.equals("start")) {
                    return new DivActionScrollDestination.e(this.f50656a.aa().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivActionScrollDestinationTemplate divActionScrollDestinationTemplate = orThrow instanceof DivActionScrollDestinationTemplate ? (DivActionScrollDestinationTemplate) orThrow : null;
        if (divActionScrollDestinationTemplate != null) {
            return this.f50656a.F0().getValue().resolve(parsingContext, divActionScrollDestinationTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionScrollDestination divActionScrollDestination) throws ParsingException {
        if (divActionScrollDestination instanceof DivActionScrollDestination.d) {
            return this.f50656a.U9().getValue().serialize(parsingContext, ((DivActionScrollDestination.d) divActionScrollDestination).c());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.c) {
            return this.f50656a.F9().getValue().serialize(parsingContext, ((DivActionScrollDestination.c) divActionScrollDestination).c());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.e) {
            return this.f50656a.aa().getValue().serialize(parsingContext, ((DivActionScrollDestination.e) divActionScrollDestination).c());
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.b) {
            return this.f50656a.C9().getValue().serialize(parsingContext, ((DivActionScrollDestination.b) divActionScrollDestination).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public h(JsonParserComponent jsonParserComponent) {
        this.f50656a = jsonParserComponent;
    }
}
