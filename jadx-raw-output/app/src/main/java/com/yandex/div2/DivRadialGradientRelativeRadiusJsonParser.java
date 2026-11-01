package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivRadialGradientRelativeRadiusJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48488a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivRadialGradientRelativeRadius.Value> f48489b = TypeHelper.Companion.from(nj.n.K(DivRadialGradientRelativeRadius.Value.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser$Companion$TYPE_HELPER_VALUE$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivRadialGradientRelativeRadius.Value);
        }
    });

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48490a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientRelativeRadius deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivRadialGradientRelativeRadius(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.f48489b, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientRelativeRadius.f48485a, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48490a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48491a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientRelativeRadiusTemplate.f48495a, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48491a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientRelativeRadiusTemplate deserialize(ParsingContext parsingContext, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivRadialGradientRelativeRadius.Value>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivRadialGradientRelativeRadius.Value> typeHelper = DivRadialGradientRelativeRadiusJsonParser.f48489b;
            if (divRadialGradientRelativeRadiusTemplate != null) {
                field = divRadialGradientRelativeRadiusTemplate.f48495a;
            } else {
                field = null;
            }
            return new DivRadialGradientRelativeRadiusTemplate(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivRadialGradientRelativeRadiusTemplate, DivRadialGradientRelativeRadius> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48492a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivRadialGradientRelativeRadius resolve(ParsingContext parsingContext, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, JSONObject jSONObject) throws ParsingException {
            return new DivRadialGradientRelativeRadius(JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientRelativeRadiusTemplate.f48495a, jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.f48489b, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48492a = jsonParserComponent;
        }
    }
}
