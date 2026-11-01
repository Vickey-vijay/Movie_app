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

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50694a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.EllipsisTemplate ellipsisTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", ellipsisTemplate.f49761a, this.f50694a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "images", ellipsisTemplate.f49762b, this.f50694a.n8());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", ellipsisTemplate.f49763c, this.f50694a.z8());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", ellipsisTemplate.f49764d);
        return jSONObject;
    }

    public i4(JsonParserComponent jsonParserComponent) {
        this.f50694a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextTemplate.EllipsisTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.EllipsisTemplate ellipsisTemplate, JSONObject jSONObject) throws ParsingException {
        Field<List<DivActionTemplate>> field;
        Field<List<DivTextTemplate.ImageTemplate>> field2;
        Field<List<DivTextTemplate.RangeTemplate>> field3;
        Field<Expression<String>> field4;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (ellipsisTemplate != null) {
            field = ellipsisTemplate.f49761a;
        } else {
            field = null;
        }
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, this.f50694a.v0());
        if (ellipsisTemplate != null) {
            field2 = ellipsisTemplate.f49762b;
        } else {
            field2 = null;
        }
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "images", allowPropertyOverride, field2, this.f50694a.n8());
        if (ellipsisTemplate != null) {
            field3 = ellipsisTemplate.f49763c;
        } else {
            field3 = null;
        }
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, field3, this.f50694a.z8());
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (ellipsisTemplate != null) {
            field4 = ellipsisTemplate.f49764d;
        } else {
            field4 = null;
        }
        return new DivTextTemplate.EllipsisTemplate((Field<List<DivActionTemplate>>) optionalListField, (Field<List<DivTextTemplate.ImageTemplate>>) optionalListField2, (Field<List<DivTextTemplate.RangeTemplate>>) optionalListField3, (Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", typeHelper, allowPropertyOverride, field4));
    }
}
