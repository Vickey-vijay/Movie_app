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

/* JADX INFO: compiled from: DivChangeTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class j0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50697a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivChangeTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "set")) {
            return new DivChangeTransition.c(this.f50697a.R1().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "change_bounds")) {
            return new DivChangeTransition.a(this.f50697a.O1().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivChangeTransitionTemplate divChangeTransitionTemplate = orThrow instanceof DivChangeTransitionTemplate ? (DivChangeTransitionTemplate) orThrow : null;
        if (divChangeTransitionTemplate != null) {
            return this.f50697a.W1().getValue().resolve(parsingContext, divChangeTransitionTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivChangeTransition divChangeTransition) throws ParsingException {
        if (divChangeTransition instanceof DivChangeTransition.c) {
            return this.f50697a.R1().getValue().serialize(parsingContext, ((DivChangeTransition.c) divChangeTransition).c());
        }
        if (divChangeTransition instanceof DivChangeTransition.a) {
            return this.f50697a.O1().getValue().serialize(parsingContext, ((DivChangeTransition.a) divChangeTransition).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public j0(JsonParserComponent jsonParserComponent) {
        this.f50697a = jsonParserComponent;
    }
}
