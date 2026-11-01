package yads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class yb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f84873a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb0 f84874b = new xb0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb0 f84875c;

    public yb0(zb0 zb0Var) {
        this.f84875c = zb0Var;
    }

    public final void a(AudioTrack audioTrack) {
        Handler handler = this.f84873a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new androidx.emoji2.text.b(handler), this.f84874b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f84874b);
        this.f84873a.removeCallbacksAndMessages(null);
    }
}
