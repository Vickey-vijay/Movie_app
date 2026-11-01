package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.BoolVariable;
import com.yandex.div2.BoolVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements TemplateResolver<JSONObject, BoolVariableTemplate, BoolVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65230a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BoolVariable resolve(ParsingContext parsingContext, BoolVariableTemplate boolVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new BoolVariable((String) JsonFieldResolver.resolve(parsingContext, boolVariableTemplate.f45902a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, boolVariableTemplate.f45903b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    public l(JsonParserComponent jsonParserComponent) {
        this.f65230a = jsonParserComponent;
    }
}
