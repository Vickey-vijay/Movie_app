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

/* JADX INFO: compiled from: DivDisappearAction.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivDisappearAction implements JSONSerializable, Hashable, c9 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f46996m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Long> f46997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression<Boolean> f46998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression<Long> f46999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Expression<Long> f47000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDisappearAction> f47001r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Long> f47002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivDownloadCallbacks f47003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Boolean> f47004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<String> f47005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<Long> f47006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONObject f47007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Uri> f47008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DivActionTyped f47010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression<Uri> f47011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression<Long> f47012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f47013l;

    public final boolean g(DivDisappearAction divDisappearAction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean zA2;
        if (divDisappearAction == null || this.f47002a.evaluate(expressionResolver).longValue() != divDisappearAction.f47002a.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        DivDownloadCallbacks divDownloadCallbacksA = a();
        if (divDownloadCallbacksA != null) {
            zA = divDownloadCallbacksA.a(divDisappearAction.a(), expressionResolver, expressionResolver2);
        } else {
            zA = divDisappearAction.a() == null;
        }
        if (!zA || isEnabled().evaluate(expressionResolver).booleanValue() != divDisappearAction.isEnabled().evaluate(expressionResolver2).booleanValue() || !ck.p.e(b().evaluate(expressionResolver), divDisappearAction.b().evaluate(expressionResolver2)) || c().evaluate(expressionResolver).longValue() != divDisappearAction.c().evaluate(expressionResolver2).longValue() || !ck.p.e(getPayload(), divDisappearAction.getPayload())) {
            return false;
        }
        Expression<Uri> expressionF = f();
        Uri uriEvaluate = expressionF != null ? expressionF.evaluate(expressionResolver) : null;
        Expression<Uri> expressionF2 = divDisappearAction.f();
        if (!ck.p.e(uriEvaluate, expressionF2 != null ? expressionF2.evaluate(expressionResolver2) : null) || !ck.p.e(e(), divDisappearAction.e())) {
            return false;
        }
        DivActionTyped divActionTypedD = d();
        if (divActionTypedD != null) {
            zA2 = divActionTypedD.a(divDisappearAction.d(), expressionResolver, expressionResolver2);
        } else {
            zA2 = divDisappearAction.d() == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Uri> url = getUrl();
        Uri uriEvaluate2 = url != null ? url.evaluate(expressionResolver) : null;
        Expression<Uri> url2 = divDisappearAction.getUrl();
        return ck.p.e(uriEvaluate2, url2 != null ? url2.evaluate(expressionResolver2) : null) && this.f47012k.evaluate(expressionResolver).longValue() == divDisappearAction.f47012k.evaluate(expressionResolver2).longValue();
    }

    /* JADX INFO: compiled from: DivDisappearAction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivDisappearAction a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().P2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46997n = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f46998o = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f46999p = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f47000q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f47001r = new bk.p<ParsingEnvironment, JSONObject, DivDisappearAction>() { // from class: com.yandex.div2.DivDisappearAction$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivDisappearAction mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivDisappearAction.f46996m.a(parsingEnvironment, jSONObject);
            }
        };
    }

    @Override // oe.c9
    public DivDownloadCallbacks a() {
        return this.f47003b;
    }

    @Override // oe.c9
    public Expression<String> b() {
        return this.f47005d;
    }

    @Override // oe.c9
    public Expression<Long> c() {
        return this.f47006e;
    }

    @Override // oe.c9
    public DivActionTyped d() {
        return this.f47010i;
    }

    @Override // oe.c9
    public String e() {
        return this.f47009h;
    }

    @Override // oe.c9
    public Expression<Uri> f() {
        return this.f47008g;
    }

    @Override // oe.c9
    public JSONObject getPayload() {
        return this.f47007f;
    }

    @Override // oe.c9
    public Expression<Uri> getUrl() {
        return this.f47011j;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47013l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivDisappearAction.class).hashCode() + this.f47002a.hashCode();
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
        int iHashCode5 = iHash2 + (url != null ? url.hashCode() : 0) + this.f47012k.hashCode();
        this.f47013l = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // oe.c9
    public Expression<Boolean> isEnabled() {
        return this.f47004c;
    }

    public DivDisappearAction(Expression<Long> expression, DivDownloadCallbacks divDownloadCallbacks, Expression<Boolean> expression2, Expression<String> expression3, Expression<Long> expression4, JSONObject jSONObject, Expression<Uri> expression5, String str, DivActionTyped divActionTyped, Expression<Uri> expression6, Expression<Long> expression7) {
        this.f47002a = expression;
        this.f47003b = divDownloadCallbacks;
        this.f47004c = expression2;
        this.f47005d = expression3;
        this.f47006e = expression4;
        this.f47007f = jSONObject;
        this.f47008g = expression5;
        this.f47009h = str;
        this.f47010i = divActionTyped;
        this.f47011j = expression6;
        this.f47012k = expression7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
