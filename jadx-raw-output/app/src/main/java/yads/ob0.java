package yads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ob0 {
    @DoNotInline
    public static void a(AudioTrack audioTrack, ye2 ye2Var) {
        xe2 xe2Var = ye2Var.f84930a;
        xe2Var.getClass();
        LogSessionId logSessionId = xe2Var.f84564a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
