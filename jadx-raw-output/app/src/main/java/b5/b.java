package b5;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g5.k0;
import g5.t;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Mp4WebvttDecoder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends t4.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f4761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e.b f4762p;

    public b() {
        super("Mp4WebvttDecoder");
        this.f4761o = new t();
        this.f4762p = new e.b();
    }

    @Override // t4.c
    public t4.e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f4761o.J(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f4761o.a() > 0) {
            if (this.f4761o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iJ = this.f4761o.j();
            if (this.f4761o.j() == 1987343459) {
                arrayList.add(x(this.f4761o, this.f4762p, iJ - 8));
            } else {
                this.f4761o.M(iJ - 8);
            }
        }
        return new c(arrayList);
    }

    public static t4.b x(t tVar, e.b bVar, int i10) throws SubtitleDecoderException {
        bVar.g();
        while (i10 > 0) {
            if (i10 >= 8) {
                int iJ = tVar.j();
                int iJ2 = tVar.j();
                int i11 = iJ - 8;
                String strA = k0.A(tVar.f53154a, tVar.c(), i11);
                tVar.M(i11);
                i10 = (i10 - 8) - i11;
                if (iJ2 == 1937011815) {
                    f.j(strA, bVar);
                } else if (iJ2 == 1885436268) {
                    f.k(null, strA.trim(), bVar, Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        return bVar.a();
    }
}
