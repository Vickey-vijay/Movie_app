package yads;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes8.dex */
public final class kc2 extends fz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f79385m = new jb2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jb2 f79386n = new jb2();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jc2 f79387o = new jc2();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Inflater f79388p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) {
        char c10;
        boolean z11;
        o20 o20Var;
        jb2 jb2Var;
        int i11;
        int iM;
        boolean z12;
        int i12;
        int i13;
        int iO;
        ?? r10;
        jb2 jb2Var2 = this.f79385m;
        jb2Var2.f78966a = bArr;
        jb2Var2.f78968c = i10;
        ?? r11 = 0;
        jb2Var2.f78967b = 0;
        char c11 = 255;
        if (i10 > 0 && (bArr[0] & 255) == 120) {
            if (this.f79388p == null) {
                this.f79388p = new Inflater();
            }
            if (ib3.a(jb2Var2, this.f79386n, this.f79388p)) {
                jb2 jb2Var3 = this.f79386n;
                byte[] bArr2 = jb2Var3.f78966a;
                int i14 = jb2Var3.f78968c;
                jb2Var2.f78966a = bArr2;
                jb2Var2.f78968c = i14;
                jb2Var2.f78967b = 0;
            }
        }
        jc2 jc2Var = this.f79387o;
        jc2Var.f78981d = 0;
        jc2Var.f78982e = 0;
        jc2Var.f78983f = 0;
        jc2Var.f78984g = 0;
        jc2Var.f78985h = 0;
        jc2Var.f78986i = 0;
        jc2Var.f78978a.c(0);
        jc2Var.f78980c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            jb2 jb2Var4 = this.f79385m;
            int i15 = jb2Var4.f78968c;
            if (i15 - jb2Var4.f78967b < 3) {
                return new lc2(Collections.unmodifiableList(arrayList));
            }
            jc2 jc2Var2 = this.f79387o;
            int iM2 = jb2Var4.m();
            int iR = jb2Var4.r();
            int i16 = jb2Var4.f78967b + iR;
            if (i16 > i15) {
                jb2Var4.e(i15);
                r10 = r11;
                c10 = c11;
                o20Var = null;
            } else {
                int i17 = 128;
                if (iM2 != 128) {
                    switch (iM2) {
                        case 20:
                            jc2Var2.getClass();
                            if (iR % 5 != 2) {
                                c10 = c11;
                            } else {
                                jb2Var4.e(jb2Var4.f78967b + 2);
                                Arrays.fill(jc2Var2.f78979b, (int) r11);
                                int i18 = iR / 5;
                                for (?? r12 = r11; r12 < i18; r12++) {
                                    int iM3 = jb2Var4.m();
                                    int iM4 = jb2Var4.m();
                                    int iM5 = jb2Var4.m();
                                    double d10 = iM4;
                                    double d11 = iM5 - i17;
                                    double dM = jb2Var4.m() - i17;
                                    int[] iArr = jc2Var2.f78979b;
                                    int i19 = ib3.f78556a;
                                    iArr[iM3] = Math.max(0, Math.min((int) ((dM * 1.772d) + d10), 255)) | (jb2Var4.m() << 24) | (Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)) << 16) | (Math.max(0, Math.min((int) ((d10 - (0.34414d * dM)) - (d11 * 0.71414d)), 255)) << 8);
                                    c11 = 255;
                                    i17 = 128;
                                }
                                c10 = c11;
                                jc2Var2.f78980c = true;
                            }
                            break;
                        case 21:
                            jc2Var2.getClass();
                            if (iR >= 4) {
                                jb2Var4.e(jb2Var4.f78967b + 3);
                                int i20 = iR - 4;
                                if (((128 & jb2Var4.m()) != 0 ? 1 : r11) == 0) {
                                    jb2 jb2Var5 = jc2Var2.f78978a;
                                    i12 = jb2Var5.f78967b;
                                    i13 = jb2Var5.f78968c;
                                    if (i12 < i13 && i20 > 0) {
                                        int iMin = Math.min(i20, i13 - i12);
                                        jb2Var4.a(jc2Var2.f78978a.f78966a, i12, iMin);
                                        jc2Var2.f78978a.e(i12 + iMin);
                                    }
                                } else if (i20 >= 7 && (iO = jb2Var4.o()) >= 4) {
                                    jc2Var2.f78985h = jb2Var4.r();
                                    jc2Var2.f78986i = jb2Var4.r();
                                    jc2Var2.f78978a.c(iO - 4);
                                    i20 = iR - 11;
                                    jb2 jb2Var6 = jc2Var2.f78978a;
                                    i12 = jb2Var6.f78967b;
                                    i13 = jb2Var6.f78968c;
                                    if (i12 < i13) {
                                        int iMin2 = Math.min(i20, i13 - i12);
                                        jb2Var4.a(jc2Var2.f78978a.f78966a, i12, iMin2);
                                        jc2Var2.f78978a.e(i12 + iMin2);
                                    }
                                }
                            }
                            c10 = c11;
                            break;
                        case 22:
                            jc2Var2.getClass();
                            if (iR >= 19) {
                                jc2Var2.f78981d = jb2Var4.r();
                                jc2Var2.f78982e = jb2Var4.r();
                                jb2Var4.e(jb2Var4.f78967b + 11);
                                jc2Var2.f78983f = jb2Var4.r();
                                jc2Var2.f78984g = jb2Var4.r();
                            }
                            c10 = c11;
                            break;
                        default:
                            c10 = c11;
                            break;
                    }
                    z12 = false;
                    o20Var = null;
                } else {
                    c10 = c11;
                    if (jc2Var2.f78981d == 0 || jc2Var2.f78982e == 0 || jc2Var2.f78985h == 0 || jc2Var2.f78986i == 0 || (i11 = (jb2Var = jc2Var2.f78978a).f78968c) == 0 || jb2Var.f78967b != i11 || !jc2Var2.f78980c) {
                        z11 = false;
                        o20Var = null;
                    } else {
                        jb2Var.e(0);
                        int i21 = jc2Var2.f78985h * jc2Var2.f78986i;
                        int[] iArr2 = new int[i21];
                        int i22 = 0;
                        while (i22 < i21) {
                            int iM6 = jc2Var2.f78978a.m();
                            if (iM6 != 0) {
                                iM = i22 + 1;
                                iArr2[i22] = jc2Var2.f78979b[iM6];
                            } else {
                                int iM7 = jc2Var2.f78978a.m();
                                if (iM7 != 0) {
                                    iM = ((iM7 & 64) == 0 ? iM7 & 63 : ((iM7 & 63) << 8) | jc2Var2.f78978a.m()) + i22;
                                    Arrays.fill(iArr2, i22, iM, (iM7 & 128) == 0 ? 0 : jc2Var2.f78979b[jc2Var2.f78978a.m()]);
                                }
                            }
                            i22 = iM;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, jc2Var2.f78985h, jc2Var2.f78986i, Bitmap.Config.ARGB_8888);
                        float f10 = jc2Var2.f78983f;
                        float f11 = jc2Var2.f78981d;
                        float f12 = f10 / f11;
                        float f13 = jc2Var2.f78984g;
                        float f14 = jc2Var2.f78982e;
                        o20Var = new o20(null, null, null, bitmapCreateBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, jc2Var2.f78985h / f11, jc2Var2.f78986i / f14, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                        z11 = false;
                    }
                    jc2Var2.f78981d = z11 ? 1 : 0;
                    jc2Var2.f78982e = z11 ? 1 : 0;
                    jc2Var2.f78983f = z11 ? 1 : 0;
                    jc2Var2.f78984g = z11 ? 1 : 0;
                    jc2Var2.f78985h = z11 ? 1 : 0;
                    jc2Var2.f78986i = z11 ? 1 : 0;
                    jc2Var2.f78978a.c(z11 ? 1 : 0);
                    jc2Var2.f78980c = z11;
                    z12 = z11;
                }
                jb2Var4.e(i16);
                r10 = z12;
            }
            if (o20Var != null) {
                arrayList.add(o20Var);
            }
            r11 = r10;
            c11 = c10;
        }
    }
}
