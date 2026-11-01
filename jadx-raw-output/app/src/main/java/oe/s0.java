package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionArrayRemoveValue;
import com.yandex.div2.DivActionArrayRemoveValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements TemplateResolver<JSONObject, DivActionArrayRemoveValueTemplate, DivActionArrayRemoveValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65282a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayRemoveValue resolve(ParsingContext parsingContext, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionArrayRemoveValue(JsonFieldResolver.resolveExpression(parsingContext, divActionArrayRemoveValueTemplate.f46103a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divActionArrayRemoveValueTemplate.f46104b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public s0(JsonParserComponent jsonParserComponent) {
        this.f65282a = jsonParserComponent;
    }
}
