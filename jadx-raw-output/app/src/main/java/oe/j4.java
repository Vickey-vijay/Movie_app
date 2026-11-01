package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFunctionArgument;
import com.yandex.div2.DivFunctionArgumentTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j4 implements TemplateResolver<JSONObject, DivFunctionArgumentTemplate, DivFunctionArgument> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65222a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFunctionArgument resolve(ParsingContext parsingContext, DivFunctionArgumentTemplate divFunctionArgumentTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivFunctionArgument((String) JsonFieldResolver.resolve(parsingContext, divFunctionArgumentTemplate.f47247a, jSONObject, "name"), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, divFunctionArgumentTemplate.f47248b, jSONObject, "type", DivEvaluableType.FROM_STRING));
    }

    public j4(JsonParserComponent jsonParserComponent) {
        this.f65222a = jsonParserComponent;
    }
}
