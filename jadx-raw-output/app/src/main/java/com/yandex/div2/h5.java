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
public final class h5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50672a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVariableTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivVariableTemplate divVariableTemplate = entityTemplate instanceof DivVariableTemplate ? (DivVariableTemplate) entityTemplate : null;
        if (divVariableTemplate != null && (type = divVariableTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new DivVariableTemplate.g(this.f50672a.S9().getValue().deserialize(parsingContext, (NumberVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case -993141291:
                if (string.equals("property")) {
                    return new DivVariableTemplate.h(this.f50672a.Y9().getValue().deserialize(parsingContext, (PropertyVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new DivVariableTemplate.i(this.f50672a.ha().getValue().deserialize(parsingContext, (StrVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new DivVariableTemplate.j(this.f50672a.na().getValue().deserialize(parsingContext, (UrlVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new DivVariableTemplate.e(this.f50672a.C().getValue().deserialize(parsingContext, (DictVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new DivVariableTemplate.b(this.f50672a.k().getValue().deserialize(parsingContext, (BoolVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new DivVariableTemplate.a(this.f50672a.e().getValue().deserialize(parsingContext, (ArrayVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new DivVariableTemplate.c(this.f50672a.q().getValue().deserialize(parsingContext, (ColorVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new DivVariableTemplate.f(this.f50672a.M9().getValue().deserialize(parsingContext, (IntegerVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivVariableTemplate divVariableTemplate) throws ParsingException {
        if (divVariableTemplate instanceof DivVariableTemplate.i) {
            return this.f50672a.ha().getValue().serialize(parsingContext, ((DivVariableTemplate.i) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.g) {
            return this.f50672a.S9().getValue().serialize(parsingContext, ((DivVariableTemplate.g) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.f) {
            return this.f50672a.M9().getValue().serialize(parsingContext, ((DivVariableTemplate.f) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.b) {
            return this.f50672a.k().getValue().serialize(parsingContext, ((DivVariableTemplate.b) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.c) {
            return this.f50672a.q().getValue().serialize(parsingContext, ((DivVariableTemplate.c) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.j) {
            return this.f50672a.na().getValue().serialize(parsingContext, ((DivVariableTemplate.j) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.e) {
            return this.f50672a.C().getValue().serialize(parsingContext, ((DivVariableTemplate.e) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.a) {
            return this.f50672a.e().getValue().serialize(parsingContext, ((DivVariableTemplate.a) divVariableTemplate).b());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.h) {
            return this.f50672a.Y9().getValue().serialize(parsingContext, ((DivVariableTemplate.h) divVariableTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public h5(JsonParserComponent jsonParserComponent) {
        this.f50672a = jsonParserComponent;
    }
}
