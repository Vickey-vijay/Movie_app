package h5;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import g5.k0;

/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface q {

    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Handler f53790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final q f53791b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, long j10, long j11) {
            ((q) k0.i(this.f53791b)).onVideoDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(int i10, long j10) {
            ((q) k0.i(this.f53791b)).onDroppedFrames(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(o3.d dVar) {
            ((q) k0.i(this.f53791b)).q(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(Format format) {
            ((q) k0.i(this.f53791b)).r(format);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Surface surface) {
            ((q) k0.i(this.f53791b)).onRenderedFirstFrame(surface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(int i10, int i11, int i12, float f10) {
            ((q) k0.i(this.f53791b)).onVideoSizeChanged(i10, i11, i12, f10);
        }

        public void h(final String str, final long j10, final long j11) {
            Handler handler = this.f53790a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h5.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53786b.m(str, j10, j11);
                    }
                });
            }
        }

        public void j(final int i10, final long j10) {
            Handler handler = this.f53790a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h5.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53776b.o(i10, j10);
                    }
                });
            }
        }

        public void k(final o3.d dVar) {
            Handler handler = this.f53790a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h5.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53772b.p(dVar);
                    }
                });
            }
        }

        public void l(final Format format) {
            Handler handler = this.f53790a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h5.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53774b.q(format);
                    }
                });
            }
        }

        public void t(@Nullable final Surface surface) {
            Handler handler = this.f53790a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h5.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53784b.r(surface);
                    }
                });
            }
        }

        public void u(final int i10, final int i11, final int i12, final float f10) {
            Handler handler = this.f53790a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h5.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53779b.s(i10, i11, i12, f10);
                    }
                });
            }
        }

        public a(@Nullable Handler handler, @Nullable q qVar) {
            Handler handler2;
            if (qVar != null) {
                handler2 = (Handler) g5.a.e(handler);
            } else {
                handler2 = null;
            }
            this.f53790a = handler2;
            this.f53791b = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(o3.d dVar) {
            dVar.a();
            ((q) k0.i(this.f53791b)).p(dVar);
        }

        public void i(final o3.d dVar) {
            dVar.a();
            Handler handler = this.f53790a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: h5.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53770b.n(dVar);
                    }
                });
            }
        }
    }

    default void onDroppedFrames(int i10, long j10) {
    }

    default void onRenderedFirstFrame(@Nullable Surface surface) {
    }

    default void onVideoDecoderInitialized(String str, long j10, long j11) {
    }

    default void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    default void p(o3.d dVar) {
    }

    default void q(o3.d dVar) {
    }

    default void r(Format format) {
    }
}
