package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
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
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: SplashLoadManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f37053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.b f37055e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBSplashView f37057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f37058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f37063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f37066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f37067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f37068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f37069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37070t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f37072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f37073w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f37071u = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f37074x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f37075y = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f37076z = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f37056f = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class a implements com.mbridge.msdk.splash.manager.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37078b;

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f37077a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f37077a, this.f37078b);
        }

        public a(CampaignEx campaignEx, int i10) {
            this.f37077a = campaignEx;
            this.f37078b = i10;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.f37078b, this.f37077a);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i10) throws Throwable {
            if (i10 == 1) {
                e.this.g(this.f37077a, this.f37078b);
            } else {
                e.this.a("readyState 2", this.f37078b, this.f37077a);
            }
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37080a;

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.f37057g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f37080a;
            messageObtain.what = 3;
            e.this.f37075y.sendMessage(messageObtain);
        }

        public b(CampaignEx campaignEx) {
            this.f37080a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.f37057g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f37063m, e.this.f37064n, this.f37080a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f37080a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.f37075y.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            int i10;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Object obj = message.obj;
                        if (obj instanceof CampaignEx) {
                            e eVar = e.this;
                            eVar.h((CampaignEx) obj, eVar.f37064n);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Object obj2 = message.obj;
                try {
                    if (obj2 instanceof Bundle) {
                        int i12 = ((Bundle) obj2).getInt("type");
                        String string = ((Bundle) obj2).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx = (CampaignEx) ((Bundle) obj2).getSerializable("campaignex");
                        if (i12 == 1) {
                            i10 = 880004;
                        } else if (i12 == 2) {
                            i10 = 880006;
                        } else {
                            i10 = 880027;
                        }
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
                        bVar.c(string);
                        e eVar2 = e.this;
                        eVar2.a(bVar, eVar2.f37063m, e.this.f37064n, campaignEx);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                    bVar2.a((Throwable) e10);
                    e eVar3 = e.this;
                    eVar3.a(bVar2, eVar3.f37063m, e.this.f37064n, (CampaignEx) null);
                    return;
                }
            }
            Object obj3 = message.obj;
            int i13 = message.arg1;
            if (obj3 instanceof CampaignEx) {
                CampaignEx campaignEx2 = (CampaignEx) obj3;
                e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx2.getAdZip()), campaignEx2, i13);
            }
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f37063m, e.this.f37064n, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class C0383e extends com.mbridge.msdk.splash.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f37084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f37085f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0383e(int i10, String str, int i11) {
            super(i10);
            this.f37084e = str;
            this.f37085f = i11;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i10, eVar.f37051a, this.f37084e);
                e.this.f37071u = campaignUnit.getRequestId();
                e.this.f37073w = campaignUnit.getAds();
            } catch (Exception e10) {
                e10.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e10);
                e.this.a(bVar, this.f37084e, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i10, String str) throws Throwable {
            q0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.c(str);
            e.this.a(bVar, this.f37084e, this.f37085f, (CampaignEx) null);
            e.this.f();
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class f extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37087a;

        public f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f37087a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f37087a, e.this.f37056f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37089a;

        public g(CampaignEx campaignEx) {
            this.f37089a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f37056f)).d();
            y.a(e.this.f37056f, this.f37089a);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37092b;

        public h(CampaignEx campaignEx, int i10) {
            this.f37091a = campaignEx;
            this.f37092b = i10;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f37091a.isDynamicView() && e.this.f37057g != null) {
                e.this.f37057g.setImageReady(true);
                e.this.f(this.f37091a, this.f37092b);
            }
            e.this.h(this.f37091a, this.f37092b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f37091a.isDynamicView() || e.this.f37057g == null) {
                return;
            }
            e.this.f37057g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.f37063m, this.f37092b, this.f37091a);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class i implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37094a;

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            e.this.a(this.f37094a, str, true, "");
        }

        public i(CampaignEx campaignEx) {
            this.f37094a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            e.this.a(this.f37094a, str, false, message);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class j implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37097b;

        public j(CampaignEx campaignEx, int i10) {
            this.f37096a = campaignEx;
            this.f37097b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.f37063m, this.f37097b, this.f37096a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f37096a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.f37075y.sendMessage(messageObtain);
            e.this.a(this.f37096a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            String adZip;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f37096a;
            messageObtain.arg1 = this.f37097b;
            e.this.f37075y.sendMessage(messageObtain);
            if (!z10) {
                CampaignEx campaignEx = this.f37096a;
                if (campaignEx == null) {
                    adZip = "";
                } else {
                    adZip = campaignEx.getAdZip();
                }
                e.this.a(this.f37096a, adZip, true, "");
            }
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class k implements com.mbridge.msdk.splash.inter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37100b;

        public k(CampaignEx campaignEx, int i10) {
            this.f37099a = campaignEx;
            this.f37100b = i10;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.f37057g != null) {
                e.this.f37057g.setDynamicView(true);
                e.this.f37057g.setSplashNativeView(view);
                e.this.h(this.f37099a, this.f37100b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f37063m, this.f37100b, this.f37099a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f37070t = 0;
    }

    private void g() {
        try {
            int i10 = this.f37070t + 1;
            this.f37070t = i10;
            l lVar = this.f37058h;
            if (lVar == null || i10 > lVar.y()) {
                this.f37070t = 0;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f37057g, campaignEx) || this.f37066p) {
            return;
        }
        b();
        if (this.f37065o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f37051a);
        }
        this.f37066p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.f37055e;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void i(CampaignEx campaignEx, int i10) throws Throwable {
        MBSplashView mBSplashView = this.f37057g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f37057g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.f37057g, campaignEx)) {
            h(campaignEx, i10);
        } else {
            a(campaignEx, i10);
        }
    }

    public String d() {
        return this.f37071u;
    }

    public void e() {
        if (this.f37055e != null) {
            this.f37055e = null;
        }
        if (this.f37067q != null) {
            this.f37067q = null;
        }
        if (this.f37068r != null) {
            this.f37068r = null;
        }
    }

    public e(String str, String str2, long j10) {
        this.f37052b = str;
        this.f37051a = str2;
        this.f37054d = j10;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cc A[Catch: Exception -> 0x0114, TRY_ENTER, TryCatch #6 {Exception -> 0x0114, blocks: (B:52:0x0110, B:53:0x0113, B:40:0x00cc, B:42:0x00d0, B:44:0x00d6, B:46:0x00dc, B:48:0x00e2, B:49:0x0102, B:27:0x00a6), top: B:63:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6 A[Catch: Exception -> 0x0114, TryCatch #6 {Exception -> 0x0114, blocks: (B:52:0x0110, B:53:0x0113, B:40:0x00cc, B:42:0x00d0, B:44:0x00d6, B:46:0x00dc, B:48:0x00e2, B:49:0x0102, B:27:0x00a6), top: B:63:0x000a }] */
    private void d(CampaignEx campaignEx, int i10) throws Throwable {
        File file;
        Exception e10;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        Exception e11;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f37051a, "6");
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
                                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f37051a, "6");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file = file2;
                                            if (!file.exists()) {
                                            }
                                            a(new com.mbridge.msdk.foundation.error.b(880013), this.f37063m, i10, campaignEx);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (fileOutputStreamFileOutputStreamCtor != null) {
                                                fileOutputStreamFileOutputStreamCtor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Exception e13) {
                                    e11 = e13;
                                    file2 = file;
                                    e11.printStackTrace();
                                    campaignEx.setMraid("");
                                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f37051a, "6");
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    file = file2;
                                }
                                if (!file.exists() && file.isFile() && file.canRead()) {
                                    campaignEx.setAdHtml(file.getAbsolutePath());
                                    a("file:////" + file.getAbsolutePath(), campaignEx, i10);
                                    return;
                                }
                                a(new com.mbridge.msdk.foundation.error.b(880013), this.f37063m, i10, campaignEx);
                            }
                            file = file2;
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f37051a, "6");
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e14) {
                            fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                            e10 = e14;
                            file2 = file;
                            FileOutputStream fileOutputStream3 = fileOutputStreamFileOutputStreamCtor;
                            e11 = e10;
                            fileOutputStream = fileOutputStream3;
                            e11.printStackTrace();
                            campaignEx.setMraid("");
                            com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e11.getMessage(), this.f37051a, "6");
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            file = file2;
                        }
                    } catch (Exception e15) {
                        e11 = e15;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStreamFileOutputStreamCtor = null;
                }
            } catch (Exception e16) {
                file = null;
                e10 = e16;
                fileOutputStreamFileOutputStreamCtor = null;
            }
            if (!file.exists()) {
            }
            a(new com.mbridge.msdk.foundation.error.b(880013), this.f37063m, i10, campaignEx);
        } catch (Exception unused) {
            a(new com.mbridge.msdk.foundation.error.b(880013), this.f37063m, i10, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            com.mbridge.msdk.splash.common.c.a aVar = new com.mbridge.msdk.splash.common.c.a();
            aVar.b(this.f37051a).a(this.f37052b).a(this.f37059i).a(campaignEx).c(this.f37060j).f(this.f37072v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th2) {
                q0.b(A, th2.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.f37057g, aVar.a(), new k(campaignEx, i10));
        }
    }

    public void b(int i10) {
        this.f37072v = i10;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f37073w);
    }

    private void b() {
        this.f37075y.removeCallbacks(this.f37076z);
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.d.a(this.f37057g, campaignEx, new h(campaignEx, i10));
    }

    private void b(CampaignEx campaignEx, int i10) {
        this.f37067q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f37056f, this.f37051a, copyOnWriteArrayList, 297, this.f37067q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f37051a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f37051a);
        } else {
            this.f37057g.setVideoReady(true);
            h(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i10) {
        if (this.f37057g.isH5Ready()) {
            return;
        }
        this.f37057g.setH5Ready(true);
        h(campaignEx, i10);
    }

    private void e(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            z.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f37068r = new j(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.f37068r);
    }

    public void a(l lVar) {
        this.f37058h = lVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.f37057g = mBSplashView;
    }

    public void a(boolean z10) {
        this.f37059i = z10;
    }

    public void a(int i10) {
        this.f37060j = i10;
    }

    public void a(int i10, int i11) {
        this.f37062l = i10;
        this.f37061k = i11;
    }

    public void a(String str, int i10) {
        this.f37066p = false;
        this.f37063m = str;
        this.f37064n = i10;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f37057g, this.f37052b, this.f37051a, str, this.f37059i, this.f37060j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.f37058h.t() == 1 && i10 != 1 && campaignExA != null) {
            i(campaignExA, i10);
            return;
        }
        this.f37065o = true;
        if (i10 == 1) {
            List<Integer> listC = this.f37058h.c();
            if (listC != null && listC.size() > 0) {
                this.f37053c = listC.get(0).intValue() * 1000;
            } else {
                this.f37053c = 30000L;
            }
        } else {
            long j10 = this.f37054d;
            if (j10 <= 0) {
                this.f37053c = this.f37058h.E();
            } else {
                this.f37053c = j10;
            }
        }
        if (this.f37058h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f37053c);
            a(this.f37056f, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f37058h.v() * 1000) {
            a(this.f37053c);
            a(this.f37056f, str, i10);
        } else {
            i(campaignExA, i10);
        }
    }

    private void a(long j10) {
        this.f37075y.postDelayed(this.f37076z, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            if (a1.a(this.f37051a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                return;
            }
            MBridgeIds mBridgeIds = new MBridgeIds(this.f37052b, this.f37051a);
            com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
            fVar.d(i10);
            fVar.c(this.f37070t);
            fVar.a(this.f37069s);
            fVar.b(this.f37062l);
            fVar.a(this.f37061k);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a("token", str);
            }
            String strD = v0.d(this.f37051a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
            C0383e c0383e = new C0383e(i10, str, i10);
            c0383e.a(str);
            c0383e.setUnitId(this.f37051a);
            c0383e.setPlacementId(this.f37052b);
            c0383e.setAdType(297);
            cVar.choiceV3OrV5BySetting(1, eVarB, c0383e, str, com.mbridge.msdk.foundation.same.c.a(this.f37053c, 30000L));
        } catch (Exception e10) {
            q0.b(A, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) e10);
            a(bVar, str, i10, (CampaignEx) null);
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 297);
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            }
            CampaignEx campaignEx = listA.get(0);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, str2, eVar, campaignEx, str);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            i(campaignEx, i10);
            return;
        }
        if (this.f37074x.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        a(bVar, str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f37051a);
        a(campaignEx);
        this.f37069s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f37056f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f37056f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f37051a, campaignEx, com.mbridge.msdk.foundation.same.a.f34914x);
                this.f37074x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f37056f, cVar, new f(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.f37055e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f37065o) {
            this.f37065o = false;
            a(bVar, i10, str, campaignEx);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f37057g, this.f37052b, this.f37051a, str, this.f37059i, this.f37060j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f37066p) {
            return;
        }
        b();
        this.f37066p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.f37055e;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) throws Throwable {
        this.f37057g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.g.d dVar = new com.mbridge.msdk.splash.manager.g.d();
        dVar.c(this.f37051a);
        dVar.b(this.f37052b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.f37059i);
        dVar.a(this.f37060j);
        com.mbridge.msdk.splash.manager.g.a().a(this.f37057g, dVar, new a(campaignEx, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f37063m, i10, campaignEx);
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
                q0.b(A, e10.getMessage());
            }
        }
    }
}
