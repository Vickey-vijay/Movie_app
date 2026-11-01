package oe;

import com.ironsource.C3426d4;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionDictSetValue;
import com.yandex.div2.DivActionDictSetValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDictSetValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements TemplateResolver<JSONObject, DivActionDictSetValueTemplate, DivActionDictSetValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65192a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDictSetValue resolve(ParsingContext parsingContext, DivActionDictSetValueTemplate divActionDictSetValueTemplate, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = divActionDictSetValueTemplate.f46145a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValue(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, C3426d4.i.W, typeHelper), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionDictSetValueTemplate.f46146b, jSONObject, "value", this.f65192a.j9(), this.f65192a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionDictSetValueTemplate.f46147c, jSONObject, "variable_name", typeHelper));
    }

    public e1(JsonParserComponent jsonParserComponent) {
        this.f65192a = jsonParserComponent;
    }
}
