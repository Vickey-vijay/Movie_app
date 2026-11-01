package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSetVariable;
import com.yandex.div2.DivActionSetVariableTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t1 implements TemplateResolver<JSONObject, DivActionSetVariableTemplate, DivActionSetVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65291a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetVariable resolve(ParsingContext parsingContext, DivActionSetVariableTemplate divActionSetVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionSetVariable((DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionSetVariableTemplate.f46267a, jSONObject, "value", this.f65291a.j9(), this.f65291a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionSetVariableTemplate.f46268b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public t1(JsonParserComponent jsonParserComponent) {
        this.f65291a = jsonParserComponent;
    }
}
