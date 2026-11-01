package com.yandex.div2;

import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46173a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<Boolean> f46174b = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivAction.Target> f46175c = TypeHelper.Companion.from(nj.n.K(DivAction.Target.values()), new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivActionJsonParser$Companion$TYPE_HELPER_TARGET$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAction.Target);
        }
    });

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46176a;

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAction deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.f46176a.S2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivActionJsonParser.f46174b;
            Expression<Boolean> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, lVar, expression);
            Expression<Boolean> expression2 = optionalExpression == null ? expression : optionalExpression;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            bk.l<Object, Uri> lVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(divDownloadCallbacks, expression2, expression3, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_url", typeHelper2, lVar2), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "menu_items", this.f46176a.x0()), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper2, lVar2), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, DivActionJsonParser.f46175c, DivAction.Target.FROM_STRING), (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.f46176a.h1()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper2, lVar2));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivAction divAction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divAction.f46030a, this.f46176a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divAction.f46031b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divAction.f46032c);
            Expression<Uri> expression = divAction.f46033d;
            bk.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_url", expression, lVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "menu_items", divAction.f46034e, this.f46176a.x0());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divAction.f46035f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", divAction.f46036g, lVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divAction.f46037h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, divAction.f46038i, DivAction.Target.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divAction.f46039j, this.f46176a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divAction.f46040k, lVar);
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46176a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46177a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivActionTemplate deserialize(ParsingContext parsingContext, DivActionTemplate divActionTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46323a : null, this.f46177a.T2());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46324b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46325c : null);
            TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field = divActionTemplate != null ? divActionTemplate.f46326d : null;
            bk.l<Object, Uri> lVar = ParsingConvertersKt.ANY_TO_URI;
            return new DivActionTemplate(optionalField, optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_url", typeHelper, allowPropertyOverride, field, lVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "menu_items", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46327e : null, this.f46177a.y0()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46328f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46329g : null, lVar), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46330h : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.AttributesType.S_TARGET, DivActionJsonParser.f46175c, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46331i : null, DivAction.Target.FROM_STRING), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46332j : null, this.f46177a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.f46333k : null, lVar));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivActionTemplate divActionTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divActionTemplate.f46323a, this.f46177a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divActionTemplate.f46324b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divActionTemplate.f46325c);
            Field<Expression<Uri>> field = divActionTemplate.f46326d;
            bk.l<Uri, String> lVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_url", field, lVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "menu_items", divActionTemplate.f46327e, this.f46177a.y0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divActionTemplate.f46328f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", divActionTemplate.f46329g, lVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divActionTemplate.f46330h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, divActionTemplate.f46331i, DivAction.Target.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divActionTemplate.f46332j, this.f46177a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divActionTemplate.f46333k, lVar);
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46177a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivActionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivActionTemplate, DivAction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46178a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivAction resolve(ParsingContext parsingContext, DivActionTemplate divActionTemplate, JSONObject jSONObject) throws ParsingException {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f46323a, jSONObject, "download_callbacks", this.f46178a.U2(), this.f46178a.S2());
            Field<Expression<Boolean>> field = divActionTemplate.f46324b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            bk.l<Object, Boolean> lVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = DivActionJsonParser.f46174b;
            Expression<Boolean> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divActionTemplate.f46325c, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Uri>> field2 = divActionTemplate.f46326d;
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            bk.l<Object, Uri> lVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(divDownloadCallbacks, expression, expressionResolveExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "log_url", typeHelper2, lVar2), JsonFieldResolver.resolveOptionalList(parsingContext, divActionTemplate.f46327e, jSONObject, "menu_items", this.f46178a.z0(), this.f46178a.x0()), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f46328f, jSONObject, "payload"), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.f46329g, jSONObject, "referer", typeHelper2, lVar2), (String) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f46330h, jSONObject, "scope_id"), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.f46331i, jSONObject, TypedValues.AttributesType.S_TARGET, DivActionJsonParser.f46175c, DivAction.Target.FROM_STRING), (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.f46332j, jSONObject, "typed", this.f46178a.j1(), this.f46178a.h1()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.f46333k, jSONObject, "url", typeHelper2, lVar2));
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46178a = jsonParserComponent;
        }
    }
}
