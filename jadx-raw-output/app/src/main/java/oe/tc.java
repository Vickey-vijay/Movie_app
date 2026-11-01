package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.NumberValue;
import com.yandex.div2.NumberValueTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class tc implements TemplateResolver<JSONObject, NumberValueTemplate, NumberValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65296a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberValue resolve(ParsingContext parsingContext, NumberValueTemplate numberValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new NumberValue(JsonFieldResolver.resolveExpression(parsingContext, numberValueTemplate.f50473a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    public tc(JsonParserComponent jsonParserComponent) {
        this.f65296a = jsonParserComponent;
    }
}
