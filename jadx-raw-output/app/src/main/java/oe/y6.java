package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPageContentSize;
import com.yandex.div2.DivPageContentSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageContentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y6 implements TemplateResolver<JSONObject, DivPageContentSizeTemplate, DivPageContentSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65327a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageContentSize resolve(ParsingContext parsingContext, DivPageContentSizeTemplate divPageContentSizeTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivPageContentSize();
    }

    public y6(JsonParserComponent jsonParserComponent) {
        this.f65327a = jsonParserComponent;
    }
}
