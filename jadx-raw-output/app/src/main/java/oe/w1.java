package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionShowTooltip;
import com.yandex.div2.DivActionShowTooltipTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionShowTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w1 implements TemplateResolver<JSONObject, DivActionShowTooltipTemplate, DivActionShowTooltip> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65312a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionShowTooltip resolve(ParsingContext parsingContext, DivActionShowTooltipTemplate divActionShowTooltipTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionShowTooltip(JsonFieldResolver.resolveExpression(parsingContext, divActionShowTooltipTemplate.f46276a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionShowTooltipTemplate.f46277b, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    public w1(JsonParserComponent jsonParserComponent) {
        this.f65312a = jsonParserComponent;
    }
}
