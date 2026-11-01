package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.DivDataJsonParser;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivDataJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46949a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Expression<DivTransitionSelector> f46950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final TypeHelper<DivTransitionSelector> f46951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final ListValidator<DivData.State> f46952d;

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46953a;

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivData divData) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divData.f46935a, this.f46953a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "log_id", divData.f46936b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", divData.f46937c, this.f46953a.G2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "timers", divData.f46938d, this.f46953a.M8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", divData.f46939e, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divData.f46940f, this.f46953a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divData.f46941g, this.f46953a.k9());
            return jSONObject;
        }

        public b(JsonParserComponent jsonParserComponent) {
            this.f46953a = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivData deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression<DivTransitionSelector> expression;
            ParsingContext parsingContextCollectingErrors = ParsingContextKt.collectingErrors(parsingContext);
            List optionalList = JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "functions", this.f46953a.I3());
            String str = (String) JsonPropertyParser.read(parsingContextCollectingErrors, jSONObject, "log_id");
            List list = JsonPropertyParser.readList(parsingContextCollectingErrors, jSONObject, "states", this.f46953a.G2(), DivDataJsonParser.f46952d);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "timers", this.f46953a.M8());
            TypeHelper<DivTransitionSelector> typeHelper = DivDataJsonParser.f46951c;
            bk.l<String, DivTransitionSelector> lVar = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression2 = DivDataJsonParser.f46950b;
            Expression<DivTransitionSelector> optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContextCollectingErrors, jSONObject, "transition_animation_selector", typeHelper, lVar, expression2);
            if (optionalExpression == null) {
                expression = expression2;
            } else {
                expression = optionalExpression;
            }
            return new DivData(optionalList, str, list, optionalList2, expression, JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variable_triggers", this.f46953a.e9()), JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variables", this.f46953a.k9()), ParsingContextKt.getCollectedErrors(parsingContextCollectingErrors));
        }
    }

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46954a;

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivDataTemplate deserialize(ParsingContext parsingContext, DivDataTemplate divDataTemplate, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f46959a : null, this.f46954a.J3());
            Field field = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "log_id", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f46960b : null);
            Field<List<DivDataTemplate.StateTemplate>> field2 = divDataTemplate != null ? divDataTemplate.f46961c : null;
            mj.g<w0> gVarH2 = this.f46954a.H2();
            ListValidator<DivData.State> listValidator = DivDataJsonParser.f46952d;
            ck.p.h(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivDataTemplate(optionalListField, field, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field2, gVarH2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "timers", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f46962d : null, this.f46954a.N8()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "transition_animation_selector", DivDataJsonParser.f46951c, allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f46963e : null, DivTransitionSelector.FROM_STRING), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f46964f : null, this.f46954a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.f46965g : null, this.f46954a.l9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, DivDataTemplate divDataTemplate) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divDataTemplate.f46959a, this.f46954a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "log_id", divDataTemplate.f46960b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", divDataTemplate.f46961c, this.f46954a.H2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "timers", divDataTemplate.f46962d, this.f46954a.N8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", divDataTemplate.f46963e, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divDataTemplate.f46964f, this.f46954a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divDataTemplate.f46965g, this.f46954a.l9());
            return jSONObject;
        }

        public c(JsonParserComponent jsonParserComponent) {
            this.f46954a = jsonParserComponent;
        }
    }

    /* JADX INFO: compiled from: DivDataJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, DivDataTemplate, DivData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonParserComponent f46955a;

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DivData resolve(ParsingContext parsingContext, DivDataTemplate divDataTemplate, JSONObject jSONObject) throws ParsingException {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f46959a, jSONObject, "functions", this.f46955a.K3(), this.f46955a.I3());
            String str = (String) JsonFieldResolver.resolve(parsingContext, divDataTemplate.f46960b, jSONObject, "log_id");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, divDataTemplate.f46961c, jSONObject, "states", this.f46955a.I2(), this.f46955a.G2(), DivDataJsonParser.f46952d);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f46962d, jSONObject, "timers", this.f46955a.O8(), this.f46955a.M8());
            Field<Expression<DivTransitionSelector>> field = divDataTemplate.f46963e;
            TypeHelper<DivTransitionSelector> typeHelper = DivDataJsonParser.f46951c;
            bk.l<String, DivTransitionSelector> lVar = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression = DivDataJsonParser.f46950b;
            Expression<DivTransitionSelector> expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "transition_animation_selector", typeHelper, lVar, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new DivData(listResolveOptionalList, str, listResolveList, listResolveOptionalList2, expression, JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f46964f, jSONObject, "variable_triggers", this.f46955a.g9(), this.f46955a.e9()), JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.f46965g, jSONObject, "variables", this.f46955a.m9(), this.f46955a.k9()), null, 128, null);
        }

        public d(JsonParserComponent jsonParserComponent) {
            this.f46955a = jsonParserComponent;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
        f46950b = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        f46951c = TypeHelper.Companion.from(divTransitionSelector, new bk.l<Object, Boolean>() { // from class: com.yandex.div2.DivDataJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivTransitionSelector);
            }
        });
        f46952d = new ListValidator() { // from class: oe.f3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return DivDataJsonParser.b(list);
            }
        };
    }

    public static final boolean b(List list) {
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
}
