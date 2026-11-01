package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DictValue;
import com.yandex.div2.DictValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictValueJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements TemplateResolver<JSONObject, DictValueTemplate, DictValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65167a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DictValue resolve(ParsingContext parsingContext, DictValueTemplate dictValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new DictValue(JsonFieldResolver.resolveExpression(parsingContext, dictValueTemplate.f45940a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }

    public a0(JsonParserComponent jsonParserComponent) {
        this.f65167a = jsonParserComponent;
    }
}
