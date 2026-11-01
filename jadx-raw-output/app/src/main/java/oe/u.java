package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ContentText;
import com.yandex.div2.ContentTextTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContentTextJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements TemplateResolver<JSONObject, ContentTextTemplate, ContentText> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65297a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentText resolve(ParsingContext parsingContext, ContentTextTemplate contentTextTemplate, JSONObject jSONObject) throws ParsingException {
        return new ContentText(JsonFieldResolver.resolveExpression(parsingContext, contentTextTemplate.f45926a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public u(JsonParserComponent jsonParserComponent) {
        this.f65297a = jsonParserComponent;
    }
}
