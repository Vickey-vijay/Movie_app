package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10597p {
    public static byte[] A02;
    public static String[] A03 = {"n0jQ8SeFa80EBLo4BXhwXwPS4Wjubjck", "v64BeMF4Y1fRwWGkqW0btQJWsOcnPY4V", "TgQc", "Ri1mjPnDGJYW0mGh81XgbTSSpeaxgcJq", "RtYQoh190WxakJNXNOvGF0rP0AmdpNRb", "fbDVM5YfIDSRqB6n56hfMufsgfpcQx7k", "HNWTUdzo11zzvmCb4ifQA88FoSPuiiKn", "CiEa"};
    public static final C10597p A04;
    public static final C10597p A05;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Prevent throwing when building the map")
    public static final AbstractC2525mj<Integer, Integer> A06;
    public final int A00;
    public final int[] A01;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        byte[] bArr = {5, 9, 90, 92, 89, 89, 70, 91, 93, 76, 77, 108, 71, 74, 70, 77, 64, 71, 78, 90, 20, 81, 125, 113, 106, 127, 126, 6, 50, 35, 46, 40, 4, 38, 55, 38, 37, 46, 43, 46, 51, 46, 34, 52, 28, ExifInterface.START_CODE, 38, 63, 4, 47, 38, 41, 41, 34, 43, 4, 40, 50, 41, 51, 122, 123, 74, 66, 76, 78, 74, 68, 52, 59, 49, 39, 58, 60, 49, 123, 56, 48, 49, 60, 52, 123, 52, 54, 33, 60, 58, 59, 123, 29, 17, 24, 28, 10, 20, 0, 17, 28, 26, 10, 5, 25, 0, 18, 30, 17, 27, 13, 16, 22, 27, 81, 18, 26, 27, 22, 30, 81, 26, 7, 11, 13, 30, 81, 62, ExifInterface.START_CODE, 59, 54, 48, 32, 47, 51, ExifInterface.START_CODE, 56, 32, 44, 43, 62, 43, 58, 114, 125, 119, 97, 124, 122, 119, 61, 126, 118, 119, 122, 114, 61, 118, 107, 103, 97, 114, 61, 86, 93, 80, 92, 87, 90, 93, 84, 64, 17, 30, 20, 2, 31, 25, 20, 94, 29, 21, 20, 25, 17, 94, 21, 8, 4, 2, 17, 94, 61, 49, 40, 47, 51, 56, 49, 62, 62, 53, 60, 47, 51, 63, 37, 62, 36, 123, 102, 106, 123, 108, 112, 127, 114, 65, 109, 107, 108, 108, 113, 107, 112, 122, 65, 109, 113, 107, 112, 122, 65, 123, 112, 127, 124, 114, 123, 122, 117, 102, 116, 102};
        String[] strArr = A03;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "fFCHGQkYTOkakvUkxnOWQDFO0G2COwX4";
        strArr2[3] = "aKWONvT57JCa0OWG4uWHvxhg88ypYICi";
        A02 = bArr;
    }

    static {
        A06();
        A04 = new C10597p(new int[]{2}, 8);
        A05 = new C10597p(new int[]{2, 5, 6}, 8);
        A06 = new C2523mh().A05(5, 6).A05(17, 6).A05(7, 6).A05(18, 6).A05(6, 8).A05(8, 8).A05(14, 8).A07();
    }

    public C10597p(int[] iArr, int i10) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    public static int A00(int i10) {
        if (AbstractC09664a.A02 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3) {
                i10 = 6;
            } else {
                if (A03[1].charAt(21) == '1') {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[6] = "n1qXVCZQxk2N8nhnGA5Su8h2HHCkXbDi";
                strArr[3] = "3IkXI2X5X2wTbaqU0wEl3DE4dRdq07f0";
                if (i10 == 4) {
                    i10 = 6;
                } else {
                    if (A03[0].charAt(17) == 'h') {
                        throw new RuntimeException();
                    }
                    A03[1] = "tECYq4G9CXONPArggxwQRVOEprBCIxCW";
                    if (i10 == 5) {
                        i10 = 6;
                    }
                }
            }
        }
        if (AbstractC09664a.A02 <= 26 && A05(237, 4, 55).equals(AbstractC09664a.A03) && i10 == 1) {
            i10 = 2;
        }
        return AbstractC09664a.A01(i10);
    }

    public static int A01(int i10, int i11) {
        if (AbstractC09664a.A02 >= 29) {
            return C10587o.A00(i10, i11);
        }
        Integer orDefault = A06.getOrDefault(Integer.valueOf(i10), 0);
        if (A03[1].charAt(21) == '1') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[5] = "4LwyKZxV9xzADs3TG4HwkSSUmTpMdFHu";
        strArr[4] = "TU5gCkHzG3bOz42CgVjxZ9enmRnhlx9h";
        return ((Integer) C3M.A01(orDefault)).intValue();
    }

    public static C10597p A02(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter(A05(68, 36, 113)));
        return A03(context, intent);
    }

    public static C10597p A03(Context context, Intent intent) {
        if (A07() && Settings.Global.getInt(context.getContentResolver(), A05(206, 31, 58), 0) == 1) {
            return A05;
        }
        if (AbstractC09664a.A02 >= 29 && (AbstractC09664a.A18(context) || AbstractC09664a.A17(context))) {
            return new C10597p(C10587o.A01(), 8);
        }
        if (intent == null || intent.getIntExtra(A05(104, 36, 91), 0) == 0) {
            return A04;
        }
        return new C10597p(intent.getIntArrayExtra(A05(140, 29, 55)), intent.getIntExtra(A05(169, 37, 84), 8));
    }

    public static boolean A07() {
        if (AbstractC09664a.A02 >= 17) {
            if (A05(21, 6, 52).equals(AbstractC09664a.A05) || A05(61, 6, 7).equals(AbstractC09664a.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A00;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    public final Pair<Integer, Integer> A09(C2654or c2654or) {
        int encoding;
        int channelCount;
        int iA03 = AbstractC09212h.A03((String) C3M.A01(c2654or.A0W), c2654or.A0R);
        if (!A06.containsKey(Integer.valueOf(iA03))) {
            return null;
        }
        if (iA03 == 18 && !A0A(18)) {
            iA03 = 6;
        } else if (iA03 == 8 && !A0A(8)) {
            iA03 = 7;
        }
        if (!A0A(iA03)) {
            return null;
        }
        int i10 = c2654or.A06;
        String[] strArr = A03;
        String str = strArr[7];
        String str2 = strArr[2];
        int length = str.length();
        int encoding2 = str2.length();
        if (length != encoding2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "4KpokJkqLEvhjIg40C82zBlUQNBiJ4Nh";
        strArr2[3] = "qYsciqDft0GPV223mm2sV4x00h8r6ql4";
        if (i10 == -1 || iA03 == 18) {
            int i11 = c2654or.A0G;
            if (A03[1].charAt(21) != '1') {
                A03[0] = "PeibxLIDNQepcsKrVJzxdcnxdYsUjYYR";
                if (i11 != -1) {
                    encoding = c2654or.A0G;
                } else {
                    encoding = 48000;
                }
            } else {
                String[] strArr3 = A03;
                strArr3[6] = "BgZH8BuYmZ4E43z5yTU6VaJsu5Ivkzql";
                strArr3[3] = "qg4irZvxQMOGKPEC5vFhWWygbOBgLyYA";
                if (i11 != -1) {
                    encoding = c2654or.A0G;
                } else {
                    encoding = 48000;
                }
            }
            channelCount = A01(iA03, encoding);
        } else {
            channelCount = c2654or.A06;
            int encoding3 = this.A00;
            if (channelCount > encoding3) {
                return null;
            }
        }
        int encoding4 = A00(channelCount);
        if (encoding4 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iA03), Integer.valueOf(encoding4));
    }

    public final boolean A0A(int i10) {
        return Arrays.binarySearch(this.A01, i10) >= 0;
    }

    public final boolean A0B(C2654or c2654or) {
        return A09(c2654or) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10597p)) {
            return false;
        }
        C10597p c10597p = (C10597p) obj;
        return Arrays.equals(this.A01, c10597p.A01) && this.A00 == c10597p.A00;
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A05(27, 34, 99) + this.A00 + A05(0, 21, 13) + Arrays.toString(this.A01) + A05(67, 1, 61);
    }
}
