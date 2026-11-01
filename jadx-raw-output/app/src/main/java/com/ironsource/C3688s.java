package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3688s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f30641d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f30642e = "capping";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30643f = "pacing";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f30644g = "delivery";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f30645h = "progressiveLoadingConfig";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f30646i = "expiredDurationInMinutes";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f30647j = "reward";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f30648k = "name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f30649l = "amount";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f30650m = "virtualItemName";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f30651n = "virtualItemCount";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f30652o = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, d> f30653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f30654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, d> f30655c;

    /* JADX INFO: renamed from: com.ironsource.s$a */
    public static final class a extends Lambda implements bk.l<JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30656a = new a();

        public a() {
            super(1);
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject jSONObject) {
            ck.p.j(jSONObject, "it");
            return new d(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$b */
    public static final class b extends Lambda implements bk.l<JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30657a = new b();

        public b() {
            super(1);
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject jSONObject) {
            ck.p.j(jSONObject, "it");
            return new d(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$c */
    public static final class c {
        public /* synthetic */ c(ck.i iVar) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I3 f30658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3381ad f30659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final R4 f30660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Long f30661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Hd f30662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Hd f30663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C3702sd f30664g;

        public d(JSONObject jSONObject) throws JSONException {
            I3 i10;
            C3381ad c3381ad;
            ck.p.j(jSONObject, "features");
            C3702sd c3702sd = null;
            if (jSONObject.has("capping")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("capping");
                ck.p.i(jSONObject2, "features.getJSONObject(key)");
                i10 = new I3(jSONObject2);
            } else {
                i10 = null;
            }
            this.f30658a = i10;
            if (jSONObject.has("pacing")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("pacing");
                ck.p.i(jSONObject3, "features.getJSONObject(key)");
                c3381ad = new C3381ad(jSONObject3);
            } else {
                c3381ad = null;
            }
            this.f30659b = c3381ad;
            this.f30660c = jSONObject.has("delivery") ? new R4(jSONObject.getBoolean("delivery")) : null;
            this.f30661d = jSONObject.has("expiredDurationInMinutes") ? Long.valueOf(jSONObject.getLong("expiredDurationInMinutes")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("reward");
            this.f30662e = jSONObjectOptJSONObject != null ? new Hd(jSONObjectOptJSONObject, "name", "amount") : null;
            Hd hd2 = new Hd(jSONObject, "virtualItemName", "virtualItemCount");
            String strB = hd2.b();
            this.f30663f = (strB == null || strB.length() == 0 || hd2.a() == null) ? null : hd2;
            if (jSONObject.has(C3688s.f30645h)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C3688s.f30645h);
                ck.p.i(jSONObject4, "features.getJSONObject(key)");
                c3702sd = new C3702sd(jSONObject4);
            }
            this.f30664g = c3702sd;
        }

        public final Hd a() {
            return this.f30662e;
        }

        public final I3 b() {
            return this.f30658a;
        }

        public final R4 c() {
            return this.f30660c;
        }

        public final Long d() {
            return this.f30661d;
        }

        public final C3381ad e() {
            return this.f30659b;
        }

        public final Hd f() {
            return this.f30663f;
        }

        public final C3702sd g() {
            return this.f30664g;
        }
    }

    public C3688s(JSONObject jSONObject) {
        ck.p.j(jSONObject, "configurations");
        this.f30653a = new C3634od(jSONObject).a(b.f30657a);
        this.f30654b = new d(jSONObject);
        this.f30655c = new Y0(jSONObject).a(a.f30656a);
    }

    public final Map<String, d> a() {
        return this.f30655c;
    }

    public final d b() {
        return this.f30654b;
    }

    public final Map<String, d> c() {
        return this.f30653a;
    }
}
