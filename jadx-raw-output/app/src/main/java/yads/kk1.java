package yads;

import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes11.dex */
public abstract class kk1 {
    @DoNotInline
    public static void a(ak1 ak1Var, ye2 ye2Var) {
        xe2 xe2Var = ye2Var.f84930a;
        xe2Var.getClass();
        LogSessionId logSessionId = xe2Var.f84564a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ak1Var.f75543b.setString("log-session-id", logSessionId.getStringId());
    }
}
