package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import g5.k0;

/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioRendererEventListener.java */
    public static final class C0175a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Handler f19041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final a f19042b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(int i10) {
            ((a) k0.i(this.f19042b)).onAudioSessionId(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(int i10, long j10, long j11) {
            ((a) k0.i(this.f19042b)).onAudioSinkUnderrun(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(String str, long j10, long j11) {
            ((a) k0.i(this.f19042b)).onAudioDecoderInitialized(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(o3.d dVar) {
            ((a) k0.i(this.f19042b)).s(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Format format) {
            ((a) k0.i(this.f19042b)).v(format);
        }

        public void g(final int i10) {
            Handler handler = this.f19041a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63992b.m(i10);
                    }
                });
            }
        }

        public void h(final int i10, final long j10, final long j11) {
            Handler handler = this.f19041a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63980b.n(i10, j10, j11);
                    }
                });
            }
        }

        public void i(final String str, final long j10, final long j11) {
            Handler handler = this.f19041a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63988b.o(str, j10, j11);
                    }
                });
            }
        }

        public void k(final o3.d dVar) {
            Handler handler = this.f19041a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63986b.q(dVar);
                    }
                });
            }
        }

        public void l(final Format format) {
            Handler handler = this.f19041a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63984b.r(format);
                    }
                });
            }
        }

        public C0175a(@Nullable Handler handler, @Nullable a aVar) {
            Handler handler2;
            if (aVar != null) {
                handler2 = (Handler) g5.a.e(handler);
            } else {
                handler2 = null;
            }
            this.f19041a = handler2;
            this.f19042b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(o3.d dVar) {
            dVar.a();
            ((a) k0.i(this.f19042b)).m(dVar);
        }

        public void j(final o3.d dVar) {
            dVar.a();
            Handler handler = this.f19041a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63978b.p(dVar);
                    }
                });
            }
        }
    }

    default void m(o3.d dVar) {
    }

    default void onAudioDecoderInitialized(String str, long j10, long j11) {
    }

    default void onAudioSessionId(int i10) {
    }

    default void onAudioSinkUnderrun(int i10, long j10, long j11) {
    }

    default void s(o3.d dVar) {
    }

    default void v(Format format) {
    }
}
