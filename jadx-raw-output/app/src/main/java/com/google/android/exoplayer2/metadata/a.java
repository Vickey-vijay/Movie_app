package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import c4.b;
import c4.c;
import c4.d;
import com.google.android.exoplayer2.Format;
import g5.k0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k3.e;
import k3.f0;
import k3.q0;

/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends e implements Handler.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f19261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f19262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Handler f19263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f19264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Metadata[] f19265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long[] f19266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public c4.a f19269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19271w;

    public a(d dVar, @Nullable Looper looper) {
        this(dVar, looper, b.f5635a);
    }

    @Override // k3.p0
    public boolean isReady() {
        return true;
    }

    public final void x(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Format wrappedMetadataFormat = metadata.c(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f19261m.a(wrappedMetadataFormat)) {
                list.add(metadata.c(i10));
            } else {
                c4.a aVarB = this.f19261m.b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) g5.a.e(metadata.c(i10).getWrappedMetadataBytes());
                this.f19264p.clear();
                this.f19264p.b(bArr.length);
                ((ByteBuffer) k0.i(this.f19264p.f64969c)).put(bArr);
                this.f19264p.c();
                Metadata metadataA = aVarB.a(this.f19264p);
                if (metadataA != null) {
                    x(metadataA, list);
                }
            }
        }
    }

    public a(d dVar, @Nullable Looper looper, b bVar) {
        super(4);
        this.f19262n = (d) g5.a.e(dVar);
        this.f19263o = looper == null ? null : k0.w(looper, this);
        this.f19261m = (b) g5.a.e(bVar);
        this.f19264p = new c();
        this.f19265q = new Metadata[5];
        this.f19266r = new long[5];
    }

    public final void A(Metadata metadata) {
        this.f19262n.o(metadata);
    }

    @Override // k3.q0
    public int a(Format format) {
        if (this.f19261m.a(format)) {
            return q0.create(e.w(null, format.f18973m) ? 4 : 2);
        }
        return q0.create(0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((Metadata) message.obj);
        return true;
    }

    @Override // k3.p0
    public boolean isEnded() {
        return this.f19270v;
    }

    @Override // k3.p0
    public void render(long j10, long j11) {
        if (!this.f19270v && this.f19268t < 5) {
            this.f19264p.clear();
            f0 f0VarI = i();
            int iU = u(f0VarI, this.f19264p, false);
            if (iU == -4) {
                if (this.f19264p.isEndOfStream()) {
                    this.f19270v = true;
                } else if (!this.f19264p.isDecodeOnly()) {
                    c cVar = this.f19264p;
                    cVar.f5636h = this.f19271w;
                    cVar.c();
                    Metadata metadataA = ((c4.a) k0.i(this.f19269u)).a(this.f19264p);
                    if (metadataA != null) {
                        ArrayList arrayList = new ArrayList(metadataA.d());
                        x(metadataA, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i10 = this.f19267s;
                            int i11 = this.f19268t;
                            int i12 = (i10 + i11) % 5;
                            this.f19265q[i12] = metadata;
                            this.f19266r[i12] = this.f19264p.f64971e;
                            this.f19268t = i11 + 1;
                        }
                    }
                }
            } else if (iU == -5) {
                this.f19271w = ((Format) g5.a.e(f0VarI.f62129c)).f18974n;
            }
        }
        if (this.f19268t > 0) {
            long[] jArr = this.f19266r;
            int i13 = this.f19267s;
            if (jArr[i13] <= j10) {
                z((Metadata) k0.i(this.f19265q[i13]));
                Metadata[] metadataArr = this.f19265q;
                int i14 = this.f19267s;
                metadataArr[i14] = null;
                this.f19267s = (i14 + 1) % 5;
                this.f19268t--;
            }
        }
    }

    @Override // k3.e
    public void t(Format[] formatArr, long j10) {
        this.f19269u = this.f19261m.b(formatArr[0]);
    }

    public final void y() {
        Arrays.fill(this.f19265q, (Object) null);
        this.f19267s = 0;
        this.f19268t = 0;
    }

    public final void z(Metadata metadata) {
        Handler handler = this.f19263o;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            A(metadata);
        }
    }

    @Override // k3.e
    public void n() {
        y();
        this.f19269u = null;
    }

    @Override // k3.e
    public void p(long j10, boolean z10) {
        y();
        this.f19270v = false;
    }
}
