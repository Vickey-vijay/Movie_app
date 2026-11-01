package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class jd {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jd f2735;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jh f2736;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2737;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2740;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private HashMap<io, ir> f2739 = new HashMap<>();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f2738 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$2, reason: invalid class name */
    public class AnonymousClass2 extends ir {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ io f2742;

        public AnonymousClass2(io ioVar) {
            this.f2742 = ioVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            jd.this.f2739.remove(this.f2742);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$3, reason: invalid class name */
    public class AnonymousClass3 extends ir {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final /* synthetic */ io f2744;

        public AnonymousClass3(io ioVar) {
            this.f2744 = ioVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            jd.this.f2739.put(this.f2744, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.3.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    AnonymousClass3.this.f2744.mo1839();
                }
            });
            jd.m2621(jd.this);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$5, reason: invalid class name */
    public class AnonymousClass5 extends ir {
        public AnonymousClass5() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            if (jd.this.f2736 == null) {
                jd.this.f2736 = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo384(Activity activity) {
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.5.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                final jd jdVar = jd.this;
                                t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        jd.m2612(jd.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo385(Activity activity) {
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.5.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                jd.m2621(jd.this);
                            }
                        });
                    }
                };
                jd.this.f2738.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        jj.m2676().m2679(jd.this.f2736);
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.2.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                jd.m2621(jd.this);
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2612(jd jdVar) {
        jdVar.f2737 = false;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2623(io ioVar) {
        t.m2991(new AnonymousClass2(ioVar));
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m2613(jd jdVar) {
        return new HashMap(jdVar.f2739);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jd m2615() {
        if (f2735 == null) {
            f2735 = new jd();
        }
        return f2735;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2621(jd jdVar) {
        if (jdVar.f2737 || new HashMap(jdVar.f2739).isEmpty()) {
            return;
        }
        jdVar.f2737 = true;
        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (!jd.this.f2737) {
                    jd.this.f2740 = null;
                    return;
                }
                HashMap mapM2613 = jd.m2613(jd.this);
                Iterator it = mapM2613.keySet().iterator();
                while (it.hasNext()) {
                    jd.this.f2738.post((Runnable) mapM2613.get((io) it.next()));
                }
                if (jd.this.f2740 == null) {
                    jd.this.f2740 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.4.5

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f2748 = 1;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f2749 = 0;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static long f2750 = -2943514433089080825L;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static char f2751;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f2752;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m2626(String str, char c10, String str2, int i10, String str3) {
                            String str4;
                            Object charArray = str3;
                            if (str3 != null) {
                                charArray = str3.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            Object charArray2 = str2;
                            if (str2 != null) {
                                charArray2 = str2.toCharArray();
                            }
                            char[] cArr2 = (char[]) charArray2;
                            Object charArray3 = str;
                            if (str != null) {
                                charArray3 = str.toCharArray();
                            }
                            char[] cArr3 = (char[]) charArray3;
                            synchronized (j.f2673) {
                                char[] cArr4 = (char[]) cArr.clone();
                                char[] cArr5 = (char[]) cArr2.clone();
                                cArr4[0] = (char) (c10 ^ cArr4[0]);
                                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                                int length = cArr3.length;
                                char[] cArr6 = new char[length];
                                j.f2675 = 0;
                                while (true) {
                                    int i11 = j.f2675;
                                    if (i11 < length) {
                                        int i12 = (i11 + 2) % 4;
                                        int i13 = (i11 + 3) % 4;
                                        int i14 = cArr4[i11 % 4] * 32718;
                                        char c11 = cArr5[i12];
                                        char c12 = (char) ((i14 + c11) % 65535);
                                        j.f2674 = c12;
                                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                                        cArr4[i13] = c12;
                                        int i15 = j.f2675;
                                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2750) ^ ((long) f2752)) ^ ((long) f2751));
                                        j.f2675 = i15 + 1;
                                    } else {
                                        str4 = new String(cArr6);
                                    }
                                }
                            }
                            return str4;
                        }

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j10) {
                            int i10 = f2748 + 101;
                            f2749 = i10 % 128;
                            int i11 = i10 % 2;
                            try {
                                t.m2995(this);
                                int i12 = f2748 + 107;
                                f2749 = i12 % 128;
                                int i13 = i12 % 2;
                            } catch (Throwable th2) {
                                k.m2824(m2626("傴公绮⻣駸\ue9b0\ud90aխ論⏾㜨骋", (char) Color.argb(0, 0, 0, 0), "爇\uf07d褷휦", ViewConfiguration.getPressedStateDuration() >> 16, "ꓹ㳝晁쿽").intern(), m2626("ㅯ䆦뀻哞朤羆濨㆛釠땐逘綏冗嬻", (char) (View.MeasureSpec.getSize(0) + 49709), "爇\uf07d褷휦", (-1) - ImageFormat.getBitsPerPixel(0), "诿㰅ⷳ鷂").intern(), th2, false);
                            }
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(jd.this.f2740);
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2624() {
        t.m2991(new AnonymousClass5());
    }

    private jd() {
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2625(io ioVar) {
        t.m2991(new AnonymousClass3(ioVar));
    }
}
