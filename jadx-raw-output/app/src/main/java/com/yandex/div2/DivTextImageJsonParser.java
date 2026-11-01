package com.yandex.div2;

import androidx.core.graphics.drawable.IconCompat;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTextImageJsonParser;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivTextImageJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49576a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivTextAlignmentVertical> f49577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f49578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivText.Image.IndexingDirection> f49579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f49580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivBlendMode> f49581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final DivFixedSize f49582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivTextAlignmentVertical> f49583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivText.Image.IndexingDirection> f49584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivBlendMode> f49585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ValueValidator<Long> f49586k;

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49587a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f49587a.j8());
            TypeHelper<DivTextAlignmentVertical> typeHelper = DivTextImageJsonParser.f49583h;
            bk.l<String, DivTextAlignmentVertical> lVar = DivTextAlignmentVertical.FROM_STRING;
            Expression<DivTextAlignmentVertical> expression = DivTextImageJsonParser.f49577b;
            Expression<DivTextAlignmentVertical> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper, lVar, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f49587a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivTextImageJsonParser.f49578c;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            TypeHelper<DivText.Image.IndexingDirection> typeHelper2 = DivTextImageJsonParser.f49584i;
            bk.l<String, DivText.Image.IndexingDirection> lVar2 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression<DivText.Image.IndexingDirection> expression2 = DivTextImageJsonParser.f49579d;
            Expression<DivText.Image.IndexingDirection> optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "indexing_direction", typeHelper2, lVar2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivTextImageJsonParser.f49580e;
            Expression<Boolean> optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper3, lVar3, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.f49586k);
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<DivBlendMode> typeHelper4 = DivTextImageJsonParser.f49585j;
            bk.l<String, DivBlendMode> lVar4 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression5 = DivTextImageJsonParser.f49581f;
            Expression<DivBlendMode> optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper4, lVar4, expression5);
            if (optionalExpression5 != null) {
                expression5 = optionalExpression5;
            }
            Expression expression6 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f49587a.w3());
            if (divFixedSize3 == null) {
                divFixedSize3 = DivTextImageJsonParser.f49582g;
            }
            return new DivText.Image(accessibility, expression, divFixedSize2, expression2, expression3, expression4, optionalExpression4, expression5, expression6, divFixedSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivText.Image image) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", image.f49520a, this.f49587a.j8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", image.f49521b, DivTextAlignmentVertical.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", image.f49522c, this.f49587a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "indexing_direction", image.f49523d, DivText.Image.IndexingDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", image.f49524e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", image.f49525f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", image.f49526g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, image.f49527h, DivBlendMode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", image.f49528i, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", image.f49529j, this.f49587a.w3());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f49587a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49588a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivTextTemplate.ImageTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate imageTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextTemplate.ImageTemplate(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, imageTemplate != null ? imageTemplate.f49773a : null, this.f49588a.k8()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", DivTextImageJsonParser.f49583h, allowPropertyOverride, imageTemplate != null ? imageTemplate.f49774b : null, DivTextAlignmentVertical.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, imageTemplate != null ? imageTemplate.f49775c : null, this.f49588a.x3()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "indexing_direction", DivTextImageJsonParser.f49584i, allowPropertyOverride, imageTemplate != null ? imageTemplate.f49776d : null, DivText.Image.IndexingDirection.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, imageTemplate != null ? imageTemplate.f49777e : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, imageTemplate != null ? imageTemplate.f49778f : null, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.f49586k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, imageTemplate != null ? imageTemplate.f49779g : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, IconCompat.EXTRA_TINT_MODE, DivTextImageJsonParser.f49585j, allowPropertyOverride, imageTemplate != null ? imageTemplate.f49780h : null, DivBlendMode.FROM_STRING), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, imageTemplate != null ? imageTemplate.f49781i : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, imageTemplate != null ? imageTemplate.f49782j : null, this.f49588a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate imageTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", imageTemplate.f49773a, this.f49588a.k8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", imageTemplate.f49774b, DivTextAlignmentVertical.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", imageTemplate.f49775c, this.f49588a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "indexing_direction", imageTemplate.f49776d, DivText.Image.IndexingDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", imageTemplate.f49777e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", imageTemplate.f49778f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", imageTemplate.f49779g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IconCompat.EXTRA_TINT_MODE, imageTemplate.f49780h, DivBlendMode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", imageTemplate.f49781i, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", imageTemplate.f49782j, this.f49588a.x3());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f49588a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivTextJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivTextTemplate.ImageTemplate, DivText.Image> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f49589a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivText.Image resolve(ParsingContext parsingContext, DivTextTemplate.ImageTemplate imageTemplate, JSONObject jSONObject) throws ParsingException {
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.f49773a, jSONObject, "accessibility", this.f49589a.l8(), this.f49589a.j8());
            Field<Expression<DivTextAlignmentVertical>> field = imageTemplate.f49774b;
            TypeHelper<DivTextAlignmentVertical> typeHelper = DivTextImageJsonParser.f49583h;
            bk.l<String, DivTextAlignmentVertical> lVar = DivTextAlignmentVertical.FROM_STRING;
            Expression<DivTextAlignmentVertical> expression = DivTextImageJsonParser.f49577b;
            Expression<DivTextAlignmentVertical> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_vertical", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.f49775c, jSONObject, "height", this.f49589a.y3(), this.f49589a.w3());
            if (divFixedSize == null) {
                divFixedSize = DivTextImageJsonParser.f49578c;
            }
            Field<Expression<DivText.Image.IndexingDirection>> field2 = imageTemplate.f49776d;
            TypeHelper<DivText.Image.IndexingDirection> typeHelper2 = DivTextImageJsonParser.f49584i;
            bk.l<String, DivText.Image.IndexingDirection> lVar2 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression<DivText.Image.IndexingDirection> expression2 = DivTextImageJsonParser.f49579d;
            Expression<DivText.Image.IndexingDirection> expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "indexing_direction", typeHelper2, lVar2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field<Expression<Boolean>> field3 = imageTemplate.f49777e;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = DivTextImageJsonParser.f49580e;
            Expression<Boolean> expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "preload_required", typeHelper3, lVar3, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, imageTemplate.f49778f, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.f49586k);
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, imageTemplate.f49779g, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<DivBlendMode>> field4 = imageTemplate.f49780h;
            TypeHelper<DivBlendMode> typeHelper4 = DivTextImageJsonParser.f49585j;
            bk.l<String, DivBlendMode> lVar4 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression4 = DivTextImageJsonParser.f49581f;
            Expression<DivBlendMode> expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, IconCompat.EXTRA_TINT_MODE, typeHelper4, lVar4, expression4);
            if (expressionResolveOptionalExpression5 != null) {
                expression4 = expressionResolveOptionalExpression5;
            }
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, imageTemplate.f49781i, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.f49782j, jSONObject, "width", this.f49589a.y3(), this.f49589a.w3());
            if (divFixedSize2 == null) {
                divFixedSize2 = DivTextImageJsonParser.f49582g;
            }
            return new DivText.Image(accessibility, expressionResolveOptionalExpression, divFixedSize, expressionResolveOptionalExpression2, expression3, expressionResolveExpression, expressionResolveOptionalExpression4, expression4, expressionResolveExpression2, divFixedSize2);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f49589a = jsonParserComponent;
        }
    }

    public static final boolean b(long j10) {
        return j10 >= 0;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.CENTER;
        f49577b = Expression.Companion.constant$default(companion, divTextAlignmentVertical, null, 2, null);
        f49578c = new DivFixedSize(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        DivText.Image.IndexingDirection indexingDirection = DivText.Image.IndexingDirection.NORMAL;
        f49579d = Expression.Companion.constant$default(companion, indexingDirection, null, 2, null);
        f49580e = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        f49581f = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        f49582g = new DivFixedSize(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f49583h = companion2.from(divTextAlignmentVertical, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
            }
        });
        f49584i = companion2.from(indexingDirection, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_INDEXING_DIRECTION$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivText.Image.IndexingDirection);
            }
        });
        f49585j = companion2.from(divBlendMode, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivBlendMode);
            }
        });
        f49586k = new ValueValidator() { // from class: oe.ra
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return DivTextImageJsonParser.b(((Long) obj).longValue());
            }
        };
    }
}
