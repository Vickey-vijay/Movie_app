package m3;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import g5.k0;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f63994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f63996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f63997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f63998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f63999f;

    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    @TargetApi(19)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f64000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f64001b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f64002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f64003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f64004e;

        public long a() {
            return this.f64004e;
        }

        public long b() {
            return this.f64001b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f64000a.getTimestamp(this.f64001b);
            if (timestamp) {
                long j10 = this.f64001b.framePosition;
                if (this.f64003d > j10) {
                    this.f64002c++;
                }
                this.f64003d = j10;
                this.f64004e = j10 + (this.f64002c << 32);
            }
            return timestamp;
        }

        public a(AudioTrack audioTrack) {
            this.f64000a = audioTrack;
        }
    }

    public void f() {
        h(4);
    }

    public void a() {
        if (this.f63995b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f63994a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f63994a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f63995b == 2;
    }

    public boolean e(long j10) {
        a aVar = this.f63994a;
        if (aVar == null || j10 - this.f63998e < this.f63997d) {
            return false;
        }
        this.f63998e = j10;
        boolean zC = aVar.c();
        int i10 = this.f63995b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        g();
                    }
                } else if (!zC) {
                    g();
                }
            } else if (!zC) {
                g();
            } else if (this.f63994a.a() > this.f63999f) {
                h(2);
            }
        } else if (zC) {
            if (this.f63994a.b() < this.f63996c) {
                return false;
            }
            this.f63999f = this.f63994a.a();
            h(1);
        } else if (j10 - this.f63996c > 500000) {
            h(3);
        }
        return zC;
    }

    public void g() {
        if (this.f63994a != null) {
            h(0);
        }
    }

    public final void h(int i10) {
        this.f63995b = i10;
        if (i10 == 0) {
            this.f63998e = 0L;
            this.f63999f = -1L;
            this.f63996c = System.nanoTime() / 1000;
            this.f63997d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f63997d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f63997d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f63997d = 500000L;
        }
    }

    public l(AudioTrack audioTrack) {
        if (k0.f53108a >= 19) {
            this.f63994a = new a(audioTrack);
            g();
        } else {
            this.f63994a = null;
            h(3);
        }
    }
}
