package sg.bigo.ads.common.f;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f69516e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f69517a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f69518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f69519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0703a f69520d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC0703a {
        void a(long j10, long j11);

        void a(boolean z10, long j10, long j11, long j12);
    }

    private a() {
        b();
    }

    public static a a() {
        return f69516e;
    }

    public final void b() {
        this.f69518b = SystemClock.elapsedRealtime();
        this.f69519c = System.currentTimeMillis();
    }

    public final boolean c() {
        return this.f69518b > 0;
    }
}
