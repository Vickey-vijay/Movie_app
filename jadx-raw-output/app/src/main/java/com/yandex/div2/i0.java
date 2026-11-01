package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50674a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivChangeTransition> f50675b = new ListValidator() { // from class: oe.j2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.i0.b(list);
        }
    };

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50676a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeSetTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivChangeSetTransition(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.f50676a.U1(), i0.f50675b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivChangeSetTransition divChangeSetTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divChangeSetTransition.f46580a, this.f50676a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50676a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50677a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divChangeSetTransitionTemplate.f46585a, this.f50677a.V1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50677a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeSetTransitionTemplate deserialize(ParsingContext parsingContext, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<List<DivChangeTransitionTemplate>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divChangeSetTransitionTemplate != null) {
                field = divChangeSetTransitionTemplate.f46585a;
            } else {
                field = null;
            }
            Field<List<DivChangeTransitionTemplate>> field2 = field;
            mj.g<k0> gVarV1 = this.f50677a.V1();
            ListValidator<DivChangeTransition> listValidator = i0.f50675b;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivChangeSetTransitionTemplate(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field2, gVarV1, listValidator));
        }
    }

    /* JADX INFO: compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivChangeSetTransitionTemplate, DivChangeSetTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50678a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivChangeSetTransition resolve(ParsingContext parsingContext, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivChangeSetTransition(JsonFieldResolver.resolveList(parsingContext, divChangeSetTransitionTemplate.f46585a, jSONObject, "items", this.f50678a.W1(), this.f50678a.U1(), i0.f50675b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50678a = jsonParserComponent;
        }
    }

    public static final boolean b(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
