package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50625a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionTemplate.MenuItemTemplate menuItemTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "action", menuItemTemplate.f46336a, this.f50625a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", menuItemTemplate.f46337b, this.f50625a.v0());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", menuItemTemplate.f46338c);
        return jSONObject;
    }

    public f(JsonParserComponent jsonParserComponent) {
        this.f50625a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionTemplate.MenuItemTemplate deserialize(ParsingContext parsingContext, DivActionTemplate.MenuItemTemplate menuItemTemplate, JSONObject jSONObject) throws ParsingException {
        Field<DivActionTemplate> field;
        Field<List<DivActionTemplate>> field2;
        Field<Expression<String>> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (menuItemTemplate != null) {
            field = menuItemTemplate.f46336a;
        } else {
            field = null;
        }
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, field, this.f50625a.v0());
        if (menuItemTemplate != null) {
            field2 = menuItemTemplate.f46337b;
        } else {
            field2 = null;
        }
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field2, this.f50625a.v0());
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (menuItemTemplate != null) {
            field3 = menuItemTemplate.f46338c;
        } else {
            field3 = null;
        }
        return new DivActionTemplate.MenuItemTemplate(optionalField, optionalListField, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", typeHelper, allowPropertyOverride, field3));
    }
}
