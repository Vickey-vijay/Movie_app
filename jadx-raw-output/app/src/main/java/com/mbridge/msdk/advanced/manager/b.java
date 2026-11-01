package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.out.MBridgeIds;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f32584z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.b f32588d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBNativeAdvancedView f32590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.setting.l f32591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f32592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f32593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f32596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f32598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f32600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f32601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f32602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f32603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f32604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f32605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f32607w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Handler f32608x = new e(Looper.getMainLooper());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f32609y = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f32589e = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32611b;

        public a(CampaignEx campaignEx, int i10) {
            this.f32610a = campaignEx;
            this.f32611b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f32584z, "zip 下载失败： " + str2 + Z7.f27998r + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f32610a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.f32608x.sendMessage(messageObtain);
            b.this.a(this.f32610a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f32584z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f32610a;
            messageObtain.arg1 = this.f32611b;
            b.this.f32608x.sendMessage(messageObtain);
            if (!z10) {
                b.this.a(this.f32610a, str, true, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class C0298b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f32615c;

        public C0298b(CampaignEx campaignEx, int i10, long j10) {
            this.f32613a = campaignEx;
            this.f32614b = i10;
            this.f32615c = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws Throwable {
            super.a(webView, i10);
            q0.b("NativeAdvancedLoadManager", "=========readyState: " + i10);
            if (i10 != 1) {
                b.this.a(this.f32613a, "readyState 2", this.f32614b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32613a, b.this.f32585a, "readyState 2", this.f32615c, 3);
                return;
            }
            b.this.f32590f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.f32586b + b.this.f32585a + this.f32613a.getRequestId(), true);
            b.this.h(this.f32613a, this.f32614b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32613a, b.this.f32585a, "", this.f32615c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f32613a.isHasMBTplMark()) {
                b.this.f32590f.setH5Ready(true);
                q0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.f32586b + b.this.f32585a + this.f32613a.getRequestId(), true);
                b.this.h(this.f32613a, this.f32614b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32613a, b.this.f32585a, "", this.f32615c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            b.this.a(this.f32613a, str, this.f32614b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32613a, b.this.f32585a, "error code:" + i10 + str, this.f32615c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            q0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f32613a, "onReceivedSslError:" + sslError.getUrl(), this.f32614b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32613a, b.this.f32585a, "error url:" + sslError.getUrl(), this.f32615c, 3);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MBNativeAdvancedWebview f32617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32618b;

        public c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f32617a = mBNativeAdvancedWebview;
            this.f32618b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MintegralNetworkBridge.webviewLoadUrl(this.f32617a, this.f32618b);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class d implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32620a;

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            q0.a(b.f32584z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f32620a;
            messageObtain.what = 5;
            b.this.f32608x.sendMessage(messageObtain);
        }

        public d(CampaignEx campaignEx) {
            this.f32620a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            q0.a(b.f32584z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f32620a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.f32608x.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            int i10;
            Object obj;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                                if (b.this.f32590f != null) {
                                    b.this.f32590f.setVideoReady(true);
                                }
                                b bVar = b.this;
                                bVar.i((CampaignEx) obj, bVar.f32599o);
                                return;
                            }
                            return;
                        }
                        Object obj2 = message.obj;
                        if (obj2 != null && (obj2 instanceof CampaignEx)) {
                            if (b.this.f32590f != null) {
                                b.this.f32590f.setEndCardReady(true);
                            }
                            b bVar2 = b.this;
                            bVar2.i((CampaignEx) obj2, bVar2.f32599o);
                            return;
                        }
                        return;
                    }
                    Object obj3 = message.obj;
                    if (obj3 != null && (obj3 instanceof CampaignEx)) {
                        b bVar3 = b.this;
                        bVar3.i((CampaignEx) obj3, bVar3.f32599o);
                        return;
                    }
                    return;
                }
                Object obj4 = message.obj;
                try {
                    if (obj4 instanceof Bundle) {
                        int i12 = ((Bundle) obj4).getInt("type");
                        if (i12 == 1) {
                            i10 = 880004;
                        } else if (i12 == 2) {
                            i10 = 880007;
                        } else if (i12 == 3) {
                            i10 = 880006;
                        } else {
                            i10 = 880024;
                        }
                        com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(i10);
                        String string = ((Bundle) obj4).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx = (CampaignEx) ((Bundle) obj4).getSerializable("campaignex");
                        bVar4.c(string);
                        bVar4.a(campaignEx);
                        b bVar5 = b.this;
                        bVar5.a(bVar4, bVar5.f32598n, b.this.f32599o, campaignEx);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar6 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar6.a((Throwable) e10);
                    b bVar7 = b.this;
                    bVar7.a(bVar6, bVar7.f32598n, b.this.f32599o, (CampaignEx) null);
                    return;
                }
            }
            Object obj5 = message.obj;
            int i13 = message.arg1;
            if (obj5 != null && (obj5 instanceof CampaignEx)) {
                CampaignEx campaignEx2 = (CampaignEx) obj5;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx2.getAdZip()), campaignEx2, i13);
            }
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.f32598n, b.this.f32599o, (CampaignEx) null);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class g extends com.mbridge.msdk.advanced.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f32624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f32625f;

        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f32627a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f32628b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f32629c;

            public a(Exception exc, int i10, CampaignUnit campaignUnit) {
                this.f32627a = exc;
                this.f32628b = i10;
                this.f32629c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f32627a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.f32624e;
                int i10 = this.f32628b;
                CampaignUnit campaignUnit = this.f32629c;
                bVar2.a(bVar, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || this.f32629c.getAds().size() == 0) ? null : this.f32629c.getAds().get(0));
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class RunnableC0299b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f32631a;

            public RunnableC0299b(String str) {
                this.f32631a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.f32631a);
                g gVar = g.this;
                b.this.a(bVar, gVar.f32624e, gVar.f32625f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, String str, int i11) {
            super(i10);
            this.f32624e = str;
            this.f32625f = i11;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i10, bVar.f32585a, this.f32624e);
                b.this.f32607w = campaignUnit.getRequestId();
                b.this.f32592h = campaignUnit.getAds();
            } catch (Exception e10) {
                q0.b(b.f32584z, e10.getMessage());
                q0.c(b.f32584z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.f32608x != null) {
                    b.this.f32608x.post(new a(e10, i10, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i10, String str) {
            q0.b(b.f32584z, str);
            q0.c(b.f32584z, "onLoadCompaginFailed load failed errorCode:" + i10 + " msg:" + str);
            if (b.this.f32608x != null) {
                b.this.f32608x.post(new RunnableC0299b(str));
            }
            b.this.f();
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class h extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32633a;

        public h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f32633a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f32633a, b.this.f32589e, null);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32635a;

        public i(CampaignEx campaignEx) {
            this.f32635a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.f32589e)).d();
            y.a(b.this.f32589e, this.f32635a);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32638b;

        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f32637a, jVar.f32638b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class RunnableC0300b implements Runnable {
            public RunnableC0300b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f32637a, jVar.f32638b);
            }
        }

        public j(CampaignEx campaignEx, int i10) {
            this.f32637a = campaignEx;
            this.f32638b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f32584z, "gifurl 下载失败： " + str2);
            if (b.this.f32608x != null) {
                b.this.f32608x.post(new RunnableC0300b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f32584z, "giturl 下载成功： " + str);
            if (b.this.f32608x != null) {
                b.this.f32608x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class k implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32643b;

        public k(CampaignEx campaignEx, int i10) {
            this.f32642a = campaignEx;
            this.f32643b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f32584z, "endcard 下载失败： " + str2);
            if (b.this.f32590f != null) {
                b.this.f32590f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f32642a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.f32608x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f32584z, "endcard 下载成功： " + str);
            if (b.this.f32608x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f32642a;
                messageObtain.arg1 = this.f32643b;
                b.this.f32608x.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class l implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32646b;

        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f32645a, lVar.f32646b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class RunnableC0301b implements Runnable {
            public RunnableC0301b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f32645a, lVar.f32646b);
            }
        }

        public l(CampaignEx campaignEx, int i10) {
            this.f32645a = campaignEx;
            this.f32646b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f32584z, "image 下载失败： " + str2);
            if (b.this.f32608x != null) {
                b.this.f32608x.post(new RunnableC0301b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f32584z, "image 下载成功： " + str);
            if (b.this.f32608x != null) {
                b.this.f32608x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f32650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f32651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32652c;

        public m(File file, CampaignEx campaignEx, int i10) {
            this.f32650a = file;
            this.f32651b = campaignEx;
            this.f32652c = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f32650a.getAbsolutePath(), this.f32651b, this.f32652c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f32606v = 0;
    }

    private void g() {
        try {
            int i10 = this.f32606v + 1;
            this.f32606v = i10;
            com.mbridge.msdk.setting.l lVar = this.f32591g;
            if (lVar == null || i10 > lVar.y()) {
                q0.c(f32584z, "onload 重置offset为0");
                this.f32606v = 0;
            }
            q0.c(f32584z, "onload 算出 下次的offset是:" + this.f32606v);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (this.f32590f.isH5Ready()) {
            i(campaignEx, i10);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f32585a, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f32590f, campaignEx, this.f32586b, this.f32585a) || this.f32601q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f32585a);
        this.f32601q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.f32588d;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void j(CampaignEx campaignEx, int i10) throws Throwable {
        this.f32593i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f32590f, campaignEx, this.f32586b, this.f32585a)) {
            i(campaignEx, i10);
        } else {
            e(campaignEx, i10);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f32592h);
    }

    public String d() {
        return this.f32607w;
    }

    public void e() {
        if (this.f32588d != null) {
            this.f32588d = null;
        }
        if (this.f32602r != null) {
            this.f32602r = null;
        }
        if (this.f32603s != null) {
            this.f32603s = null;
        }
    }

    public b(String str, String str2, long j10) {
        this.f32586b = str;
        this.f32585a = str2;
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl(), new l(campaignEx, i10));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[Catch: Exception -> 0x0127, all -> 0x0142, TRY_ENTER, TryCatch #2 {all -> 0x0142, blocks: (B:62:0x0127, B:40:0x00cd, B:42:0x00d1, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00f6, B:51:0x00ff, B:27:0x00a6), top: B:82:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: Exception -> 0x0127, all -> 0x0142, TryCatch #2 {all -> 0x0142, blocks: (B:62:0x0127, B:40:0x00cd, B:42:0x00d1, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00f6, B:51:0x00ff, B:27:0x00a6), top: B:82:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: Exception -> 0x0127, all -> 0x0142, TRY_LEAVE, TryCatch #2 {all -> 0x0142, blocks: (B:62:0x0127, B:40:0x00cd, B:42:0x00d1, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00f6, B:51:0x00ff, B:27:0x00a6), top: B:82:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0118 A[Catch: IOException -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0137, blocks: (B:64:0x0133, B:53:0x0118), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0133 A[Catch: IOException -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0137, blocks: (B:64:0x0133, B:53:0x0118), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    private void d(CampaignEx campaignEx, int i10) throws Throwable {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        File file;
        Exception e10;
        Exception e11;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f32585a, "8");
                            File file2 = new File(campaignEx.getAdHtml());
                            try {
                                try {
                                    if (!file2.exists()) {
                                        String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                        String md5 = SameMD5.getMD5(c1.b(campaignEx.getAdHtml()));
                                        if (TextUtils.isEmpty(md5)) {
                                            md5 = String.valueOf(System.currentTimeMillis());
                                        }
                                        file = new File(strB, md5.concat(".html"));
                                        try {
                                            if (!file.exists()) {
                                                fileOutputStreamFileOutputStreamCtor = MintegralFilesBridge.fileOutputStreamCtor(file);
                                                try {
                                                    String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, "<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx.getAdHtml());
                                                    if (campaignEx.isActiveOm()) {
                                                        strInjectScriptContentIntoHtml = com.mbridge.msdk.omsdk.b.a(strInjectScriptContentIntoHtml);
                                                    }
                                                    fileOutputStreamFileOutputStreamCtor.write(strInjectScriptContentIntoHtml.getBytes());
                                                    fileOutputStreamFileOutputStreamCtor.flush();
                                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                } catch (Exception e12) {
                                                    e10 = e12;
                                                    file2 = file;
                                                    FileOutputStream fileOutputStream2 = fileOutputStreamFileOutputStreamCtor;
                                                    e11 = e10;
                                                    fileOutputStream = fileOutputStream2;
                                                    e11.printStackTrace();
                                                    campaignEx.setMraid("");
                                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f32585a, "8");
                                                    if (fileOutputStream != null) {
                                                        fileOutputStream.close();
                                                    }
                                                    file = file2;
                                                    if (!file.exists()) {
                                                        q0.a(f32584z, "渲染 HTML 失败： html file write failed");
                                                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880013);
                                                        a(bVar, this.f32598n, i10, campaignEx);
                                                        a(bVar, this.f32598n, i10, campaignEx);
                                                    } else {
                                                        q0.a(f32584z, "渲染 HTML 失败： html file write failed");
                                                        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880013);
                                                        a(bVar2, this.f32598n, i10, campaignEx);
                                                        a(bVar2, this.f32598n, i10, campaignEx);
                                                    }
                                                    if (fileOutputStream != null) {
                                                        fileOutputStream.close();
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (fileOutputStreamFileOutputStreamCtor != null) {
                                                        try {
                                                            fileOutputStreamFileOutputStreamCtor.close();
                                                        } catch (Exception unused) {
                                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                            a(new com.mbridge.msdk.foundation.error.b(880013), this.f32598n, i10, campaignEx);
                                                            if (fileOutputStream == null) {
                                                                fileOutputStream.close();
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                            if (fileOutputStream != null) {
                                                                try {
                                                                    fileOutputStream.close();
                                                                } catch (IOException e13) {
                                                                    q0.b(f32584z, e13.getMessage());
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e14) {
                                            e11 = e14;
                                            file2 = file;
                                            e11.printStackTrace();
                                            campaignEx.setMraid("");
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f32585a, "8");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file = file2;
                                        }
                                        if (!file.exists() && file.isFile() && file.canRead()) {
                                            campaignEx.setAdHtml(file.getAbsolutePath());
                                            q0.a(f32584z, "开始渲染 HTML： ");
                                            Handler handler = this.f32608x;
                                            if (handler != null) {
                                                handler.post(new m(file, campaignEx, i10));
                                            }
                                        } else {
                                            q0.a(f32584z, "渲染 HTML 失败： html file write failed");
                                            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880013);
                                            a(bVar3, this.f32598n, i10, campaignEx);
                                            a(bVar3, this.f32598n, i10, campaignEx);
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    }
                                    file = file2;
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f32585a, "8");
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (Exception e15) {
                                    fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                                    e10 = e15;
                                    file2 = file;
                                    FileOutputStream fileOutputStream3 = fileOutputStreamFileOutputStreamCtor;
                                    e11 = e10;
                                    fileOutputStream = fileOutputStream3;
                                    e11.printStackTrace();
                                    campaignEx.setMraid("");
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f32585a, "8");
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    file = file2;
                                }
                            } catch (Exception e16) {
                                e11 = e16;
                            }
                        } catch (IOException e17) {
                            q0.b(f32584z, e17.getMessage());
                            return;
                        }
                    } catch (Exception e18) {
                        file = null;
                        e10 = e18;
                        fileOutputStreamFileOutputStreamCtor = null;
                    }
                    if (!file.exists()) {
                        q0.a(f32584z, "渲染 HTML 失败： html file write failed");
                        com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880013);
                        a(bVar4, this.f32598n, i10, campaignEx);
                        a(bVar4, this.f32598n, i10, campaignEx);
                    } else {
                        q0.a(f32584z, "渲染 HTML 失败： html file write failed");
                        com.mbridge.msdk.foundation.error.b bVar5 = new com.mbridge.msdk.foundation.error.b(880013);
                        a(bVar5, this.f32598n, i10, campaignEx);
                        a(bVar5, this.f32598n, i10, campaignEx);
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                }
            } catch (Exception unused2) {
                a(new com.mbridge.msdk.foundation.error.b(880013), this.f32598n, i10, campaignEx);
                if (fileOutputStream == null) {
                } else {
                    fileOutputStream.close();
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private void f(CampaignEx campaignEx, int i10) {
        this.f32602r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f32589e, this.f32585a, copyOnWriteArrayList, 298, this.f32602r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f32585a, campaignEx.isBidCampaign())) {
            q0.a(f32584z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f32585a);
        } else {
            q0.a(f32584z, " load Video isReady true");
            this.f32590f.setVideoReady(true);
            i(campaignEx, i10);
        }
    }

    public void b(String str, int i10) {
        CampaignEx campaignExA;
        List<Integer> listC;
        this.f32601q = false;
        this.f32598n = str;
        this.f32599o = i10;
        this.f32593i = null;
        if (this.f32590f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i10, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f32590f, this.f32586b, this.f32585a, str, this.f32594j, false, false);
        } else {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f32590f, this.f32586b, this.f32585a, str, this.f32594j, false, true);
        }
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.l lVar = this.f32591g;
        if (lVar != null && lVar.t() == 1 && this.f32590f != null && campaignExA != null) {
            j(campaignExA, i10);
            return;
        }
        this.f32600p = false;
        com.mbridge.msdk.setting.l lVar2 = this.f32591g;
        if (lVar2 != null && (listC = lVar2.c()) != null && listC.size() > 0) {
            this.f32587c = listC.get(0).intValue() * 1000;
        } else {
            this.f32587c = 30000L;
        }
        q0.a(f32584z, "开始从V3请求新的 offer，超时 ：" + this.f32587c);
        if (this.f32591g == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f32587c);
            a(this.f32589e, str, i10);
        } else if (System.currentTimeMillis() - timestamp > this.f32591g.v() * 1000) {
            a(this.f32587c);
            a(this.f32589e, str, i10);
        } else {
            j(campaignExA, i10);
        }
    }

    private void e(CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f32590f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            q0.a(f32584z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.a(f32584z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            q0.a(f32584z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            q0.a(f32584z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            q0.a(f32584z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        q0.a(f32584z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i10);
    }

    private void g(CampaignEx campaignEx, int i10) {
        String adZip;
        this.f32603s = new a(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        int i11 = 0;
        if (campaignEx != null) {
            i11 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i11);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.f32603s);
    }

    public void a(com.mbridge.msdk.setting.l lVar) {
        this.f32591g = lVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f32590f = mBNativeAdvancedView;
    }

    public void a(int i10) {
        this.f32594j = i10;
    }

    public void a(int i10, int i11) {
        this.f32597m = i10;
        this.f32596l = i11;
    }

    private void a(long j10) {
        this.f32608x.postDelayed(this.f32609y, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            if (a1.a(this.f32585a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                return;
            }
            try {
                com.mbridge.msdk.advanced.manager.d.b(this.f32585a);
            } catch (Throwable th2) {
                q0.b(f32584z, th2.getMessage());
            }
            q0.c(f32584z, "load 开始准备请求参数");
            MBridgeIds mBridgeIds = new MBridgeIds(this.f32586b, this.f32585a);
            com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
            fVar.d(i10);
            fVar.c(this.f32606v);
            fVar.a(this.f32605u);
            fVar.b(this.f32597m);
            fVar.a(this.f32596l);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                q0.c(f32584z, "load 请求参数为空 load失败");
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a("token", str);
            }
            String strD = v0.d(this.f32585a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i10), str, com.mbridge.msdk.foundation.same.c.a(this.f32587c, 30000L));
        } catch (Exception e10) {
            q0.b(f32584z, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) e10);
            a(bVar, str, i10, (CampaignEx) null);
            f();
        }
    }

    private void b() {
        this.f32608x.removeCallbacks(this.f32609y);
    }

    private void b(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getGifUrl(), new j(campaignEx, i10));
    }

    @NonNull
    private com.mbridge.msdk.advanced.request.b a(String str, int i10) {
        g gVar = new g(i10, str, i10);
        gVar.a(str);
        gVar.setUnitId(this.f32585a);
        gVar.setPlacementId(this.f32586b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (!TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        }
        if (campaignUnit != null && campaignUnit.getAds() != null) {
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i10 == 1, str2, eVar, campaignUnit.getAds().get(0), str).t());
        }
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            q0.c(f32584z, "onload load成功 size:" + listA.size());
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i10);
            return;
        }
        q0.c(f32584z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f32585a);
        a(campaignEx);
        this.f32605u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f32589e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f32589e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f32585a, campaignEx, com.mbridge.msdk.foundation.same.a.f34914x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f32589e, cVar, new h(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.f32588d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f32600p) {
            this.f32600p = false;
            a(bVar, i10, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f32590f, this.f32586b, this.f32585a, str, this.f32594j, true, true);
        if (campaignExA != null) {
            q0.b(f32584z, "load failed cache ");
            j(campaignExA, i10);
        } else {
            a(bVar, i10, campaignExA);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f32601q) {
            return;
        }
        b();
        if (bVar != null) {
            q0.b(f32584z, "real failed: " + bVar.l());
        }
        this.f32601q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.f32588d;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) {
        String str;
        this.f32604t = new k(campaignEx, i10);
        int i11 = 0;
        if (campaignEx != null) {
            i11 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i11);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.f32604t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f32590f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f32585a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f32590f.getContext(), this.f32586b, this.f32585a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.f32594j);
        bVar.b(this.f32595k);
        this.f32590f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f32590f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0298b(campaignEx, i10, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.b(f32584z, "=======开始渲染: " + str);
            Handler handler = this.f32608x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.f32598n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f32585a, "webview had destory", jCurrentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f32598n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f32585a, campaignEx);
    }

    public String a(String str) {
        int iO;
        if (this.f32593i == null) {
            return "";
        }
        try {
            com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f32585a, this.f32593i.getId() + this.f32593i.getVideoUrlEncode() + this.f32593i.getBidToken());
            if (aVarA == null || (iO = aVarA.o()) != 5) {
                return str;
            }
            String strP = aVarA.p();
            if (!new File(strP).exists()) {
                return str;
            }
            q0.b(f32584z, "本地已下载完 拿本地播放地址：" + strP + " state：" + iO);
            return strP;
        } catch (Exception e10) {
            q0.b(f32584z, e10.getMessage());
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f32584z, e10.getMessage());
            }
        }
    }
}
