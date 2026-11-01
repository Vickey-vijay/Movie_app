package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionClearFocus;
import com.yandex.div2.DivActionClearFocusTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionClearFocusJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements TemplateResolver<JSONObject, DivActionClearFocusTemplate, DivActionClearFocus> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65324a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionClearFocus resolve(ParsingContext parsingContext, DivActionClearFocusTemplate divActionClearFocusTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionClearFocus();
    }

    public y0(JsonParserComponent jsonParserComponent) {
        this.f65324a = jsonParserComponent;
    }
}
