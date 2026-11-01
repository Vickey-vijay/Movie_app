package yads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes10.dex */
public final class ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll f80243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f80245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f80246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f80247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f80248f;

    public final void a() {
        if (this.f80243a != null) {
            a(0);
        }
    }

    public ml(AudioTrack audioTrack) {
        if (ib3.f78556a >= 19) {
            this.f80243a = new ll(audioTrack);
            a();
        } else {
            this.f80243a = null;
            a(3);
        }
    }

    public final void a(int i10) {
        this.f80244b = i10;
        if (i10 == 0) {
            this.f80247e = 0L;
            this.f80248f = -1L;
            this.f80245c = System.nanoTime() / 1000;
            this.f80246d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f80246d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f80246d = 10000000L;
        } else {
            if (i10 == 4) {
                this.f80246d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
