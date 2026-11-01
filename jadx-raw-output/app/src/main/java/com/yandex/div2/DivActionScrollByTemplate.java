package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollByTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivActionScrollByTemplate implements JSONSerializable, JsonTemplate<DivActionScrollBy> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46201f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Boolean> f46202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f46203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f46204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<DivActionScrollBy.Overflow> f46205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionScrollByTemplate> f46206k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<String>> f46208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f46209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Long>> f46210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivActionScrollBy.Overflow>> f46211e;

    /* JADX INFO: compiled from: DivActionScrollByTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionScrollByTemplate(Field<Expression<Boolean>> field, Field<Expression<String>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4, Field<Expression<DivActionScrollBy.Overflow>> field5) {
        this.f46207a = field;
        this.f46208b = field2;
        this.f46209c = field3;
        this.f46210d = field4;
        this.f46211e = field5;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46202g = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f46203h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46204i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46205j = Expression.Companion.constant$default(companion, DivActionScrollBy.Overflow.CLAMP, null, 2, null);
        f46206k = new bk.p<ParsingEnvironment, JSONObject, DivActionScrollByTemplate>() { // from class: com.yandex.div2.DivActionScrollByTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivActionScrollByTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivActionScrollByTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionScrollByTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollByTemplate divActionScrollByTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionScrollByTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionScrollByTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollByTemplate divActionScrollByTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
