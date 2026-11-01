package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50608a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTabs.Item deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivTabs.Item((Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f50608a.M4()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_click_action", this.f50608a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTabs.Item item) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "div", item.f49276a, this.f50608a.M4());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "title", item.f49277b);
        JsonPropertyParser.write(parsingContext, jSONObject, "title_click_action", item.f49278c, this.f50608a.u0());
        return jSONObject;
    }

    public d4(JsonParserComponent jsonParserComponent) {
        this.f50608a = jsonParserComponent;
    }
}
