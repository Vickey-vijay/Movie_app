package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: MonitorNetworkRequestTimeout.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33520b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f33521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f33522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f33523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f33524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f33525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.b f33526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.b f33527i;

    /* JADX INFO: compiled from: MonitorNetworkRequestTimeout.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f33524f != null && !b.this.f33525g.h()) {
                b.this.a();
                b.this.f33524f.d(b.this.f33525g);
            }
            b.this.e();
        }
    }

    private void c() {
        this.f33523e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.f33526h = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.f33521c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f33521c = null;
            }
            HandlerThread handlerThread = this.f33522d;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f33522d.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f33522d = null;
                }
                this.f33523e = null;
                this.f33520b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f33522d = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void d() {
        Runnable runnable;
        if (this.f33520b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f33520b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f33522d = handlerThread;
            handlerThread.start();
            this.f33521c = new Handler(this.f33522d.getLooper());
            c();
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f33521c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.f33521c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f33524f;
            if (aVar != null) {
                aVar.d(this.f33525g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f33519a + "ms");
        Handler handler = this.f33521c;
        if (handler == null || (runnable = this.f33523e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f33519a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.f33520b) {
            this.f33520b = false;
            Handler handler = this.f33521c;
            if (handler != null && (runnable = this.f33523e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    public b(long j10) {
        if (this.f33519a < 0) {
            this.f33519a = 30L;
        } else {
            this.f33519a = j10;
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.f33527i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f33526h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.f33526h.a();
            }
            if (this.f33527i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.f33527i.a();
            }
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "取消任务时发生异常：" + e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.f33525g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f33524f = aVar;
    }
}
