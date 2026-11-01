package yads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x93 extends fz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f84508m = new jb2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f84509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f84510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f84511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f84512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f84513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f84514s;

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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

    public x93(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f84510o = bArr[24];
            this.f84511p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f84512q = "Serif".equals(ib3.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f84514s = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f84509n = z10;
            if (z10) {
                this.f84513r = ib3.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10);
                return;
            } else {
                this.f84513r = 0.85f;
                return;
            }
        }
        this.f84510o = 0;
        this.f84511p = -1;
        this.f84512q = "sans-serif";
        this.f84509n = false;
        this.f84513r = 0.85f;
        this.f84514s = -1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) throws t43 {
        String strA;
        int i11;
        int i12;
        jb2 jb2Var = this.f84508m;
        jb2Var.f78966a = bArr;
        jb2Var.f78968c = i10;
        int i13 = 0;
        jb2Var.f78967b = 0;
        int i14 = 2;
        if (i10 >= 2) {
            int iR = jb2Var.r();
            int i15 = 8;
            if (iR == 0) {
                strA = "";
            } else {
                int i16 = jb2Var.f78968c;
                int i17 = jb2Var.f78967b;
                if (i16 - i17 >= 2) {
                    byte[] bArr2 = jb2Var.f78966a;
                    char c10 = (char) ((bArr2[i17 + 1] & 255) | ((bArr2[i17] & 255) << 8));
                    if (c10 == 65279 || c10 == 65534) {
                        strA = jb2Var.a(iR, bu.f75966e);
                    } else {
                        strA = jb2Var.a(iR, bu.f75964c);
                    }
                } else {
                    strA = jb2Var.a(iR, bu.f75964c);
                }
            }
            if (strA.isEmpty()) {
                return y93.f84867c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
            a(spannableStringBuilder, this.f84510o, 0, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
            int i18 = this.f84511p;
            int length = spannableStringBuilder.length();
            if (i18 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i18 >>> 8) | ((i18 & 255) << 24)), 0, length, 16711713);
            }
            String str = this.f84512q;
            int length2 = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float fMax = this.f84513r;
            while (true) {
                jb2 jb2Var2 = this.f84508m;
                int i19 = jb2Var2.f78968c;
                int i20 = jb2Var2.f78967b;
                if (i19 - i20 >= i15) {
                    int iB = jb2Var2.b();
                    int iB2 = this.f84508m.b();
                    if (iB2 == 1937013100) {
                        jb2 jb2Var3 = this.f84508m;
                        if (jb2Var3.f78968c - jb2Var3.f78967b >= i14) {
                            int iR2 = jb2Var3.r();
                            int i21 = i13;
                            while (i21 < iR2) {
                                jb2 jb2Var4 = this.f84508m;
                                if (jb2Var4.f78968c - jb2Var4.f78967b >= 12) {
                                    int iR3 = jb2Var4.r();
                                    int iR4 = jb2Var4.r();
                                    jb2Var4.e(jb2Var4.f78967b + i14);
                                    int iM = jb2Var4.m();
                                    jb2Var4.e(jb2Var4.f78967b + 1);
                                    int iB3 = jb2Var4.b();
                                    if (iR4 > spannableStringBuilder.length()) {
                                        ih1.d("Tx3gDecoder", "Truncating styl end (" + iR4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                                        iR4 = spannableStringBuilder.length();
                                    }
                                    int i22 = iR4;
                                    if (iR3 >= i22) {
                                        ih1.d("Tx3gDecoder", "Ignoring styl with start (" + iR3 + ") >= end (" + i22 + ").");
                                        i12 = i21;
                                        i11 = iR2;
                                    } else {
                                        i11 = iR2;
                                        i12 = i21;
                                        a(spannableStringBuilder, iM, this.f84510o, iR3, i22, 0);
                                        if (iB3 != this.f84511p) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((iB3 >>> 8) | ((iB3 & 255) << 24)), iR3, i22, 33);
                                        }
                                    }
                                    i21 = i12 + 1;
                                    iR2 = i11;
                                    i14 = 2;
                                } else {
                                    throw new t43("Unexpected subtitle format.");
                                }
                            }
                        } else {
                            throw new t43("Unexpected subtitle format.");
                        }
                    } else if (iB2 == 1952608120 && this.f84509n) {
                        jb2 jb2Var5 = this.f84508m;
                        i14 = 2;
                        if (jb2Var5.f78968c - jb2Var5.f78967b >= 2) {
                            float fR = jb2Var5.r() / this.f84514s;
                            int i23 = ib3.f78556a;
                            fMax = Math.max(0.0f, Math.min(fR, 0.95f));
                        } else {
                            throw new t43("Unexpected subtitle format.");
                        }
                    } else {
                        i14 = 2;
                    }
                    this.f84508m.e(i20 + iB);
                    i13 = 0;
                    i15 = 8;
                } else {
                    return new y93(new o20(spannableStringBuilder, null, null, null, fMax, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f));
                }
            }
        } else {
            throw new t43("Unexpected subtitle format.");
        }
    }
}
