package yads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dn3 {
    public static an3 a(jb2 jb2Var, boolean z10, boolean z11) throws ob2 {
        if (z10) {
            a(3, jb2Var, false);
        }
        jb2Var.a((int) jb2Var.g(), bu.f75964c);
        long jG = jb2Var.g();
        String[] strArr = new String[(int) jG];
        for (int i10 = 0; i10 < jG; i10++) {
            strArr[i10] = jb2Var.a((int) jb2Var.g(), bu.f75964c);
        }
        if (z11 && (jb2Var.m() & 1) == 0) {
            throw new ob2("framing bit expected to be set", null, true, 1);
        }
        return new an3(strArr);
    }

    public static cn3 a(jb2 jb2Var) throws ob2 {
        a(1, jb2Var, false);
        int iD = jb2Var.d();
        if (iD >= 0) {
            int iM = jb2Var.m();
            int iD2 = jb2Var.d();
            if (iD2 >= 0) {
                int iD3 = jb2Var.d();
                int i10 = iD3 <= 0 ? -1 : iD3;
                int iD4 = jb2Var.d();
                int i11 = iD4 <= 0 ? -1 : iD4;
                jb2Var.d();
                int iM2 = jb2Var.m();
                int iPow = (int) Math.pow(2.0d, iM2 & 15);
                int iPow2 = (int) Math.pow(2.0d, (iM2 & 240) >> 4);
                jb2Var.m();
                return new cn3(iM, iD2, i10, i11, iPow, iPow2, Arrays.copyOf(jb2Var.f78966a, jb2Var.f78968c));
            }
            throw new IllegalStateException(mg2.a("Top bit not zero: ", iD2));
        }
        throw new IllegalStateException(mg2.a("Top bit not zero: ", iD));
    }

    public static boolean a(int i10, jb2 jb2Var, boolean z10) throws ob2 {
        if (jb2Var.f78968c - jb2Var.f78967b < 7) {
            if (z10) {
                return false;
            }
            throw new ob2("too short header: " + (jb2Var.f78968c - jb2Var.f78967b), null, true, 1);
        }
        if (jb2Var.m() != i10) {
            if (z10) {
                return false;
            }
            throw new ob2("expected header type " + Integer.toHexString(i10), null, true, 1);
        }
        if (jb2Var.m() == 118 && jb2Var.m() == 111 && jb2Var.m() == 114 && jb2Var.m() == 98 && jb2Var.m() == 105 && jb2Var.m() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw new ob2("expected characters 'vorbis'", null, true, 1);
    }

    public static ts1 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = ib3.f78556a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                ih1.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    jb2 jb2Var = new jb2(Base64.decode(strArrSplit[1], 0));
                    int iB = jb2Var.b();
                    String strA = jb2Var.a(jb2Var.b(), bu.f75962a);
                    String strA2 = jb2Var.a(jb2Var.b(), bu.f75964c);
                    int iB2 = jb2Var.b();
                    int iB3 = jb2Var.b();
                    int iB4 = jb2Var.b();
                    int iB5 = jb2Var.b();
                    int iB6 = jb2Var.b();
                    byte[] bArr = new byte[iB6];
                    jb2Var.a(bArr, 0, iB6);
                    arrayList.add(new ad2(iB, strA, strA2, iB2, iB3, iB4, iB5, bArr));
                } catch (RuntimeException e10) {
                    ih1.d("VorbisUtil", ih1.a("Failed to parse vorbis picture", e10));
                }
            } else {
                arrayList.add(new wm3(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ts1(arrayList);
    }
}
