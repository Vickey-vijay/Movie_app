package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.UrlValue;
import com.yandex.div2.UrlValueTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class kd implements TemplateResolver<JSONObject, UrlValueTemplate, UrlValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65229a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UrlValue resolve(ParsingContext parsingContext, UrlValueTemplate urlValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new UrlValue(JsonFieldResolver.resolveExpression(parsingContext, urlValueTemplate.f50540a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    public kd(JsonParserComponent jsonParserComponent) {
        this.f65229a = jsonParserComponent;
    }
}
