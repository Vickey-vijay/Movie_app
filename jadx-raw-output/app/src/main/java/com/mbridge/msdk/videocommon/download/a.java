package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CampaignDownLoadTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.mbridge.msdk.setting.l H;
    private com.mbridge.msdk.videocommon.setting.c I;
    private com.mbridge.msdk.setting.l J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39482c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f39486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f39487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f39488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f39489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f39490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f39492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f39493n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f39495p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f39497r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private m f39500u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f39502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private DownloadRequest f39503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f39504y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f39505z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39480a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f39483d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f39484e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> f39485f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f39494o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f39496q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f39498s = 100;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f39499t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f39501v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new b();
    private OnProgressStateListener S = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    public class RunnableC0414a implements Runnable {
        public RunnableC0414a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f39500u == null) {
                a.this.f39500u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            try {
                try {
                    a.this.f39500u.a(a.this.f39492m);
                    if (!s0.a().a("r_d_v_b_l", true)) {
                        File file = new File(a.this.f39495p);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                    a.this.f39484e = 0;
                } finally {
                    a.this.f39484e = 0;
                }
            } catch (Throwable unused) {
                q0.b("CampaignDownLoadTask", "del DB or file failed");
            }
        }
    }

    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    public class b implements OnDownloadStateListener {
        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }

        public b() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                q0.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f39494o + "    " + a.this.f39491l);
                if (a.this.f39500u == null) {
                    a.this.f39500u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                }
                a.this.f39500u.a(a.this.f39492m, a.this.f39494o, 5, a.this.f39491l);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th2) {
                        q0.b("CampaignDownLoadTask", th2.getMessage());
                        str = "";
                    }
                } else {
                    str = "";
                }
                a aVar = a.this;
                aVar.a(aVar.f39494o, true, str);
                a.this.a(1, true, "");
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (a.this.f39503x == null || a.this.f39503x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", a.this.f39503x.get("cache", "2"));
            a aVar = a.this;
            aVar.a(aVar.f39488i, eVar);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            a.this.r();
            a.this.a(3, message, "");
            a.this.b(message);
            a aVar2 = a.this;
            aVar2.a(3, aVar2.f39505z, message);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f39484e = 1;
            if (a.this.f39500u == null) {
                a.this.f39500u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            a.this.f39500u.a(a.this.f39488i, a.this.f39491l, a.this.f39495p, a.this.f39484e);
        }
    }

    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    public class c implements OnProgressStateListener {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", a.this.f39503x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f39488i, eVar);
                a.this.f39494o = downloadProgress.getCurrent();
                a.this.f39491l = downloadProgress.getTotal();
                a.this.f39504y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f39498s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f39498s) {
                    q0.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f39498s + Z7.f27998r + a.this.f39482c);
                    if (a.this.f39483d) {
                        return;
                    }
                    a.this.f39483d = true;
                    if (!a.this.f39505z) {
                        a.this.a(1, true, "");
                        a.this.a(downloadProgress.getCurrent(), false, "");
                    }
                    if (a.this.f39503x == null || a.this.C != 2 || a.this.f39505z) {
                        return;
                    }
                    a.this.f39503x.cancel(downloadMessage);
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
    }

    private void q() {
        File file;
        try {
            if (TextUtils.isEmpty(this.f39492m)) {
                return;
            }
            File file2 = null;
            if (!TextUtils.isEmpty(this.f39493n)) {
                file2 = new File(this.f39493n);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            if (file2 != null && file2.exists() && ((file = this.B) == null || !file.exists())) {
                File file3 = new File(file2 + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            z();
            a(this.f39492m);
        } catch (Exception e10) {
            q0.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            v0.a(this.f39489j, this.f39488i, com.mbridge.msdk.foundation.same.a.f34914x);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void z() {
        if (this.f39500u == null) {
            this.f39500u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        com.mbridge.msdk.foundation.entity.m mVarB = this.f39500u.b(this.f39492m, "");
        if (mVarB != null) {
            this.f39494o = mVarB.c();
            if (this.f39484e != 2) {
                this.f39484e = mVarB.b();
            }
            if (this.f39484e == 1) {
                this.f39484e = 2;
            }
            this.f39491l = mVarB.d();
            if (mVarB.a() > 0) {
                this.f39497r = mVarB.a();
            }
            if (this.f39484e == 5) {
                if (Objects.exists(new File(this.f39493n + this.f39502w), this.f39493n, this.f39502w)) {
                    this.f39495p = this.f39493n + this.f39502w;
                } else {
                    d();
                }
            } else if (this.f39484e != 0) {
                this.f39495p = this.f39493n + this.f39502w;
            }
        } else {
            this.f39500u.a(this.f39492m, this.f39497r);
        }
        try {
            long j10 = this.f39491l;
            if (j10 <= 0 || this.f39494o * 100 < j10 * ((long) c(this.f39488i))) {
                return;
            }
            if (c(this.f39488i) == 100 || this.f39484e == 5) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                a(this.f39488i, eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void A() {
        if (this.Q) {
            return;
        }
        try {
            this.f39505z = true;
            if (this.C == 1) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
                return;
            }
            if (this.f39481b == 3) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f39481b);
                return;
            }
            q0.b("CampaignDownLoadTask", "resume()");
            this.O = false;
            this.P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f39492m, this.f39502w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(a(this.f39488i));
            DownloadRequest<?> downloadRequestA = a(downloadMessage, this.R, this.S, "2");
            this.f39503x = downloadRequestA;
            downloadRequestA.start();
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    public void B() {
        q0.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f39492m)) {
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f39498s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f39503x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f39486g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f39487h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void C() {
        q0.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f39492m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f39486g;
                if (aVar != null) {
                    aVar.a(this.f39492m);
                    return;
                }
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f39481b == 3) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f39486g;
                if (aVar2 != null) {
                    aVar2.a(this.f39492m);
                    return;
                }
                return;
            }
            if (this.f39498s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f39486g;
                if (aVar3 != null) {
                    aVar3.a(this.f39492m);
                    return;
                }
                return;
            }
            try {
                if (this.f39484e == 5 && Utils.getDownloadRate(this.f39491l, this.f39494o) >= this.f39498s) {
                    if (Objects.exists(new File(this.f39493n + this.f39502w), this.f39493n, this.f39502w)) {
                        this.f39495p = this.f39493n + this.f39502w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f39486g;
                        if (aVar4 != null) {
                            aVar4.a(this.f39492m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: " + e10.getMessage());
            }
            DownloadRequest downloadRequest = this.f39503x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f39486g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void c(boolean z10) {
        this.L = z10;
    }

    public void d(boolean z10) {
        this.f39496q = z10;
    }

    public void e(boolean z10) {
        this.N = z10;
    }

    public void f(boolean z10) {
        this.M = z10;
    }

    public void g() {
        try {
            d();
            CampaignEx campaignEx = this.f39488i;
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                if (aVarA != null) {
                    aVarA.a(this.f39488i);
                }
            }
        } catch (Exception unused) {
            q0.b("CampaignDownLoadTask", "del file is failed");
        } finally {
            this.f39484e = 0;
        }
    }

    public CampaignEx h() {
        return this.f39488i;
    }

    public String i() {
        return this.f39492m;
    }

    public long j() {
        return this.f39491l;
    }

    public String k() {
        String message = "";
        if (this.f39481b == 3) {
            return "";
        }
        String str = this.f39493n + this.f39502w;
        File file = new File(str);
        try {
            if (!Objects.exists(file, this.f39493n, this.f39502w)) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not read ";
            } else if (file.length() > 0) {
                this.f39495p = str;
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage());
            message = th2.getMessage();
        }
        if (this.f39484e == 5 && !TextUtils.isEmpty(message)) {
            d();
        }
        return message;
    }

    public String l() {
        if (this.Q) {
            try {
                File file = new File(this.f39495p);
                return (file.exists() && file.isFile()) ? this.f39495p : this.f39492m;
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
                return this.f39492m;
            }
        }
        try {
            File file2 = new File(this.f39495p);
            if (Objects.exists(file2, this.f39493n, this.f39502w) && file2.isFile()) {
                return this.f39495p;
            }
        } catch (Exception e11) {
            q0.b("CampaignDownLoadTask", e11.getMessage());
        }
        return this.f39492m;
    }

    public long m() {
        return this.f39494o;
    }

    public long n() {
        return this.f39497r;
    }

    public int o() {
        return this.f39484e;
    }

    public String p() {
        return this.f39495p;
    }

    public boolean s() {
        return this.K;
    }

    public boolean t() {
        return this.f39501v;
    }

    public boolean u() {
        return this.L;
    }

    public boolean v() {
        return this.Q;
    }

    public boolean w() {
        return this.N;
    }

    public boolean x() {
        return this.M;
    }

    public void y() {
        if (this.f39485f != null) {
            this.f39485f = null;
        }
    }

    public a(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f39481b = 1;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarB != null) {
            this.G = gVarB.E0();
        }
        this.D = com.mbridge.msdk.foundation.same.a.f34911u;
        this.E = com.mbridge.msdk.foundation.same.a.f34912v;
        this.F = com.mbridge.msdk.foundation.same.a.f34910t;
        this.f39497r = System.currentTimeMillis();
        this.f39490k = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f39488i = campaignEx;
        this.f39489j = str;
        this.f39481b = i10;
        if (campaignEx != null) {
            this.f39492m = campaignEx.getVideoUrlEncode();
        }
        this.f39502w = o0.d(this.f39492m);
        this.f39493n = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC) + File.separator;
        this.f39495p = this.f39493n + this.f39502w;
        q0.c("CampaignDownLoadTask", this.f39488i.getAppName() + " videoLocalPath:" + this.f39495p + " videoUrl: " + this.f39488i.getVideoUrlEncode() + Z7.f27998r + this.f39498s);
        q();
    }

    public void c(int i10) {
        this.f39481b = i10;
    }

    public void d(int i10) {
        q0.a("CampaignDownLoadTask", "set ready rate: " + i10);
        this.f39498s = i10;
    }

    public void e(CampaignEx campaignEx) {
        this.f39488i = campaignEx;
    }

    private int c(CampaignEx campaignEx) {
        int iD;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iD = campaignEx.getReady_rate();
            q0.a("CampaignDownLoadTask", "ready_rate(campaign): " + iD);
        } else {
            iD = d(campaignEx);
            q0.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iD);
        }
        try {
            return Math.max(iD, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public void b(int i10) {
        this.f39482c = i10;
    }

    public void e(int i10) {
        this.C = i10;
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39489j);
                }
                return this.H.C();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39489j);
                }
                return b((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39489j, false);
            }
            return this.I.w();
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage(), th2);
            return 100;
        }
    }

    public void b(boolean z10) {
        this.f39501v = z10;
    }

    public void b(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f39486g;
        if (aVar != null) {
            aVar.a(str, this.f39492m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f39487h;
        if (aVar2 != null) {
            aVar2.a(str, this.f39492m);
        }
        q0.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f39484e == 4 || this.f39484e == 2 || this.f39484e == 5) {
            return;
        }
        this.f39484e = 4;
        CampaignEx campaignEx = this.f39488i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f39488i.getRsIgnoreCheckRule().size() > 0 && this.f39488i.getRsIgnoreCheckRule().contains(0)) {
            q0.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f39494o, this.f39484e);
        }
    }

    public void a(boolean z10) {
        this.K = z10;
    }

    public void a(int i10, int i11) {
        this.f39484e = i10;
        if (this.f39500u == null) {
            this.f39500u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        this.f39500u.a(this.f39492m, i11, i10, this.f39491l);
    }

    public void c(String str) {
        r();
        a(2, str, "");
        this.f39484e = 4;
    }

    public void a(int i10) {
        this.A = i10;
    }

    public void a(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            this.f39487h.a("VideoUrl is NULL, Please check it.", "");
            return;
        }
        if (this.f39484e == 1) {
            q0.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
            return;
        }
        if (this.f39484e == 5 && Utils.getDownloadRate(this.f39491l, this.f39494o) >= this.f39498s) {
            q0.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
            com.mbridge.msdk.videocommon.listener.a aVar = this.f39486g;
            if (aVar != null) {
                aVar.a(this.f39492m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f39487h;
            if (aVar2 != null) {
                aVar2.a(this.f39492m);
            }
            try {
                File file = new File(this.f39495p);
                if (Objects.exists(file, this.f39493n, this.f39502w) && file.isFile()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f39488i, eVar);
            return;
        }
        if (this.f39481b == 3) {
            q0.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
            a(0L, false, "");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            a(this.f39488i, eVar2);
            return;
        }
        try {
            iC = c(this.f39488i);
        } catch (Exception unused) {
            iC = 100;
        }
        d(iC);
        if (iC == 0) {
            com.mbridge.msdk.videocommon.listener.a aVar3 = this.f39486g;
            if (aVar3 != null) {
                aVar3.a(this.f39492m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar4 = this.f39487h;
            if (aVar4 != null) {
                aVar4.a(this.f39492m);
            }
        }
        DownloadMessage downloadMessage = new DownloadMessage(this.f39488i, str, this.f39502w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        downloadMessage.setUseCronetDownload(a(this.f39488i));
        downloadMessage.addExtra("resource_type", 4);
        this.f39503x = a(downloadMessage, this.R, this.S, "1");
    }

    private void d() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0414a());
    }

    private int b(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.J;
            if (lVar != null) {
                return lVar.C();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
        return 100;
    }

    public void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f39487h = aVar;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f39493n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(60000L).with("do_us_fi_re", Boolean.toString(this.G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f39498s)).with("scenes", str).build();
    }

    public void a(long j10, boolean z10, String str) {
        q0.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f39494o + "  progressSize " + j10 + "  " + this.f39504y + "%   FileSize : " + this.f39491l + "  " + this.f39488i.getAppName());
        if (this.f39498s == 100 && this.f39481b != 3 && j10 != this.f39491l && !z10) {
            File file = new File(this.f39495p);
            q0.b("CampaignDownLoadTask", "progressSize = " + j10 + " fileSize = " + this.f39491l + Z7.f27998r + z10 + " absFileSize = " + (Objects.exists(file, this.f39493n, this.f39502w) ? file.length() : 0L));
            b("File size is not match witch download size.");
            return;
        }
        this.f39484e = 5;
        if (j10 == this.f39491l) {
            a(1, "", str);
        }
        this.f39480a = false;
        a(j10, this.f39484e);
    }

    public void a(com.mbridge.msdk.videocommon.download.c cVar) {
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f39485f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f39486g = aVar;
    }

    private void a(long j10, int i10) {
        this.f39494o = j10;
        int i11 = this.f39498s;
        if (100 * j10 >= ((long) i11) * this.f39491l && !this.f39499t && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f39484e = 5;
                return;
            }
            this.f39499t = true;
            q0.b("CampaignDownLoadTask", "UpdateListener : state: " + i10 + " progress : " + j10);
            String strK = k();
            if (TextUtils.isEmpty(strK)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f39486g;
                if (aVar != null) {
                    aVar.a(this.f39492m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f39487h;
                if (aVar2 != null) {
                    aVar2.a(this.f39492m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f39486g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + strK, this.f39492m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f39487h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + strK, this.f39492m);
                }
            }
        }
        if (!this.f39480a && j10 > 0) {
            this.f39480a = true;
            if (this.f39500u == null) {
                this.f39500u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            this.f39500u.a(this.f39492m, j10, this.f39484e, this.f39491l);
        }
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f39485f;
        if (copyOnWriteArrayList != null) {
            for (com.mbridge.msdk.videocommon.download.c cVar : copyOnWriteArrayList) {
                if (cVar != null) {
                    cVar.onProgress(j10, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2) {
        n nVar = new n(this.f39490k, this.f39488i, i10, Long.toString(this.f39497r != 0 ? System.currentTimeMillis() - this.f39497r : 0L), this.f39491l, this.A);
        nVar.b(this.f39488i.getId());
        nVar.v(this.f39488i.getVideoUrlEncode());
        nVar.m(str);
        nVar.n(this.f39488i.getRequestId());
        nVar.k(this.f39488i.getCurrentLocalRid());
        nVar.o(this.f39488i.getRequestIdNotice());
        nVar.u(this.f39489j);
        nVar.q(str2);
        nVar.b(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f39498s));
        nVar.b("url", this.f39488i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f39503x;
        if (downloadRequest != null) {
            nVar.b("scenes", downloadRequest.get("scenes", ""));
            nVar.b("resumed_breakpoint", this.f39503x.get("resumed_breakpoint", ""));
        }
        int i11 = this.A;
        if (i11 == 94 || i11 == 287) {
            return;
        }
        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(nVar);
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAabEntity() != null) {
                    return campaignEx.getAabEntity().h3c;
                }
            } catch (Throwable th2) {
                q0.b("CampaignDownLoadTask", th2.getMessage());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, boolean z10, String str) {
        if (this.P) {
            return;
        }
        try {
            this.P = true;
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            DownloadRequest downloadRequest = this.f39503x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", ""));
                eVar.a("url", this.f39492m);
                eVar.a("resumed_breakpoint", this.f39503x.get("resumed_breakpoint", ""));
                eVar.a("h3c", "");
            }
            eVar.a("resource_type", 4);
            eVar.a("file_size", Long.valueOf(this.f39491l));
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f39498s));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_end", this.f39488i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (this.O || campaignEx == null || eVar == null) {
            return;
        }
        this.O = true;
        try {
            eVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f39503x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", "1"));
                eVar.a("resumed_breakpoint", this.f39503x.get("resumed_breakpoint", "2"));
            } else {
                eVar.a("scenes", "1");
                eVar.a("resumed_breakpoint", "1");
            }
            eVar.a("url", campaignEx.getVideoUrlEncode());
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(c(campaignEx)));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }
}
