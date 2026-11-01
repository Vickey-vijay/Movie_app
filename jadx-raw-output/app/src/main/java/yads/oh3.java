package yads;

import android.view.Surface;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes9.dex */
public abstract class oh3 {
    @DoNotInline
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            ih1.b("VideoFrameReleaseHelper", ih1.a("Failed to call Surface.setFrameRate", e10));
        }
    }
}
