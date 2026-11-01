package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ViewConfiguration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class je {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Handler f2760 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2761 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2762 = 6080386998049583536L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2763;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ib f2764;

    public interface b {
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        void mo2642(String str);
    }

    public interface d {
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo2643();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Handler m2630() {
        Handler handler;
        synchronized (je.class) {
            if (f2760 == null) {
                HandlerThread handlerThread = new HandlerThread(m2628("\u0efb퇕롮\udb97ະ\ue000\udb77仑졚⧉鈻耢茨溑䣡掠嫚呂ྫ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
                handlerThread.start();
                f2760 = new Handler(handlerThread.getLooper());
            }
            handler = f2760;
        }
        return handler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2631(je jeVar, d dVar) {
        int i10 = f2763 + 113;
        f2761 = i10 % 128;
        int i11 = i10 % 2;
        jeVar.m2629(dVar);
        int i12 = f2763 + 85;
        f2761 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2632(final String str, final b bVar) {
        m2630().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final String strM2637 = je.this.m2637(str);
                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        bVar.mo2642(strM2637);
                    }
                });
            }
        });
        int i10 = f2761 + 55;
        f2763 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2637(String str) {
        int i10 = f2763 + 73;
        f2761 = i10 % 128;
        int i11 = i10 % 2;
        String strM2458 = this.f2764.m2458(str);
        int i12 = f2763 + 115;
        f2761 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return strM2458;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2633(String str, String str2) {
        int i10 = f2761 + 61;
        f2763 = i10 % 128;
        if (i10 % 2 != 0) {
            m2638(str, str2);
            m2638(m2627(str), Long.toString(jx.m2780()));
            throw null;
        }
        m2638(str, str2);
        m2638(m2627(str), Long.toString(jx.m2780()));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2638(String str, String str2) {
        int i10 = f2761 + 93;
        f2763 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2764.m2461(str, str2);
        } else {
            this.f2764.m2461(str, str2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m2639(String str) {
        int i10 = f2763 + 65;
        f2761 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2764.m2460(str);
            throw null;
        }
        int iM2460 = this.f2764.m2460(str);
        int i11 = f2763 + 73;
        f2761 = i11 % 128;
        int i12 = i11 % 2;
        return iM2460;
    }

    public je(Context context, String str, String str2) {
        this.f2764 = new ib(context, str, str2);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2636(final String str, final String str2, final d dVar) {
        m2630().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                je.this.m2638(str, str2);
                je.m2631(je.this, dVar);
            }
        });
        int i10 = f2761 + 5;
        f2763 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap<String, String> m2640(String str, int i10) {
        int i11 = f2761 + 67;
        f2763 = i11 % 128;
        int i12 = i11 % 2;
        HashMap<String, String> mapM2459 = this.f2764.m2459(str, i10);
        int i13 = f2761 + 11;
        f2763 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return mapM2459;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2641(String str, String str2) {
        int i10 = f2763 + 103;
        f2761 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m2636(str, str2, null);
        if (z10) {
            throw null;
        }
        int i11 = f2763 + 71;
        f2761 = i11 % 128;
        if ((i11 % 2 == 0 ? '3' : 'a') == 'a') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2627(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(m2628("Ό⟥啚\ue3c0\u03a2ᘹ㙛皣씸\udfe0缊롴蹭颡ꗟ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
        String string = sb2.toString();
        int i10 = f2761 + 85;
        f2763 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2629(d dVar) {
        int i10 = f2763 + 7;
        f2761 = i10 % 128;
        int i11 = i10 % 2;
        if (dVar != null) {
            t.m3000(new ir(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                }
            });
            int i12 = f2761 + 7;
            f2763 = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = f2763 + 17;
        f2761 = i14 % 128;
        if ((i14 % 2 == 0 ? '\r' : ':') != '\r') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2634(String str) {
        int i10 = f2763 + 107;
        f2761 = i10 % 128;
        int i11 = i10 % 2;
        this.f2764.m2457(str);
        int i12 = f2761 + 21;
        f2763 = i12 % 128;
        if ((i12 % 2 != 0 ? 'A' : (char) 22) == 22) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2628(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f2762, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f2762));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2635(final String str, final String str2, final d dVar) {
        m2630().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                je.this.m2633(str, str2);
                je.m2631(je.this, dVar);
            }
        });
        int i10 = f2763 + 53;
        f2761 = i10 % 128;
        int i11 = i10 % 2;
    }
}
