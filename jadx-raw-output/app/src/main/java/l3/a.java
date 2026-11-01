package l3;

import android.view.Surface;
import androidx.annotation.Nullable;
import c4.d;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import e5.c;
import h5.i;
import h5.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k3.l0;
import k3.n0;
import k3.v0;
import k4.b0;
import k4.r;
import m3.e;
import p3.f;

/* JADX INFO: compiled from: AnalyticsCollector.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements n0.b, d, com.google.android.exoplayer2.audio.a, q, b0, c.a, f, i, e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.c f63395c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0 f63398f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet<l3.b> f63394b = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f63397e = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0.c f63396d = new v0.c();

    /* JADX INFO: compiled from: AnalyticsCollector.java */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public C0571a f63405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public C0571a f63406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public C0571a f63407f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f63409h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<C0571a> f63402a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<r.a, C0571a> f63403b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v0.b f63404c = new v0.b();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public v0 f63408g = v0.f62325a;

        public void l() {
            this.f63409h = false;
            this.f63406e = this.f63405d;
        }

        public void m() {
            this.f63409h = true;
        }

        public void n(v0 v0Var) {
            for (int i10 = 0; i10 < this.f63402a.size(); i10++) {
                C0571a c0571aP = p(this.f63402a.get(i10), v0Var);
                this.f63402a.set(i10, c0571aP);
                this.f63403b.put(c0571aP.f63399a, c0571aP);
            }
            C0571a c0571a = this.f63407f;
            if (c0571a != null) {
                this.f63407f = p(c0571a, v0Var);
            }
            this.f63408g = v0Var;
            this.f63406e = this.f63405d;
        }

        @Nullable
        public C0571a o(int i10) {
            C0571a c0571a = null;
            for (int i11 = 0; i11 < this.f63402a.size(); i11++) {
                C0571a c0571a2 = this.f63402a.get(i11);
                int iB = this.f63408g.b(c0571a2.f63399a.f62602a);
                if (iB != -1 && this.f63408g.f(iB, this.f63404c).f62328c == i10) {
                    if (c0571a != null) {
                        return null;
                    }
                    c0571a = c0571a2;
                }
            }
            return c0571a;
        }

        @Nullable
        public C0571a b() {
            return this.f63406e;
        }

        @Nullable
        public C0571a c() {
            if (this.f63402a.isEmpty()) {
                return null;
            }
            ArrayList<C0571a> arrayList = this.f63402a;
            return arrayList.get(arrayList.size() - 1);
        }

        @Nullable
        public C0571a d(r.a aVar) {
            return this.f63403b.get(aVar);
        }

        @Nullable
        public C0571a e() {
            if (this.f63402a.isEmpty() || this.f63408g.q() || this.f63409h) {
                return null;
            }
            return this.f63402a.get(0);
        }

        @Nullable
        public C0571a f() {
            return this.f63407f;
        }

        public boolean g() {
            return this.f63409h;
        }

        public void h(int i10, r.a aVar) {
            int iB = this.f63408g.b(aVar.f62602a);
            boolean z10 = iB != -1;
            v0 v0Var = z10 ? this.f63408g : v0.f62325a;
            if (z10) {
                i10 = this.f63408g.f(iB, this.f63404c).f62328c;
            }
            C0571a c0571a = new C0571a(aVar, v0Var, i10);
            this.f63402a.add(c0571a);
            this.f63403b.put(aVar, c0571a);
            this.f63405d = this.f63402a.get(0);
            if (this.f63402a.size() != 1 || this.f63408g.q()) {
                return;
            }
            this.f63406e = this.f63405d;
        }

        public boolean i(r.a aVar) {
            C0571a c0571aRemove = this.f63403b.remove(aVar);
            if (c0571aRemove == null) {
                return false;
            }
            this.f63402a.remove(c0571aRemove);
            C0571a c0571a = this.f63407f;
            if (c0571a != null && aVar.equals(c0571a.f63399a)) {
                this.f63407f = this.f63402a.isEmpty() ? null : this.f63402a.get(0);
            }
            if (this.f63402a.isEmpty()) {
                return true;
            }
            this.f63405d = this.f63402a.get(0);
            return true;
        }

        public void j(int i10) {
            this.f63406e = this.f63405d;
        }

        public void k(r.a aVar) {
            this.f63407f = this.f63403b.get(aVar);
        }

        public final C0571a p(C0571a c0571a, v0 v0Var) {
            int iB = v0Var.b(c0571a.f63399a.f62602a);
            if (iB == -1) {
                return c0571a;
            }
            return new C0571a(c0571a.f63399a, v0Var, v0Var.f(iB, this.f63404c).f62328c);
        }
    }

    @Override // h5.i
    public final void onRenderedFirstFrame() {
    }

    @Override // h5.q
    public final void onRenderedFirstFrame(@Nullable Surface surface) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().j(aVarE, surface);
        }
    }

    /* JADX INFO: renamed from: l3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnalyticsCollector.java */
    public static final class C0571a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r.a f63399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f63400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63401c;

        public C0571a(r.a aVar, v0 v0Var, int i10) {
            this.f63399a = aVar;
            this.f63400b = v0Var;
            this.f63401c = i10;
        }
    }

    public final l3.b.a A() {
        return z(this.f63397e.b());
    }

    public final l3.b.a B() {
        return z(this.f63397e.c());
    }

    public final l3.b.a C(int i10, @Nullable r.a aVar) {
        g5.a.e(this.f63398f);
        if (aVar != null) {
            C0571a c0571aD = this.f63397e.d(aVar);
            return c0571aD != null ? z(c0571aD) : y(v0.f62325a, i10, aVar);
        }
        v0 currentTimeline = this.f63398f.getCurrentTimeline();
        if (!(i10 < currentTimeline.p())) {
            currentTimeline = v0.f62325a;
        }
        return y(currentTimeline, i10, null);
    }

    public final l3.b.a D() {
        return z(this.f63397e.e());
    }

    public final l3.b.a E() {
        return z(this.f63397e.f());
    }

    public final void F() {
        if (this.f63397e.g()) {
            return;
        }
        l3.b.a aVarD = D();
        this.f63397e.m();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().v(aVarD);
        }
    }

    public final void G() {
        for (C0571a c0571a : new ArrayList(this.f63397e.f63402a)) {
            w(c0571a.f63401c, c0571a.f63399a);
        }
    }

    public void H(n0 n0Var) {
        g5.a.f(this.f63398f == null || this.f63397e.f63402a.isEmpty());
        this.f63398f = (n0) g5.a.e(n0Var);
    }

    @Override // k4.b0
    public final void f(int i10, r.a aVar) {
        this.f63397e.h(i10, aVar);
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().E(aVarC);
        }
    }

    @Override // k3.n0.b
    public final void g(v0 v0Var, int i10) {
        this.f63397e.n(v0Var);
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().i(aVarD, i10);
        }
    }

    @Override // k4.b0
    public final void n(int i10, r.a aVar) {
        this.f63397e.k(aVar);
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().c(aVarC);
        }
    }

    @Override // k3.n0.b
    public final void onPositionDiscontinuity(int i10) {
        this.f63397e.j(i10);
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().u(aVarD, i10);
        }
    }

    @Override // k3.n0.b
    public final void onSeekProcessed() {
        if (this.f63397e.g()) {
            this.f63397e.l();
            l3.b.a aVarD = D();
            Iterator<l3.b> it = this.f63394b.iterator();
            while (it.hasNext()) {
                it.next().N(aVarD);
            }
        }
    }

    public void x(l3.b bVar) {
        this.f63394b.add(bVar);
    }

    public final l3.b.a z(@Nullable C0571a c0571a) {
        g5.a.e(this.f63398f);
        if (c0571a == null) {
            int currentWindowIndex = this.f63398f.getCurrentWindowIndex();
            C0571a c0571aO = this.f63397e.o(currentWindowIndex);
            if (c0571aO == null) {
                v0 currentTimeline = this.f63398f.getCurrentTimeline();
                if (!(currentWindowIndex < currentTimeline.p())) {
                    currentTimeline = v0.f62325a;
                }
                return y(currentTimeline, currentWindowIndex, null);
            }
            c0571a = c0571aO;
        }
        return y(c0571a.f63400b, c0571a.f63401c, c0571a.f63399a);
    }

    public a(g5.c cVar) {
        this.f63395c = (g5.c) g5.a.e(cVar);
    }

    @Override // k3.n0.b
    public final void a(l0 l0Var) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().z(aVarD, l0Var);
        }
    }

    @Override // k3.n0.b
    public final void b(ExoPlaybackException exoPlaybackException) {
        l3.b.a aVarA = A();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().C(aVarA, exoPlaybackException);
        }
    }

    @Override // k3.n0.b
    public final void c(TrackGroupArray trackGroupArray, c5.c cVar) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().G(aVarD, trackGroupArray, cVar);
        }
    }

    @Override // k4.b0
    public final void d(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().y(aVarC, bVar, cVar);
        }
    }

    @Override // k4.b0
    public final void e(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().K(aVarC, bVar, cVar);
        }
    }

    @Override // k4.b0
    public final void h(int i10, @Nullable r.a aVar, b0.c cVar) {
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().d(aVarC, cVar);
        }
    }

    @Override // p3.f
    public final void i() {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().x(aVarE);
        }
    }

    @Override // k4.b0
    public final void j(int i10, @Nullable r.a aVar, b0.c cVar) {
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().t(aVarC, cVar);
        }
    }

    @Override // p3.f
    public final void k() {
        l3.b.a aVarA = A();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().M(aVarA);
        }
    }

    @Override // k4.b0
    public final void l(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar) {
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().h(aVarC, bVar, cVar);
        }
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void m(o3.d dVar) {
        l3.b.a aVarA = A();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().e(aVarA, 1, dVar);
        }
    }

    @Override // c4.d
    public final void o(Metadata metadata) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().I(aVarD, metadata);
        }
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void onAudioDecoderInitialized(String str, long j10, long j11) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().B(aVarE, 1, str, j11);
        }
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void onAudioSessionId(int i10) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().k(aVarE, i10);
        }
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void onAudioSinkUnderrun(int i10, long j10, long j11) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().g(aVarE, i10, j10, j11);
        }
    }

    @Override // e5.c.a
    public final void onBandwidthSample(int i10, long j10, long j11) {
        l3.b.a aVarB = B();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().o(aVarB, i10, j10, j11);
        }
    }

    @Override // p3.f
    public final void onDrmKeysLoaded() {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().s(aVarE);
        }
    }

    @Override // p3.f
    public final void onDrmKeysRestored() {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().q(aVarE);
        }
    }

    @Override // p3.f
    public final void onDrmSessionManagerError(Exception exc) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().H(aVarE, exc);
        }
    }

    @Override // h5.q
    public final void onDroppedFrames(int i10, long j10) {
        l3.b.a aVarA = A();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().F(aVarA, i10, j10);
        }
    }

    @Override // k3.n0.b
    public void onIsPlayingChanged(boolean z10) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().r(aVarD, z10);
        }
    }

    @Override // k3.n0.b
    public final void onLoadingChanged(boolean z10) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().m(aVarD, z10);
        }
    }

    @Override // k3.n0.b
    public void onPlaybackSuppressionReasonChanged(int i10) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().p(aVarD, i10);
        }
    }

    @Override // k3.n0.b
    public final void onPlayerStateChanged(boolean z10, int i10) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().f(aVarD, z10, i10);
        }
    }

    @Override // k3.n0.b
    public final void onRepeatModeChanged(int i10) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().L(aVarD, i10);
        }
    }

    @Override // k3.n0.b
    public final void onShuffleModeEnabledChanged(boolean z10) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().n(aVarD, z10);
        }
    }

    @Override // h5.i
    public void onSurfaceSizeChanged(int i10, int i11) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().w(aVarE, i10, i11);
        }
    }

    @Override // h5.q
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().B(aVarE, 2, str, j11);
        }
    }

    @Override // h5.q
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().A(aVarE, i10, i11, i12, f10);
        }
    }

    @Override // m3.e
    public void onVolumeChanged(float f10) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().b(aVarE, f10);
        }
    }

    @Override // h5.q
    public final void p(o3.d dVar) {
        l3.b.a aVarA = A();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().e(aVarA, 2, dVar);
        }
    }

    @Override // h5.q
    public final void q(o3.d dVar) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().D(aVarD, 2, dVar);
        }
    }

    @Override // h5.q
    public final void r(Format format) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().l(aVarE, 2, format);
        }
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void s(o3.d dVar) {
        l3.b.a aVarD = D();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().D(aVarD, 1, dVar);
        }
    }

    @Override // k4.b0
    public final void u(int i10, @Nullable r.a aVar, b0.b bVar, b0.c cVar, IOException iOException, boolean z10) {
        l3.b.a aVarC = C(i10, aVar);
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().J(aVarC, bVar, cVar, iOException, z10);
        }
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void v(Format format) {
        l3.b.a aVarE = E();
        Iterator<l3.b> it = this.f63394b.iterator();
        while (it.hasNext()) {
            it.next().l(aVarE, 1, format);
        }
    }

    @Override // k4.b0
    public final void w(int i10, r.a aVar) {
        l3.b.a aVarC = C(i10, aVar);
        if (this.f63397e.i(aVar)) {
            Iterator<l3.b> it = this.f63394b.iterator();
            while (it.hasNext()) {
                it.next().a(aVarC);
            }
        }
    }

    public l3.b.a y(v0 v0Var, int i10, @Nullable r.a aVar) {
        boolean z10;
        if (v0Var.q()) {
            aVar = null;
        }
        r.a aVar2 = aVar;
        long jElapsedRealtime = this.f63395c.elapsedRealtime();
        boolean z11 = true;
        if (v0Var == this.f63398f.getCurrentTimeline() && i10 == this.f63398f.getCurrentWindowIndex()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long jA = 0;
        if (aVar2 != null && aVar2.b()) {
            if (!z10 || this.f63398f.getCurrentAdGroupIndex() != aVar2.f62603b || this.f63398f.getCurrentAdIndexInAdGroup() != aVar2.f62604c) {
                z11 = false;
            }
            if (z11) {
                jA = this.f63398f.getCurrentPosition();
            }
        } else if (z10) {
            jA = this.f63398f.getContentPosition();
        } else if (!v0Var.q()) {
            jA = v0Var.n(i10, this.f63396d).a();
        }
        return new l3.b.a(jElapsedRealtime, v0Var, i10, aVar2, jA, this.f63398f.getCurrentPosition(), this.f63398f.getTotalBufferedDuration());
    }
}
