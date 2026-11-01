package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l6 extends i5 implements q0.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f7898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q0.e f7899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d6.b f7900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x4 f7901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x4 f7902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q0.b f7903l;

    public class a implements q0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.sdk.k f7904a;

        @Override // com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            l6.this.f7898g.a(0);
            l6.this.a(str, obj, i10);
        }

        public a(com.applovin.impl.sdk.k kVar) {
            this.f7904a = kVar;
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || l6.this.f7898g.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || l6.this.f7898g.p())) {
                String strA = l6.this.f7898g.a();
                if (l6.this.f7898g.j() <= 0) {
                    if (strA != null && strA.equals(l6.this.f7898g.f())) {
                        l6 l6Var = l6.this;
                        l6Var.a(l6Var.f7902k);
                    } else {
                        l6 l6Var2 = l6.this;
                        l6Var2.a(l6Var2.f7901j);
                    }
                    l6 l6Var3 = l6.this;
                    l6Var3.a(l6Var3.f7898g.f(), i10, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.o oVar = l6.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    l6 l6Var4 = l6.this;
                    l6Var4.f7707c.k(l6Var4.f7706b, "Unable to send request due to server failure (code " + i10 + "). " + l6.this.f7898g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(l6.this.f7898g.k()) + " seconds...");
                }
                int iJ = l6.this.f7898g.j() - 1;
                l6.this.f7898g.a(iJ);
                if (iJ == 0) {
                    l6 l6Var5 = l6.this;
                    l6Var5.a(l6Var5.f7901j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.o oVar2 = l6.this.f7707c;
                        if (com.applovin.impl.sdk.o.a()) {
                            l6 l6Var6 = l6.this;
                            l6Var6.f7707c.d(l6Var6.f7706b, "Switching to backup endpoint " + strA);
                        }
                        l6.this.f7898g.a(strA);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f7904a.a(x4.f9931g3)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = l6.this.f7898g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, l6.this.f7898g.c())) : l6.this.f7898g.k();
                }
                d6 d6VarQ0 = this.f7904a.q0();
                l6 l6Var7 = l6.this;
                d6VarQ0.a(l6Var7, l6Var7.f7900i, millis);
                return;
            }
            l6 l6Var8 = l6.this;
            l6Var8.a(l6Var8.f7898g.f(), i10, str2, obj);
        }
    }

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    public l6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskRepeatRequest", kVar, z10);
        this.f7900i = d6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f7898g = aVar;
        this.f7903l = new q0.b();
        this.f7899h = new a(kVar);
    }

    public void b(x4 x4Var) {
        this.f7902k = x4Var;
    }

    public void c(x4 x4Var) {
        this.f7901j = x4Var;
    }

    public void a(d6.b bVar) {
        this.f7900i = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        q0 q0VarW = b().w();
        if (!b().E0() && !b().B0()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f7898g.f(), -22, null, null);
            return;
        }
        if (StringUtils.isValidString(this.f7898g.f()) && this.f7898g.f().length() >= 4) {
            if (TextUtils.isEmpty(this.f7898g.h())) {
                if (this.f7898g.b() != null) {
                    str = "POST";
                } else {
                    str = "GET";
                }
                this.f7898g.b(str);
            }
            q0VarW.a(this.f7898g, this.f7903l, this.f7899h);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "Task has an invalid or null request endpoint.");
        }
        a(this.f7898g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x4 x4Var) {
        if (x4Var != null) {
            b().o0().a(x4Var, x4Var.a());
        }
    }
}
