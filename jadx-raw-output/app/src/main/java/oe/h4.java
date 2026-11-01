package oe;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFunctionArgument;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65209a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFunctionArgument deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivFunctionArgument((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "type", DivEvaluableType.FROM_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivFunctionArgument divFunctionArgument) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", divFunctionArgument.f47242a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", divFunctionArgument.f47243b, (bk.l<DivEvaluableType, R>) DivEvaluableType.TO_STRING);
        return jSONObject;
    }

    public h4(JsonParserComponent jsonParserComponent) {
        this.f65209a = jsonParserComponent;
    }
}
