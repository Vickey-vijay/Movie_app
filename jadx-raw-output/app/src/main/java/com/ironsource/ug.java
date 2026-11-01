package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ug {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f31424c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f31425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f31426b;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final b a() {
            return new b();
        }

        public final ug b() {
            return a().a();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f31427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f31428b;

        public final void a(Double d10) {
            this.f31428b = d10;
        }

        public final void b(Double d10) {
            this.f31427a = d10;
        }

        public final b a(double d10) {
            this.f31428b = Double.valueOf(d10);
            return this;
        }

        public final Double b() {
            return this.f31428b;
        }

        public final Double c() {
            return this.f31427a;
        }

        public final ug a() {
            return new ug(this, null);
        }

        public final b b(double d10) {
            this.f31427a = Double.valueOf(d10);
            return this;
        }
    }

    public /* synthetic */ ug(b bVar, ck.i iVar) {
        this(bVar);
    }

    private ug(b bVar) {
        this.f31425a = bVar.c();
        this.f31426b = bVar.b();
    }

    public static final b a() {
        return f31424c.a();
    }

    public static final ug b() {
        return f31424c.b();
    }

    public final Double c() {
        return this.f31426b;
    }

    public final Double d() {
        return this.f31425a;
    }

    public String toString() {
        return "WaterfallConfiguration" + e();
    }

    public final String e() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("ceiling", this.f31426b);
            jSONObjectJsonObjectInit.put("floor", this.f31425a);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        String string = jSONObjectJsonObjectInit.toString();
        ck.p.i(string, "json.toString()");
        return string;
    }
}
