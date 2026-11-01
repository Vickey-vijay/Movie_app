package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionArrayInsertValue;
import com.yandex.div2.DivActionArrayInsertValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements TemplateResolver<JSONObject, DivActionArrayInsertValueTemplate, DivActionArrayInsertValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65260a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayInsertValue resolve(ParsingContext parsingContext, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionArrayInsertValue(JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionArrayInsertValueTemplate.f46093a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionArrayInsertValueTemplate.f46094b, jSONObject, "value", this.f65260a.j9(), this.f65260a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionArrayInsertValueTemplate.f46095c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public p0(JsonParserComponent jsonParserComponent) {
        this.f65260a = jsonParserComponent;
    }
}
