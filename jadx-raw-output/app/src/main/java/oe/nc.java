package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.IntegerValue;
import com.yandex.div2.IntegerValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class nc implements TemplateResolver<JSONObject, IntegerValueTemplate, IntegerValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65249a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IntegerValue resolve(ParsingContext parsingContext, IntegerValueTemplate integerValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new IntegerValue(JsonFieldResolver.resolveExpression(parsingContext, integerValueTemplate.f50152a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
    }

    public nc(JsonParserComponent jsonParserComponent) {
        this.f65249a = jsonParserComponent;
    }
}
