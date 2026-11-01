package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: compiled from: BaseDefaultJSCommon.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f39427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.setting.c f39428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.click.a f39429l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f39418a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39419b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39420c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39421d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39422e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39423f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39424g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39425h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39426i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.mbridge.msdk.video.signal.a.InterfaceC0410a f39430m = new C0411a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39431n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39432o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdSession f39433p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaEvents f39434q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f39435r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseDefaultJSCommon.java */
    public static class C0411a implements com.mbridge.msdk.video.signal.a.InterfaceC0410a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    /* JADX INFO: compiled from: BaseDefaultJSCommon.java */
    public static class b implements com.mbridge.msdk.video.signal.a.InterfaceC0410a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f39436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.a.InterfaceC0410a f39437b;

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a(boolean z10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f39436a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void onInitSuccess() {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            return interfaceC0410a != null && interfaceC0410a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f39436a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.onStartRedirection(campaign, str);
            }
        }

        public b(com.mbridge.msdk.video.signal.d dVar, com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a) {
            this.f39436a = dVar;
            this.f39437b = interfaceC0410a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a(int i10, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a() {
            com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a = this.f39437b;
            if (interfaceC0410a != null) {
                interfaceC0410a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f39419b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f39420c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f39422e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f39425h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f39421d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f39424g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", C3426d4.a.f28413f);
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f39431n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f39426i;
    }

    public AdEvents j() {
        return this.f39435r;
    }

    public AdSession k() {
        return this.f39433p;
    }

    public int l() {
        if (this.f39420c == 0 && this.f39419b) {
            this.f39420c = 1;
        }
        return this.f39420c;
    }

    public int m() {
        if (this.f39421d == 0 && this.f39419b) {
            this.f39421d = 1;
        }
        return this.f39421d;
    }

    public int n() {
        if (this.f39422e == 0 && this.f39419b) {
            this.f39422e = 1;
        }
        return this.f39422e;
    }

    public MediaEvents o() {
        return this.f39434q;
    }

    public boolean p() {
        return this.f39419b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f39429l;
        if (aVar != null) {
            aVar.a(false);
            this.f39429l.a((NativeListener.NativeTrackingListener) null);
            this.f39429l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f39435r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f39433p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f39428k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        q0.a("DefaultJSCommon", "setUnitId:" + str);
        this.f39427j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f39434q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f39424g = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f39418a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f39418a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f39425h);
        return this.f39425h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0410a);
        this.f39430m = interfaceC0410a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f39426i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }
}
