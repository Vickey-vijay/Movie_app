package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.UrlVariable;
import com.yandex.div2.UrlVariableTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class nd implements TemplateResolver<JSONObject, UrlVariableTemplate, UrlVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65250a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UrlVariable resolve(ParsingContext parsingContext, UrlVariableTemplate urlVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new UrlVariable((String) JsonFieldResolver.resolve(parsingContext, urlVariableTemplate.f50548a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, urlVariableTemplate.f50549b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    public nd(JsonParserComponent jsonParserComponent) {
        this.f65250a = jsonParserComponent;
    }
}
