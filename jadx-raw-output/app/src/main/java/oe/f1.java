package oe;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionDownload;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownloadJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65197a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDownload deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new DivActionDownload(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f65197a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f65197a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionDownload divActionDownload) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divActionDownload.f46150a, this.f65197a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divActionDownload.f46151b, this.f65197a.u0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", NativeAdPresenter.DOWNLOAD);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divActionDownload.f46152c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    public f1(JsonParserComponent jsonParserComponent) {
        this.f65197a = jsonParserComponent;
    }
}
