package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f83526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f83530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f83531f;

    public static ul a(jb2 jb2Var) throws ob2 {
        float f10;
        String str;
        int i10;
        try {
            jb2Var.e(jb2Var.f78967b + 4);
            int iM = (jb2Var.m() & 3) + 1;
            if (iM == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2 = jb2Var.m() & 31;
            for (int i11 = 0; i11 < iM2; i11++) {
                int iR = jb2Var.r();
                int i12 = jb2Var.f78967b;
                jb2Var.e(i12 + iR);
                byte[] bArr = jb2Var.f78966a;
                byte[] bArr2 = new byte[iR + 4];
                System.arraycopy(jx.f79223a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i12, bArr2, 4, iR);
                arrayList.add(bArr2);
            }
            int iM3 = jb2Var.m();
            for (int i13 = 0; i13 < iM3; i13++) {
                int iR2 = jb2Var.r();
                int i14 = jb2Var.f78967b;
                jb2Var.e(i14 + iR2);
                byte[] bArr3 = jb2Var.f78966a;
                byte[] bArr4 = new byte[iR2 + 4];
                System.arraycopy(jx.f79223a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i14, bArr4, 4, iR2);
                arrayList.add(bArr4);
            }
            int i15 = -1;
            if (iM2 > 0) {
                cy1 cy1VarB = dy1.b((byte[]) arrayList.get(0), iM, ((byte[]) arrayList.get(0)).length);
                int i16 = cy1VarB.f76476e;
                int i17 = cy1VarB.f76477f;
                float f11 = cy1VarB.f76478g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cy1VarB.f76472a), Integer.valueOf(cy1VarB.f76473b), Integer.valueOf(cy1VarB.f76474c));
                i10 = i17;
                f10 = f11;
                i15 = i16;
            } else {
                f10 = 1.0f;
                str = null;
                i10 = -1;
            }
            return new ul(arrayList, iM, i15, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ob2("Error parsing AVC config", e10, true, 1);
        }
    }

    public ul(ArrayList arrayList, int i10, int i11, int i12, float f10, String str) {
        this.f83526a = arrayList;
        this.f83527b = i10;
        this.f83528c = i11;
        this.f83529d = i12;
        this.f83530e = f10;
        this.f83531f = str;
    }
}
