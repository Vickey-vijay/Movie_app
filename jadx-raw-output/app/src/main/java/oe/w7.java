package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPivotPercentage;
import com.yandex.div2.DivPivotPercentageTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotPercentageJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w7 implements TemplateResolver<JSONObject, DivPivotPercentageTemplate, DivPivotPercentage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65314a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivotPercentage resolve(ParsingContext parsingContext, DivPivotPercentageTemplate divPivotPercentageTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivPivotPercentage(JsonFieldResolver.resolveExpression(parsingContext, divPivotPercentageTemplate.f48411a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    public w7(JsonParserComponent jsonParserComponent) {
        this.f65314a = jsonParserComponent;
    }
}
