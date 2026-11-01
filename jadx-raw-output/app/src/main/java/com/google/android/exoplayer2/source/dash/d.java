package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import g5.k0;
import g5.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k3.f0;
import k4.h0;
import q3.h;
import q3.u;

/* JADX INFO: compiled from: PlayerEmsgHandler.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e5.b f19537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f19538c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o4.b f19542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19543h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19547l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap<Long, Long> f19541f = new TreeMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f19540e = k0.v(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d4.a f19539d = new d4.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19544i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19545j = -9223372036854775807L;

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public interface b {
        void onDashManifestPublishTimeExpired(long j10);

        void onDashManifestRefreshRequested();
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f19550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f19551b = new f0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c4.c f19552c = new c4.c();

        public c(e5.b bVar) {
            this.f19550a = new h0(bVar, d.this.f19540e.getLooper(), com.google.android.exoplayer2.drm.a.a());
        }

        @Override // q3.u
        public void a(Format format) {
            this.f19550a.a(format);
        }

        @Override // q3.u
        public int b(h hVar, int i10, boolean z10) throws InterruptedException, IOException {
            return this.f19550a.b(hVar, i10, z10);
        }

        @Override // q3.u
        public void c(t tVar, int i10) {
            this.f19550a.c(tVar, i10);
        }

        @Override // q3.u
        public void d(long j10, int i10, int i11, int i12, @Nullable u.a aVar) {
            this.f19550a.d(j10, i10, i11, i12, aVar);
            j();
        }

        @Nullable
        public final c4.c e() {
            this.f19552c.clear();
            if (this.f19550a.K(this.f19551b, this.f19552c, false, false, 0L) != -4) {
                return null;
            }
            this.f19552c.c();
            return this.f19552c;
        }

        public boolean f(long j10) {
            return d.this.i(j10);
        }

        public boolean g(m4.d dVar) {
            return d.this.j(dVar);
        }

        public void h(m4.d dVar) {
            d.this.m(dVar);
        }

        public final void i(long j10, long j11) {
            d.this.f19540e.sendMessage(d.this.f19540e.obtainMessage(1, new a(j10, j11)));
        }

        public final void j() {
            while (this.f19550a.E(false)) {
                c4.c cVarE = e();
                if (cVarE != null) {
                    long j10 = cVarE.f64971e;
                    EventMessage eventMessage = (EventMessage) d.this.f19539d.a(cVarE).c(0);
                    if (d.g(eventMessage.f19274b, eventMessage.f19275c)) {
                        k(j10, eventMessage);
                    }
                }
            }
            this.f19550a.o();
        }

        public void l() {
            this.f19550a.M();
        }

        public final void k(long j10, EventMessage eventMessage) {
            long jE = d.e(eventMessage);
            if (jE == -9223372036854775807L) {
                return;
            }
            i(j10, jE);
        }
    }

    public void n() {
        this.f19547l = true;
        this.f19540e.removeCallbacksAndMessages(null);
    }

    public void p(o4.b bVar) {
        this.f19546k = false;
        this.f19543h = -9223372036854775807L;
        this.f19542g = bVar;
        o();
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19549b;

        public a(long j10, long j11) {
            this.f19548a = j10;
            this.f19549b = j11;
        }
    }

    public static long e(EventMessage eventMessage) {
        try {
            return k0.s0(k0.z(eventMessage.f19278f));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean g(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || ExifInterface.GPS_MEASUREMENT_3D.equals(str2));
    }

    @Nullable
    public final Map.Entry<Long, Long> d(long j10) {
        return this.f19541f.ceilingEntry(Long.valueOf(j10));
    }

    public final void f(long j10, long j11) {
        Long l10 = this.f19541f.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f19541f.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f19541f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    public final void h() {
        long j10 = this.f19545j;
        if (j10 == -9223372036854775807L || j10 != this.f19544i) {
            this.f19546k = true;
            this.f19545j = this.f19544i;
            this.f19538c.onDashManifestRefreshRequested();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f19547l) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        f(aVar.f19548a, aVar.f19549b);
        return true;
    }

    public boolean i(long j10) {
        o4.b bVar = this.f19542g;
        boolean z10 = false;
        if (!bVar.f64997d) {
            return false;
        }
        if (this.f19546k) {
            return true;
        }
        Map.Entry<Long, Long> entryD = d(bVar.f65001h);
        if (entryD != null && entryD.getValue().longValue() < j10) {
            this.f19543h = entryD.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            h();
        }
        return z10;
    }

    public boolean j(m4.d dVar) {
        if (!this.f19542g.f64997d) {
            return false;
        }
        if (this.f19546k) {
            return true;
        }
        long j10 = this.f19544i;
        if (!(j10 != -9223372036854775807L && j10 < dVar.f64046f)) {
            return false;
        }
        h();
        return true;
    }

    public c k() {
        return new c(this.f19537b);
    }

    public final void l() {
        this.f19538c.onDashManifestPublishTimeExpired(this.f19543h);
    }

    public void m(m4.d dVar) {
        long j10 = this.f19544i;
        if (j10 != -9223372036854775807L || dVar.f64047g > j10) {
            this.f19544i = dVar.f64047g;
        }
    }

    public final void o() {
        Iterator<Map.Entry<Long, Long>> it = this.f19541f.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f19542g.f65001h) {
                it.remove();
            }
        }
    }

    public d(o4.b bVar, b bVar2, e5.b bVar3) {
        this.f19542g = bVar;
        this.f19538c = bVar2;
        this.f19537b = bVar3;
    }
}
