package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AV {
    public static byte[] A06;
    public static String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final AV A08;

    @Nullable
    public MediaCodecPoolTracker A01;

    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<AO>> A04 = new HashMap();
    public final AU A03 = new AU(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{-63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58};
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #3 {all -> 0x009f, blocks: (B:41:0x0078, B:44:0x007e, B:46:0x0082), top: B:56:0x0078 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z10, C2249hv c2249hv, EnumC2246hq enumC2246hq, String str, AO ao2) {
        if (A0I(z10, c2249hv) && A0G(str, c2249hv)) {
            boolean z11 = true;
            synchronized (this) {
                if (this.A00 < c2249hv.A05) {
                    Set<AO> setA06 = this.A04.get(str);
                    if (setA06 == null) {
                        setA06 = A06();
                        this.A04.put(str, setA06);
                    }
                    if (setA06.contains(ao2)) {
                        z11 = false;
                    } else if (((z10 && c2249hv.A0M) || (!z10 && c2249hv.A0L)) && setA06.size() < c2249hv.A04) {
                        setA06.add(ao2);
                        this.A00++;
                        z11 = false;
                    }
                }
                if (!z11) {
                    try {
                        try {
                            this.A05 = SystemClock.elapsedRealtime();
                            ao2.reset();
                            A03().A09(enumC2246hq, ao2.hashCode());
                            this.A05 = -1L;
                            return;
                        } catch (IllegalStateException unused) {
                            A0B(str, ao2);
                            this.A05 = -1L;
                            if (c2249hv.A0Q) {
                                ao2.stop();
                            } else {
                                ao2.stop();
                            }
                        }
                    } catch (Throwable th2) {
                        this.A05 = -1L;
                        throw th2;
                    }
                }
            }
        }
        try {
            if (c2249hv.A0Q || (!z10 && !c2249hv.A0P)) {
                ao2.stop();
            }
        } finally {
            A03().A08(enumC2246hq, ao2.hashCode());
            ao2.AGr();
            A03().A07(enumC2246hq, ao2.hashCode());
        }
    }

    static {
        A08();
        A08 = new AV();
    }

    private AO A01(boolean z10, C2249hv c2249hv, EnumC2246hq enumC2246hq, String str) throws Exception {
        if (A0I(z10, c2249hv) && A0G(str, c2249hv)) {
            synchronized (this) {
                Set<AO> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<AO> it = set.iterator();
                    AO ret = it.next();
                    it.remove();
                    A03().A0A(z10, str, enumC2246hq, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C2244ho c2244hoA05 = A03().A05(z10, str, enumC2246hq);
            AO aoA03 = this.A03.A03(z10, str);
            A03().A06(c2244hoA05, aoA03.hashCode());
            return aoA03;
        } catch (Exception e10) {
            throw new MediaCodecInitializationException(str, e10);
        }
    }

    public static AV A02() {
        AV av = A08;
        String[] strArr = A07;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "gdX1n";
        strArr2[4] = "uqN6";
        return av;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaCodecPoolTracker A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return NoOpMediaCodecPoolTracker.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<AO> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(MediaCodecPoolTracker mediaCodecPoolTracker) {
        if (this.A01 == null) {
            this.A01 = mediaCodecPoolTracker;
        }
    }

    private void A0A(C2249hv c2249hv) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c2249hv.A0R);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, AO ao2) {
        Set<AO> set = this.A04.get(str);
        if (set != null && set.remove(ao2)) {
            int i10 = this.A00;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i10 - 1;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(String str, C2249hv c2249hv) {
        if (A0E(str) && c2249hv.A0A) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z10, C2249hv c2249hv) {
        if (c2249hv.A0C && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > 5000) {
            return false;
        }
        return A0J(z10, c2249hv);
    }

    public static boolean A0J(boolean z10, C2249hv c2249hv) {
        return (z10 && c2249hv.A0M) || (!z10 && c2249hv.A0L);
    }

    public final AO A0K(boolean z10, C2249hv c2249hv, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC2246hq enumC2246hq, String str) throws Exception {
        A09(mediaCodecPoolTracker);
        A0A(c2249hv);
        if (c2249hv.A0J) {
            AO aoA02 = this.A03.A02(z10, c2249hv, enumC2246hq, str);
            String[] strArr = A07;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
            strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
            return aoA02;
        }
        return A01(z10, c2249hv, enumC2246hq, str);
    }

    public final void A0L(boolean z10, C2249hv c2249hv, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC2246hq enumC2246hq, String str, AO ao2) throws Throwable {
        A09(mediaCodecPoolTracker);
        if (c2249hv.A0J) {
            this.A03.A0A(z10, c2249hv, enumC2246hq, str, ao2);
        } else {
            A0C(z10, c2249hv, enumC2246hq, str, ao2);
        }
    }
}
