package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorBaseTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivInputValidatorBaseTemplate implements JSONSerializable, JsonTemplate<DivInputValidatorBase> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47985d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<Boolean> f47986e = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputValidatorBaseTemplate> f47987f = new bk.p<ParsingEnvironment, JSONObject, DivInputValidatorBaseTemplate>() { // from class: com.yandex.div2.DivInputValidatorBaseTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorBaseTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivInputValidatorBaseTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f47989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<String> f47990c;

    /* JADX INFO: compiled from: DivInputValidatorBaseTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivInputValidatorBaseTemplate(Field<Expression<Boolean>> field, Field<Expression<String>> field2, Field<String> field3) {
        this.f47988a = field;
        this.f47989b = field2;
        this.f47990c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivInputValidatorBaseTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputValidatorBaseTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivInputValidatorBaseTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
