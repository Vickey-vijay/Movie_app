package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StartDestination;
import com.yandex.div2.StartDestinationTemplate;
import org.json.JSONObject;

/* JADX INFO: compiled from: StartDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class bd implements TemplateResolver<JSONObject, StartDestinationTemplate, StartDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65181a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StartDestination resolve(ParsingContext parsingContext, StartDestinationTemplate startDestinationTemplate, JSONObject jSONObject) throws ParsingException {
        return new StartDestination();
    }

    public bd(JsonParserComponent jsonParserComponent) {
        this.f65181a = jsonParserComponent;
    }
}
