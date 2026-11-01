package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivPointTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z7 implements TemplateResolver<JSONObject, DivPointTemplate, DivPoint> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65340a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPoint resolve(ParsingContext parsingContext, DivPointTemplate divPointTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivPoint((DivDimension) JsonFieldResolver.resolve(parsingContext, divPointTemplate.f48423a, jSONObject, VastAttributes.HORIZONTAL_POSITION, this.f65340a.O2(), this.f65340a.M2()), (DivDimension) JsonFieldResolver.resolve(parsingContext, divPointTemplate.f48424b, jSONObject, VastAttributes.VERTICAL_POSITION, this.f65340a.O2(), this.f65340a.M2()));
    }

    public z7(JsonParserComponent jsonParserComponent) {
        this.f65340a = jsonParserComponent;
    }
}
