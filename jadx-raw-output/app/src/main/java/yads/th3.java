package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public final class th3 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final th3 f83053f = new th3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f83054b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f83055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Choreographer f83056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83057e;

    public static th3 a() {
        return f83053f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f83054b = j10;
        Choreographer choreographer = this.f83056d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f83056d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                ih1.d("VideoFrameReleaseHelper", ih1.a("Vsync sampling disabled due to platform error", e10));
            }
            return true;
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f83056d;
            if (choreographer != null) {
                int i11 = this.f83057e + 1;
                this.f83057e = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f83056d;
        if (choreographer2 != null) {
            int i12 = this.f83057e - 1;
            this.f83057e = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f83054b = -9223372036854775807L;
            }
        }
        return true;
    }

    public th3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerA = ib3.a(handlerThread.getLooper(), (Handler.Callback) this);
        this.f83055c = handlerA;
        handlerA.sendEmptyMessage(0);
    }
}
