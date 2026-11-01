package oe;

import android.net.Uri;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionDownloadTemplate;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownloadJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f65202a;

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivActionDownloadTemplate divActionDownloadTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divActionDownloadTemplate.f46156a, this.f65202a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divActionDownloadTemplate.f46157b, this.f65202a.v0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", NativeAdPresenter.DOWNLOAD);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divActionDownloadTemplate.f46158c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    public g1(JsonParserComponent jsonParserComponent) {
        this.f65202a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDownloadTemplate deserialize(ParsingContext parsingContext, DivActionDownloadTemplate divActionDownloadTemplate, JSONObject jSONObject) throws ParsingException {
        Field<List<DivActionTemplate>> field;
        Field<List<DivActionTemplate>> field2;
        Field<Expression<Uri>> field3;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        if (divActionDownloadTemplate != null) {
            field = divActionDownloadTemplate.f46156a;
        } else {
            field = null;
        }
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, field, this.f65202a.v0());
        if (divActionDownloadTemplate != null) {
            field2 = divActionDownloadTemplate.f46157b;
        } else {
            field2 = null;
        }
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, field2, this.f65202a.v0());
        TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
        if (divActionDownloadTemplate != null) {
            field3 = divActionDownloadTemplate.f46158c;
        } else {
            field3 = null;
        }
        return new DivActionDownloadTemplate(optionalListField, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper, allowPropertyOverride, field3, ParsingConvertersKt.ANY_TO_URI));
    }
}
