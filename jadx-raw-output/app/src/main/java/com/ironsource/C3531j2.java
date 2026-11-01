package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3531j2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f29217h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.demandOnly.a f29219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3605n2 f29220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f29221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f29222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3424d2 f29223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3623o2 f29224g;

    /* JADX INFO: renamed from: com.ironsource.j2$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f29225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f29227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.ironsource.mediationsdk.demandOnly.a f29228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C3605n2 f29229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final JSONObject f29230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final JSONObject f29231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C3424d2 f29232h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final C3623o2 f29233i;

        public final C3531j2 a() {
            return new C3531j2(this.f29227c, this.f29228d, this.f29229e, this.f29230f, this.f29231g, this.f29232h, this.f29233i);
        }

        public final JSONObject b() {
            return this.f29225a;
        }

        public final String c() {
            return this.f29226b;
        }

        public a(JSONObject jSONObject, String str) {
            ck.p.j(jSONObject, Ne.E1);
            ck.p.j(str, "instanceId");
            this.f29225a = jSONObject;
            this.f29226b = str;
            JSONObject jSONObjectA = a(jSONObject);
            this.f29227c = jSONObject.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(jSONObject, jSONObjectA);
            this.f29228d = aVarA;
            this.f29229e = c(jSONObjectA);
            this.f29230f = d(jSONObjectA);
            this.f29231g = b(jSONObjectA);
            this.f29232h = a(aVarA, str);
            this.f29233i = b(aVarA, str);
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C3605n2 c(JSONObject jSONObject) {
            return new C3605n2(jSONObject);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        private final C3623o2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C3605n2 c3605n2A = aVar.a(str);
            if (c3605n2A == null) {
                return null;
            }
            String strK = c3605n2A.k();
            ck.p.i(strK, "it.serverData");
            return new C3623o2(strK);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.f29592d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.f29596h);
            if (jSONArrayOptJSONArray != null) {
                ik.i iVarQ = ik.k.q(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = iVarQ.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((nj.g0) it).nextInt();
                    C3605n2 c3605n2 = new C3605n2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c3605n2.n()) {
                        c3605n2 = null;
                    }
                    if (c3605n2 != null) {
                        arrayList2.add(c3605n2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.ironsource.mediationsdk.demandOnly.a.C0279a(arrayList);
        }

        private final C3424d2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C3605n2 c3605n2A = aVar.a(str);
            if (c3605n2A == null) {
                return null;
            }
            C3424d2 c3424d2 = new C3424d2();
            c3424d2.a(c3605n2A.b());
            c3424d2.c(c3605n2A.h());
            c3424d2.b(c3605n2A.g());
            return c3424d2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j2$b */
    public static final class b {
        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        public final Object a(JSONObject jSONObject, String str) {
            ck.p.j(jSONObject, Ne.E1);
            ck.p.j(str, "instanceId");
            return a(new a(jSONObject, str).a(), str);
        }

        private b() {
        }

        private final Object a(C3531j2 c3531j2, String str) {
            String strB = c3531j2.b();
            if (strB != null && strB.length() != 0) {
                if (c3531j2.i()) {
                    Result.a aVar = Result.Companion;
                    return Result.m3458constructorimpl(kotlin.c.a(new C3466f8(C3813z5.f31697a.f())));
                }
                C3605n2 c3605n2A = c3531j2.a(str);
                if (c3605n2A == null) {
                    Result.a aVar2 = Result.Companion;
                    return Result.m3458constructorimpl(kotlin.c.a(new C3466f8(C3813z5.f31697a.j())));
                }
                String strK = c3605n2A.k();
                if (strK != null && strK.length() != 0) {
                    return Result.m3458constructorimpl(c3531j2);
                }
                Result.a aVar3 = Result.Companion;
                return Result.m3458constructorimpl(kotlin.c.a(new C3466f8(C3813z5.f31697a.e())));
            }
            Result.a aVar4 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(new C3466f8(C3813z5.f31697a.i())));
        }
    }

    public final String a() {
        C3623o2 c3623o2 = this.f29224g;
        if (c3623o2 != null) {
            return c3623o2.d();
        }
        return null;
    }

    public C3531j2(String str, com.ironsource.mediationsdk.demandOnly.a aVar, C3605n2 c3605n2, JSONObject jSONObject, JSONObject jSONObject2, C3424d2 c3424d2, C3623o2 c3623o2) {
        ck.p.j(aVar, com.ironsource.mediationsdk.d.f29596h);
        ck.p.j(c3605n2, "genericNotifications");
        this.f29218a = str;
        this.f29219b = aVar;
        this.f29220c = c3605n2;
        this.f29221d = jSONObject;
        this.f29222e = jSONObject2;
        this.f29223f = c3424d2;
        this.f29224g = c3623o2;
    }

    public final C3605n2 a(String str) {
        ck.p.j(str, "providerName");
        return a(this.f29219b, str);
    }

    public final String b() {
        return this.f29218a;
    }

    public final C3424d2 c() {
        return this.f29223f;
    }

    public final JSONObject d() {
        return this.f29222e;
    }

    public final C3605n2 e() {
        return this.f29220c;
    }

    public final JSONObject f() {
        return this.f29221d;
    }

    public final C3623o2 g() {
        return this.f29224g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.f29219b;
    }

    public final boolean i() {
        return this.f29219b.isEmpty();
    }

    private final C3605n2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
