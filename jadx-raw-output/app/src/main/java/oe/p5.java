package oe;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInfinityCount;
import com.yandex.div2.DivInfinityCountTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInfinityCountJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p5 implements TemplateResolver<JSONObject, DivInfinityCountTemplate, DivInfinityCount> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65262a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInfinityCount resolve(ParsingContext parsingContext, DivInfinityCountTemplate divInfinityCountTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivInfinityCount();
    }

    public p5(JsonParserComponent jsonParserComponent) {
        this.f65262a = jsonParserComponent;
    }
}
