package yads;

import android.media.MediaDrm;
import android.media.MediaDrm$PlaybackComponent;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vx0 {
    @DoNotInline
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    @DoNotInline
    public static void a(MediaDrm mediaDrm, byte[] bArr, ye2 ye2Var) {
        xe2 xe2Var = ye2Var.f84930a;
        xe2Var.getClass();
        LogSessionId logSessionId = xe2Var.f84564a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm$PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionId);
    }
}
