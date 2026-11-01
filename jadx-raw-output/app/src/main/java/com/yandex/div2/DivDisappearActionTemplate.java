package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDisappearActionTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivDisappearActionTemplate implements JSONSerializable, JsonTemplate<DivDisappearAction> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f47014l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Long> f47015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Boolean> f47016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<Long> f47017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression<Long> f47018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDisappearActionTemplate> f47019q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f47020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivDownloadCallbacksTemplate> f47021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<String>> f47023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Long>> f47024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<JSONObject> f47025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Uri>> f47026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<String> f47027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<DivActionTypedTemplate> f47028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<Uri>> f47029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Long>> f47030k;

    /* JADX INFO: compiled from: DivDisappearActionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivDisappearActionTemplate(Field<Expression<Long>> field, Field<DivDownloadCallbacksTemplate> field2, Field<Expression<Boolean>> field3, Field<Expression<String>> field4, Field<Expression<Long>> field5, Field<JSONObject> field6, Field<Expression<Uri>> field7, Field<String> field8, Field<DivActionTypedTemplate> field9, Field<Expression<Uri>> field10, Field<Expression<Long>> field11) {
        this.f47020a = field;
        this.f47021b = field2;
        this.f47022c = field3;
        this.f47023d = field4;
        this.f47024e = field5;
        this.f47025f = field6;
        this.f47026g = field7;
        this.f47027h = field8;
        this.f47028i = field9;
        this.f47029j = field10;
        this.f47030k = field11;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47015m = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f47016n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f47017o = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f47018p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47019q = new bk.p<ParsingEnvironment, JSONObject, DivDisappearActionTemplate>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivDisappearActionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivDisappearActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivDisappearActionTemplate(ParsingEnvironment parsingEnvironment, DivDisappearActionTemplate divDisappearActionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDisappearActionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivDisappearActionTemplate(ParsingEnvironment parsingEnvironment, DivDisappearActionTemplate divDisappearActionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
