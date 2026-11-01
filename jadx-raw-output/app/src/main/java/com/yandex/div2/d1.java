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

/* JADX INFO: compiled from: DivFilterJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50601a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilter deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "blur")) {
            return new DivFilter.a(this.f50601a.I1().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "rtl_mirror")) {
            return new DivFilter.c(this.f50601a.k3().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivFilterTemplate divFilterTemplate = orThrow instanceof DivFilterTemplate ? (DivFilterTemplate) orThrow : null;
        if (divFilterTemplate != null) {
            return this.f50601a.j3().getValue().resolve(parsingContext, divFilterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFilter divFilter) throws ParsingException {
        if (divFilter instanceof DivFilter.a) {
            return this.f50601a.I1().getValue().serialize(parsingContext, ((DivFilter.a) divFilter).c());
        }
        if (divFilter instanceof DivFilter.c) {
            return this.f50601a.k3().getValue().serialize(parsingContext, ((DivFilter.c) divFilter).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public d1(JsonParserComponent jsonParserComponent) {
        this.f50601a = jsonParserComponent;
    }
}
