package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f84063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f84065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84066d;

    public static w01 a(jb2 jb2Var) throws ob2 {
        try {
            jb2Var.e(jb2Var.f78967b + 21);
            int iM = jb2Var.m() & 3;
            int iM2 = jb2Var.m();
            int i10 = jb2Var.f78967b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iM2; i13++) {
                jb2Var.e(jb2Var.f78967b + 1);
                int iR = jb2Var.r();
                for (int i14 = 0; i14 < iR; i14++) {
                    int iR2 = jb2Var.r();
                    i12 += iR2 + 4;
                    jb2Var.e(jb2Var.f78967b + iR2);
                }
            }
            jb2Var.e(i10);
            byte[] bArr = new byte[i12];
            float f10 = 1.0f;
            String strA = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iM2) {
                int iM3 = jb2Var.m() & 127;
                int iR3 = jb2Var.r();
                int i17 = i11;
                while (i17 < iR3) {
                    int iR4 = jb2Var.r();
                    System.arraycopy(dy1.f76843a, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy(jb2Var.f78966a, jb2Var.f78967b, bArr, i18, iR4);
                    if (iM3 == 33 && i17 == 0) {
                        ay1 ay1VarA = dy1.a(bArr, i18, i18 + iR4);
                        float f11 = ay1VarA.f75661g;
                        strA = jx.a(ay1VarA.f75655a, ay1VarA.f75656b, ay1VarA.f75657c, ay1VarA.f75658d, ay1VarA.f75659e, ay1VarA.f75660f);
                        f10 = f11;
                    }
                    i16 = i18 + iR4;
                    jb2Var.e(jb2Var.f78967b + iR4);
                    i17++;
                    iM2 = iM2;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            return new w01(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iM + 1, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ob2("Error parsing HEVC config", e10, true, 1);
        }
    }

    public w01(List list, int i10, float f10, String str) {
        this.f84063a = list;
        this.f84064b = i10;
        this.f84065c = f10;
        this.f84066d = str;
    }
}
