package y;

import com.android.cast.dlna.dmr.RenderState;

/* JADX INFO: compiled from: RenderControl.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface a {
    long getCurrentPosition();

    long getDuration();

    RenderState getState();

    void stop();
}
