package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.EndDestination;
import com.yandex.div2.EndDestinationTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class jc implements TemplateResolver<JSONObject, EndDestinationTemplate, EndDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65223a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EndDestination resolve(ParsingContext parsingContext, EndDestinationTemplate endDestinationTemplate, JSONObject jSONObject) throws ParsingException {
        return new EndDestination();
    }

    public jc(JsonParserComponent jsonParserComponent) {
        this.f65223a = jsonParserComponent;
    }
}
