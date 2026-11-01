package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class n1 implements TemplateResolver<JSONObject, DivFocusTemplate.NextFocusIdsTemplate, DivFocus.NextFocusIds> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50780a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus.NextFocusIds resolve(ParsingContext parsingContext, DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = nextFocusIdsTemplate.f47227a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocus.NextFocusIds(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "down", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f47228b, jSONObject, ToolBar.FORWARD, typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f47229c, jSONObject, "left", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f47230d, jSONObject, "right", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.f47231e, jSONObject, "up", typeHelper));
    }

    public n1(JsonParserComponent jsonParserComponent) {
        this.f50780a = jsonParserComponent;
    }
}
