package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class X9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U6 f27869a = new U6();

    public class a extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EnumC3703se f27870b;

        public a(EnumC3703se enumC3703se) {
            this.f27870b = enumC3703se;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            X9.this.f27869a.a(Q6.f27431g0, new JSONArray().put(this.f27870b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.f27869a.a(Q6.f27472u, (Object) jSONObject);
    }

    public void b(JSONObject jSONObject) {
        this.f27869a.a(Q6.f27429f1, (Object) jSONObject);
    }

    public void c(String str) {
        this.f27869a.a(Q6.K0, str);
    }

    public void a(boolean z10) {
        this.f27869a.a(Q6.R0, Boolean.valueOf(z10));
    }

    public void b(boolean z10) {
        this.f27869a.a("gpi", Boolean.valueOf(z10));
    }

    public void c(int i10) {
        this.f27869a.a(Q6.f27428f0, Integer.valueOf(i10));
    }

    public void d(String str) {
        this.f27869a.a(Q6.M0, str);
    }

    public void e(String str) {
        this.f27869a.a(com.ironsource.mediationsdk.metadata.a.f29887i, str);
    }

    public void f(String str) {
        this.f27869a.a(Q6.f27414a1, str);
    }

    public void g(String str) {
        this.f27869a.a(Q6.A, str);
    }

    public void h(String str) {
        this.f27869a.a("sid", str);
    }

    public void a(Context context) {
        this.f27869a.a(context);
    }

    public void b(int i10) {
        if (i10 >= 0) {
            this.f27869a.a(Q6.T0, Integer.valueOf(i10));
        }
    }

    public void i(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f27869a.a(Q6.f27425e0, str);
        }
    }

    public void a(Boolean bool) {
        this.f27869a.a(Q6.U0, bool);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27869a.a("adq_init_blob", str);
    }

    public void a(EnumC3703se enumC3703se) {
        new Thread(new a(enumC3703se)).start();
    }

    public void b(Context context) {
        B7 b7I = Lb.U().i();
        ActivityManager.MemoryInfo memoryInfoN = b7I.n(context);
        this.f27869a.a(Q6.f27478w, b7I.c(memoryInfoN));
        this.f27869a.a("lowM", b7I.b(memoryInfoN));
    }

    public void a(U7 u10) {
        try {
            HashMap map = new HashMap();
            map.put(Q6.E, u10.a());
            map.put(Q6.D, u10.b());
            map.put(Q6.V, u10.c());
            this.f27869a.a(map);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27869a.a("abt", str);
    }

    public void a(int i10) {
        this.f27869a.a(Q6.f27440j0, Integer.valueOf(i10));
    }
}
