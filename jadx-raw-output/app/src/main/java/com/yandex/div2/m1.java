package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class m1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50747a;

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocusTemplate.NextFocusIdsTemplate deserialize(ParsingContext parsingContext, DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocusTemplate.NextFocusIdsTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "down", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f47227a : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ToolBar.FORWARD, typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f47228b : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f47229c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f47230d : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "up", typeHelper, allowPropertyOverride, nextFocusIdsTemplate != null ? nextFocusIdsTemplate.f47231e : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "down", nextFocusIdsTemplate.f47227a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ToolBar.FORWARD, nextFocusIdsTemplate.f47228b);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", nextFocusIdsTemplate.f47229c);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", nextFocusIdsTemplate.f47230d);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "up", nextFocusIdsTemplate.f47231e);
        return jSONObject;
    }

    public m1(JsonParserComponent jsonParserComponent) {
        this.f50747a = jsonParserComponent;
    }
}
