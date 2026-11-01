package oe;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivWrapContentSize;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivWrapContentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ec implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65194a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivWrapContentSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivWrapContentSize(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", this.f65194a.b7()), (DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", this.f65194a.b7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivWrapContentSize divWrapContentSize) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "constrained", divWrapContentSize.f50125a);
        JsonPropertyParser.write(parsingContext, jSONObject, "max_size", divWrapContentSize.f50126b, this.f65194a.b7());
        JsonPropertyParser.write(parsingContext, jSONObject, "min_size", divWrapContentSize.f50127c, this.f65194a.b7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }

    public ec(JsonParserComponent jsonParserComponent) {
        this.f65194a = jsonParserComponent;
    }
}
