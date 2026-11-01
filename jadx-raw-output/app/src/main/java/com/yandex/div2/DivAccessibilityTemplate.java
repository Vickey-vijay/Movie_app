package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAccessibilityTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivAccessibilityTemplate implements JSONSerializable, JsonTemplate<DivAccessibility> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f46015h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<DivAccessibility.Mode> f46016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Boolean> f46017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final DivAccessibility.Type f46018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAccessibilityTemplate> f46019l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f46020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f46021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<DivAccessibility.Mode>> f46023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<String>> f46025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<DivAccessibility.Type> f46026g;

    /* JADX INFO: compiled from: DivAccessibilityTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivAccessibilityTemplate(Field<Expression<String>> field, Field<Expression<String>> field2, Field<Expression<Boolean>> field3, Field<Expression<DivAccessibility.Mode>> field4, Field<Expression<Boolean>> field5, Field<Expression<String>> field6, Field<DivAccessibility.Type> field7) {
        this.f46020a = field;
        this.f46021b = field2;
        this.f46022c = field3;
        this.f46023d = field4;
        this.f46024e = field5;
        this.f46025f = field6;
        this.f46026g = field7;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46016i = Expression.Companion.constant$default(companion, DivAccessibility.Mode.DEFAULT, null, 2, null);
        f46017j = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f46018k = DivAccessibility.Type.AUTO;
        f46019l = new bk.p<ParsingEnvironment, JSONObject, DivAccessibilityTemplate>() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAccessibilityTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivAccessibilityTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivAccessibilityTemplate(ParsingEnvironment parsingEnvironment, DivAccessibilityTemplate divAccessibilityTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAccessibilityTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivAccessibilityTemplate(ParsingEnvironment parsingEnvironment, DivAccessibilityTemplate divAccessibilityTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
