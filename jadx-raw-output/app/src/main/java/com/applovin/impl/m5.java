package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class m5 extends l5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f7973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7975s;

    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                m5.this.f7973q.m1();
                m5.this.f7973q.c(uri);
            }
        }
    }

    public class b implements l5.e {
        public b() {
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            m5.this.f7973q.d(m5.this.d(str));
            m5.this.f7973q.b(true);
            com.applovin.impl.sdk.o oVar = m5.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var = m5.this;
                m5Var.f7707c.a(m5Var.f7706b, "Finish caching non-video resources for ad #" + m5.this.f7973q.getAdIdNumber());
            }
            m5 m5Var2 = m5.this;
            m5Var2.f7707c.f(m5Var2.f7706b, "Ad updated with cachedHTML = " + m5.this.f7973q.g1());
        }
    }

    public m5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f7973q = aVar;
    }

    private e0 p() {
        return b(this.f7973q.k1(), new a());
    }

    private void q() {
        List<String> listH = this.f7973q.H();
        if (CollectionUtils.isEmpty(listH)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching optional HTML resources...");
        }
        String strG1 = this.f7973q.g1();
        for (String str : listH) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Caching optional resource: " + str);
            }
            int iA = this.f7705a.G().a(str, this.f7882g);
            Map mapA = f2.a((AppLovinAdImpl) this.f7882g);
            String strA = this.f7705a.G().a(com.applovin.impl.sdk.k.o(), str, this.f7973q.getCachePrefix(), this.f7973q.S(), true, true, iA, this.f7884i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "Updating HTML with cached optional resource: " + strA);
                }
                this.f7973q.a(strA, str);
                strG1 = strG1.replace(str, strA);
                this.f7973q.d(strG1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Finish caching optional HTML resources for ad #" + this.f7973q.getAdIdNumber());
        }
    }

    public void b(boolean z10) {
        this.f7975s = z10;
    }

    public void c(boolean z10) {
        this.f7974r = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (n7.j(com.applovin.impl.sdk.k.o())) {
            str = n7.c(str);
        }
        if (this.f7973q.isOpenMeasurementEnabled()) {
            return this.f7705a.e0().a(str, f2.a((AppLovinAdImpl) this.f7882g));
        }
        return str;
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching non-optional HTML resources...");
        }
        this.f7973q.d(d(a(this.f7973q.g1(), this.f7973q.S(), this.f7973q)));
        this.f7973q.b(true);
        a(this.f7973q);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Finish caching non-optional HTML resources for ad #" + this.f7973q.getAdIdNumber());
        }
        this.f7707c.f(this.f7706b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f7973q.g1());
    }

    private void n() {
        Uri uriC;
        if (!l() && (uriC = c(this.f7973q.k1())) != null) {
            this.f7973q.m1();
            this.f7973q.c(uriC);
        }
    }

    private d0 o() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching HTML resources...");
        }
        return a(this.f7973q.g1(), this.f7973q.S(), new b());
    }

    @Override // com.applovin.impl.l5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zC0 = this.f7973q.C0();
        boolean z10 = this.f7975s;
        if (!zC0 && !z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Begin processing for non-streaming ad #" + this.f7973q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f7705a.a(x4.I0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!o0.d()) {
                    arrayList.addAll(e());
                }
                d0 d0VarO = o();
                if (d0VarO != null) {
                    arrayList.add(d0VarO);
                }
                e0 e0VarP = p();
                if (e0VarP != null) {
                    arrayList.add(e0VarP);
                }
                a(arrayList);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Begin caching for streaming ad #" + this.f7973q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f7705a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                ArrayList arrayList2 = new ArrayList();
                if (zC0) {
                    if (this.f7974r) {
                        f();
                        d0 d0VarO2 = o();
                        if (d0VarO2 != null) {
                            arrayList2.add(d0VarO2);
                        }
                        e0 e0VarP2 = p();
                        if (e0VarP2 != null) {
                            arrayList2.add(e0VarP2);
                        }
                    } else {
                        d0 d0VarO3 = o();
                        if (d0VarO3 != null) {
                            a(Arrays.asList(d0VarO3));
                        }
                        f();
                        e0 e0VarP3 = p();
                        if (e0VarP3 != null) {
                            arrayList2.add(e0VarP3);
                        }
                    }
                } else {
                    f();
                    d0 d0VarO4 = o();
                    if (d0VarO4 != null) {
                        arrayList2.add(d0VarO4);
                    }
                }
                a(arrayList2);
                f();
            } else {
                j();
                if (zC0) {
                    if (this.f7974r) {
                        f();
                    }
                    m();
                    if (!this.f7974r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        }
        k();
    }
}
