package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class oy2 {
    public static SharedPreferences a(oy2 oy2Var, Context context, String str) {
        Object objM3458constructorimpl;
        oy2Var.getClass();
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("user");
            ck.p.h(systemService, "null cannot be cast to non-null type android.os.UserManager");
            objM3458constructorimpl = Result.m3458constructorimpl(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = bool;
        }
        if (!((Boolean) objM3458constructorimpl).booleanValue()) {
            return context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
        }
        return context.getSharedPreferences(str, 0);
    }
}
