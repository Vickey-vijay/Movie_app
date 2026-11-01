package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivEdgeInsetsTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivEdgeInsetsTemplate implements JSONSerializable, JsonTemplate<DivEdgeInsets> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f47078h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f47079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<Long> f47080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<Long> f47081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Long> f47082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f47083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> f47084n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f47085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f47086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f47087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Long>> f47088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Long>> f47089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<Long>> f47090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f47091g;

    /* JADX INFO: compiled from: DivEdgeInsetsTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivEdgeInsetsTemplate(Field<Expression<Long>> field, Field<Expression<Long>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4, Field<Expression<Long>> field5, Field<Expression<Long>> field6, Field<Expression<DivSizeUnit>> field7) {
        this.f47085a = field;
        this.f47086b = field2;
        this.f47087c = field3;
        this.f47088d = field4;
        this.f47089e = field5;
        this.f47090f = field6;
        this.f47091g = field7;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47079i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47080j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47081k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47082l = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47083m = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        f47084n = new bk.p<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate>() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivEdgeInsetsTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivEdgeInsetsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivEdgeInsetsTemplate divEdgeInsetsTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divEdgeInsetsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivEdgeInsetsTemplate divEdgeInsetsTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
