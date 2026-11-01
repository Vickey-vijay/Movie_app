package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivExtensionTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtensionJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u3 implements TemplateResolver<JSONObject, DivExtensionTemplate, DivExtension> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65300a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivExtension resolve(ParsingContext parsingContext, DivExtensionTemplate divExtensionTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivExtension((String) JsonFieldResolver.resolve(parsingContext, divExtensionTemplate.f47100a, jSONObject, "id"), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divExtensionTemplate.f47101b, jSONObject, "params"));
    }

    public u3(JsonParserComponent jsonParserComponent) {
        this.f65300a = jsonParserComponent;
    }
}
