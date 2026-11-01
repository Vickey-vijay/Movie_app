package sg.bigo.ads.common.utils;

import android.os.SystemClock;
import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: loaded from: classes9.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f70030a = new r() { // from class: sg.bigo.ads.common.utils.r.1
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 1000;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f70031b = new r() { // from class: sg.bigo.ads.common.utils.r.2
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 60000;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f70032c = new r() { // from class: sg.bigo.ads.common.utils.r.3
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 3600000;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f70033d = new r() { // from class: sg.bigo.ads.common.utils.r.4
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * SignalManager.TWENTY_FOUR_HOURS_MILLIS;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f70034e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f70035f = 1619452800;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f70036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f70037b = SystemClock.elapsedRealtime();

        public a(long j10) {
            this.f70036a = j10;
        }

        public final long a() {
            return this.f70036a + (SystemClock.elapsedRealtime() - this.f70037b);
        }
    }

    private r() {
    }

    public /* synthetic */ r(byte b10) {
        this();
    }

    public static long a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - sg.bigo.ads.common.x.a.e();
        if (jCurrentTimeMillis > 0) {
            return jCurrentTimeMillis;
        }
        sg.bigo.ads.common.x.a.f();
        return System.currentTimeMillis();
    }

    public static void a(long j10) {
        if (j10 < f70035f) {
            return;
        }
        a aVar = new a(j10 * 1000);
        if (f70034e == null) {
            f70034e = aVar;
        } else if (aVar.a() > f70034e.a()) {
            f70034e = aVar;
        }
    }

    public static long b() {
        a aVar = f70034e;
        return aVar == null ? System.currentTimeMillis() : aVar.a();
    }

    public long a(int i10) {
        return i10;
    }
}
