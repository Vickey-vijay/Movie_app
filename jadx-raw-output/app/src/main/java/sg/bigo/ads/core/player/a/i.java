package sg.bigo.ads.core.player.a;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f71793b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f71795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f71796e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f71792a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f71794c = new Object();

    public final int a(byte[] bArr, long j10) throws j {
        if (j10 < 0) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "buffer or offset or length is wrong");
            return 0;
        }
        int i10 = 0;
        while (!this.f71793b.c() && this.f71793b.a() < PlaybackStateCompat.ACTION_PLAY_FROM_URI + j10 && !this.f71795d) {
            i10++;
            synchronized (this.f71792a) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "wait for downloading. thread=" + Thread.currentThread().getName() + ",url=" + this.f71796e.f69660b + ",count=" + i10);
                    this.f71792a.wait(1000L);
                } catch (InterruptedException e10) {
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Waiting source data is interrupted!" + e10.toString());
                }
            }
            if (i10 >= 15) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "wait for downloading more than 15s.");
                throw new j("Error reading source " + i10 + " times");
            }
        }
        int iA = this.f71793b.a(bArr, j10);
        if (iA <= 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "read end, size = ".concat(String.valueOf(iA)));
        }
        return iA;
    }
}
