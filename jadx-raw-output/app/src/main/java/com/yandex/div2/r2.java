package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerLayoutModeJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class r2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonParserComponent f50845a;

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPagerLayoutModeTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = entityTemplate instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) entityTemplate : null;
        if (divPagerLayoutModeTemplate != null && (type = divPagerLayoutModeTemplate.getType()) != null) {
            string = type;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode != 97445748) {
                if (iHashCode == 343327108 && string.equals("wrap_content")) {
                    return new DivPagerLayoutModeTemplate.c(this.f50845a.l5().getValue().deserialize(parsingContext, (DivPageContentSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.a() : null), jSONObject));
                }
            } else if (string.equals("fixed")) {
                return new DivPagerLayoutModeTemplate.b(this.f50845a.c5().getValue().deserialize(parsingContext, (DivNeighbourPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.a() : null), jSONObject));
            }
        } else if (string.equals("percentage")) {
            return new DivPagerLayoutModeTemplate.d(this.f50845a.o5().getValue().deserialize(parsingContext, (DivPageSizeTemplate) (divPagerLayoutModeTemplate != null ? divPagerLayoutModeTemplate.a() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, DivPagerLayoutModeTemplate divPagerLayoutModeTemplate) throws ParsingException {
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.d) {
            return this.f50845a.o5().getValue().serialize(parsingContext, ((DivPagerLayoutModeTemplate.d) divPagerLayoutModeTemplate).b());
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.b) {
            return this.f50845a.c5().getValue().serialize(parsingContext, ((DivPagerLayoutModeTemplate.b) divPagerLayoutModeTemplate).b());
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.c) {
            return this.f50845a.l5().getValue().serialize(parsingContext, ((DivPagerLayoutModeTemplate.c) divPagerLayoutModeTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public r2(JsonParserComponent jsonParserComponent) {
        this.f50845a = jsonParserComponent;
    }
}
