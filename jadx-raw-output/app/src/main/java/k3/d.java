package k3;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.c f62073a = new v0.c();

    /* JADX INFO: compiled from: BasePlayer.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0.b f62074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f62075b;

        public void b() {
            this.f62075b = true;
        }

        public void a(b bVar) {
            if (this.f62075b) {
                return;
            }
            bVar.a(this.f62074a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.f62074a.equals(((a) obj).f62074a);
        }

        public int hashCode() {
            return this.f62074a.hashCode();
        }

        public a(n0.b bVar) {
            this.f62074a = bVar;
        }
    }

    /* JADX INFO: compiled from: BasePlayer.java */
    public interface b {
        void a(n0.b bVar);
    }

    public final void m() {
        stop(false);
    }

    public final int g() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return g5.k0.q((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // k3.n0
    public final int getNextWindowIndex() {
        v0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.e(getCurrentWindowIndex(), i(), getShuffleModeEnabled());
    }

    @Override // k3.n0
    public final int getPreviousWindowIndex() {
        v0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        return currentTimeline.l(getCurrentWindowIndex(), i(), getShuffleModeEnabled());
    }

    public final long h() {
        v0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return -9223372036854775807L;
        }
        return currentTimeline.n(getCurrentWindowIndex(), this.f62073a).c();
    }

    public final int i() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final boolean j() {
        if (getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0) {
            return true;
        }
        return false;
    }

    public final void k(long j10) {
        seekTo(getCurrentWindowIndex(), j10);
    }

    @Override // k3.n0
    public final void next() {
        int nextWindowIndex = getNextWindowIndex();
        if (nextWindowIndex != -1) {
            l(nextWindowIndex);
        }
    }

    @Override // k3.n0
    public final void previous() {
        int previousWindowIndex = getPreviousWindowIndex();
        if (previousWindowIndex != -1) {
            l(previousWindowIndex);
        }
    }

    public final void l(int i10) {
        seekTo(i10, -9223372036854775807L);
    }
}
