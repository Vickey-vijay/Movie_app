package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorRegexTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivInputValidatorRegexTemplate implements JSONSerializable, JsonTemplate<DivInputValidatorRegex> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48014e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Boolean> f48015f = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputValidatorRegexTemplate> f48016g = new bk.p<ParsingEnvironment, JSONObject, DivInputValidatorRegexTemplate>() { // from class: com.yandex.div2.DivInputValidatorRegexTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorRegexTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivInputValidatorRegexTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f48017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f48018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f48019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<String> f48020d;

    /* JADX INFO: compiled from: DivInputValidatorRegexTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivInputValidatorRegexTemplate(Field<Expression<Boolean>> field, Field<Expression<String>> field2, Field<Expression<String>> field3, Field<String> field4) {
        this.f48017a = field;
        this.f48018b = field2;
        this.f48019c = field3;
        this.f48020d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivInputValidatorRegexTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divInputValidatorRegexTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivInputValidatorRegexTemplate(ParsingEnvironment parsingEnvironment, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Boolean>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false), (Field<Expression<String>>) companion.nullField(false), (Field<String>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
