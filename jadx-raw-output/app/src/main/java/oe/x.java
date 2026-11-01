package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ContentUrl;
import com.yandex.div2.ContentUrlTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContentUrlJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements TemplateResolver<JSONObject, ContentUrlTemplate, ContentUrl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65317a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentUrl resolve(ParsingContext parsingContext, ContentUrlTemplate contentUrlTemplate, JSONObject jSONObject) throws ParsingException {
        return new ContentUrl(JsonFieldResolver.resolveExpression(parsingContext, contentUrlTemplate.f45933a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    public x(JsonParserComponent jsonParserComponent) {
        this.f65317a = jsonParserComponent;
    }
}
