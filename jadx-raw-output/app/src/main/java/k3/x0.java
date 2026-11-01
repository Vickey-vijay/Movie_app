package k3;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WifiManager f62352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WifiManager.WifiLock f62353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f62354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62355d;

    public void a(boolean z10) {
        this.f62355d = z10;
        b();
    }

    public final void b() {
        WifiManager.WifiLock wifiLock = this.f62353b;
        if (wifiLock == null) {
            return;
        }
        if (this.f62354c && this.f62355d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public x0(Context context) {
        this.f62352a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
