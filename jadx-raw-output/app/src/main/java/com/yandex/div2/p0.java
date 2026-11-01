package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
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

/* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50814a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50815b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50816a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder.Prototype deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Div div = (Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f50816a.M4());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = p0.f50815b;
            Expression<Boolean> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selector", typeHelper, lVar, expression);
            if (optionalExpression2 != null) {
                expression = optionalExpression2;
            }
            return new DivCollectionItemBuilder.Prototype(div, optionalExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilder.Prototype prototype) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "div", prototype.f46629a, this.f50816a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", prototype.f46630b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selector", prototype.f46631c);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50816a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50817a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", prototypeTemplate.f46642a, this.f50817a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", prototypeTemplate.f46643b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selector", prototypeTemplate.f46644c);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50817a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilderTemplate.PrototypeTemplate deserialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate, JSONObject jSONObject) throws ParsingException {
            Field<DivTemplate> field;
            Field<Expression<String>> field2;
            Field<Expression<Boolean>> field3;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (prototypeTemplate != null) {
                field = prototypeTemplate.f46642a;
            } else {
                field = null;
            }
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, field, this.f50817a.N4());
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            if (prototypeTemplate != null) {
                field2 = prototypeTemplate.f46643b;
            } else {
                field2 = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", typeHelper, allowPropertyOverride, field2);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            if (prototypeTemplate != null) {
                field3 = prototypeTemplate.f46644c;
            } else {
                field3 = null;
            }
            return new DivCollectionItemBuilderTemplate.PrototypeTemplate(field4, optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selector", typeHelper2, allowPropertyOverride, field3, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivCollectionItemBuilderTemplate.PrototypeTemplate, DivCollectionItemBuilder.Prototype> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50818a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivCollectionItemBuilder.Prototype resolve(ParsingContext parsingContext, DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate, JSONObject jSONObject) throws ParsingException {
            Div div = (Div) JsonFieldResolver.resolve(parsingContext, prototypeTemplate.f46642a, jSONObject, "div", this.f50818a.O4(), this.f50818a.M4());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, prototypeTemplate.f46643b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field = prototypeTemplate.f46644c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = p0.f50815b;
            Expression<Boolean> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "selector", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            return new DivCollectionItemBuilder.Prototype(div, expressionResolveOptionalExpression, expression);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50818a = jsonParserComponent;
        }
    }
}
