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

/* JADX INFO: compiled from: DivTextRangeMaskBaseJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50857a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f50858b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: compiled from: DivTextRangeMaskBaseJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskBaseJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50859a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskBase deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = s4.f50858b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new DivTextRangeMaskBase(expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskBase divTextRangeMaskBase) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divTextRangeMaskBase.f49663a);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f50859a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskBaseJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50860a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divTextRangeMaskBaseTemplate.f49668a);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f50860a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskBaseTemplate deserialize(ParsingContext parsingContext, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            if (divTextRangeMaskBaseTemplate != null) {
                field = divTextRangeMaskBaseTemplate.f49668a;
            } else {
                field = null;
            }
            return new DivTextRangeMaskBaseTemplate(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskBaseJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextRangeMaskBaseTemplate, DivTextRangeMaskBase> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f50861a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextRangeMaskBase resolve(ParsingContext parsingContext, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = divTextRangeMaskBaseTemplate.f49668a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = s4.f50858b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivTextRangeMaskBase(expression);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f50861a = jsonParserComponent;
        }
    }
}
