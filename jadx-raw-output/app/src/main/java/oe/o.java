package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ColorValue;
import com.yandex.div2.ColorValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorValueJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements TemplateResolver<JSONObject, ColorValueTemplate, ColorValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65251a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ColorValue resolve(ParsingContext parsingContext, ColorValueTemplate colorValueTemplate, JSONObject jSONObject) throws ParsingException {
        return new ColorValue(JsonFieldResolver.resolveExpression(parsingContext, colorValueTemplate.f45910a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    public o(JsonParserComponent jsonParserComponent) {
        this.f65251a = jsonParserComponent;
    }
}
