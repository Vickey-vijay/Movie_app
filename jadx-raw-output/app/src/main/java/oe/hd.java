package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StrVariable;
import com.yandex.div2.StrVariableTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class hd implements TemplateResolver<JSONObject, StrVariableTemplate, StrVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65212a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrVariable resolve(ParsingContext parsingContext, StrVariableTemplate strVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new StrVariable((String) JsonFieldResolver.resolve(parsingContext, strVariableTemplate.f50532a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, strVariableTemplate.f50533b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public hd(JsonParserComponent jsonParserComponent) {
        this.f65212a = jsonParserComponent;
    }
}
