package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import g5.q;
import g5.t;
import q3.u;

/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f19184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f19185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19189g;

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) throws ParserException {
        int iY = tVar.y();
        long jK = j10 + (((long) tVar.k()) * 1000);
        if (iY == 0 && !this.f19187e) {
            t tVar2 = new t(new byte[tVar.a()]);
            tVar.h(tVar2.f53154a, 0, tVar.a());
            h5.a aVarB = h5.a.b(tVar2);
            this.f19186d = aVarB.f53704b;
            this.f19179a.a(Format.B(null, "video/avc", null, -1, -1, aVarB.f53705c, aVarB.f53706d, -1.0f, aVarB.f53703a, -1, aVarB.f53707e, null));
            this.f19187e = true;
            return false;
        }
        if (iY != 1 || !this.f19187e) {
            return false;
        }
        int i10 = this.f19189g == 1 ? 1 : 0;
        if (!this.f19188f && i10 == 0) {
            return false;
        }
        byte[] bArr = this.f19185c.f53154a;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        int i11 = 4 - this.f19186d;
        int i12 = 0;
        while (tVar.a() > 0) {
            tVar.h(this.f19185c.f53154a, i11, this.f19186d);
            this.f19185c.L(0);
            int iC = this.f19185c.C();
            this.f19184b.L(0);
            this.f19179a.c(this.f19184b, 4);
            this.f19179a.c(tVar, iC);
            i12 = i12 + 4 + iC;
        }
        this.f19179a.d(jK, i10, i12, 0, null);
        this.f19188f = true;
        return true;
    }

    public b(u uVar) {
        super(uVar);
        this.f19184b = new t(q.f53130a);
        this.f19185c = new t(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) throws TagPayloadReader.UnsupportedFormatException {
        int iY = tVar.y();
        int i10 = (iY >> 4) & 15;
        int i11 = iY & 15;
        if (i11 == 7) {
            this.f19189g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }
}
