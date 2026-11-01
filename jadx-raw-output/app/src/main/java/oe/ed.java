package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StrValue;
import com.yandex.div2.StrValueTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ed implements TemplateResolver<JSONObject, StrValueTemplate, StrValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65195a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrValue resolve(ParsingContext parsingContext, StrValueTemplate strValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new StrValue(JsonFieldResolver.resolveExpression(parsingContext, strValueTemplate.f50524a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public ed(JsonParserComponent jsonParserComponent) {
        this.f65195a = jsonParserComponent;
    }
}
