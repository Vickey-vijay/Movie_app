package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputFilterRegex;
import com.yandex.div2.DivInputFilterRegexTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterRegexJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v5 implements TemplateResolver<JSONObject, DivInputFilterRegexTemplate, DivInputFilterRegex> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65307a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterRegex resolve(ParsingContext parsingContext, DivInputFilterRegexTemplate divInputFilterRegexTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivInputFilterRegex(JsonFieldResolver.resolveExpression(parsingContext, divInputFilterRegexTemplate.f47874a, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public v5(JsonParserComponent jsonParserComponent) {
        this.f65307a = jsonParserComponent;
    }
}
