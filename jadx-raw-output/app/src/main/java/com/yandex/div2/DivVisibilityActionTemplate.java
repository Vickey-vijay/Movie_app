package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVisibilityActionTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivVisibilityActionTemplate implements JSONSerializable, JsonTemplate<DivVisibilityAction> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f50106l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Boolean> f50107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Long> f50108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<Long> f50109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression<Long> f50110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> f50111q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivDownloadCallbacksTemplate> f50112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Boolean>> f50113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f50114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Long>> f50115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<JSONObject> f50116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<Uri>> f50117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<String> f50118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<DivActionTypedTemplate> f50119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<Expression<Uri>> f50120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<Long>> f50121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<Expression<Long>> f50122k;

    /* JADX INFO: compiled from: DivVisibilityActionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivVisibilityActionTemplate(Field<DivDownloadCallbacksTemplate> field, Field<Expression<Boolean>> field2, Field<Expression<String>> field3, Field<Expression<Long>> field4, Field<JSONObject> field5, Field<Expression<Uri>> field6, Field<String> field7, Field<DivActionTypedTemplate> field8, Field<Expression<Uri>> field9, Field<Expression<Long>> field10, Field<Expression<Long>> field11) {
        this.f50112a = field;
        this.f50113b = field2;
        this.f50114c = field3;
        this.f50115d = field4;
        this.f50116e = field5;
        this.f50117f = field6;
        this.f50118g = field7;
        this.f50119h = field8;
        this.f50120i = field9;
        this.f50121j = field10;
        this.f50122k = field11;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50107m = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f50108n = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f50109o = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f50110p = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f50111q = new bk.p<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVisibilityActionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivVisibilityActionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivVisibilityActionTemplate(ParsingEnvironment parsingEnvironment, DivVisibilityActionTemplate divVisibilityActionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divVisibilityActionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivVisibilityActionTemplate(ParsingEnvironment parsingEnvironment, DivVisibilityActionTemplate divVisibilityActionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
