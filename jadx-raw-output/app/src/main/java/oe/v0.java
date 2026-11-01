package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionArraySetValue;
import com.yandex.div2.DivActionArraySetValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArraySetValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 implements TemplateResolver<JSONObject, DivActionArraySetValueTemplate, DivActionArraySetValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65305a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArraySetValue resolve(ParsingContext parsingContext, DivActionArraySetValueTemplate divActionArraySetValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionArraySetValue(JsonFieldResolver.resolveExpression(parsingContext, divActionArraySetValueTemplate.f46113a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionArraySetValueTemplate.f46114b, jSONObject, "value", this.f65305a.j9(), this.f65305a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionArraySetValueTemplate.f46115c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public v0(JsonParserComponent jsonParserComponent) {
        this.f65305a = jsonParserComponent;
    }
}
