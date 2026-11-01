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

/* JADX INFO: compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50579a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardContentTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate = entityTemplate instanceof DivActionCopyToClipboardContentTemplate ? (DivActionCopyToClipboardContentTemplate) entityTemplate : null;
        if (divActionCopyToClipboardContentTemplate != null && (type = divActionCopyToClipboardContentTemplate.getType()) != null) {
            string = type;
        }
        if (ck.p.e(string, "text")) {
            return new DivActionCopyToClipboardContentTemplate.b(this.f50579a.t().getValue().deserialize(parsingContext, (ContentTextTemplate) (divActionCopyToClipboardContentTemplate != null ? divActionCopyToClipboardContentTemplate.a() : null), jSONObject));
        }
        if (ck.p.e(string, "url")) {
            return new DivActionCopyToClipboardContentTemplate.c(this.f50579a.w().getValue().deserialize(parsingContext, (ContentUrlTemplate) (divActionCopyToClipboardContentTemplate != null ? divActionCopyToClipboardContentTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate) throws ParsingException {
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.b) {
            return this.f50579a.t().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContentTemplate.b) divActionCopyToClipboardContentTemplate).b());
        }
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.c) {
            return this.f50579a.w().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContentTemplate.c) divActionCopyToClipboardContentTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public c(JsonParserComponent jsonParserComponent) {
        this.f50579a = jsonParserComponent;
    }
}
