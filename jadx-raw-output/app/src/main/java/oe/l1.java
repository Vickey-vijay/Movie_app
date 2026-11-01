package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionHideTooltip;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionHideTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65232a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionHideTooltip deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionHideTooltip(JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionHideTooltip divActionHideTooltip) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionHideTooltip.f46168a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }

    public l1(JsonParserComponent jsonParserComponent) {
        this.f65232a = jsonParserComponent;
    }
}
