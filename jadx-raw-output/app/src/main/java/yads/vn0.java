package yads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vn0 {
    @DoNotInline
    public static ye2 a(Context context, zn0 zn0Var, boolean z10) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        mm1 mm1Var = mediaMetricsManager == null ? null : new mm1(context, mediaMetricsManager.createPlaybackSession());
        if (mm1Var == null) {
            ih1.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new ye2(new xe2(LogSessionId.LOG_SESSION_ID_NONE));
        }
        if (z10) {
            zn0Var.getClass();
            kb0 kb0Var = (kb0) zn0Var.f85532o;
            kb0Var.getClass();
            pf1 pf1Var = kb0Var.f79355f;
            if (!pf1Var.f81400g) {
                pf1Var.f81397d.add(new of1(mm1Var));
            }
        }
        return new ye2(new xe2(mm1Var.f80261c.getSessionId()));
    }
}
