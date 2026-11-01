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
public final class e1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50612a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilterTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivFilterTemplate divFilterTemplate = entityTemplate instanceof DivFilterTemplate ? (DivFilterTemplate) entityTemplate : null;
        if (divFilterTemplate != null && (type = divFilterTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "blur")) {
            return new DivFilterTemplate.a(this.f50612a.J1().getValue().deserialize(parsingContext, (DivBlurTemplate) (divFilterTemplate != null ? divFilterTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "rtl_mirror")) {
            return new DivFilterTemplate.c(this.f50612a.l3().getValue().deserialize(parsingContext, (DivFilterRtlMirrorTemplate) (divFilterTemplate != null ? divFilterTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFilterTemplate divFilterTemplate) throws ParsingException {
        if (divFilterTemplate instanceof DivFilterTemplate.a) {
            return this.f50612a.J1().getValue().serialize(parsingContext, ((DivFilterTemplate.a) divFilterTemplate).b());
        }
        if (divFilterTemplate instanceof DivFilterTemplate.c) {
            return this.f50612a.l3().getValue().serialize(parsingContext, ((DivFilterTemplate.c) divFilterTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public e1(JsonParserComponent jsonParserComponent) {
        this.f50612a = jsonParserComponent;
    }
}
