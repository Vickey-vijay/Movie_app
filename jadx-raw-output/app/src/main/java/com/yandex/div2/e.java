package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50610a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAction.MenuItem deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivAction.MenuItem((DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f50610a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f50610a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivAction.MenuItem menuItem) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "action", menuItem.f46044a, this.f50610a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", menuItem.f46045b, this.f50610a.u0());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", menuItem.f46046c);
        return jSONObject;
    }

    public e(JsonParserComponent jsonParserComponent) {
        this.f50610a = jsonParserComponent;
    }
}
