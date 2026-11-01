package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50724a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus.NextFocusIds deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocus.NextFocusIds(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "down", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ToolBar.FORWARD, typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "up", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFocus.NextFocusIds nextFocusIds) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "down", nextFocusIds.f47212a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, ToolBar.FORWARD, nextFocusIds.f47213b);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", nextFocusIds.f47214c);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", nextFocusIds.f47215d);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "up", nextFocusIds.f47216e);
        return jSONObject;
    }

    public l1(JsonParserComponent jsonParserComponent) {
        this.f50724a = jsonParserComponent;
    }
}
