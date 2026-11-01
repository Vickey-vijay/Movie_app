package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.BoolValue;
import com.yandex.div2.BoolValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements TemplateResolver<JSONObject, BoolValueTemplate, BoolValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65213a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BoolValue resolve(ParsingContext parsingContext, BoolValueTemplate boolValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new BoolValue(JsonFieldResolver.resolveExpression(parsingContext, boolValueTemplate.f45894a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    public i(JsonParserComponent jsonParserComponent) {
        this.f65213a = jsonParserComponent;
    }
}
