package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes11.dex */
public final class tc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82965a;

    public final rc2 a() {
        Object systemService = this.f82965a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (boolValueOf != null && !boolValueOf.booleanValue()) {
            return rc2.f82192c;
        }
        Object systemService2 = this.f82965a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? rc2.f82193d : rc2.f82191b;
    }

    public tc2(Context context) {
        this.f82965a = context;
    }
}
