package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ArrayVariable;
import com.yandex.div2.ArrayVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements TemplateResolver<JSONObject, ArrayVariableTemplate, ArrayVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65196a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayVariable resolve(ParsingContext parsingContext, ArrayVariableTemplate arrayVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new ArrayVariable((String) JsonFieldResolver.resolve(parsingContext, arrayVariableTemplate.f45886a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, arrayVariableTemplate.f45887b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }

    public f(JsonParserComponent jsonParserComponent) {
        this.f65196a = jsonParserComponent;
    }
}
