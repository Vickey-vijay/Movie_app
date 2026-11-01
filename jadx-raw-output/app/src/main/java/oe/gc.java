package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivWrapContentSize;
import com.yandex.div2.DivWrapContentSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivWrapContentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class gc implements TemplateResolver<JSONObject, DivWrapContentSizeTemplate, DivWrapContentSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65205a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivWrapContentSize resolve(ParsingContext parsingContext, DivWrapContentSizeTemplate divWrapContentSizeTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivWrapContentSize(JsonFieldResolver.resolveOptionalExpression(parsingContext, divWrapContentSizeTemplate.f50131a, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divWrapContentSizeTemplate.f50132b, jSONObject, "max_size", this.f65205a.d7(), this.f65205a.b7()), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divWrapContentSizeTemplate.f50133c, jSONObject, "min_size", this.f65205a.d7(), this.f65205a.b7()));
    }

    public gc(JsonParserComponent jsonParserComponent) {
        this.f65205a = jsonParserComponent;
    }
}
