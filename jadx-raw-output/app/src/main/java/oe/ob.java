package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTooltipModeModal;
import com.yandex.div2.DivTooltipModeModalTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeModalJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ob implements TemplateResolver<JSONObject, DivTooltipModeModalTemplate, DivTooltipModeModal> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65257a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeModal resolve(ParsingContext parsingContext, DivTooltipModeModalTemplate divTooltipModeModalTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivTooltipModeModal();
    }

    public ob(JsonParserComponent jsonParserComponent) {
        this.f65257a = jsonParserComponent;
    }
}
