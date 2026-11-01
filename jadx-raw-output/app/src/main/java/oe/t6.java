package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivNinePatchBackground;
import com.yandex.div2.DivNinePatchBackgroundTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t6 implements TemplateResolver<JSONObject, DivNinePatchBackgroundTemplate, DivNinePatchBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65294a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNinePatchBackground resolve(ParsingContext parsingContext, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivNinePatchBackground(JsonFieldResolver.resolveExpression(parsingContext, divNinePatchBackgroundTemplate.f48082a, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (DivAbsoluteEdgeInsets) JsonFieldResolver.resolve(parsingContext, divNinePatchBackgroundTemplate.f48083b, jSONObject, "insets", this.f65294a.G(), this.f65294a.E()));
    }

    public t6(JsonParserComponent jsonParserComponent) {
        this.f65294a = jsonParserComponent;
    }
}
