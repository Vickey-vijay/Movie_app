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

/* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50912a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivAppearanceTransition> f50913b = new ListValidator() { // from class: oe.c2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return com.yandex.div2.y.b(list);
        }
    };

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50914a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAppearanceSetTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivAppearanceSetTransition(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.f50914a.z1(), y.f50913b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAppearanceSetTransition divAppearanceSetTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divAppearanceSetTransition.f46485a, this.f50914a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50914a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50915a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divAppearanceSetTransitionTemplate.f46490a, this.f50915a.A1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50915a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAppearanceSetTransitionTemplate deserialize(ParsingContext parsingContext, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            Field<List<DivAppearanceTransitionTemplate>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divAppearanceSetTransitionTemplate != null) {
                field = divAppearanceSetTransitionTemplate.f46490a;
            } else {
                field = null;
            }
            Field<List<DivAppearanceTransitionTemplate>> field2 = field;
            mj.g<a0> gVarA1 = this.f50915a.A1();
            ListValidator<DivAppearanceTransition> listValidator = y.f50913b;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivAppearanceSetTransitionTemplate(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field2, gVarA1, listValidator));
        }
    }

    /* JADX INFO: compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivAppearanceSetTransitionTemplate, DivAppearanceSetTransition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50916a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAppearanceSetTransition resolve(ParsingContext parsingContext, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivAppearanceSetTransition(JsonFieldResolver.resolveList(parsingContext, divAppearanceSetTransitionTemplate.f46490a, jSONObject, "items", this.f50916a.B1(), this.f50916a.z1(), y.f50913b));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50916a = jsonParserComponent;
        }
    }

    public static final boolean b(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
