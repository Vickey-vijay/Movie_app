package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSetStoredValue;
import com.yandex.div2.DivActionSetStoredValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetStoredValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements TemplateResolver<JSONObject, DivActionSetStoredValueTemplate, DivActionSetStoredValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65268a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetStoredValue resolve(ParsingContext parsingContext, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionSetStoredValue(JsonFieldResolver.resolveExpression(parsingContext, divActionSetStoredValueTemplate.f46257a, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divActionSetStoredValueTemplate.f46258b, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionSetStoredValueTemplate.f46259c, jSONObject, "value", this.f65268a.j9(), this.f65268a.h9()));
    }

    public q1(JsonParserComponent jsonParserComponent) {
        this.f65268a = jsonParserComponent;
    }
}
