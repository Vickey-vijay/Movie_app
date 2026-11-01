package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ArrayValue;
import com.yandex.div2.ArrayValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements TemplateResolver<JSONObject, ArrayValueTemplate, ArrayValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65182a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayValue resolve(ParsingContext parsingContext, ArrayValueTemplate arrayValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new ArrayValue(JsonFieldResolver.resolveExpression(parsingContext, arrayValueTemplate.f45878a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }

    public c(JsonParserComponent jsonParserComponent) {
        this.f65182a = jsonParserComponent;
    }
}
