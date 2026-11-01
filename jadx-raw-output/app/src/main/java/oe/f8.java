package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRelativeCenter;
import com.yandex.div2.DivRadialGradientRelativeCenterTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f8 implements TemplateResolver<JSONObject, DivRadialGradientRelativeCenterTemplate, DivRadialGradientRelativeCenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65198a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRelativeCenter resolve(ParsingContext parsingContext, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivRadialGradientRelativeCenter(JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientRelativeCenterTemplate.f48482a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    public f8(JsonParserComponent jsonParserComponent) {
        this.f65198a = jsonParserComponent;
    }
}
