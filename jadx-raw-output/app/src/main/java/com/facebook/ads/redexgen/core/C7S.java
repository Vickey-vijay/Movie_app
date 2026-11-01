package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Log;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7S implements InterfaceC2589nl {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC2589nl A06;
    public AnonymousClass56 A07;
    public AnonymousClass56 A08;

    @MetaExoPlayerCustomization
    public C1400Lj A09;
    public C1414Lx A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC2589nl A0D;
    public final InterfaceC2589nl A0E;
    public final InterfaceC2589nl A0F;
    public final InterfaceC1404Ln A0G;
    public final InterfaceC1407Lq A0H;
    public final InterfaceC1413Lw A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{25, 59, 57, 50, 63, 30, 59, 46, 59, 9, 53, 47, 40, 57, 63, 22, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, 28, 123, 117, 1, 61, 60, 38, 117, 56, 60, 50, 61, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, 28, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
        try {
            String strA4d = this.A0I.A4d(anonymousClass56);
            AnonymousClass56 anonymousClass56A09 = anonymousClass56.A04().A08(strA4d).A09();
            this.A08 = anonymousClass56A09;
            this.A05 = A01(this.A0G, strA4d, anonymousClass56A09.A06);
            this.A03 = anonymousClass56.A04;
            this.A09 = new C1400Lj(anonymousClass56.A07);
            this.A0B = A00(anonymousClass56) != -1;
            boolean z10 = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = M7.A00(this.A0G.A7K(strA4d));
                if (this.A00 != -1) {
                    this.A00 -= anonymousClass56.A04;
                    if (this.A00 < 0) {
                        throw new C09914z(2008);
                    }
                }
            }
            boolean z11 = anonymousClass56.A07.A08 <= 0 && anonymousClass56.A07.A07 <= 0;
            if (anonymousClass56.A03 != -1) {
                this.A00 = this.A00 == -1 ? anonymousClass56.A03 : Math.min(this.A00, anonymousClass56.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(anonymousClass56A09, false, z11);
            }
            return anonymousClass56.A03 != -1 ? anonymousClass56.A03 : this.A00;
        } catch (Throwable th2) {
            A09(th2);
            throw th2;
        }
    }

    static {
        A05();
    }

    public C7S(InterfaceC1404Ln interfaceC1404Ln, final InterfaceC2589nl interfaceC2589nl, InterfaceC2589nl interfaceC2589nl2, final InterfaceC09864u interfaceC09864u, InterfaceC1413Lw interfaceC1413Lw, int i10, final AnonymousClass31 anonymousClass31, final int i11, InterfaceC1407Lq interfaceC1407Lq) {
        this.A0G = interfaceC1404Ln;
        this.A0D = interfaceC2589nl2;
        this.A0I = interfaceC1413Lw == null ? InterfaceC1413Lw.A00 : interfaceC1413Lw;
        this.A0J = (i10 & 1) != 0;
        this.A0L = (i10 & 2) != 0;
        this.A0K = (i10 & 4) != 0;
        if (interfaceC2589nl != null) {
            interfaceC2589nl = anonymousClass31 != null ? new InterfaceC2589nl(interfaceC2589nl, anonymousClass31, i11) { // from class: com.facebook.ads.redexgen.X.9c
                public static byte[] A03;
                public final int A00;
                public final AnonymousClass31 A01;
                public final InterfaceC2589nl A02;

                static {
                    A01();
                }

                public static String A00(int i12, int i13, int i14) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i12, i12 + i13);
                    for (int i15 = 0; i15 < bArrCopyOfRange.length; i15++) {
                        bArrCopyOfRange[i15] = (byte) ((bArrCopyOfRange[i15] - i14) - 41);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
                }

                {
                    this.A02 = (InterfaceC2589nl) C3M.A01(interfaceC2589nl);
                    C3M.A01(anonymousClass31);
                    this.A01 = null;
                    this.A00 = i11;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final void A3v(C5H c5h) {
                    C3M.A01(c5h);
                    this.A02.A3v(c5h);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final Map<String, List<String>> A8l() {
                    return this.A02.A8l();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final Uri A9H() {
                    return this.A02.A9H();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                    throw new NullPointerException(A00(0, 14, 104));
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final void close() throws IOException {
                    this.A02.close();
                }

                @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                public final int read(byte[] bArr, int i12, int i13) throws IOException {
                    throw new NullPointerException(A00(0, 14, 104));
                }
            } : interfaceC2589nl;
            this.A0F = interfaceC2589nl;
            this.A0E = interfaceC09864u != null ? new InterfaceC2589nl(interfaceC2589nl, interfaceC09864u) { // from class: com.facebook.ads.redexgen.X.9a
                public static String[] A04 = {"wbGAhFLyG1O1BXRQkdAsuvRwjcG0JvdY", "WIGHUXkmdMwjKtYrGQHAEajnCcLVhsJc", "71g9TI5vzncmEyYDsqHRZQ5IIDSVhuCU", "Of7gEliA8dohBLU5UePsnNPr9luYUKIX", "Ip7oB5coOYYSe2wQ3nHh7WYhGK", "mFyxGR7YA7Uh54mquru9LT9AFg", "iYrL5ZFnNwboLBDSkDK7D5rnh7HwI2GN", "DEMvAgZEfGNSxO1Scy7Mz579azioI4xU"};
                public long A00;
                public boolean A01;
                public final InterfaceC09864u A02;
                public final InterfaceC2589nl A03;

                {
                    this.A03 = (InterfaceC2589nl) C3M.A01(interfaceC2589nl);
                    this.A02 = (InterfaceC09864u) C3M.A01(interfaceC09864u);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final void A3v(C5H c5h) {
                    C3M.A01(c5h);
                    this.A03.A3v(c5h);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final Map<String, List<String>> A8l() {
                    return this.A03.A8l();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final Uri A9H() {
                    return this.A03.A9H();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                    this.A00 = this.A03.AFy(anonymousClass56);
                    if (this.A00 == 0) {
                        return 0L;
                    }
                    long j10 = anonymousClass56.A03;
                    String[] strArr = A04;
                    if (strArr[4].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "8JYiy7Q3QOgUU9IJtNo1oEeVZYLkhQA2";
                    strArr2[1] = "C3hXJiAszWGMEEgz1C8EzdfpsF4hhGij";
                    if (j10 == -1 && this.A00 != -1) {
                        anonymousClass56 = anonymousClass56.A05(0L, this.A00);
                    }
                    this.A01 = true;
                    this.A02.AG0(anonymousClass56);
                    return this.A00;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
                public final void close() throws IOException {
                    try {
                        this.A03.close();
                    } finally {
                        if (this.A01) {
                            this.A01 = false;
                            this.A02.close();
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                public final int read(byte[] bArr, int i12, int i13) throws IOException {
                    if (this.A00 != 0) {
                        int i14 = this.A03.read(bArr, i12, i13);
                        if (i14 > 0) {
                            this.A02.write(bArr, i12, i14);
                            if (this.A00 != -1) {
                                this.A00 -= (long) i14;
                            }
                        }
                        return i14;
                    }
                    String[] strArr = A04;
                    if (strArr[4].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[0] = "tTmOA5hODgmGBNxF0mS11dvWTNwifcB6";
                    strArr2[3] = "mpSZqupnUd3dBB1VIyplsxMvqiIWybTS";
                    return -1;
                }
            } : null;
        } else {
            this.A0F = C10869d.A02;
            this.A0E = null;
        }
        this.A0H = interfaceC1407Lq;
    }

    private int A00(AnonymousClass56 anonymousClass56) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && anonymousClass56.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC1404Ln interfaceC1404Ln, String str, Uri redirectedUri) {
        Uri redirectedUri2 = M7.A01(interfaceC1404Ln.A7K(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    InterfaceC1404Ln interfaceC1404Ln = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        interfaceC1404Ln.AGw(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th2) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AGw(this.A0A);
                this.A0A = null;
            }
            throw th2;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A72();
            throw new NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    @MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    private void A06(AnonymousClass56 anonymousClass56, boolean z10, boolean z11) throws Throwable {
        C1414Lx c1414LxAJP;
        long jMin;
        AnonymousClass56 anonymousClass56A09;
        InterfaceC2589nl interfaceC2589nl;
        long j10;
        Uri uri;
        long j11;
        String str = (String) AbstractC09664a.A0f(anonymousClass56.A08);
        EnumC1402Ll enumC1402Ll = z11 ? EnumC1402Ll.A03 : EnumC1402Ll.A06;
        if (this.A0B) {
            c1414LxAJP = null;
        } else if (this.A0J) {
            try {
                c1414LxAJP = this.A0G.AJP(str, this.A03, this.A00, enumC1402Ll);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            str = str;
            c1414LxAJP = this.A0G.AJQ(str, this.A03, this.A00, enumC1402Ll);
        }
        if (c1414LxAJP == null) {
            interfaceC2589nl = this.A0F;
            anonymousClass56A09 = anonymousClass56.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else {
            boolean z12 = c1414LxAJP.A05;
            String[] strArr = A0N;
            if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
                A0N[5] = "u32inRltH66jjh9yXIb3cYFcwSkjtAHW";
                if (z12) {
                    Uri uriFromFile = Uri.fromFile((File) AbstractC09664a.A0f(c1414LxAJP.A03));
                    long j12 = c1414LxAJP.A02;
                    long j13 = this.A03 - j12;
                    long jMin2 = c1414LxAJP.A01 - j13;
                    if (this.A00 != -1) {
                        jMin2 = Math.min(jMin2, this.A00);
                    }
                    anonymousClass56A09 = anonymousClass56.A04().A06(uriFromFile).A05(j12).A04(j13).A03(jMin2).A07(this.A09).A09();
                    interfaceC2589nl = this.A0D;
                } else {
                    if (c1414LxAJP.A04()) {
                        jMin = this.A00;
                    } else {
                        jMin = c1414LxAJP.A01;
                        if (this.A00 != -1) {
                            jMin = Math.min(jMin, this.A00);
                        }
                    }
                    anonymousClass56A09 = anonymousClass56.A04().A04(this.A03).A03(jMin).A07(this.A09).A09();
                    if (this.A0E != null) {
                        interfaceC2589nl = this.A0E;
                    } else {
                        interfaceC2589nl = this.A0F;
                        this.A0G.AGw(c1414LxAJP);
                        c1414LxAJP = null;
                    }
                }
            }
            throw new RuntimeException();
        }
        boolean z13 = this.A0B;
        if (A0N[5].charAt(3) == 'i') {
            String[] strArr2 = A0N;
            strArr2[0] = "KvC0Ia1A4x1eGi9X8aRBDgkMlzCJszIJ";
            strArr2[7] = "nNrFIIpUFsn1fqvNydhqNDEn907tEQAg";
            if (!z13 && interfaceC2589nl == this.A0F) {
                j10 = this.A03 + 102400;
            } else {
                j10 = Long.MAX_VALUE;
            }
            this.A01 = j10;
            if (z10) {
                C3M.A08(A0A());
                InterfaceC2589nl interfaceC2589nl2 = this.A0F;
                if (A0N[3].charAt(26) == 'u') {
                    Throwable e10 = new RuntimeException();
                    throw e10;
                }
                A0N[5] = "8XoiTPgLcR8ApVu7jrAIE2ygde6TsOz1";
                if (interfaceC2589nl == interfaceC2589nl2) {
                    return;
                }
                try {
                    A03();
                } catch (Throwable th2) {
                    if (((C1414Lx) AbstractC09664a.A0f(c1414LxAJP)).A03()) {
                        this.A0G.AGw(c1414LxAJP);
                    }
                    throw th2;
                }
            }
            if (c1414LxAJP != null && c1414LxAJP.A03()) {
                this.A0A = c1414LxAJP;
            }
            this.A06 = interfaceC2589nl;
            this.A07 = anonymousClass56A09;
            this.A02 = 0L;
            long jAFy = interfaceC2589nl.AFy(anonymousClass56A09);
            M9 m10 = new M9();
            if (anonymousClass56A09.A03 == -1) {
                if (A0N[4].length() != 12) {
                    A0N[3] = "AihO48tXyqmUqd3oId9EAGnNfKcJ6kuS";
                    if (jAFy != -1) {
                        this.A00 = jAFy;
                        j11 = this.A03 + this.A00;
                        if (A0N[5].charAt(3) != 'i') {
                            throw new RuntimeException();
                        }
                        A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
                        M9.A00(m10, j11);
                    }
                } else if (jAFy != -1) {
                    this.A00 = jAFy;
                    j11 = this.A03 + this.A00;
                    if (A0N[5].charAt(3) != 'i') {
                        throw new RuntimeException();
                    }
                    A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
                    M9.A00(m10, j11);
                }
            }
            if (A0C()) {
                this.A05 = interfaceC2589nl.A9H();
                boolean isRedirected = !anonymousClass56.A06.equals(this.A05);
                if (A0N[4].length() != 12) {
                    A0N[4] = "aty3owKlrPhsH";
                    if (isRedirected) {
                        uri = this.A05;
                    } else {
                        uri = null;
                    }
                    M9.A01(m10, uri);
                }
            }
            if (A0D()) {
                this.A0G.A46(str, m10);
            }
            A08(str, this.A05);
            return;
        }
        throw new RuntimeException();
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            M9 m10 = new M9();
            M9.A00(m10, this.A03);
            this.A0G.A46(str, m10);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        M9 m10 = new M9();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            M9.A01(m10, uri2);
        } else {
            M9.A01(m10, null);
        }
        try {
            this.A0G.A46(str, m10);
        } catch (C1401Lk e10) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e10);
        }
    }

    private void A09(Throwable th2) {
        if (A0B() || (th2 instanceof C1401Lk)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final InterfaceC1404Ln A0E() {
        return this.A0G;
    }

    public final InterfaceC1413Lw A0F() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public final void A3v(C5H c5h) {
        C3M.A01(c5h);
        this.A0D.A3v(c5h);
        this.A0F.A3v(c5h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public final Map<String, List<String>> A8l() {
        if (A0C()) {
            return this.A0F.A8l();
        }
        return Collections.emptyMap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public final Uri A9H() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e10) {
            A09(e10);
            throw e10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i10, int i11) throws Throwable {
        if (i11 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        AnonymousClass56 currentDataSpec = (AnonymousClass56) C3M.A01(this.A08);
        AnonymousClass56 anonymousClass56 = (AnonymousClass56) C3M.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
            try {
                int bytesRead = ((InterfaceC2589nl) C3M.A01(this.A06)).read(bArr, i10, i11);
                if (bytesRead != -1) {
                    if (A0B()) {
                        this.A04 += (long) bytesRead;
                    }
                    this.A03 += (long) bytesRead;
                    this.A02 += (long) bytesRead;
                    if (this.A00 != -1) {
                        this.A00 -= (long) bytesRead;
                    }
                } else if (A0C() && (anonymousClass56.A03 == -1 || this.A02 < anonymousClass56.A03)) {
                    A07((String) AbstractC09664a.A0f(currentDataSpec.A08));
                } else if (this.A00 > 0 || this.A00 == -1) {
                    A03();
                    A06(currentDataSpec, false, false);
                    return read(bArr, i10, i11);
                }
                return bytesRead;
            } catch (Throwable th2) {
                e = th2;
                A09(e);
                throw e;
            }
        } catch (Throwable th3) {
            e = th3;
        }
    }
}
