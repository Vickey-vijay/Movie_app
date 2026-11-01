package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ColorVariable;
import com.yandex.div2.ColorVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorVariableJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements TemplateResolver<JSONObject, ColorVariableTemplate, ColorVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65273a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ColorVariable resolve(ParsingContext parsingContext, ColorVariableTemplate colorVariableTemplate, JSONObject jSONObject) throws ParsingException {
        return new ColorVariable((String) JsonFieldResolver.resolve(parsingContext, colorVariableTemplate.f45918a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, colorVariableTemplate.f45919b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    public r(JsonParserComponent jsonParserComponent) {
        this.f65273a = jsonParserComponent;
    }
}
