package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;

/* JADX INFO: compiled from: MonitorPlayerTimeout.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33457c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f33461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HandlerThread f33462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f33463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f33464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f33465k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f33467m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33458d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33459e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33460f = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33466l = 0;

    /* JADX INFO: compiled from: MonitorPlayerTimeout.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: MonitorPlayerTimeout.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f33465k != null) {
                c.this.f33465k.a("播放超时：从创建到第一帧播放超过 " + c.this.f33456b + "ms");
            }
            c.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f33458d || this.f33459e || TextUtils.isEmpty(this.f33467m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.f33466l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f33466l);
                if (this.f33466l >= this.f33455a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f33461g;
                if (handler == null || (runnable2 = this.f33463i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f33459e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f33465k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f33461g;
            if (handler2 == null || (runnable3 = this.f33463i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "检查本地地址异常：" + e10.getMessage());
            Handler handler3 = this.f33461g;
            if (handler3 == null || (runnable = this.f33463i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f33467m.startsWith(AdPayload.FILE_SCHEME) || this.f33467m.startsWith("/")) {
                File file = new File(this.f33467m.replace(AdPayload.FILE_SCHEME, ""));
                if (file.exists() && file.isFile()) {
                    return this.f33467m;
                }
            }
            if (this.f33467m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(this.f33467m);
                String strA = bVarE != null ? bVarE.a() : "";
                File file2 = new File(strA.replace(AdPayload.FILE_SCHEME, ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e10.getMessage());
            return null;
        }
    }

    private void d() {
        this.f33463i = new a();
        this.f33464j = new b();
    }

    public void b() {
        try {
            g();
            Handler handler = this.f33461g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f33461g = null;
            }
            HandlerThread handlerThread = this.f33462h;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f33462h.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f33462h = null;
                }
                this.f33463i = null;
                this.f33464j = null;
                this.f33465k = null;
                this.f33458d = false;
                this.f33459e = false;
                this.f33460f = false;
                this.f33466l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f33462h = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void e() {
        Runnable runnable;
        if (!this.f33458d || this.f33460f) {
            return;
        }
        this.f33460f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f33457c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f33461g;
        if (handler != null && (runnable = this.f33464j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f33456b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        g();
    }

    public void f() {
        Runnable runnable;
        if (this.f33461g == null) {
            g();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f33465k;
            if (aVar != null) {
                aVar.a(" playerHandler 异常 ");
            }
        }
        if (this.f33458d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f33458d = true;
        this.f33459e = false;
        this.f33460f = false;
        this.f33466l = 0;
        this.f33457c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f33456b + "ms");
        Handler handler = this.f33461g;
        if (handler != null && (runnable = this.f33464j) != null) {
            handler.postDelayed(runnable, this.f33456b);
        }
        a();
    }

    public void g() {
        if (this.f33458d) {
            this.f33458d = false;
            Handler handler = this.f33461g;
            if (handler != null) {
                Runnable runnable = this.f33463i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f33464j;
                if (runnable2 != null) {
                    this.f33461g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    public c(int i10, String str) {
        long j10;
        this.f33455a = 3;
        this.f33467m = str;
        if (i10 > 0) {
            j10 = i10;
        } else {
            j10 = 3000;
        }
        this.f33456b = j10;
        this.f33455a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f33462h = handlerThread;
            handlerThread.start();
            this.f33461g = new Handler(this.f33462h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f33461g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f33465k = aVar;
    }
}
