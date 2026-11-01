package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2463li extends EK {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public EC A00;

    public abstract Pair<C7G[], InterfaceC2464lj[]> A0d(EC ec2, int[][][] iArr, int[] iArr2, C2501mL c2501mL, Timeline timeline) throws C9Y;

    public static int A0Y(C7D[] c7dArr, C2620oH c2620oH, int[] iArr, boolean z10) throws C9Y {
        int length = c7dArr.length;
        int formatSupportLevel = 0;
        int i10 = 1;
        for (int i11 = 0; i11 < bestRendererIndex; i11++) {
            C7D c7d = c7dArr[i11];
            int iMax = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = c7d.AJb(c2620oH.A08(bestFormatSupportLevel));
                iMax = Math.max(iMax, AnonymousClass76.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i11];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (iMax > formatSupportLevel || (iMax == formatSupportLevel && z10 && i10 == 0 && bestRendererIndex3 != 0)) {
                length = i11;
                formatSupportLevel = iMax;
                i10 = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(C7D c7d, C2620oH c2620oH) throws C9Y {
        int[] iArr = new int[c2620oH.A01];
        for (int i10 = 0; i10 < c2620oH.A01; i10++) {
            iArr[i10] = c7d.AJb(c2620oH.A08(i10));
        }
        return iArr;
    }

    public static int[] A0a(C7D[] c7dArr) throws C9Y {
        int[] iArr = new int[c7dArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iAJd = c7dArr[i10].AJd();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i11 = str.charAt(23);
            if (i11 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i10] = iAJd;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final EL A0b(C7D[] c7dArr, C2491mA c2491mA, C2501mL c2501mL, Timeline timeline) throws C9Y {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[c7dArr.length + 1];
        C2620oH[][] c2620oHArr = new C2620oH[c7dArr.length + 1][];
        int[][][] iArr2 = new int[c7dArr.length + 1][][];
        for (int i10 = 0; i10 < c2620oHArr.length; i10++) {
            c2620oHArr[i10] = new C2620oH[c2491mA.A01];
            iArr2[i10] = new int[c2491mA.A01][];
        }
        int[] iArrA0a = A0a(c7dArr);
        for (int i11 = 0; i11 < c2491mA.A01; i11++) {
            C2620oH c2620oHA05 = c2491mA.A05(i11);
            int groupIndex = A0Y(c7dArr, c2620oHA05, iArr, c2620oHA05.A02 == 5);
            if (groupIndex == c7dArr.length) {
                rendererTrackGroupCounts = new int[c2620oHA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(c7dArr[groupIndex], c2620oHA05);
            }
            int i12 = iArr[groupIndex];
            c2620oHArr[groupIndex][i12] = c2620oHA05;
            iArr2[groupIndex][i12] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2491mA[] c2491mAArr = new C2491mA[c7dArr.length];
        String[] strArr = new String[c7dArr.length];
        int[] iArr3 = new int[c7dArr.length];
        int i13 = 0;
        while (true) {
            int length = c7dArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i13 < length) {
                int i14 = iArr[i13];
                c2491mAArr[i13] = new C2491mA((C2620oH[]) AbstractC09664a.A1I(c2620oHArr[i13], i14));
                iArr2[i13] = (int[][]) AbstractC09664a.A1I(iArr2[i13], i14);
                strArr[i13] = c7dArr[i13].getName();
                iArr3[i13] = c7dArr[i13].A9F();
                i13++;
            } else {
                EC ec2 = new EC(strArr, iArr3, c2491mAArr, iArrA0a, iArr2, new C2491mA((C2620oH[]) AbstractC09664a.A1I(c2620oHArr[c7dArr.length], iArr[c7dArr.length])));
                Pair<C7G[], InterfaceC2464lj[]> pairA0d = A0d(ec2, iArr2, iArrA0a, c2501mL, timeline);
                return new EL((C7G[]) pairA0d.first, (InterfaceC2464lj[]) pairA0d.second, EH.A00(ec2, (EE[]) pairA0d.second), ec2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final void A0c(Object obj) {
        this.A00 = (EC) obj;
    }
}
