package oe;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionAnimatorStop;
import com.yandex.div2.DivActionAnimatorStopTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStopJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements TemplateResolver<JSONObject, DivActionAnimatorStopTemplate, DivActionAnimatorStop> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65237a;

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionAnimatorStop resolve(ParsingContext parsingContext, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, JSONObject jSONObject) throws ParsingException {
        return new DivActionAnimatorStop((String) JsonFieldResolver.resolve(parsingContext, divActionAnimatorStopTemplate.f46084a, jSONObject, "animator_id"));
    }

    public m0(JsonParserComponent jsonParserComponent) {
        this.f65237a = jsonParserComponent;
    }
}
