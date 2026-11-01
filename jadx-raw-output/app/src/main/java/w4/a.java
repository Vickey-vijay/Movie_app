package w4;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g5.k0;
import g5.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import t4.c;
import t4.e;

/* JADX INFO: compiled from: PgsDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f73495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f73496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0775a f73497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Inflater f73498r;

    /* JADX INFO: renamed from: w4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PgsDecoder.java */
    public static final class C0775a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f73499a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f73500b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f73501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f73503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f73504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f73505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f73506h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f73507i;

        public final void e(t tVar, int i10) {
            int iB;
            if (i10 < 4) {
                return;
            }
            tVar.M(3);
            int i11 = i10 - 4;
            if ((tVar.y() & 128) != 0) {
                if (i11 < 7 || (iB = tVar.B()) < 4) {
                    return;
                }
                this.f73506h = tVar.E();
                this.f73507i = tVar.E();
                this.f73499a.H(iB - 4);
                i11 -= 7;
            }
            int iC = this.f73499a.c();
            int iD = this.f73499a.d();
            if (iC >= iD || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iD - iC);
            tVar.h(this.f73499a.f53154a, iC, iMin);
            this.f73499a.L(iC + iMin);
        }

        public void h() {
            this.f73502d = 0;
            this.f73503e = 0;
            this.f73504f = 0;
            this.f73505g = 0;
            this.f73506h = 0;
            this.f73507i = 0;
            this.f73499a.H(0);
            this.f73501c = false;
        }

        @Nullable
        public t4.b d() {
            int iY;
            if (this.f73502d == 0 || this.f73503e == 0 || this.f73506h == 0 || this.f73507i == 0 || this.f73499a.d() == 0 || this.f73499a.c() != this.f73499a.d() || !this.f73501c) {
                return null;
            }
            this.f73499a.L(0);
            int i10 = this.f73506h * this.f73507i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iY2 = this.f73499a.y();
                if (iY2 != 0) {
                    iY = i11 + 1;
                    iArr[i11] = this.f73500b[iY2];
                } else {
                    int iY3 = this.f73499a.y();
                    if (iY3 != 0) {
                        iY = ((iY3 & 64) == 0 ? iY3 & 63 : ((iY3 & 63) << 8) | this.f73499a.y()) + i11;
                        Arrays.fill(iArr, i11, iY, (iY3 & 128) == 0 ? 0 : this.f73500b[this.f73499a.y()]);
                    }
                }
                i11 = iY;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f73506h, this.f73507i, Bitmap.Config.ARGB_8888);
            float f10 = this.f73504f;
            int i12 = this.f73502d;
            float f11 = f10 / i12;
            float f12 = this.f73505g;
            int i13 = this.f73503e;
            return new t4.b(bitmapCreateBitmap, f11, 0, f12 / i13, 0, this.f73506h / i12, this.f73507i / i13);
        }

        public final void f(t tVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f73502d = tVar.E();
            this.f73503e = tVar.E();
            tVar.M(11);
            this.f73504f = tVar.E();
            this.f73505g = tVar.E();
        }

        public final void g(t tVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            tVar.M(2);
            Arrays.fill(this.f73500b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int iY = tVar.y();
                int iY2 = tVar.y();
                int iY3 = tVar.y();
                int iY4 = tVar.y();
                int iY5 = tVar.y();
                double d10 = iY2;
                double d11 = iY3 - 128;
                int i13 = (int) ((1.402d * d11) + d10);
                int i14 = i12;
                double d12 = iY4 - 128;
                this.f73500b[iY] = k0.q((int) (d10 + (d12 * 1.772d)), 0, 255) | (k0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (iY5 << 24) | (k0.q(i13, 0, 255) << 16);
                i12 = i14 + 1;
            }
            this.f73501c = true;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f73495o = new t();
        this.f73496p = new t();
        this.f73497q = new C0775a();
    }

    @Override // t4.c
    public e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f73495o.J(bArr, i10);
        x(this.f73495o);
        this.f73497q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f73495o.a() >= 3) {
            t4.b bVarY = y(this.f73495o, this.f73497q);
            if (bVarY != null) {
                arrayList.add(bVarY);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    @Nullable
    public static t4.b y(t tVar, C0775a c0775a) {
        int iD = tVar.d();
        int iY = tVar.y();
        int iE = tVar.E();
        int iC = tVar.c() + iE;
        t4.b bVarD = null;
        if (iC > iD) {
            tVar.L(iD);
            return null;
        }
        if (iY != 128) {
            switch (iY) {
                case 20:
                    c0775a.g(tVar, iE);
                    break;
                case 21:
                    c0775a.e(tVar, iE);
                    break;
                case 22:
                    c0775a.f(tVar, iE);
                    break;
            }
        } else {
            bVarD = c0775a.d();
            c0775a.h();
        }
        tVar.L(iC);
        return bVarD;
    }

    public final void x(t tVar) {
        if (tVar.a() > 0 && tVar.f() == 120) {
            if (this.f73498r == null) {
                this.f73498r = new Inflater();
            }
            if (k0.d0(tVar, this.f73496p, this.f73498r)) {
                t tVar2 = this.f73496p;
                tVar.J(tVar2.f53154a, tVar2.d());
            }
        }
    }
}
