package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DictVariable;
import com.yandex.div2.DictVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements TemplateResolver<JSONObject, DictVariableTemplate, DictVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65187a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DictVariable resolve(ParsingContext parsingContext, DictVariableTemplate dictVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new DictVariable((String) JsonFieldResolver.resolve(parsingContext, dictVariableTemplate.f45948a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, dictVariableTemplate.f45949b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }

    public d0(JsonParserComponent jsonParserComponent) {
        this.f65187a = jsonParserComponent;
    }
}
