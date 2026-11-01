package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import g5.d;
import g5.t;
import java.util.Collections;
import q3.u;

/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends TagPayloadReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f19180e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19183d;

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f19181b) {
            tVar.M(1);
        } else {
            int iY = tVar.y();
            int i10 = (iY >> 4) & 15;
            this.f19183d = i10;
            if (i10 == 2) {
                this.f19179a.a(Format.p(null, "audio/mpeg", null, -1, -1, 1, f19180e[(iY >> 2) & 3], null, null, 0, null));
                this.f19182c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f19179a.a(Format.o(null, i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, -1, null, null, 0, null));
                this.f19182c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f19183d);
            }
            this.f19181b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) throws ParserException {
        if (this.f19183d == 2) {
            int iA = tVar.a();
            this.f19179a.c(tVar, iA);
            this.f19179a.d(j10, 1, iA, 0, null);
            return true;
        }
        int iY = tVar.y();
        if (iY != 0 || this.f19182c) {
            if (this.f19183d == 10 && iY != 1) {
                return false;
            }
            int iA2 = tVar.a();
            this.f19179a.c(tVar, iA2);
            this.f19179a.d(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = tVar.a();
        byte[] bArr = new byte[iA3];
        tVar.h(bArr, 0, iA3);
        Pair<Integer, Integer> pairJ = d.j(bArr);
        this.f19179a.a(Format.p(null, "audio/mp4a-latm", null, -1, -1, ((Integer) pairJ.second).intValue(), ((Integer) pairJ.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.f19182c = true;
        return false;
    }

    public a(u uVar) {
        super(uVar);
    }
}
