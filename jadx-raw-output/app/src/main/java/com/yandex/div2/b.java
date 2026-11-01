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
public final class b implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50568a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardContent deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (ck.p.e(string, "text")) {
            return new DivActionCopyToClipboardContent.b(this.f50568a.s().getValue().deserialize(parsingContext, jSONObject));
        }
        if (ck.p.e(string, "url")) {
            return new DivActionCopyToClipboardContent.c(this.f50568a.v().getValue().deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate = orThrow instanceof DivActionCopyToClipboardContentTemplate ? (DivActionCopyToClipboardContentTemplate) orThrow : null;
        if (divActionCopyToClipboardContentTemplate != null) {
            return this.f50568a.e0().getValue().resolve(parsingContext, divActionCopyToClipboardContentTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionCopyToClipboardContent divActionCopyToClipboardContent) throws ParsingException {
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.b) {
            return this.f50568a.s().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContent.b) divActionCopyToClipboardContent).c());
        }
        if (divActionCopyToClipboardContent instanceof DivActionCopyToClipboardContent.c) {
            return this.f50568a.v().getValue().serialize(parsingContext, ((DivActionCopyToClipboardContent.c) divActionCopyToClipboardContent).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    public b(JsonParserComponent jsonParserComponent) {
        this.f50568a = jsonParserComponent;
    }
}
