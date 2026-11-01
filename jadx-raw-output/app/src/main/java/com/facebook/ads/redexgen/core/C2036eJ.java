package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2036eJ {
    public static InterfaceC09784m A06;
    public static BT A07;
    public static InterfaceC1404Ln A08;
    public static C2036eJ A09;
    public static File A0A;
    public static byte[] A0B;
    public static String[] A0C = {"4y", "AwMrvrZaA3qCUMe4DaWf", "nMell2jjCxhf1iVkS1T4", "JoDZxKxhXC6KTCYPanywHJvOgx3oSz2Q", "c4TvbpAtmy9oRzm3BRhbekxSipSfphPN", "JNxty2uNXQJQugnl9tUmEGg4l4lnFcO6", "Bo5IZ2fGdsUyi7NqIQl4cfXztCU0TldF", "nOSbM9ZPEjvtyh7HAXbSWFPDuf7zpKmZ"};
    public boolean A00;
    public final C1951cu A04;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final SparseArray<C2034eH> A02 = new SparseArray<>();
    public final Runnable A05 = new RunnableC2033eG(this);
    public final BS A03 = new CN(this);

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{11, 6, 11, 73, 82, 95, 78, 88, 116, 79, 68, 92, 69, 71, 68, 74, 79, 78, 79, 17, 55, 58, 55, 103, 114, 101, 116, 114, 121, 99, 118, 112, 114, 55, 115, 120, 96, 121, 123, 120, 118, 115, 114, 115, 45, 123, 118, 123, 40, 47, 58, 47, 62, 97, 35, 65, 122, 119, 102, 112, 57, 35, 33, 99, 120, 117, 100, 114, 33, 4, 4, 4, 4, 9, 91, 76, 88, 92, 76, 90, 93, 96, 77, 19, 25, 50, ExifInterface.START_CODE, 51, 49, 50, 60, 57, 56, 57, 115, 125, 14, 41, 60, 41, 56, 103, 125, 62, 9, 9, 20, 9, 85, 91, 40, 15, 26, 15, 30, 65, 91, 110, 91, 73, 81, 126, 123, 113, 104, 50, 123, 112, 104, 113, 115, 112, 126, 123, 108, 37, 32, 55, 84, 86, 84, 95, 82};
    }

    static {
        A0D();
    }

    public C2036eJ(C1951cu c1951cu, BT bt) {
        this.A04 = c1951cu;
        if (bt != null) {
            A07 = bt;
            bt.A0F(this.A03);
        }
        A03().A0E();
    }

    public static synchronized InterfaceC09784m A01(Context context) {
        if (A06 == null) {
            A06 = new C2592no(context);
        }
        return A06;
    }

    private C10929j A02() {
        return new C10929j().A01(A08(135, 3, 65)).A00(null);
    }

    private synchronized BT A03() {
        A0E();
        return A07;
    }

    public static synchronized InterfaceC1404Ln A04(Context context) {
        if (A08 == null) {
            A08 = new C2301ir(new File(A07(context), A08(121, 14, 26)), new C7R(U7.A0T(context)));
        }
        return A08;
    }

    public static C2307ix A05(C2588nk c2588nk, InterfaceC1404Ln interfaceC1404Ln) {
        return new C2307ix().A06(interfaceC1404Ln).A05(c2588nk).A04(new C2582ne()).A03(2);
    }

    public static synchronized C2036eJ A06(C1951cu c1951cu) {
        if (A09 == null) {
            A09 = new C2036eJ(c1951cu, null);
        }
        return A09;
    }

    public static synchronized File A07(Context context) {
        if (A0A == null) {
            A0A = context.getCacheDir();
            if (A0A == null) {
                A0A = context.getFilesDir();
            }
        }
        return A0A;
    }

    public static String A09(C1951cu c1951cu, Uri uri) {
        try {
            if (!U7.A1r(c1951cu)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e10) {
            c1951cu.A08().AAy(A08(138, 5, 50), AbstractC1590Sv.A0u, new C1591Sw(e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00cf  */
    public void A0A() {
        for (B8 b10 : A03().A0D()) {
            int requestId = b10.A07.A02.hashCode();
            C2034eH c2034eH = this.A02.get(requestId);
            boolean z10 = b10.A02 == 2 && b10.A01() > 0;
            String str = A08(69, 15, 44) + requestId + A08(20, 25, 18) + b10.A00() + A08(0, 20, 46) + b10.A01() + A08(45, 9, 94) + b10.A02;
            if (c2034eH != null) {
                int state = b10.A02;
                if (state != 3 && !z10 && b10.A00() < 100.0f) {
                    long jA01 = b10.A01();
                    String[] strArr = A0C;
                    if (strArr[7].charAt(29) == strArr[4].charAt(29)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0C;
                    strArr2[3] = "Dot6Q3Penl8IgXRyTYIqC6CBr4bXo7x7";
                    strArr2[6] = "9ocSvY8ybipVJ0ZgVUYrz9Eev0RZQ1px";
                    if (jA01 > c2034eH.A00) {
                        String str2 = A08(84, 19, 88) + state + A08(54, 8, 6) + b10.A01();
                        c2034eH.A01.AD5(c2034eH.A02);
                        this.A02.remove(requestId);
                    } else if (state == 4 || state == 1) {
                        String str3 = A08(103, 14, 126) + state;
                        c2034eH.A01.ADD(new Throwable(String.valueOf(b10.A01)));
                        this.A02.remove(requestId);
                    }
                } else {
                    String str4 = A08(84, 19, 88) + state + A08(54, 8, 6) + b10.A01();
                    c2034eH.A01.AD5(c2034eH.A02);
                    this.A02.remove(requestId);
                }
            }
            String str5 = A08(117, 4, 63) + requestId + A08(62, 7, 4) + b10.A01();
        }
    }

    private void A0B() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.post(this.A05);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A01.removeCallbacks(this.A05);
        this.A00 = false;
    }

    private synchronized void A0E() {
        if (A07 == null) {
            A07 = new BT(this.A04, A01(this.A04), A04(this.A04), A0H(this.A04), Executors.newFixedThreadPool(6));
            A07.A0F(this.A03);
        }
    }

    public final InterfaceC09884w A0H(Context context) {
        return A05(new C2588nk(context, (C5H) null, A02()), A04(context));
    }

    public final void A0I(Uri uri, InterfaceC2035eI interfaceC2035eI, long j10) {
        String cacheKey = A09(this.A04, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean zA0J = A0J(cacheKey);
        DownloadRequest downloadRequestA05 = new BW(uri.toString(), uri).A00(cacheKey).A05();
        A03().A0G(downloadRequestA05);
        this.A02.put(downloadRequestA05.A02.hashCode(), new C2034eH(interfaceC2035eI, j10, zA0J, null));
        A0B();
    }

    public final boolean A0J(String str) {
        return A04(this.A04).A74(str, 0L, 1L) > 0;
    }
}
