package l3;

import android.view.Surface;
import androidx.annotation.Nullable;
import c5.c;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import k3.l0;
import k3.v0;
import k4.b0;
import k4.r;
import o3.d;

/* JADX INFO: compiled from: AnalyticsListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface b {
    default void A(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void B(a aVar, int i10, String str, long j10) {
    }

    default void C(a aVar, ExoPlaybackException exoPlaybackException) {
    }

    default void D(a aVar, int i10, d dVar) {
    }

    default void E(a aVar) {
    }

    default void F(a aVar, int i10, long j10) {
    }

    default void G(a aVar, TrackGroupArray trackGroupArray, c cVar) {
    }

    default void H(a aVar, Exception exc) {
    }

    default void I(a aVar, Metadata metadata) {
    }

    default void J(a aVar, b0.b bVar, b0.c cVar, IOException iOException, boolean z10) {
    }

    default void K(a aVar, b0.b bVar, b0.c cVar) {
    }

    default void L(a aVar, int i10) {
    }

    default void M(a aVar) {
    }

    default void N(a aVar) {
    }

    default void a(a aVar) {
    }

    default void b(a aVar, float f10) {
    }

    default void c(a aVar) {
    }

    default void d(a aVar, b0.c cVar) {
    }

    default void e(a aVar, int i10, d dVar) {
    }

    default void f(a aVar, boolean z10, int i10) {
    }

    default void g(a aVar, int i10, long j10, long j11) {
    }

    default void h(a aVar, b0.b bVar, b0.c cVar) {
    }

    default void i(a aVar, int i10) {
    }

    default void j(a aVar, @Nullable Surface surface) {
    }

    default void k(a aVar, int i10) {
    }

    default void l(a aVar, int i10, Format format) {
    }

    default void m(a aVar, boolean z10) {
    }

    default void n(a aVar, boolean z10) {
    }

    default void o(a aVar, int i10, long j10, long j11) {
    }

    default void p(a aVar, int i10) {
    }

    default void q(a aVar) {
    }

    default void r(a aVar, boolean z10) {
    }

    default void s(a aVar) {
    }

    default void t(a aVar, b0.c cVar) {
    }

    default void u(a aVar, int i10) {
    }

    default void v(a aVar) {
    }

    default void w(a aVar, int i10, int i11) {
    }

    default void x(a aVar) {
    }

    default void y(a aVar, b0.b bVar, b0.c cVar) {
    }

    default void z(a aVar, l0 l0Var) {
    }

    /* JADX INFO: compiled from: AnalyticsListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f63411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final r.a f63413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f63414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f63415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f63416g;

        public a(long j10, v0 v0Var, int i10, @Nullable r.a aVar, long j11, long j12, long j13) {
            this.f63410a = j10;
            this.f63411b = v0Var;
            this.f63412c = i10;
            this.f63413d = aVar;
            this.f63414e = j11;
            this.f63415f = j12;
            this.f63416g = j13;
        }
    }
}
