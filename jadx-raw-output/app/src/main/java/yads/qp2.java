package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public final class qp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f81922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final op2 f81923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mp2 f81924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f81925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp2 f81927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f81928g;

    public final void a() {
        this.f81928g.post(new Runnable() { // from class: cp.x8
            @Override // java.lang.Runnable
            public final void run() {
                this.f51691b.b();
            }
        });
    }

    public qp2(Context context, op2 op2Var) {
        mp2 mp2Var = mj0.f80186h;
        this.f81922a = context.getApplicationContext();
        this.f81923b = op2Var;
        this.f81924c = mp2Var;
        this.f81925d = ib3.b();
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.f81928g = new Handler(handlerThread.getLooper());
    }

    public final /* synthetic */ void a(int i10) {
        this.f81923b.a(this, i10);
    }

    public final /* synthetic */ void b() {
        final int iA = this.f81924c.a(this.f81922a);
        if (this.f81926e != iA) {
            this.f81926e = iA;
            this.f81925d.post(new Runnable() { // from class: cp.y8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51716b.a(iA);
                }
            });
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if ((this.f81924c.f80316b & 1) != 0) {
            if (ib3.f78556a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f81922a.getSystemService("connectivity");
                connectivityManager.getClass();
                pp2 pp2Var = new pp2(this);
                this.f81927f = pp2Var;
                connectivityManager.registerDefaultNetworkCallback(pp2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.f81924c.f80316b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.f81924c.f80316b & 4) != 0) {
            if (ib3.f78556a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((this.f81924c.f80316b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f81922a.registerReceiver(new np2(this), intentFilter, null, this.f81925d);
        return this.f81926e;
    }
}
