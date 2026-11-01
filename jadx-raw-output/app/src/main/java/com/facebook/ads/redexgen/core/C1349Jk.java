package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1349Jk {
    public static byte[] A0D;
    public static String[] A0E = {"GeuvjWmU0qMIecUET3rH1sSpSiCCpV8d", "VWuGBdV", "r1UddSi70yifv9lgmWBFhDm81yvqf6sz", "XTFXH6doUzlPXpn0lOcCpEMXSJ", "Gs3RvICYSdgYtTZ", "LUo1PxiU5xdJ1hZxjmijWXp8gfNxa8cO", "PBxwyL5R7nlTE13P8yY94OOBBe", "AYtcaoWRC0gFrEQm0SEPSBapgfKgyhaj"};
    public List<C1349Jk> A00;
    public final long A01;
    public final long A02;
    public final C1349Jk A03;
    public final C1356Jr A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final HashMap<String, Integer> A0A;
    public final HashMap<String, Integer> A0B;
    public final String[] A0C;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0E[1].length() == 19) {
                throw new RuntimeException();
            }
            A0E[1] = "X7T2v9MzXPQN9wm4iApZn5l";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 80);
            i13++;
        }
    }

    public static void A04() {
        A0D = new byte[]{30, 14, 38, 43, 52, 92, 84, 69, 80, 85, 80, 69, 80, 95};
    }

    static {
        A04();
    }

    public C1349Jk(String str, String str2, long j10, long j11, C1356Jr c1356Jr, String[] strArr, String str3, String str4, C1349Jk c1349Jk) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = c1356Jr;
        this.A0C = strArr;
        this.A09 = str2 != null;
        this.A02 = j10;
        this.A01 = j11;
        this.A06 = (String) C3M.A01(str3);
        this.A03 = c1349Jk;
        this.A0B = new HashMap<>();
        this.A0A = new HashMap<>();
    }

    public static SpannableStringBuilder A00(String str, Map<String, C3C> map) {
        if (!map.containsKey(str)) {
            C3C c3c = new C3C();
            c3c.A0G(new SpannableStringBuilder());
            map.put(str, c3c);
        }
        C3C regionOutput = map.get(str);
        return (SpannableStringBuilder) C3M.A01(regionOutput.A0I());
    }

    public static C1349Jk A01(String str) {
        return new C1349Jk(null, AbstractC1351Jm.A04(str), -9223372036854775807L, -9223372036854775807L, null, null, A03(0, 0, 119), null, null);
    }

    public static C1349Jk A02(String str, long j10, long j11, C1356Jr c1356Jr, String[] strArr, String str2, String str3, C1349Jk c1349Jk) {
        return new C1349Jk(str, null, j10, j11, c1356Jr, strArr, str2, str3, c1349Jk);
    }

    private void A05(long j10, String str, List<Pair<String, String>> regionImageList) {
        if (!A03(0, 0, 119).equals(this.A06)) {
            str = this.A06;
        }
        if (A0B(j10)) {
            String strA03 = A03(2, 3, 18);
            String resolvedRegionId = this.A07;
            if (strA03.equals(resolvedRegionId)) {
                String resolvedRegionId2 = this.A05;
                if (resolvedRegionId2 != null) {
                    regionImageList.add(new Pair<>(str, this.A05));
                    return;
                }
            }
        }
        for (int i10 = 0; i10 < A0C(); i10++) {
            A0D(i10).A05(j10, str, regionImageList);
        }
    }

    private void A06(long j10, Map<String, C1356Jr> map, Map<String, C1350Jl> map2, String str, Map<String, C3C> map3) {
        int end;
        String str2 = str;
        if (A0B(j10)) {
            if (!A03(0, 0, 119).equals(this.A06)) {
                str2 = this.A06;
            }
            for (Map.Entry<String, Integer> entry : this.A0A.entrySet()) {
                String key = entry.getKey();
                if (this.A0B.containsKey(key)) {
                    end = this.A0B.get(key).intValue();
                } else {
                    end = 0;
                }
                int iIntValue = entry.getValue().intValue();
                if (end != iIntValue) {
                    A09(map, (C3C) C3M.A01(map3.get(key)), end, iIntValue, ((C1350Jl) C3M.A01(map2.get(str2))).A08);
                }
            }
            for (int i10 = 0; i10 < i; i10++) {
                A0D(i10).A06(j10, map, map2, str2, map3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    private void A07(long j10, boolean z10, String str, Map<String, C3C> map) {
        boolean z11;
        String str2 = str;
        this.A0B.clear();
        this.A0A.clear();
        if (A03(5, 8, 97).equals(this.A07)) {
            return;
        }
        if (!A03(0, 0, 119).equals(this.A06)) {
            str2 = this.A06;
        }
        if (this.A09 && z10) {
            SpannableStringBuilder spannableStringBuilderA00 = A00(str2, map);
            String resolvedRegionId = this.A08;
            spannableStringBuilderA00.append((CharSequence) C3M.A01(resolvedRegionId));
            return;
        }
        String strA03 = A03(0, 2, 44);
        String resolvedRegionId2 = this.A07;
        if (strA03.equals(resolvedRegionId2) && z10) {
            SpannableStringBuilder spannableStringBuilderA01 = A00(str2, map);
            String[] strArr = A0E;
            if (strArr[0].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "DvePMvlINfUrHf8oCshP3y2zgWJgm1y9";
            strArr2[7] = "g33vhajkRJhloC0qEKLO4Zm1g9rQEkrd";
            spannableStringBuilderA01.append('\n');
            return;
        }
        if (!A0B(j10)) {
            return;
        }
        for (Map.Entry<String, C3C> entry : map.entrySet()) {
            this.A0B.put(entry.getKey(), Integer.valueOf(((CharSequence) C3M.A01(entry.getValue().A0I())).length()));
        }
        String strA04 = A03(13, 1, 127);
        String resolvedRegionId3 = this.A07;
        boolean zEquals = strA04.equals(resolvedRegionId3);
        for (int i10 = 0; i10 < A0C(); i10++) {
            C1349Jk c1349JkA0D = A0D(i10);
            String[] strArr3 = A0E;
            String str3 = strArr3[3];
            String resolvedRegionId4 = strArr3[6];
            if (str3.length() != resolvedRegionId4.length()) {
                if (!z10) {
                    if (zEquals) {
                        z11 = false;
                    }
                }
                c1349JkA0D.A07(j10, z11, str2, map);
            } else {
                A0E[1] = "BxcnzhC5XqKLAs";
                if (!z10) {
                    if (zEquals) {
                        z11 = false;
                    }
                }
                c1349JkA0D.A07(j10, z11, str2, map);
            }
            z11 = true;
            c1349JkA0D.A07(j10, z11, str2, map);
        }
        if (zEquals) {
            AbstractC1351Jm.A07(A00(str2, map));
        }
        for (Map.Entry<String, C3C> entry2 : map.entrySet()) {
            HashMap<String, Integer> map2 = this.A0A;
            String key = entry2.getKey();
            C3C value = entry2.getValue();
            String[] strArr4 = A0E;
            if (strArr4[0].charAt(26) != strArr4[2].charAt(26)) {
                String[] strArr5 = A0E;
                strArr5[3] = "NvsWEQBQe6VAGnQhJA54b4pVjA";
                strArr5[6] = "RDTsakCOEzYFACc9hnpkZM81VS";
                map2.put(key, Integer.valueOf(((CharSequence) C3M.A01(value.A0I())).length()));
            } else {
                String[] strArr6 = A0E;
                strArr6[5] = "CHxe0vxZr8lPRHvaCG5LBeS6gh9aVBuv";
                strArr6[7] = "HeV50lBh9JGf3GNHX7ZdMbjxgTQZONIp";
                map2.put(key, Integer.valueOf(((CharSequence) C3M.A01(value.A0I())).length()));
            }
        }
    }

    public static void A08(SpannableStringBuilder spannableStringBuilder) {
        for (C1342Jd c1342Jd : (C1342Jd[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1342Jd.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1342Jd), spannableStringBuilder.getSpanEnd(c1342Jd), (CharSequence) A03(0, 0, 119));
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                while (i11 < spannableStringBuilder.length()) {
                    char cCharAt = spannableStringBuilder.charAt(i11);
                    String[] strArr = A0E;
                    String str = strArr[5];
                    String str2 = strArr[7];
                    int i12 = str.charAt(24);
                    if (i12 == str2.charAt(24)) {
                        String[] strArr2 = A0E;
                        strArr2[0] = "TbkeKkbvotKRDkL3aJkR6CKPV2CRZepO";
                        strArr2[2] = "HOyzJt7YVHsiDEtesdPQS8q1On7uoMtF";
                        if (cCharAt != ' ') {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    throw new RuntimeException();
                }
                int j10 = i10 + 1;
                String[] strArr3 = A0E;
                String str3 = strArr3[0];
                String str4 = strArr3[2];
                int i13 = str3.charAt(26);
                if (i13 == str4.charAt(26)) {
                    throw new RuntimeException();
                }
                A0E[1] = "2IIAODStabB9";
                int i14 = i11 - j10;
                if (i14 > 0) {
                    spannableStringBuilder.delete(i10, i10 + i14);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
            if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i15 + 1) == ' ') {
                int i16 = i15 + 1;
                spannableStringBuilder.delete(i16, i15 + 2);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
            if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i17 + 1) == '\n') {
                spannableStringBuilder.delete(i17, i17 + 1);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void A09(Map<String, C1356Jr> map, C3C c3c, int i10, int i11, int i12) {
        C1356Jr c1356JrA02 = AbstractC1351Jm.A02(this.A04, this.A0C, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c3c.A0I();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c3c.A0G(spannableStringBuilder);
        }
        if (c1356JrA02 != null) {
            AbstractC1351Jm.A06(spannableStringBuilder, i10, i11, c1356JrA02, this.A03, map, i12);
            if (A03(13, 1, 127).equals(this.A07)) {
                if (c1356JrA02.A04() != Float.MAX_VALUE) {
                    c3c.A05((c1356JrA02.A04() * (-90.0f)) / 100.0f);
                }
                if (c1356JrA02.A0C() != null) {
                    c3c.A0F(c1356JrA02.A0C());
                }
                if (c1356JrA02.A0B() != null) {
                    c3c.A0E(c1356JrA02.A0B());
                }
            }
        }
    }

    private void A0A(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = A03(13, 1, 127).equals(this.A07);
        boolean isPNode = A03(2, 3, 18).equals(this.A07);
        if (z10 || zEquals || (isPNode && this.A05 != null)) {
            if (this.A02 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.A02));
            }
            if (this.A01 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.A01));
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            C1349Jk c1349Jk = this.A00.get(i10);
            boolean isPNode2 = z10 || zEquals;
            c1349Jk.A0A(treeSet, isPNode2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    private final boolean A0B(long j10) {
        if (this.A02 != -9223372036854775807L || this.A01 != -9223372036854775807L) {
            if (this.A02 > j10) {
                return this.A02 == -9223372036854775807L ? false : false;
            }
            long j11 = this.A01;
            if (A0E[1].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "RgXDLQ3a08cIBfoVnl1r1eLIg5MUrfoW";
            strArr[7] = "Ter36j0QNwpTucwH0VATqUwzgkfFz8sj";
            if (j11 != -9223372036854775807L) {
                if ((this.A02 == -9223372036854775807L || j10 >= this.A01) && (this.A02 > j10 || j10 >= this.A01)) {
                }
            }
        }
        return true;
    }

    public final int A0C() {
        if (this.A00 == null) {
            return 0;
        }
        List<C1349Jk> list = this.A00;
        if (A0E[4].length() == 7) {
            throw new RuntimeException();
        }
        A0E[1] = "iiL";
        return list.size();
    }

    public final C1349Jk A0D(int i10) {
        if (this.A00 != null) {
            return this.A00.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<C2605o2> A0E(long j10, Map<String, C1356Jr> map, Map<String, C1350Jl> map2, Map<String, String> imageMap) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        A05(j10, this.A06, arrayList);
        TreeMap treeMap = new TreeMap();
        A07(j10, false, this.A06, treeMap);
        A06(j10, map, map2, this.A06, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = imageMap.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C1350Jl c1350Jl = (C1350Jl) C3M.A01(map2.get(pair.first));
                arrayList2.add(new C3C().A0D(bitmapDecodeByteArray).A04(c1350Jl.A02).A0A(0).A07(c1350Jl.A01, 0).A09(c1350Jl.A05).A06(c1350Jl.A04).A03(c1350Jl.A00).A0B(c1350Jl.A08).A0H());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1350Jl c1350Jl2 = (C1350Jl) C3M.A01(map2.get(entry.getKey()));
            C3C c3c = (C3C) entry.getValue();
            A08((SpannableStringBuilder) C3M.A01(c3c.A0I()));
            c3c.A07(c1350Jl2.A01, c1350Jl2.A06);
            c3c.A09(c1350Jl2.A05);
            c3c.A04(c1350Jl2.A02);
            c3c.A06(c1350Jl2.A04);
            c3c.A08(c1350Jl2.A03, c1350Jl2.A07);
            c3c.A0B(c1350Jl2.A08);
            arrayList2.add(c3c.A0H());
        }
        return arrayList2;
    }

    public final void A0F(C1349Jk c1349Jk) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(c1349Jk);
    }

    public final long[] A0G() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0A(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i10 = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public final String[] A0H() {
        return this.A0C;
    }
}
