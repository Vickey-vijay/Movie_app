package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f27647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, b> f27648b;

    public static final class a extends Lambda implements bk.l<JSONObject, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27649a = new a();

        public a() {
            super(1);
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject jSONObject) {
            ck.p.j(jSONObject, "it");
            return new b(jSONObject);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f27650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f27652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f27653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f27654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<String> f27655f;

        public b(JSONObject jSONObject) {
            ck.p.j(jSONObject, "features");
            JSONObject jSONObject2 = jSONObject.has(V2.f27784a) ? jSONObject : null;
            JSONObject jSONObjectOptJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(V2.f27784a) : null;
            this.f27650a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(V2.f27785b, 25000) : 25000;
            this.f27651b = iOptInt;
            this.f27652c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            this.f27653d = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(V2.f27787d) || jSONObjectOptJSONObject.isNull(V2.f27787d)) ? iOptInt : jSONObjectOptJSONObject.optLong(V2.f27787d);
            this.f27654e = jSONObject.has(V2.f27788e) ? jSONObject.optInt(V2.f27788e) / 100.0f : 0.15f;
            List<String> listB = jSONObject.has(V2.f27789f) ? C3575la.b(jSONObject.getJSONArray(V2.f27789f)) : nj.s.n("BANNER", com.ironsource.mediationsdk.l.f29841d);
            ck.p.i(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f27655f = listB;
        }

        public final List<String> a() {
            return this.f27655f;
        }

        public final float b() {
            return this.f27654e;
        }

        public final int c() {
            return this.f27651b;
        }

        public final long d() {
            return this.f27653d;
        }

        public final boolean e() {
            return this.f27652c;
        }
    }

    public T2(JSONObject jSONObject) {
        ck.p.j(jSONObject, "bannerConfigurations");
        this.f27647a = new b(jSONObject);
        this.f27648b = new Y0(jSONObject).a(a.f27649a);
    }

    public final Map<String, b> a() {
        return this.f27648b;
    }

    public final b b() {
        return this.f27647a;
    }
}
