package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPageSize;
import com.yandex.div2.DivPageSizeTemplate;
import com.yandex.div2.DivPercentageSize;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b7 implements TemplateResolver<JSONObject, DivPageSizeTemplate, DivPageSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65178a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageSize resolve(ParsingContext parsingContext, DivPageSizeTemplate divPageSizeTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivPageSize((DivPercentageSize) JsonFieldResolver.resolve(parsingContext, divPageSizeTemplate.f48142a, jSONObject, "page_width", this.f65178a.M5(), this.f65178a.K5()));
    }

    public b7(JsonParserComponent jsonParserComponent) {
        this.f65178a = jsonParserComponent;
    }
}
