package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivCurrencyInputMask;
import com.yandex.div2.DivCurrencyInputMaskTemplate;
import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a3 implements TemplateResolver<JSONObject, DivCurrencyInputMaskTemplate, DivCurrencyInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65169a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCurrencyInputMask resolve(ParsingContext parsingContext, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivCurrencyInputMask(JsonFieldResolver.resolveOptionalExpression(parsingContext, divCurrencyInputMaskTemplate.f46863a, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, divCurrencyInputMaskTemplate.f46864b, jSONObject, "raw_text_variable"));
    }

    public a3(JsonParserComponent jsonParserComponent) {
        this.f65169a = jsonParserComponent;
    }
}
