package yads;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l82 {
    public static void a(Context context, o82 o82Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            k82 k82Var = new k82(o82Var);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), k82Var);
            telephonyManager.unregisterTelephonyCallback(k82Var);
        } catch (RuntimeException unused) {
            o82Var.a(5);
        }
    }
}
