package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2301ir implements InterfaceC1404Ln {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public C1401Lk A02;
    public boolean A03;
    public final InterfaceC2306iw A04;
    public final C1410Lt A05;
    public final M6 A06;
    public final File A07;
    public final HashMap<String, ArrayList<InterfaceC1403Lm>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 43);
            i13++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, 24, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, 13, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, 12, 9, 0, 1, 69, 17, 10, 69, 6, 23, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, 12, 9, 0, 95, 69, 31, 56, 48, 53, 60, 61, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, 12, 16, 29, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, 16, 10, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, 22, 85, 87, 85, 94, 83, 22, 95, 88, 82, 95, 85, 83, 69, 12, 22, 43, 12, 4, 1, 8, 9, 77, 25, 2, 77, 1, 4, 30, 25, 77, 14, 12, 14, 5, 8, 77, 9, 4, 31, 8, 14, 25, 2, 31, 20, 77, 11, 4, 1, 8, 30, 87, 77, 48, 23, 31, 26, 19, 18, 86, 2, 25, 86, 4, 19, 27, 25, 0, 19, 86, 16, 31, 26, 19, 86, 31, 24, 18, 19, 14, 86, 19, 24, 2, 4, 15, 86, 16, 25, 4, 76, 86, 56, 20, 25, 19, 26, 7, 24, 16, 17, 85, 32, 60, 49, 85, 19, 28, 25, 16, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, 64, 91, 92, 85, 18, 91, 92, 86, 87, 74, 18, 84, 91, 94, 87, 18, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0G(File file, boolean z10, File[] fileArr, Map<String, C1409Ls> map) {
        long j10;
        long j11;
        C1409Ls c1409LsRemove;
        C2300iq c2300iqA01;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z10 && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else if (z10) {
                    boolean zA0A = M6.A0A(name);
                    if (A0C[0].length() != 2) {
                        String[] strArr2 = A0C;
                        strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                        strArr2[4] = "SAWP83LvD";
                        if (!zA0A && !name.endsWith(A04(0, 4, 107))) {
                            j10 = -1;
                            j11 = -9223372036854775807L;
                            if (map != null) {
                                c1409LsRemove = map.remove(name);
                            } else {
                                c1409LsRemove = null;
                            }
                            if (c1409LsRemove != null) {
                                j10 = c1409LsRemove.A01;
                                j11 = c1409LsRemove.A00;
                            }
                            c2300iqA01 = C2300iq.A01(file2, j10, j11, this.A06);
                            if (c2300iqA01 != null) {
                                A0C(c2300iqA01);
                            } else {
                                file2.delete();
                            }
                        }
                    }
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                    if (map != null) {
                        c1409LsRemove = map.remove(name);
                    } else {
                        c1409LsRemove = null;
                    }
                    if (c1409LsRemove != null) {
                        j10 = c1409LsRemove.A01;
                        j11 = c1409LsRemove.A00;
                    }
                    c2300iqA01 = C2300iq.A01(file2, j10, j11, this.A06);
                    if (c2300iqA01 != null) {
                        A0C(c2300iqA01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<C1414Lx> A0I(String str) {
        M4 m4A0C;
        C3M.A08(!this.A03);
        m4A0C = this.A06.A0C(str);
        return (m4A0C == null || m4A0C.A09()) ? new TreeSet() : new TreeSet((Collection) m4A0C.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized long A73(String str, long j10, long j11) {
        long j12;
        long j13 = j10;
        synchronized (this) {
            long j14 = j11 == -1 ? Long.MAX_VALUE : j13 + j11;
            if (j14 < 0) {
                j14 = Long.MAX_VALUE;
            }
            j12 = 0;
            while (j13 < j14) {
                long jA74 = A74(str, j13, j14 - j13);
                if (jA74 > 0) {
                    j12 += jA74;
                } else {
                    jA74 = -jA74;
                }
                j13 += jA74;
            }
        }
        return j12;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C2301ir(File file, InterfaceC2306iw interfaceC2306iw) {
        this(file, interfaceC2306iw, (byte[]) null, false);
    }

    public C2301ir(File file, InterfaceC2306iw interfaceC2306iw, InterfaceC09784m interfaceC09784m, byte[] bArr, boolean z10, boolean z11) {
        C1410Lt c1410Lt;
        M6 m10 = new M6(interfaceC09784m, file, bArr, z10, z11);
        if (interfaceC09784m != null && !z11) {
            c1410Lt = new C1410Lt(interfaceC09784m);
        } else {
            c1410Lt = null;
        }
        this(file, interfaceC2306iw, m10, c1410Lt);
    }

    public C2301ir(File file, InterfaceC2306iw interfaceC2306iw, M6 m10, C1410Lt c1410Lt) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC2306iw;
            this.A06 = m10;
            this.A05 = c1410Lt;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC2306iw.AHz();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new MD(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C2301ir(File file, InterfaceC2306iw interfaceC2306iw, byte[] bArr, boolean z10) {
        this(file, interfaceC2306iw, null, bArr, z10, true);
    }

    public static long A00(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AnonymousClass44.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C2300iq A03(String str, long j10, long j11) {
        C2300iq c2300iqA04;
        M4 m4A0C = this.A06.A0C(str);
        if (m4A0C == null) {
            return C2300iq.A04(str, j10, j11);
        }
        while (true) {
            c2300iqA04 = m4A0C.A04(j10, j11);
            if (!c2300iqA04.A05 || c2300iqA04.A03.length() == c2300iqA04.A01) {
                break;
            }
            A06();
        }
        return c2300iqA04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (C1401Lk e10) {
                this.A02 = e10;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] fileArrListFiles = file.listFiles();
        String strA04 = A04(297, 11, 30);
        if (fileArrListFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AnonymousClass44.A05(strA04, str);
            this.A02 = new C1401Lk(str);
            return;
        }
        this.A01 = A02(fileArrListFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e11) {
                String str2 = A04(102, 28, 114) + this.A07;
                AnonymousClass44.A08(strA04, str2, e11);
                this.A02 = new C1401Lk(str2, e11);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, C1409Ls> mapA05 = this.A05.A05();
                A0G(this.A07, true, fileArrListFiles, mapA05);
                this.A05.A09(mapA05.keySet());
            } else {
                A0G(this.A07, true, fileArrListFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e12) {
                AnonymousClass44.A08(strA04, A04(308, 25, 25), e12);
            }
        } catch (IOException e13) {
            String str3 = A04(164, 36, 29) + this.A07;
            AnonymousClass44.A08(strA04, str3, e13);
            this.A02 = new C1401Lk(str3, e13);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<M4> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            for (C2300iq c2300iq : it.next().A06()) {
                if (c2300iq.A03.length() != c2300iq.A01) {
                    arrayList.add(c2300iq);
                }
            }
        }
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i11 = str.charAt(29);
            if (i11 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i10 < size) {
                A0A((C1414Lx) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws C1401Lk {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(C1414Lx c1414Lx) {
        ArrayList<InterfaceC1403Lm> arrayList = this.A08.get(c1414Lx.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).AFK(this, c1414Lx);
            }
        }
        this.A04.AFK(this, c1414Lx);
    }

    private void A0A(C1414Lx c1414Lx) {
        M4 m4A0C = this.A06.A0C(c1414Lx.A04);
        if (m4A0C == null || !m4A0C.A0D(c1414Lx)) {
            return;
        }
        this.A00 -= c1414Lx.A01;
        if (this.A05 != null) {
            String name = c1414Lx.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AnonymousClass44.A07(A04(297, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(m4A0C.A02);
        A09(c1414Lx);
    }

    private void A0C(C2300iq c2300iq) {
        this.A06.A0D(c2300iq.A04).A08(c2300iq);
        this.A00 += c2300iq.A01;
        A0D(c2300iq);
    }

    private void A0D(C2300iq c2300iq) {
        ArrayList<InterfaceC1403Lm> arrayList = this.A08.get(c2300iq.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC1403Lm interfaceC1403Lm = arrayList.get(size);
                int i10 = A0C[0].length();
                if (i10 == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                interfaceC1403Lm.AFJ(this, c2300iq);
            }
        }
        this.A04.AFJ(this, c2300iq);
    }

    private void A0E(C2300iq c2300iq, C1414Lx c1414Lx) {
        ArrayList<InterfaceC1403Lm> arrayList = this.A08.get(c2300iq.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).AFL(this, c2300iq, c1414Lx);
            }
        }
        this.A04.AFL(this, c2300iq, c1414Lx);
    }

    public static void A0F(File file) throws C1401Lk {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AnonymousClass44.A05(message, str);
        throw new C1401Lk(str);
    }

    public static synchronized boolean A0H(File file) {
        return A0D.add(file.getAbsoluteFile());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized void A46(String str, M9 m10) throws C1401Lk {
        C3M.A08(!this.A03);
        A08();
        this.A06.A0L(str, m10);
        try {
            this.A06.A0I();
        } catch (IOException e10) {
            throw new C1401Lk(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized void A4x(File file, long j10) throws C1401Lk {
        C3M.A08(!this.A03);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            C2300iq c2300iq = (C2300iq) C3M.A01(C2300iq.A02(file, j10, this.A06));
            M4 m10 = (M4) C3M.A01(this.A06.A0C(c2300iq.A04));
            C3M.A08(m10.A0B(c2300iq.A02, c2300iq.A01));
            long jA00 = M7.A00(m10.A03());
            if (jA00 != -1) {
                C3M.A08(c2300iq.A02 + c2300iq.A01 <= jA00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c2300iq.A01, c2300iq.A00);
                    A0C(c2300iq);
                    try {
                        this.A06.A0I();
                        notifyAll();
                        return;
                    } catch (IOException e10) {
                        throw new C1401Lk(e10);
                    }
                } catch (IOException e11) {
                    throw new C1401Lk(e11);
                }
            }
            A0C(c2300iq);
            this.A06.A0I();
            notifyAll();
            return;
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized long A72() {
        C3M.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    @MetaExoPlayerCustomization
    public final synchronized long A74(String str, long j10, long j11) {
        M4 cachedContent;
        C3M.A08(!this.A03);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized M8 A7K(String str) {
        C3M.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized void AGw(C1414Lx c1414Lx) {
        C3M.A08(!this.A03);
        M4 m10 = (M4) C3M.A01(this.A06.A0C(c1414Lx.A04));
        m10.A07(c1414Lx.A02);
        this.A06.A0K(m10.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized void AHk(String str) {
        C3M.A08(!this.A03);
        Iterator<C1414Lx> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized void AHl(C1414Lx c1414Lx) {
        C3M.A08(!this.A03);
        A0A(c1414Lx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized File AJN(String str, long lastTouchTimestamp, long j10) throws C1401Lk {
        M4 m4A0C;
        File file;
        C3M.A08(!this.A03);
        A08();
        m4A0C = this.A06.A0C(str);
        C3M.A01(m4A0C);
        C3M.A08(m4A0C.A0B(lastTouchTimestamp, j10));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AFM(this, str, lastTouchTimestamp, j10);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C2300iq.A05(file, m4A0C.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized C1414Lx AJP(String str, long j10, long j11, EnumC1402Ll enumC1402Ll) throws InterruptedException, C1401Lk {
        C1414Lx span;
        C3M.A08(!this.A03);
        A08();
        while (true) {
            span = AJQ(str, j10, j11, enumC1402Ll);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Ln
    public final synchronized C2300iq AJQ(String str, long j10, long j11, EnumC1402Ll enumC1402Ll) throws C1401Lk {
        C3M.A08(!this.A03);
        A08();
        C2300iq c2300iqA03 = A03(str, j10, j11);
        if (c2300iqA03.A05) {
            C2300iq span = this.A06.A0C(str).A05(c2300iqA03, c2300iqA03.A00, false);
            A0E(c2300iqA03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j10, c2300iqA03.A01)) {
            return c2300iqA03;
        }
        return null;
    }
}
