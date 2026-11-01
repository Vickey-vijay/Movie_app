package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPhoneInputMask;
import com.yandex.div2.DivPhoneInputMaskTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t7 implements TemplateResolver<JSONObject, DivPhoneInputMaskTemplate, DivPhoneInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65295a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPhoneInputMask resolve(ParsingContext parsingContext, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivPhoneInputMask((String) JsonFieldResolver.resolve(parsingContext, divPhoneInputMaskTemplate.f48382a, jSONObject, "raw_text_variable"));
    }

    public t7(JsonParserComponent jsonParserComponent) {
        this.f65295a = jsonParserComponent;
    }
}
