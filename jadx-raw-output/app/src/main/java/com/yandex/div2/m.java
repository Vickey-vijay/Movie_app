package com.yandex.div2;

import com.vungle.ads.internal.ui.AdActivity;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50741a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmit deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionSubmit(JsonExpressionParser.readExpression(parsingContext, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f50741a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f50741a.u0()), (DivActionSubmit.Request) JsonPropertyParser.read(parsingContext, jSONObject, AdActivity.REQUEST_KEY_EXTRA, this.f50741a.b1()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionSubmit divActionSubmit) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "container_id", divActionSubmit.f46280a);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divActionSubmit.f46281b, this.f50741a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divActionSubmit.f46282c, this.f50741a.u0());
        JsonPropertyParser.write(parsingContext, jSONObject, AdActivity.REQUEST_KEY_EXTRA, divActionSubmit.f46283d, this.f50741a.b1());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
        return jSONObject;
    }

    public m(JsonParserComponent jsonParserComponent) {
        this.f50741a = jsonParserComponent;
    }
}
