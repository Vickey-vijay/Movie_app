package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivAbsoluteEdgeInsetsTemplate implements JSONSerializable, JsonTemplate<DivAbsoluteEdgeInsets> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45982e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<Long> f45983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Long> f45984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f45985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Long> f45986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsetsTemplate> f45987j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f45988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f45989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f45990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Long>> f45991d;

    /* JADX INFO: compiled from: DivAbsoluteEdgeInsetsTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivAbsoluteEdgeInsetsTemplate(Field<Expression<Long>> field, Field<Expression<Long>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4) {
        this.f45988a = field;
        this.f45989b = field2;
        this.f45990c = field3;
        this.f45991d = field4;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f45983f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45984g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45985h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45986i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f45987j = new bk.p<ParsingEnvironment, JSONObject, DivAbsoluteEdgeInsetsTemplate>() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAbsoluteEdgeInsetsTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivAbsoluteEdgeInsetsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivAbsoluteEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAbsoluteEdgeInsetsTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivAbsoluteEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
