package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import oe.c9;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVisibilityAction.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivVisibilityAction implements JSONSerializable, Hashable, c9 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f50088m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Boolean> f50089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<Long> f50090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression<Long> f50091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Expression<Long> f50092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVisibilityAction> f50093r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivDownloadCallbacks f50094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f50095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f50096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Long> f50097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f50098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression<Uri> f50099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f50100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DivActionTyped f50101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<Uri> f50102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<Long> f50103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression<Long> f50104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f50105l;

    public final boolean g(DivVisibilityAction divVisibilityAction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        if (divVisibilityAction == null) {
            return false;
        }
        DivDownloadCallbacks divDownloadCallbacksA = a();
        if (divDownloadCallbacksA != null) {
            zA = divDownloadCallbacksA.a(divVisibilityAction.a(), expressionResolver, expressionResolver2);
        } else {
            zA = divVisibilityAction.a() == null;
        }
        if (!zA || isEnabled().evaluate(expressionResolver).booleanValue() != divVisibilityAction.isEnabled().evaluate(expressionResolver2).booleanValue() || !ck.p.e(b().evaluate(expressionResolver), divVisibilityAction.b().evaluate(expressionResolver2)) || c().evaluate(expressionResolver).longValue() != divVisibilityAction.c().evaluate(expressionResolver2).longValue() || !ck.p.e(getPayload(), divVisibilityAction.getPayload())) {
            return false;
        }
        Expression<Uri> expressionF = f();
        Uri uriEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<Uri> expressionF2 = divVisibilityAction.f();
        if (!ck.p.e(uriEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null) || !ck.p.e(e(), divVisibilityAction.e())) {
            return false;
        }
        DivActionTyped divActionTypedD = d();
        if (divActionTypedD != null) {
            zA2 = divActionTypedD.a(divVisibilityAction.d(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divVisibilityAction.d() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Uri> url = getUrl();
        Uri uriEvaluate2 = url != null ? url.evaluate(expressionResolver) : null;
        Expression<Uri> url2 = divVisibilityAction.getUrl();
        return ck.p.e(uriEvaluate2, url2 != null ? url2.evaluate(expressionResolver2) : null) && this.f50103j.evaluate(expressionResolver).longValue() == divVisibilityAction.f50103j.evaluate(expressionResolver2).longValue() && this.f50104k.evaluate(expressionResolver).longValue() == divVisibilityAction.f50104k.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivVisibilityAction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivVisibilityAction a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().w9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f50089n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f50090o = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f50091p = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f50092q = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f50093r = new bk.p<ParsingEnvironment, JSONObject, DivVisibilityAction>() { // from class: com.yandex.div2.DivVisibilityAction$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVisibilityAction mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivVisibilityAction.f50088m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.c9
    public DivDownloadCallbacks a() {
        return this.f50094a;
    }

    @Override // oe.c9
    public Expression<String> b() {
        return this.f50096c;
    }

    @Override // oe.c9
    public Expression<Long> c() {
        return this.f50097d;
    }

    @Override // oe.c9
    public DivActionTyped d() {
        return this.f50101h;
    }

    @Override // oe.c9
    public String e() {
        return this.f50100g;
    }

    @Override // oe.c9
    public Expression<Uri> f() {
        return this.f50099f;
    }

    @Override // oe.c9
    public JSONObject getPayload() {
        return this.f50098e;
    }

    @Override // oe.c9
    public Expression<Uri> getUrl() {
        return this.f50102i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50105l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivVisibilityAction.class).hashCode();
        DivDownloadCallbacks divDownloadCallbacksA = a();
        int iHash = iHashCode + (divDownloadCallbacksA != null ? divDownloadCallbacksA.hash() : 0) + isEnabled().hashCode() + b().hashCode() + c().hashCode();
        JSONObject payload = getPayload();
        int iHashCode2 = iHash + (payload != null ? payload.hashCode() : 0);
        Expression<Uri> expressionF = f();
        int iHashCode3 = iHashCode2 + (expressionF != null ? expressionF.hashCode() : 0);
        String strE = e();
        int iHashCode4 = iHashCode3 + (strE != null ? strE.hashCode() : 0);
        DivActionTyped divActionTypedD = d();
        int iHash2 = iHashCode4 + (divActionTypedD != null ? divActionTypedD.hash() : 0);
        Expression<Uri> url = getUrl();
        int iHashCode5 = iHash2 + (url != null ? url.hashCode() : 0) + this.f50103j.hashCode() + this.f50104k.hashCode();
        this.f50105l = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // oe.c9
    public Expression<Boolean> isEnabled() {
        return this.f50095b;
    }

    public DivVisibilityAction(DivDownloadCallbacks divDownloadCallbacks, Expression<Boolean> expression, Expression<String> expression2, Expression<Long> expression3, JSONObject jSONObject, Expression<Uri> expression4, String str, DivActionTyped divActionTyped, Expression<Uri> expression5, Expression<Long> expression6, Expression<Long> expression7) {
        this.f50094a = divDownloadCallbacks;
        this.f50095b = expression;
        this.f50096c = expression2;
        this.f50097d = expression3;
        this.f50098e = jSONObject;
        this.f50099f = expression4;
        this.f50100g = str;
        this.f50101h = divActionTyped;
        this.f50102i = expression5;
        this.f50103j = expression6;
        this.f50104k = expression7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
