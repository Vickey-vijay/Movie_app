package k3;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes8.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f62221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f62222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f62223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Object f62225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f62226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f62228h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f62229i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f62230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f62231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f62233m;

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface a {
        void b(o0 o0Var);
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface b {
        void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException;
    }

    public synchronized boolean a() throws InterruptedException {
        g5.a.f(this.f62230j);
        g5.a.f(this.f62226f.getLooper().getThread() != Thread.currentThread());
        while (!this.f62232l) {
            wait();
        }
        return this.f62231k;
    }

    public synchronized boolean i() {
        return this.f62233m;
    }

    public synchronized void j(boolean z10) {
        this.f62231k = z10 | this.f62231k;
        this.f62232l = true;
        notifyAll();
    }

    public boolean b() {
        return this.f62229i;
    }

    public Handler c() {
        return this.f62226f;
    }

    @Nullable
    public Object d() {
        return this.f62225e;
    }

    public long e() {
        return this.f62228h;
    }

    public b f() {
        return this.f62221a;
    }

    public v0 g() {
        return this.f62223c;
    }

    public int getType() {
        return this.f62224d;
    }

    public int h() {
        return this.f62227g;
    }

    public o0 k() {
        g5.a.f(!this.f62230j);
        if (this.f62228h == -9223372036854775807L) {
            g5.a.a(this.f62229i);
        }
        this.f62230j = true;
        this.f62222b.b(this);
        return this;
    }

    public o0 l(@Nullable Object obj) {
        g5.a.f(!this.f62230j);
        this.f62225e = obj;
        return this;
    }

    public o0 m(int i10) {
        g5.a.f(!this.f62230j);
        this.f62224d = i10;
        return this;
    }

    public o0(a aVar, b bVar, v0 v0Var, int i10, Handler handler) {
        this.f62222b = aVar;
        this.f62221a = bVar;
        this.f62223c = v0Var;
        this.f62226f = handler;
        this.f62227g = i10;
    }
}
