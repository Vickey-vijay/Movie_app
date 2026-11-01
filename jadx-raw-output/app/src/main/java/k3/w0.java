package k3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: WakeLockManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final PowerManager f62347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f62348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f62349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62350d;

    public void a(boolean z10) {
        this.f62350d = z10;
        b();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void b() {
        PowerManager.WakeLock wakeLock = this.f62348b;
        if (wakeLock == null) {
            return;
        }
        if (this.f62349c && this.f62350d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public w0(Context context) {
        this.f62347a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
