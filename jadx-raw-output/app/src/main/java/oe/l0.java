package oe;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionAnimatorStopTemplate;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStopJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65231a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "animator_id", divActionAnimatorStopTemplate.f46084a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    public l0(JsonParserComponent jsonParserComponent) {
        this.f65231a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionAnimatorStopTemplate deserialize(ParsingContext parsingContext, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, JSONObject jSONObject) throws ParsingException {
        Field<String> field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divActionAnimatorStopTemplate != null) {
            field = divActionAnimatorStopTemplate.f46084a;
        } else {
            field = null;
        }
        return new DivActionAnimatorStopTemplate(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "animator_id", allowPropertyOverride, field));
    }
}
