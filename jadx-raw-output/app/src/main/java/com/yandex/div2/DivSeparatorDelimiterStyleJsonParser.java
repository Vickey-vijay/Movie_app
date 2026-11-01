package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivSeparatorDelimiterStyleJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48706a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Integer> f48707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivSeparator.DelimiterStyle.Orientation> f48708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivSeparator.DelimiterStyle.Orientation> f48709d;

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48710a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator.DelimiterStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivSeparatorDelimiterStyleJsonParser.f48707b;
            Expression<Integer> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<DivSeparator.DelimiterStyle.Orientation> typeHelper2 = DivSeparatorDelimiterStyleJsonParser.f48709d;
            bk.l<String, DivSeparator.DelimiterStyle.Orientation> lVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = DivSeparatorDelimiterStyleJsonParser.f48708c;
            Expression<DivSeparator.DelimiterStyle.Orientation> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper2, lVar2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSeparator.DelimiterStyle delimiterStyle) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", delimiterStyle.f48702a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", delimiterStyle.f48703b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f48710a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48711a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", delimiterStyleTemplate.f48760a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", delimiterStyleTemplate.f48761b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f48711a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparatorTemplate.DelimiterStyleTemplate deserialize(ParsingContext parsingContext, DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field;
            Field<Expression<DivSeparator.DelimiterStyle.Orientation>> field2;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            if (delimiterStyleTemplate != null) {
                field = delimiterStyleTemplate.f48760a;
            } else {
                field = null;
            }
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<DivSeparator.DelimiterStyle.Orientation> typeHelper2 = DivSeparatorDelimiterStyleJsonParser.f48709d;
            if (delimiterStyleTemplate != null) {
                field2 = delimiterStyleTemplate.f48761b;
            } else {
                field2 = null;
            }
            return new DivSeparatorTemplate.DelimiterStyleTemplate(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", typeHelper2, allowPropertyOverride, field2, DivSeparator.DelimiterStyle.Orientation.FROM_STRING));
        }
    }

    /* JADX INFO: compiled from: DivSeparatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivSeparatorTemplate.DelimiterStyleTemplate, DivSeparator.DelimiterStyle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f48712a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivSeparator.DelimiterStyle resolve(ParsingContext parsingContext, DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Integer>> field = delimiterStyleTemplate.f48760a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            bk.l<Object, Integer> lVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = DivSeparatorDelimiterStyleJsonParser.f48707b;
            Expression<Integer> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "color", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field<Expression<DivSeparator.DelimiterStyle.Orientation>> field2 = delimiterStyleTemplate.f48761b;
            TypeHelper<DivSeparator.DelimiterStyle.Orientation> typeHelper2 = DivSeparatorDelimiterStyleJsonParser.f48709d;
            bk.l<String, DivSeparator.DelimiterStyle.Orientation> lVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = DivSeparatorDelimiterStyleJsonParser.f48708c;
            Expression<DivSeparator.DelimiterStyle.Orientation> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "orientation", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(expression, expression2);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f48712a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f48707b = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        DivSeparator.DelimiterStyle.Orientation orientation = DivSeparator.DelimiterStyle.Orientation.HORIZONTAL;
        f48708c = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        f48709d = TypeHelper.Companion.from(orientation, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorDelimiterStyleJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSeparator.DelimiterStyle.Orientation);
            }
        });
    }
}
