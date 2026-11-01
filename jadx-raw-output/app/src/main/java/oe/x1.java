package oe;

import com.vungle.ads.internal.ui.AdActivity;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionSubmitTemplate;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65319a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionSubmitTemplate divActionSubmitTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "container_id", divActionSubmitTemplate.f46306a);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divActionSubmitTemplate.f46307b, this.f65319a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divActionSubmitTemplate.f46308c, this.f65319a.v0());
        JsonFieldParser.writeField(parsingContext, jSONObject, AdActivity.REQUEST_KEY_EXTRA, divActionSubmitTemplate.f46309d, this.f65319a.c1());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
        return jSONObject;
    }

    public x1(JsonParserComponent jsonParserComponent) {
        this.f65319a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmitTemplate deserialize(ParsingContext parsingContext, DivActionSubmitTemplate divActionSubmitTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field;
        Field<List<DivActionTemplate>> field2;
        Field<List<DivActionTemplate>> field3;
        Field<DivActionSubmitTemplate.RequestTemplate> field4;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        if (divActionSubmitTemplate != null) {
            field = divActionSubmitTemplate.f46306a;
        } else {
            field = null;
        }
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "container_id", typeHelper, allowPropertyOverride, field);
        if (divActionSubmitTemplate != null) {
            field2 = divActionSubmitTemplate.f46307b;
        } else {
            field2 = null;
        }
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, field2, this.f65319a.v0());
        if (divActionSubmitTemplate != null) {
            field3 = divActionSubmitTemplate.f46308c;
        } else {
            field3 = null;
        }
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, field3, this.f65319a.v0());
        if (divActionSubmitTemplate != null) {
            field4 = divActionSubmitTemplate.f46309d;
        } else {
            field4 = null;
        }
        return new DivActionSubmitTemplate((Field<Expression<String>>) fieldWithExpression, (Field<List<DivActionTemplate>>) optionalListField, (Field<List<DivActionTemplate>>) optionalListField2, (Field<DivActionSubmitTemplate.RequestTemplate>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, AdActivity.REQUEST_KEY_EXTRA, allowPropertyOverride, field4, this.f65319a.c1()));
    }
}
