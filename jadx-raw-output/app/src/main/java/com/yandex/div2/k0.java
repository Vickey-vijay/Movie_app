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
public final class k0 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50708a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivChangeTransitionTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivChangeTransitionTemplate divChangeTransitionTemplate = entityTemplate instanceof DivChangeTransitionTemplate ? (DivChangeTransitionTemplate) entityTemplate : null;
        if (divChangeTransitionTemplate != null && (type = divChangeTransitionTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "set")) {
            return new DivChangeTransitionTemplate.c(this.f50708a.S1().getValue().deserialize(parsingContext, (DivChangeSetTransitionTemplate) (divChangeTransitionTemplate != null ? divChangeTransitionTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "change_bounds")) {
            return new DivChangeTransitionTemplate.a(this.f50708a.P1().getValue().deserialize(parsingContext, (DivChangeBoundsTransitionTemplate) (divChangeTransitionTemplate != null ? divChangeTransitionTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivChangeTransitionTemplate divChangeTransitionTemplate) throws ParsingException {
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.c) {
            return this.f50708a.S1().getValue().serialize(parsingContext, ((DivChangeTransitionTemplate.c) divChangeTransitionTemplate).b());
        }
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.a) {
            return this.f50708a.P1().getValue().serialize(parsingContext, ((DivChangeTransitionTemplate.a) divChangeTransitionTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public k0(JsonParserComponent jsonParserComponent) {
        this.f50708a = jsonParserComponent;
    }
}
