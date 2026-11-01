package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivNeighbourPageSize;
import com.yandex.div2.DivNeighbourPageSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNeighbourPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q6 implements TemplateResolver<JSONObject, DivNeighbourPageSizeTemplate, DivNeighbourPageSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65270a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNeighbourPageSize resolve(ParsingContext parsingContext, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivNeighbourPageSize((DivFixedSize) JsonFieldResolver.resolve(parsingContext, divNeighbourPageSizeTemplate.f48074a, jSONObject, "neighbour_page_width", this.f65270a.y3(), this.f65270a.w3()));
    }

    public q6(JsonParserComponent jsonParserComponent) {
        this.f65270a = jsonParserComponent;
    }
}
