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

/* JADX INFO: compiled from: DivVariableJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50655a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new DivVariable.g(this.f50655a.R9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -993141291:
                if (string.equals("property")) {
                    return new DivVariable.h(this.f50655a.X9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new DivVariable.i(this.f50655a.ga().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new DivVariable.j(this.f50655a.ma().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new DivVariable.e(this.f50655a.B().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new DivVariable.b(this.f50655a.j().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new DivVariable.a(this.f50655a.d().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new DivVariable.c(this.f50655a.p().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new DivVariable.f(this.f50655a.L9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivVariableTemplate divVariableTemplate = orThrow instanceof DivVariableTemplate ? (DivVariableTemplate) orThrow : null;
        if (divVariableTemplate != null) {
            return this.f50655a.m9().getValue().resolve(parsingContext, divVariableTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivVariable divVariable) throws ParsingException {
        if (divVariable instanceof DivVariable.i) {
            return this.f50655a.ga().getValue().serialize(parsingContext, ((DivVariable.i) divVariable).c());
        }
        if (divVariable instanceof DivVariable.g) {
            return this.f50655a.R9().getValue().serialize(parsingContext, ((DivVariable.g) divVariable).c());
        }
        if (divVariable instanceof DivVariable.f) {
            return this.f50655a.L9().getValue().serialize(parsingContext, ((DivVariable.f) divVariable).c());
        }
        if (divVariable instanceof DivVariable.b) {
            return this.f50655a.j().getValue().serialize(parsingContext, ((DivVariable.b) divVariable).c());
        }
        if (divVariable instanceof DivVariable.c) {
            return this.f50655a.p().getValue().serialize(parsingContext, ((DivVariable.c) divVariable).c());
        }
        if (divVariable instanceof DivVariable.j) {
            return this.f50655a.ma().getValue().serialize(parsingContext, ((DivVariable.j) divVariable).c());
        }
        if (divVariable instanceof DivVariable.e) {
            return this.f50655a.B().getValue().serialize(parsingContext, ((DivVariable.e) divVariable).c());
        }
        if (divVariable instanceof DivVariable.a) {
            return this.f50655a.d().getValue().serialize(parsingContext, ((DivVariable.a) divVariable).c());
        }
        if (divVariable instanceof DivVariable.h) {
            return this.f50655a.X9().getValue().serialize(parsingContext, ((DivVariable.h) divVariable).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public g5(JsonParserComponent jsonParserComponent) {
        this.f50655a = jsonParserComponent;
    }
}
