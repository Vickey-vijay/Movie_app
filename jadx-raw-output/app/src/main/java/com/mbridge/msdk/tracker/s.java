package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.ironsource.Z7;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ReportManager.java */
/* JADX INFO: loaded from: classes8.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f38316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f38320e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f38324i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f38321f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f38322g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f38323h = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38325j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f38326k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f38327l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f38328m = false;

    /* JADX INFO: compiled from: ReportManager.java */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f38331a;

        private void a(String str) {
            Log.d("TrackManager", this.f38331a.f38320e.v() + Z7.f27998r + str + this.f38331a.f38322g.addAndGet(0) + " 数据库记录数：" + this.f38331a.f38316a.b());
        }

        private synchronized void a() {
            try {
                this.f38331a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f38101a) {
                    Log.e("TrackManager", this.f38331a.f38320e.v() + " report failed ", e10);
                }
            }
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f38101a) {
                    Log.e("TrackManager", this.f38331a.f38320e.v() + " removeMessages failed ", e10);
                }
            }
            if (this.f38331a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f38331a.f38321f.get(), this.f38331a.f38326k, this.f38331a.f38318c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f38101a) {
                    Log.e("TrackManager", this.f38331a.f38320e.v() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        public b(Looper looper, s sVar) {
            super(looper);
            this.f38331a = sVar;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            e eVar;
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 != 2 && i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            b();
                            if (com.mbridge.msdk.tracker.a.f38101a) {
                                a("触发上报（timer）当前 Event 数量：");
                            }
                            a();
                            return;
                        }
                        this.f38331a.k();
                        b();
                        if (com.mbridge.msdk.tracker.a.f38101a) {
                            a("触发上报（flush）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    Object obj = message.obj;
                    if (obj instanceof e) {
                        eVar = (e) obj;
                    } else {
                        eVar = null;
                    }
                    if (com.mbridge.msdk.tracker.a.f38101a && !y.b(eVar)) {
                        a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.g()));
                    }
                    if (y.a(eVar) || this.f38331a.f()) {
                        b();
                        if (com.mbridge.msdk.tracker.a.f38101a) {
                            a("触发上报（notice check）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    return;
                }
                if (com.mbridge.msdk.tracker.a.f38101a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f38331a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            b();
            if (com.mbridge.msdk.tracker.a.f38101a) {
                a("触发上报（report result）当前 Event 数量：");
            }
            a();
        }
    }

    /* JADX INFO: compiled from: ReportManager.java */
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f38329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f38330b;

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f38330b.b(tVar.a());
            this.f38330b.i();
            this.f38330b.f38326k = 0L;
            if (this.f38330b.f()) {
                Handler handler = this.f38329a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.d("TrackManager", this.f38330b.f38320e.v() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f38330b.f38322g.addAndGet(0) + " 个，数据库记录数：" + this.f38330b.f38316a.b() + " 个");
            }
        }

        public a(Handler handler, s sVar) {
            this.f38329a = handler;
            this.f38330b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f38330b.a(tVar.a(), str);
            this.f38330b.f38326k = System.currentTimeMillis();
            int iD = this.f38330b.d();
            if (iD <= 10) {
                this.f38329a.removeMessages(3);
                Handler handler = this.f38329a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iD) * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.d("TrackManager", this.f38330b.f38320e.v() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f38330b.f38322g.addAndGet(0) + " 个，数据库记录数：" + this.f38330b.f38316a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    private List<i> c() {
        return this.f38316a.a(this.f38317b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f38321f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.d("TrackManager", this.f38320e.v() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f38322g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f38101a) {
            Log.d("TrackManager", this.f38320e.v() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f38322g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f38316a.b());
        }
        try {
            zA = this.f38320e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", this.f38320e.v() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", this.f38320e.v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarM = this.f38320e.m();
        oVarM.a(new a(this.f38324i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f38320e.f().a(this.f38320e.u(), listC, this.f38320e.o());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", this.f38320e.v() + " report decorate request params failed ", e11);
            }
        }
        oVarM.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f38321f.set(0);
    }

    private void l() {
        this.f38316a.c();
    }

    public void b() {
        this.f38324i.removeMessages(1);
        Handler handler = this.f38324i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f38322g.incrementAndGet();
    }

    public boolean f() {
        return this.f38322g.addAndGet(0) >= this.f38317b;
    }

    public boolean g() {
        return this.f38325j;
    }

    public void j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f38324i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f38324i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f38318c);
        this.f38325j = false;
    }

    public void k() {
        synchronized (this.f38323h) {
            if (!this.f38327l) {
                this.f38327l = true;
                l();
            }
            if (!this.f38328m) {
                this.f38328m = true;
                this.f38322g.addAndGet(this.f38316a.b());
            }
        }
    }

    public s(k kVar) {
        this.f38316a = kVar.d();
        this.f38317b = kVar.i();
        this.f38318c = kVar.l();
        this.f38319d = kVar.j();
        this.f38320e = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f38316a.c(list);
    }

    public void a(e eVar) {
        if (this.f38324i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f38321f.get(), this.f38326k, this.f38318c);
        if (jA > this.f38318c) {
            Handler handler = this.f38324i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f38324i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    private void a(List<i> list) {
        this.f38316a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f38101a) {
            return;
        }
        int iA = this.f38316a.a();
        if (com.mbridge.msdk.tracker.a.f38101a) {
            Log.d("TrackManager", this.f38320e.v() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f38322g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f38316a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.l() && iVar.h() >= this.f38319d;
                boolean z11 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (!z10 && !z11) {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f38316a.a(list);
        this.f38322g.addAndGet(i10);
    }
}
