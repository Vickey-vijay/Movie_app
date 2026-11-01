package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionHideTooltip;
import com.yandex.div2.DivActionHideTooltipTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionHideTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements TemplateResolver<JSONObject, DivActionHideTooltipTemplate, DivActionHideTooltip> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65245a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionHideTooltip resolve(ParsingContext parsingContext, DivActionHideTooltipTemplate divActionHideTooltipTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionHideTooltip(JsonFieldResolver.resolveExpression(parsingContext, divActionHideTooltipTemplate.f46172a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public n1(JsonParserComponent jsonParserComponent) {
        this.f65245a = jsonParserComponent;
    }
}
