package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivLayoutProviderTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i6 implements TemplateResolver<JSONObject, DivLayoutProviderTemplate, DivLayoutProvider> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65216a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivLayoutProvider resolve(ParsingContext parsingContext, DivLayoutProviderTemplate divLayoutProviderTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivLayoutProvider((String) JsonFieldResolver.resolveOptional(parsingContext, divLayoutProviderTemplate.f48032a, jSONObject, "height_variable_name"), (String) JsonFieldResolver.resolveOptional(parsingContext, divLayoutProviderTemplate.f48033b, jSONObject, "width_variable_name"));
    }

    public i6(JsonParserComponent jsonParserComponent) {
        this.f65216a = jsonParserComponent;
    }
}
