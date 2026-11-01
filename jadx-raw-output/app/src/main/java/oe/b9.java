package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivShapeDrawableTemplate;
import com.yandex.div2.DivStroke;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b9 implements TemplateResolver<JSONObject, DivShapeDrawableTemplate, DivShapeDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65179a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShapeDrawable resolve(ParsingContext parsingContext, DivShapeDrawableTemplate divShapeDrawableTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivShapeDrawable(JsonFieldResolver.resolveExpression(parsingContext, divShapeDrawableTemplate.f48794a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShape) JsonFieldResolver.resolve(parsingContext, divShapeDrawableTemplate.f48795b, jSONObject, "shape", this.f65179a.X6(), this.f65179a.V6()), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divShapeDrawableTemplate.f48796c, jSONObject, VastAttributes.STROKE_COLOR, this.f65179a.E7(), this.f65179a.C7()));
    }

    public b9(JsonParserComponent jsonParserComponent) {
        this.f65179a = jsonParserComponent;
    }
}
