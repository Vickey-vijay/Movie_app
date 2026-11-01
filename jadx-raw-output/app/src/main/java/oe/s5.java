package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputFilterExpression;
import com.yandex.div2.DivInputFilterExpressionTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterExpressionJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s5 implements TemplateResolver<JSONObject, DivInputFilterExpressionTemplate, DivInputFilterExpression> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65285a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterExpression resolve(ParsingContext parsingContext, DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivInputFilterExpression(JsonFieldResolver.resolveExpression(parsingContext, divInputFilterExpressionTemplate.f47867a, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    public s5(JsonParserComponent jsonParserComponent) {
        this.f65285a = jsonParserComponent;
    }
}
