package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lx3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lx3 f79987d = new lx3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f79988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79989b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79990c = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f79990c || this.f79989b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(nw3.f80846c.f80847a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f84355e;
            boolean z12 = z11 || z10;
            if (kaVar.f79343b.get() != 0) {
                ix3.f78850a.a((WebView) kaVar.f79343b.get(), "setDeviceLockState", z12 ? "locked" : "unlocked");
            }
        }
    }

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f79988a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f79989b, zIsDeviceLocked);
        this.f79990c = zIsDeviceLocked;
    }
}
