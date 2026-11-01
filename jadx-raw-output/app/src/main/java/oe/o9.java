package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivSolidBackgroundTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSolidBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o9 implements TemplateResolver<JSONObject, DivSolidBackgroundTemplate, DivSolidBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65256a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSolidBackground resolve(ParsingContext parsingContext, DivSolidBackgroundTemplate divSolidBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivSolidBackground(JsonFieldResolver.resolveExpression(parsingContext, divSolidBackgroundTemplate.f49010a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    public o9(JsonParserComponent jsonParserComponent) {
        this.f65256a = jsonParserComponent;
    }
}
