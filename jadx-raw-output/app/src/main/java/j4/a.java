package j4;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.scheduler.Requirements;
import g5.k0;

/* JADX INFO: compiled from: RequirementsWatcher.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f61700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Requirements f61701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f61702d = new Handler(k0.N());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b f61703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f61704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public d f61705g;

    /* JADX INFO: compiled from: RequirementsWatcher.java */
    public interface c {
        void a(a aVar, int i10);
    }

    /* JADX INFO: compiled from: RequirementsWatcher.java */
    @RequiresApi(24)
    public final class d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f61707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f61708b;

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (a.this.f61705g != null) {
                a.this.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (a.this.f61705g != null) {
                a.this.g();
            }
        }

        public final void e() {
            a.this.f61702d.post(new Runnable() { // from class: j4.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61711b.c();
                }
            });
        }

        public final void f() {
            a.this.f61702d.post(new Runnable() { // from class: j4.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61710b.d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            if (z10) {
                return;
            }
            f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f61707a && this.f61708b == zHasCapability) {
                if (zHasCapability) {
                    f();
                }
            } else {
                this.f61707a = true;
                this.f61708b = zHasCapability;
                e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            e();
        }
    }

    /* JADX INFO: compiled from: RequirementsWatcher.java */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                a.this.e();
            }
        }
    }

    public final void e() {
        int iC = this.f61701c.c(this.f61699a);
        if (this.f61704f != iC) {
            this.f61704f = iC;
            this.f61700b.a(this, iC);
        }
    }

    public Requirements f() {
        return this.f61701c;
    }

    public final void g() {
        if ((this.f61704f & 3) == 0) {
            return;
        }
        e();
    }

    @TargetApi(24)
    public final void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) g5.a.e((ConnectivityManager) this.f61699a.getSystemService("connectivity"));
        d dVar = new d();
        this.f61705g = dVar;
        connectivityManager.registerDefaultNetworkCallback(dVar);
    }

    public int i() {
        this.f61704f = this.f61701c.c(this.f61699a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f61701c.i()) {
            if (k0.f53108a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f61701c.d()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f61701c.g()) {
            if (k0.f53108a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        b bVar = new b();
        this.f61703e = bVar;
        this.f61699a.registerReceiver(bVar, intentFilter, null, this.f61702d);
        return this.f61704f;
    }

    public void j() {
        this.f61699a.unregisterReceiver((BroadcastReceiver) g5.a.e(this.f61703e));
        this.f61703e = null;
        if (k0.f53108a < 24 || this.f61705g == null) {
            return;
        }
        k();
    }

    @TargetApi(24)
    public final void k() {
        ((ConnectivityManager) this.f61699a.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) g5.a.e(this.f61705g));
        this.f61705g = null;
    }

    public a(Context context, c cVar, Requirements requirements) {
        this.f61699a = context.getApplicationContext();
        this.f61700b = cVar;
        this.f61701c = requirements;
    }
}
