package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionFocusElement;
import com.yandex.div2.DivActionFocusElementTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionFocusElementJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k1 implements TemplateResolver<JSONObject, DivActionFocusElementTemplate, DivActionFocusElement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65227a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionFocusElement resolve(ParsingContext parsingContext, DivActionFocusElementTemplate divActionFocusElementTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionFocusElement(JsonFieldResolver.resolveExpression(parsingContext, divActionFocusElementTemplate.f46165a, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    public k1(JsonParserComponent jsonParserComponent) {
        this.f65227a = jsonParserComponent;
    }
}
