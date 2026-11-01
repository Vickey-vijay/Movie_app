package u4;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g5.m;
import g5.s;
import g5.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t4.h;
import t4.i;

/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f72658g = new t();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f72659h = new s();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f72660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a[] f72661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f72662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<t4.b> f72663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<t4.b> f72664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f72665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f72666o;

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class a {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f72667w = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f72668x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f72669y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f72670z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<SpannableString> f72671a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f72672b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f72673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f72674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f72676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f72677g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f72678h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f72679i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f72680j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f72681k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f72682l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f72683m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f72684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f72685o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f72686p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f72687q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f72688r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f72689s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f72690t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f72691u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f72692v;

        static {
            int iH = h(0, 0, 0, 0);
            f72668x = iH;
            int iH2 = h(0, 0, 0, 3);
            f72669y = iH2;
            f72670z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        public static int h(int i10, int i11, int i12, int i13) {
            int i14;
            g5.a.c(i10, 0, 4);
            g5.a.c(i11, 0, 4);
            g5.a.c(i12, 0, 4);
            g5.a.c(i13, 0, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = 127;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f72673c = true;
            this.f72674d = z10;
            this.f72681k = z11;
            this.f72675e = i10;
            this.f72676f = z13;
            this.f72677g = i11;
            this.f72678h = i12;
            this.f72679i = i15;
            int i18 = i13 + 1;
            if (this.f72680j != i18) {
                this.f72680j = i18;
                while (true) {
                    if ((!z11 || this.f72671a.size() < this.f72680j) && this.f72671a.size() < 15) {
                        break;
                    } else {
                        this.f72671a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f72683m != i16) {
                this.f72683m = i16;
                int i19 = i16 - 1;
                q(D[i19], f72669y, C[i19], 0, A[i19], B[i19], f72670z[i19]);
            }
            if (i17 == 0 || this.f72684n == i17) {
                return;
            }
            this.f72684n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f72667w, G[i20], f72668x);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f72672b.append(c10);
                return;
            }
            this.f72671a.add(d());
            this.f72672b.clear();
            if (this.f72686p != -1) {
                this.f72686p = 0;
            }
            if (this.f72687q != -1) {
                this.f72687q = 0;
            }
            if (this.f72688r != -1) {
                this.f72688r = 0;
            }
            if (this.f72690t != -1) {
                this.f72690t = 0;
            }
            while (true) {
                if ((!this.f72681k || this.f72671a.size() < this.f72680j) && this.f72671a.size() < 15) {
                    return;
                } else {
                    this.f72671a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f72672b.length();
            if (length > 0) {
                this.f72672b.delete(length - 1, length);
            }
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f72672b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f72686p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f72686p, length, 33);
                }
                if (this.f72687q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f72687q, length, 33);
                }
                if (this.f72688r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f72689s), this.f72688r, length, 33);
                }
                if (this.f72690t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f72691u), this.f72690t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f72671a.clear();
            this.f72672b.clear();
            this.f72686p = -1;
            this.f72687q = -1;
            this.f72688r = -1;
            this.f72690t = -1;
            this.f72692v = 0;
        }

        public boolean i() {
            return this.f72673c;
        }

        public boolean k() {
            return this.f72674d;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f72686p != -1) {
                if (!z10) {
                    this.f72672b.setSpan(new StyleSpan(2), this.f72686p, this.f72672b.length(), 33);
                    this.f72686p = -1;
                }
            } else if (z10) {
                this.f72686p = this.f72672b.length();
            }
            if (this.f72687q == -1) {
                if (z11) {
                    this.f72687q = this.f72672b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f72672b.setSpan(new UnderlineSpan(), this.f72687q, this.f72672b.length(), 33);
                this.f72687q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f72688r != -1 && this.f72689s != i10) {
                this.f72672b.setSpan(new ForegroundColorSpan(this.f72689s), this.f72688r, this.f72672b.length(), 33);
            }
            if (i10 != f72667w) {
                this.f72688r = this.f72672b.length();
                this.f72689s = i10;
            }
            if (this.f72690t != -1 && this.f72691u != i11) {
                this.f72672b.setSpan(new BackgroundColorSpan(this.f72691u), this.f72690t, this.f72672b.length(), 33);
            }
            if (i11 != f72668x) {
                this.f72690t = this.f72672b.length();
                this.f72691u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f72692v != i10) {
                a('\n');
            }
            this.f72692v = i10;
        }

        public void p(boolean z10) {
            this.f72674d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f72685o = i10;
            this.f72682l = i15;
        }

        public a() {
            l();
        }

        public u4.b c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            int i10;
            int i11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z10 = false;
            for (int i12 = 0; i12 < this.f72671a.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f72671a.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i13 = this.f72682l;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalArgumentException("Unexpected justification value: " + this.f72682l);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f72676f) {
                f10 = this.f72678h / 99.0f;
                f11 = this.f72677g / 99.0f;
            } else {
                f10 = this.f72678h / 209.0f;
                f11 = this.f72677g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i14 = this.f72679i;
            if (i14 % 3 == 0) {
                i10 = 0;
            } else if (i14 % 3 == 1) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            if (i14 / 3 == 0) {
                i11 = 0;
            } else if (i14 / 3 == 1) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            if (this.f72685o != f72668x) {
                z10 = true;
            }
            return new u4.b(spannableStringBuilder, alignment2, f13, 0, i10, f12, i11, -3.4028235E38f, z10, this.f72685o, this.f72675e);
        }

        public boolean j() {
            if (i() && (!this.f72671a.isEmpty() || this.f72672b.length() != 0)) {
                return false;
            }
            return true;
        }

        public void l() {
            e();
            this.f72673c = false;
            this.f72674d = false;
            this.f72675e = 4;
            this.f72676f = false;
            this.f72677g = 0;
            this.f72678h = 0;
            this.f72679i = 0;
            this.f72680j = 15;
            this.f72681k = true;
            this.f72682l = 0;
            this.f72683m = 0;
            this.f72684n = 0;
            int i10 = f72668x;
            this.f72685o = i10;
            this.f72689s = f72667w;
            this.f72691u = i10;
        }
    }

    public final void m(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f72659h.q(8);
        } else if (i10 <= 23) {
            this.f72659h.q(16);
        } else if (i10 <= 31) {
            this.f72659h.q(24);
        }
    }

    public final void y() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f72661j[i10].l();
        }
    }

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f72695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f72696d = 0;

        public b(int i10, int i11) {
            this.f72693a = i10;
            this.f72694b = i11;
            this.f72695c = new byte[(i11 * 2) - 1];
        }
    }

    @Override // u4.e
    public t4.e a() {
        List<t4.b> list = this.f72663l;
        this.f72664m = list;
        return new f(list);
    }

    @Override // u4.e
    public void b(h hVar) {
        this.f72658g.J(hVar.f64969c.array(), hVar.f64969c.limit());
        while (this.f72658g.a() >= 3) {
            int iY = this.f72658g.y() & 7;
            int i10 = iY & 3;
            boolean z10 = (iY & 4) == 4;
            byte bY = (byte) this.f72658g.y();
            byte bY2 = (byte) this.f72658g.y();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (bY & 192) >> 6;
                        int i12 = bY & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        b bVar = new b(i11, i12);
                        this.f72665n = bVar;
                        byte[] bArr = bVar.f72695c;
                        int i13 = bVar.f72696d;
                        bVar.f72696d = i13 + 1;
                        bArr[i13] = bY2;
                    } else {
                        g5.a.a(i10 == 2);
                        b bVar2 = this.f72665n;
                        if (bVar2 == null) {
                            m.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = bVar2.f72695c;
                            int i14 = bVar2.f72696d;
                            int i15 = i14 + 1;
                            bArr2[i14] = bY;
                            bVar2.f72696d = i15 + 1;
                            bArr2[i15] = bY2;
                        }
                    }
                    b bVar3 = this.f72665n;
                    if (bVar3.f72696d == (bVar3.f72694b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // u4.e
    public boolean e() {
        return this.f72663l != this.f72664m;
    }

    public final void i() {
        if (this.f72665n == null) {
            return;
        }
        x();
        this.f72665n = null;
    }

    public final List<t4.b> j() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f72661j[i10].j() && this.f72661j[i10].k()) {
                arrayList.add(this.f72661j[i10].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    public final void k(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f72663l = j();
            }
            if (i10 == 8) {
                this.f72662k.b();
                return;
            }
            switch (i10) {
                case 12:
                    y();
                    break;
                case 13:
                    this.f72662k.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        m.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f72659h.q(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        m.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f72659h.q(16);
                    } else {
                        m.h("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void l(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case MRAID_JS_WRITE_FAILED_VALUE:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f72666o != i12) {
                    this.f72666o = i12;
                    this.f72662k = this.f72661j[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f72659h.g()) {
                        this.f72661j[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f72659h.g()) {
                        this.f72661j[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f72659h.g()) {
                        this.f72661j[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f72659h.g()) {
                        a aVar = this.f72661j[8 - i14];
                        aVar.p(!aVar.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f72659h.g()) {
                        this.f72661j[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f72659h.q(8);
                break;
            case 142:
                break;
            case 143:
                y();
                break;
            case 144:
                if (this.f72662k.i()) {
                    t();
                } else {
                    this.f72659h.q(16);
                }
                break;
            case 145:
                if (this.f72662k.i()) {
                    u();
                } else {
                    this.f72659h.q(24);
                }
                break;
            case 146:
                if (this.f72662k.i()) {
                    v();
                } else {
                    this.f72659h.q(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                m.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f72662k.i()) {
                    w();
                } else {
                    this.f72659h.q(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                o(i15);
                if (this.f72666o != i15) {
                    this.f72666o = i15;
                    this.f72662k = this.f72661j[i15];
                }
                break;
        }
    }

    public final void n(int i10) {
        if (i10 <= 135) {
            this.f72659h.q(32);
            return;
        }
        if (i10 <= 143) {
            this.f72659h.q(40);
        } else if (i10 <= 159) {
            this.f72659h.q(2);
            this.f72659h.q(this.f72659h.h(6) * 8);
        }
    }

    public final void o(int i10) {
        a aVar = this.f72661j[i10];
        this.f72659h.q(2);
        boolean zG = this.f72659h.g();
        boolean zG2 = this.f72659h.g();
        boolean zG3 = this.f72659h.g();
        int iH = this.f72659h.h(3);
        boolean zG4 = this.f72659h.g();
        int iH2 = this.f72659h.h(7);
        int iH3 = this.f72659h.h(8);
        int iH4 = this.f72659h.h(4);
        int iH5 = this.f72659h.h(4);
        this.f72659h.q(2);
        int iH6 = this.f72659h.h(6);
        this.f72659h.q(2);
        aVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f72659h.h(3), this.f72659h.h(3));
    }

    public final void p(int i10) {
        if (i10 == 127) {
            this.f72662k.a((char) 9835);
        } else {
            this.f72662k.a((char) (i10 & 255));
        }
    }

    public final void q(int i10) {
        this.f72662k.a((char) (i10 & 255));
    }

    public final void r(int i10) {
        if (i10 == 32) {
            this.f72662k.a(' ');
        }
        if (i10 == 33) {
            this.f72662k.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f72662k.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f72662k.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f72662k.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f72662k.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f72662k.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f72662k.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f72662k.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f72662k.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f72662k.a((char) 9608);
                break;
            case 49:
                this.f72662k.a((char) 8216);
                break;
            case 50:
                this.f72662k.a((char) 8217);
                break;
            case 51:
                this.f72662k.a((char) 8220);
                break;
            case 52:
                this.f72662k.a((char) 8221);
                break;
            case 53:
                this.f72662k.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f72662k.a((char) 8539);
                        break;
                    case 119:
                        this.f72662k.a((char) 8540);
                        break;
                    case 120:
                        this.f72662k.a((char) 8541);
                        break;
                    case 121:
                        this.f72662k.a((char) 8542);
                        break;
                    case 122:
                        this.f72662k.a((char) 9474);
                        break;
                    case 123:
                        this.f72662k.a((char) 9488);
                        break;
                    case 124:
                        this.f72662k.a((char) 9492);
                        break;
                    case 125:
                        this.f72662k.a((char) 9472);
                        break;
                    case 126:
                        this.f72662k.a((char) 9496);
                        break;
                    case 127:
                        this.f72662k.a((char) 9484);
                        break;
                    default:
                        m.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }

    public final void s(int i10) {
        if (i10 == 160) {
            this.f72662k.a((char) 13252);
            return;
        }
        m.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f72662k.a('_');
    }

    public final void t() {
        this.f72662k.m(this.f72659h.h(4), this.f72659h.h(2), this.f72659h.h(2), this.f72659h.g(), this.f72659h.g(), this.f72659h.h(3), this.f72659h.h(3));
    }

    public final void u() {
        int iH = a.h(this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2));
        int iH2 = a.h(this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2));
        this.f72659h.q(2);
        this.f72662k.n(iH, iH2, a.g(this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2)));
    }

    public final void v() {
        this.f72659h.q(4);
        int iH = this.f72659h.h(4);
        this.f72659h.q(2);
        this.f72662k.o(iH, this.f72659h.h(6));
    }

    public final void w() {
        int iH = a.h(this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2));
        int iH2 = this.f72659h.h(2);
        int iG = a.g(this.f72659h.h(2), this.f72659h.h(2), this.f72659h.h(2));
        if (this.f72659h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f72659h.g();
        int iH3 = this.f72659h.h(2);
        int iH4 = this.f72659h.h(2);
        int iH5 = this.f72659h.h(2);
        this.f72659h.q(8);
        this.f72662k.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    public final void x() {
        b bVar = this.f72665n;
        int i10 = bVar.f72696d;
        if (i10 != (bVar.f72694b * 2) - 1) {
            m.h("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f72665n.f72694b * 2) - 1) + ", but current index is " + this.f72665n.f72696d + " (sequence number " + this.f72665n.f72693a + "); ignoring packet");
            return;
        }
        this.f72659h.n(bVar.f72695c, i10);
        int iH = this.f72659h.h(3);
        int iH2 = this.f72659h.h(5);
        if (iH == 7) {
            this.f72659h.q(2);
            iH = this.f72659h.h(6);
            if (iH < 7) {
                m.h("Cea708Decoder", "Invalid extended service number: " + iH);
            }
        }
        if (iH2 == 0) {
            if (iH != 0) {
                m.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (iH != this.f72660i) {
            return;
        }
        boolean z10 = false;
        while (this.f72659h.b() > 0) {
            int iH3 = this.f72659h.h(8);
            if (iH3 == 16) {
                int iH4 = this.f72659h.h(8);
                if (iH4 <= 31) {
                    m(iH4);
                } else {
                    if (iH4 <= 127) {
                        r(iH4);
                    } else if (iH4 <= 159) {
                        n(iH4);
                    } else if (iH4 <= 255) {
                        s(iH4);
                    } else {
                        m.h("Cea708Decoder", "Invalid extended command: " + iH4);
                    }
                    z10 = true;
                }
            } else if (iH3 <= 31) {
                k(iH3);
            } else {
                if (iH3 <= 127) {
                    p(iH3);
                } else if (iH3 <= 159) {
                    l(iH3);
                } else if (iH3 <= 255) {
                    q(iH3);
                } else {
                    m.h("Cea708Decoder", "Invalid base command: " + iH3);
                }
                z10 = true;
            }
        }
        if (z10) {
            this.f72663l = j();
        }
    }

    public c(int i10, @Nullable List<byte[]> list) {
        this.f72660i = i10 == -1 ? 1 : i10;
        this.f72661j = new a[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f72661j[i11] = new a();
        }
        this.f72662k = this.f72661j[0];
        y();
    }

    @Override // u4.e
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ h dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // u4.e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ i dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // u4.e
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void queueInputBuffer(h hVar) throws SubtitleDecoderException {
        super.queueInputBuffer(hVar);
    }

    @Override // u4.e, o3.c
    public void flush() {
        super.flush();
        this.f72663l = null;
        this.f72664m = null;
        this.f72666o = 0;
        this.f72662k = this.f72661j[0];
        y();
        this.f72665n = null;
    }

    @Override // u4.e, o3.c
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // u4.e, t4.f
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }
}
