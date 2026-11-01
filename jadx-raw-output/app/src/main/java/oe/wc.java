package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.NumberVariable;
import com.yandex.div2.NumberVariableTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class wc implements TemplateResolver<JSONObject, NumberVariableTemplate, NumberVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65316a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberVariable resolve(ParsingContext parsingContext, NumberVariableTemplate numberVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new NumberVariable((String) JsonFieldResolver.resolve(parsingContext, numberVariableTemplate.f50481a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, numberVariableTemplate.f50482b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    public wc(JsonParserComponent jsonParserComponent) {
        this.f65316a = jsonParserComponent;
    }
}
