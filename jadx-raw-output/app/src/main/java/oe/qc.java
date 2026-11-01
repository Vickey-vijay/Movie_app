package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.IntegerVariable;
import com.yandex.div2.IntegerVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class qc implements TemplateResolver<JSONObject, IntegerVariableTemplate, IntegerVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65272a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IntegerVariable resolve(ParsingContext parsingContext, IntegerVariableTemplate integerVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new IntegerVariable((String) JsonFieldResolver.resolve(parsingContext, integerVariableTemplate.f50160a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, integerVariableTemplate.f50161b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
    }

    public qc(JsonParserComponent jsonParserComponent) {
        this.f65272a = jsonParserComponent;
    }
}
