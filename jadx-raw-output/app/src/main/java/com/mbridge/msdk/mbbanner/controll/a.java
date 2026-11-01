package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbanner.common.manager.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;

/* JADX INFO: compiled from: BannerController.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f35737x = "BannerController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBridgeIds f35741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBBannerView f35744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35747j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BannerAdListener f35749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignUnit f35750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f35751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f35752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f35753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f35754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f35756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35758u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35748k = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.c f35759v = new C0345a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f35760w = new b();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerController.java */
    public class C0345a implements com.mbridge.msdk.mbbanner.common.listener.c {
        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(List<CampaignEx> list) {
            q0.b(a.f35737x, "onShowSuccessed:");
            if (a.this.f35749l != null) {
                a.this.f35749l.onLoadSuccessed(a.this.f35741d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f35738a, list.get(0).getLocalRequestId());
                cVarA.b(list);
                cVarA.g(1);
                cVarA.d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000048", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f35737x, e10.getMessage());
            }
        }

        public C0345a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void b() {
            if (a.this.f35749l != null) {
                a.this.f35749l.onCloseBanner(a.this.f35741d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void c() {
            if (a.this.f35749l != null) {
                a.this.f35749l.onClick(a.this.f35741d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void d() {
            if (a.this.f35749l != null) {
                a.this.f35749l.closeFullScreen(a.this.f35741d);
                a.this.f35758u = false;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, a.this.f35739b, a.this.f35738a, new com.mbridge.msdk.mbbanner.common.data.a(a.this.f35746i + VastAttributes.HORIZONTAL_POSITION + a.this.f35745h, a.this.f35747j * 1000), a.this.f35760w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void onLeaveApp() {
            if (a.this.f35749l != null) {
                a.this.f35749l.onLeaveApp(a.this.f35741d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(CampaignEx campaignEx) {
            a.this.c();
            if (a.this.f35749l != null) {
                a.this.f35749l.onLogImpression(a.this.f35741d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f35738a, campaignEx.getLocalRequestId());
                cVarA.a(campaignEx);
                cVarA.h(campaignEx.isBidCampaign() ? "1" : "0");
                int i10 = 1;
                cVarA.g(a.this.f35751n != null ? a.this.f35751n.c() : 1);
                if (a.this.f35747j != 0) {
                    i10 = 2;
                }
                cVarA.b(i10);
                cVarA.c(a.this.f35747j);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000128", cVarA, (e) null);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000130", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f35737x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a() {
            if (a.this.f35749l != null) {
                a.this.f35749l.showFullScreen(a.this.f35741d);
                a.this.f35758u = true;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, a.this.f35739b, a.this.f35738a, null, null);
            }
        }
    }

    /* JADX INFO: compiled from: BannerController.java */
    public class b implements com.mbridge.msdk.mbbanner.common.listener.b {
        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f35750m = campaignUnit;
            a.this.a(1, (com.mbridge.msdk.foundation.error.b) null);
        }

        public b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void b(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(2, bVar);
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, int i10, boolean z10) {
            if (a.this.f35744g != null) {
                a.this.f35757t = true;
                a.this.j();
            }
        }
    }

    private int a(int i10) {
        if (i10 <= 0) {
            return i10;
        }
        if (i10 < 10) {
            return 10;
        }
        return i10 > 180 ? BaseTransientBottomBar.ANIMATION_FADE_DURATION : i10;
    }

    private boolean a(View view) {
        return true;
    }

    private void f() {
        b(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f35756s || !this.f35757t) {
            return;
        }
        if (!a(this.f35744g)) {
            a(new com.mbridge.msdk.foundation.error.b(880044));
        } else if (this.f35750m != null) {
            if (this.f35751n == null) {
                this.f35751n = new c(this.f35744g, this.f35759v, this.f35739b, this.f35738a, this.f35742e, this.f35752o);
            }
            this.f35751n.a(this.f35740c);
            this.f35751n.b(this.f35754q);
            this.f35751n.d(this.f35755r);
            this.f35751n.a(this.f35742e, this.f35743f);
            this.f35751n.b(this.f35750m);
        } else {
            a(new com.mbridge.msdk.foundation.error.b(880043));
        }
        this.f35757t = false;
    }

    private void k() {
        MBBannerView mBBannerView = this.f35744g;
        if (mBBannerView != null) {
            if (!this.f35754q || !this.f35755r || this.f35758u || e1.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, this.f35739b, this.f35738a, null, null);
            } else {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f35739b, this.f35738a, new com.mbridge.msdk.mbbanner.common.data.a(this.f35746i + VastAttributes.HORIZONTAL_POSITION + this.f35745h, this.f35747j * 1000), this.f35760w);
            }
            if (this.f35754q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f35739b, this.f35738a, null, null);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f35738a);
        }
    }

    public void c() {
        if (this.f35756s) {
            return;
        }
        k();
        l();
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f35746i + VastAttributes.HORIZONTAL_POSITION + this.f35745h, this.f35747j * 1000);
        aVar.c(this.f35739b);
        aVar.a(true);
        aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(this.f35739b, this.f35738a, aVar, this.f35760w);
    }

    public String d() {
        CampaignUnit campaignUnit = this.f35750m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.b(campaignUnit.getAds()) : "";
    }

    public String e() {
        CampaignUnit campaignUnit = this.f35750m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f35750m.getRequestId();
    }

    public void g() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f35739b, this.f35738a, new com.mbridge.msdk.mbbanner.common.data.a(this.f35746i + VastAttributes.HORIZONTAL_POSITION + this.f35745h, this.f35747j * 1000), this.f35760w);
    }

    public void h() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f35739b, this.f35738a, new com.mbridge.msdk.mbbanner.common.data.a(this.f35746i + VastAttributes.HORIZONTAL_POSITION + this.f35745h, this.f35747j * 1000), this.f35760w);
    }

    public void i() {
        this.f35756s = true;
        if (this.f35749l != null) {
            this.f35749l = null;
        }
        if (this.f35760w != null) {
            this.f35760w = null;
        }
        if (this.f35759v != null) {
            this.f35759v = null;
        }
        if (this.f35744g != null) {
            this.f35744g = null;
        }
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f35739b, this.f35738a, null, null);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f35738a);
        com.mbridge.msdk.mbbanner.common.manager.a.b().c();
        c cVar = this.f35751n;
        if (cVar != null) {
            cVar.h();
        }
    }

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f35744g = mBBannerView;
        if (bannerSize != null) {
            this.f35745h = bannerSize.getHeight();
            this.f35746i = bannerSize.getWidth();
        }
        this.f35738a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f35739b = str;
        this.f35741d = new MBridgeIds(str, this.f35738a);
        f();
    }

    private void l() {
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35738a);
        this.f35752o = lVarE;
        if (lVarE == null) {
            this.f35752o = l.i(this.f35738a);
        }
        if (this.f35748k == -1) {
            this.f35747j = a(this.f35752o.D());
        }
        if (this.f35743f == 0) {
            boolean z10 = true;
            if (this.f35752o.g() != 1) {
                z10 = false;
            }
            this.f35742e = z10;
            c cVar = this.f35751n;
            if (cVar != null) {
                cVar.c(z10);
            }
        }
    }

    public void b(int i10) {
        int iA = a(i10);
        this.f35748k = iA;
        this.f35747j = iA;
    }

    private void b(String str, String str2) {
        if (this.f35753p == null) {
            this.f35753p = new j();
        }
        this.f35753p.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, this.f35738a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.error.b bVar) {
        CampaignUnit campaignUnit;
        String strL = "";
        if (bVar != null) {
            try {
                strL = bVar.l();
                if (TextUtils.isEmpty(str)) {
                    str = bVar.k();
                }
            } catch (Throwable th2) {
                q0.b(f35737x, th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f35750m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35738a, str);
        CampaignUnit campaignUnit2 = this.f35750m;
        cVarA.b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        cVarA.a(bVar);
        CampaignUnit campaignUnit3 = this.f35750m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            cVarA.d(TextUtils.isEmpty(this.f35750m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        cVarA.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVarA, (e) null);
        BannerAdListener bannerAdListener = this.f35749l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f35741d, strL);
        }
    }

    public void b(boolean z10) {
        this.f35754q = z10;
        b();
        j();
    }

    public void b() {
        k();
        c cVar = this.f35751n;
        if (cVar != null) {
            cVar.b(this.f35754q);
            this.f35751n.d(this.f35755r);
        }
    }

    public void c(boolean z10) {
        this.f35755r = z10;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.mbridge.msdk.foundation.error.b bVar) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35738a, bVar == null ? this.f35750m.getLocalRequestId() : bVar.k());
            e eVar = new e();
            eVar.a("result", Integer.valueOf(i10));
            CampaignUnit campaignUnit = this.f35750m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f35750m.getAds().get(0);
                if (campaignEx != null) {
                    cVarA.d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                cVarA.b(this.f35750m.getAds());
            }
            if (bVar != null) {
                cVarA.a(bVar);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a("2000126", cVarA, eVar);
        } catch (Exception e10) {
            q0.b(f35737x, e10.getMessage());
        }
    }

    public void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f35745h = bannerSize.getHeight();
            this.f35746i = bannerSize.getWidth();
        }
    }

    public void a(boolean z10) {
        this.f35742e = z10;
        this.f35743f = z10 ? 1 : 2;
    }

    public void a(String str, String str2) {
        if (this.f35745h >= 1 && this.f35746i >= 1) {
            boolean zB = false;
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(f35737x, e10.getMessage());
            }
            if (!zB) {
                a(str2, new com.mbridge.msdk.foundation.error.b(880029));
                return;
            }
            this.f35740c = str2;
            com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f35746i + VastAttributes.HORIZONTAL_POSITION + this.f35745h, this.f35747j * 1000);
            aVar.a(str);
            aVar.c(this.f35739b);
            aVar.b(str2);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f35739b, this.f35738a, aVar, this.f35760w);
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(1, this.f35739b, this.f35738a, aVar, this.f35760w);
            return;
        }
        a(str2, new com.mbridge.msdk.foundation.error.b(880037));
    }

    public void a(BannerAdListener bannerAdListener) {
        this.f35749l = bannerAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        a(this.f35740c, bVar);
        if (bVar.g() != 880044) {
            c();
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f35751n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
