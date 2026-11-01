package b5;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g5.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WebvttDecoder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends t4.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f4802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f4803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e.b f4804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f4805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<d> f4806s;

    public static int x(t tVar) {
        int iC = 0;
        int i10 = -1;
        while (i10 == -1) {
            iC = tVar.c();
            String strL = tVar.l();
            if (strL == null) {
                i10 = 0;
            } else if ("STYLE".equals(strL)) {
                i10 = 2;
            } else {
                i10 = strL.startsWith("NOTE") ? 1 : 3;
            }
        }
        tVar.L(iC);
        return i10;
    }

    public g() {
        super("WebvttDecoder");
        this.f4802o = new f();
        this.f4803p = new t();
        this.f4804q = new e.b();
        this.f4805r = new a();
        this.f4806s = new ArrayList();
    }

    @Override // t4.c
    public t4.e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f4803p.J(bArr, i10);
        this.f4804q.g();
        this.f4806s.clear();
        try {
            h.e(this.f4803p);
            while (!TextUtils.isEmpty(this.f4803p.l())) {
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                int iX = x(this.f4803p);
                if (iX == 0) {
                    return new i(arrayList);
                }
                if (iX == 1) {
                    y(this.f4803p);
                } else if (iX == 2) {
                    if (!arrayList.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f4803p.l();
                    this.f4806s.addAll(this.f4805r.d(this.f4803p));
                } else if (iX == 3 && this.f4802o.h(this.f4803p, this.f4804q, this.f4806s)) {
                    arrayList.add(this.f4804q.a());
                    this.f4804q.g();
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException(e10);
        }
    }

    public static void y(t tVar) {
        while (!TextUtils.isEmpty(tVar.l())) {
        }
    }
}
