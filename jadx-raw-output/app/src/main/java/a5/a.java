package a5;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g5.k0;
import g5.t;
import java.nio.charset.Charset;
import java.util.List;
import t4.c;
import t4.e;

/* JADX INFO: compiled from: Tx3gDecoder.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f3481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f3485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f3486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3487u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f3481o = new t();
        if (list == null || list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f3483q = 0;
            this.f3484r = -1;
            this.f3485s = "sans-serif";
            this.f3482p = false;
            this.f3486t = 0.85f;
            return;
        }
        byte[] bArr = list.get(0);
        this.f3483q = bArr[24];
        this.f3484r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f3485s = "Serif".equals(k0.A(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f3487u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f3482p = z10;
        if (!z10) {
            this.f3486t = 0.85f;
            return;
        }
        float f10 = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10;
        this.f3486t = f10;
        this.f3486t = k0.p(f10, 0.0f, 0.95f);
    }

    public static void A(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    public static void B(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i10, int i11, int i12) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, i12 | 33);
        }
    }

    public static void y(boolean z10) throws SubtitleDecoderException {
        if (!z10) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    public static void z(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    @Override // t4.c
    public e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f3481o.J(bArr, i10);
        String strC = C(this.f3481o);
        if (strC.isEmpty()) {
            return b.f3488c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC);
        A(spannableStringBuilder, this.f3483q, 0, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        z(spannableStringBuilder, this.f3484r, -1, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        B(spannableStringBuilder, this.f3485s, "sans-serif", 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        float fP = this.f3486t;
        while (this.f3481o.a() >= 8) {
            int iC = this.f3481o.c();
            int iJ = this.f3481o.j();
            int iJ2 = this.f3481o.j();
            if (iJ2 == 1937013100) {
                y(this.f3481o.a() >= 2);
                int iE = this.f3481o.E();
                for (int i11 = 0; i11 < iE; i11++) {
                    x(this.f3481o, spannableStringBuilder);
                }
            } else if (iJ2 == 1952608120 && this.f3482p) {
                y(this.f3481o.a() >= 2);
                fP = k0.p(this.f3481o.E() / this.f3487u, 0.0f, 0.95f);
            }
            this.f3481o.L(iC + iJ);
        }
        return new b(new t4.b(spannableStringBuilder, null, fP, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
    }

    public static String C(t tVar) throws SubtitleDecoderException {
        boolean z10;
        char cE;
        if (tVar.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        y(z10);
        int iE = tVar.E();
        if (iE == 0) {
            return "";
        }
        if (tVar.a() >= 2 && ((cE = tVar.e()) == 65279 || cE == 65534)) {
            return tVar.w(iE, Charset.forName(C.UTF16_NAME));
        }
        return tVar.w(iE, Charset.forName("UTF-8"));
    }

    public final void x(t tVar, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        boolean z10;
        if (tVar.a() >= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        y(z10);
        int iE = tVar.E();
        int iE2 = tVar.E();
        tVar.M(2);
        int iY = tVar.y();
        tVar.M(1);
        int iJ = tVar.j();
        A(spannableStringBuilder, iY, this.f3483q, iE, iE2, 0);
        z(spannableStringBuilder, iJ, this.f3484r, iE, iE2, 0);
    }
}
