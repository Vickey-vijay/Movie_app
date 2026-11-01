package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTooltipModeNonModal;
import com.yandex.div2.DivTooltipModeNonModalTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeNonModalJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class rb implements TemplateResolver<JSONObject, DivTooltipModeNonModalTemplate, DivTooltipModeNonModal> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65279a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeNonModal resolve(ParsingContext parsingContext, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivTooltipModeNonModal();
    }

    public rb(JsonParserComponent jsonParserComponent) {
        this.f65279a = jsonParserComponent;
    }
}
