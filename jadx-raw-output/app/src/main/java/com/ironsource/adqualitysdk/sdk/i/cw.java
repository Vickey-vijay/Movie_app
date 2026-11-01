package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cw extends cz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1532 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1533 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1534 = 33475;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1535;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1536 = {':', 139, 162, 160, 160, 'y', 'q', 154, 155, 147, 154, 158, 155, 154, 's', 'f', 137, 148, 150, 149, 136, 142, 150, 157, 159, 155, 144, 142, 139, 139, 154, 154, 141, 138, 158, 163, 156, 153, 153, 155, ':', 's', 'n', 'Z', 'X', 'f', 'j', 'g', 'd', 'U', '[', 't', 'r', 't', 'm', 'V', ']', '^', '7', 'C', 'j', 'k', 'n', 'j', 'c', 'k', 'j', 'A', 'I', 'p', 'p', 'r', '[', '[', 'k', 'i', 'i', '9', 'k', 'm', 'o', 'g', 'd', 'd', '[', 'c', 's', 'j', 'b', 'c', 'b', 'h', 'p', 'Z', '1', 'C', 'j', 'k', 'n', 'j', 'c', 'k', 'j', 'A', 'I', 'p', 'p', 'r', '[', '0', 'b', 'c', 'g', 'g', 'f', 'R', '4', '/'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1537;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static View.OnTouchListener m1802(List<Object> list) {
        int i10 = f1537 + 11;
        f1532 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        return ju.m2737((View) cz.m1851(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m1804(List<Object> list) {
        int i10 = f1532 + 91;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        jd.m2615().m2623((io) cz.m1851(list, 0, io.class));
        int i12 = f1532 + 41;
        f1537 = i12 % 128;
        if ((i12 % 2 != 0 ? '!' : '1') != '!') {
            return null;
        }
        int i13 = 44 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m1805(List list, Object[] objArr) {
        int i10 = f1537 + 13;
        f1532 = i10 % 128;
        int i11 = i10 % 2;
        List<Object> listM1808 = m1808(list, objArr);
        int i12 = f1537 + 39;
        f1532 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 24 : '5') == '5') {
            return listM1808;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1812(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            final boolean zM1806 = m1806(list, 2);
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.4

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static char[] f1606 = {'E', 'r', 'o', ' ', 'i', 'n', 'O', 'L', 'a', 'y', 'u', 't', 'C', 'h', 'g', 'e', 's', 'd', 'F', 'G', 'H', 'I', 'J', 'K', 'M'};

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f1607 = 1;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static char f1608 = 5;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static int f1609;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static String m1838(String str, int i10, byte b10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (g.f2129) {
                        char[] cArr2 = f1606;
                        char c10 = f1608;
                        char[] cArr3 = new char[i10];
                        if (i10 % 2 != 0) {
                            i10--;
                            cArr3[i10] = (char) (cArr[i10] - b10);
                        }
                        if (i10 > 1) {
                            g.f2134 = 0;
                            while (true) {
                                int i11 = g.f2134;
                                if (i11 >= i10) {
                                    break;
                                }
                                g.f2133 = cArr[i11];
                                g.f2131 = cArr[g.f2134 + 1];
                                if (g.f2133 == g.f2131) {
                                    cArr3[g.f2134] = (char) (g.f2133 - b10);
                                    cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                                } else {
                                    g.f2132 = g.f2133 / c10;
                                    g.f2130 = g.f2133 % c10;
                                    g.f2135 = g.f2131 / c10;
                                    g.f2128 = g.f2131 % c10;
                                    if (g.f2130 == g.f2128) {
                                        g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                        g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                        int i12 = (g.f2132 * c10) + g.f2130;
                                        int i13 = (g.f2135 * c10) + g.f2128;
                                        int i14 = g.f2134;
                                        cArr3[i14] = cArr2[i12];
                                        cArr3[i14 + 1] = cArr2[i13];
                                    } else if (g.f2132 == g.f2135) {
                                        g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                        g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                        int i15 = (g.f2132 * c10) + g.f2130;
                                        int i16 = (g.f2135 * c10) + g.f2128;
                                        int i17 = g.f2134;
                                        cArr3[i17] = cArr2[i15];
                                        cArr3[i17 + 1] = cArr2[i16];
                                    } else {
                                        int i18 = (g.f2132 * c10) + g.f2128;
                                        int i19 = (g.f2135 * c10) + g.f2130;
                                        int i20 = g.f2134;
                                        cArr3[i20] = cArr2[i18];
                                        cArr3[i20 + 1] = cArr2[i19];
                                    }
                                }
                                g.f2134 += 2;
                            }
                        }
                        str2 = new String(cArr3);
                    }
                    return str2;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int i18 = f1609 + 73;
                    f1607 = i18 % 128;
                    int i19 = i18 % 2;
                    try {
                        final List<Object> listM1805 = cw.m1805(listM1853, new Object[]{this, view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)});
                        if ((zM1806 ? 'O' : (char) 23) == 'O') {
                            dsVar.m2097(duVar, cqVar, listM1805);
                            return;
                        }
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.4.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                dsVar.m2097(duVar, cqVar, listM1805);
                            }
                        });
                        int i20 = f1609 + 25;
                        f1607 = i20 % 128;
                        if ((i20 % 2 == 0 ? (char) 24 : (char) 21) != 21) {
                            int i21 = 41 / 0;
                        }
                    } catch (Throwable th2) {
                        String strM1683 = cqVar.m1683();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m1838("\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0001\b\u0006\b\t\u0005\u0000\f\f\r\u0012\r\t\n\u0011\u0005\u0001\u0013\n\u0010\n\u0014\u0002\u0004\u0000\t\u0013\u0001\u0012\u0010g", 39 - TextUtils.indexOf("", ""), (byte) (70 - Process.getGidForName(""))).intern());
                        sb2.append(dsVar.m2098());
                        co.m1623(strM1683, sb2.toString(), th2);
                    }
                }
            };
            int i10 = f1532 + 11;
            f1537 = i10 % 128;
            int i11 = i10 % 2;
            return onLayoutChangeListener;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1810(new int[]{40, 37, 0, 33}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", true).intern(), e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041 A[PHI: r0 r1
  0x0041: PHI (r0v7 com.ironsource.adqualitysdk.sdk.i.hf$b) = (r0v2 com.ironsource.adqualitysdk.sdk.i.hf$b), (r0v9 com.ironsource.adqualitysdk.sdk.i.hf$b) binds: [B:13:0x003f, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r1v10 android.media.MediaPlayer) = (r1v7 android.media.MediaPlayer), (r1v13 android.media.MediaPlayer) binds: [B:13:0x003f, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r0 r1
  0x0045: PHI (r0v3 com.ironsource.adqualitysdk.sdk.i.hf$b) = (r0v2 com.ironsource.adqualitysdk.sdk.i.hf$b), (r0v9 com.ironsource.adqualitysdk.sdk.i.hf$b) binds: [B:13:0x003f, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r1v8 android.media.MediaPlayer) = (r1v7 android.media.MediaPlayer), (r1v13 android.media.MediaPlayer) binds: [B:13:0x003f, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1815(List<Object> list) {
        MediaPlayer mediaPlayer;
        final hf.b bVar;
        int i10 = f1532 + 59;
        f1537 = i10 % 128;
        if (i10 % 2 == 0) {
            mediaPlayer = (MediaPlayer) cz.m1851(list, 0, MediaPlayer.class);
            bVar = (hf.b) cz.m1851(list, 1, hf.b.class);
            if (m1806(list, 2) ? false : true) {
                ju.m2740(mediaPlayer, new hf.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.hf.b
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo1836(final hf hfVar, final MediaPlayer mediaPlayer2) {
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.8.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                bVar.mo1836(hfVar, mediaPlayer2);
                            }
                        });
                    }
                });
                int i11 = f1537 + 55;
                f1532 = i11 % 128;
                int i12 = i11 % 2;
            } else {
                ju.m2740(mediaPlayer, bVar);
            }
        } else {
            mediaPlayer = (MediaPlayer) cz.m1851(list, 0, MediaPlayer.class);
            bVar = (hf.b) cz.m1851(list, 0, hf.b.class);
            if (m1806(list, 2)) {
                ju.m2740(mediaPlayer, bVar);
            } else {
                ju.m2740(mediaPlayer, new hf.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.8
                    @Override // com.ironsource.adqualitysdk.sdk.i.hf.b
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo1836(final hf hfVar, final MediaPlayer mediaPlayer2) {
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.8.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                bVar.mo1836(hfVar, mediaPlayer2);
                            }
                        });
                    }
                });
                int i13 = f1537 + 55;
                f1532 = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        int i15 = f1532 + 45;
        f1537 = i15 % 128;
        if ((i15 % 2 != 0 ? (char) 19 : 'b') != 19) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1816(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            hf.b bVar = new hf.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.17
                @Override // com.ironsource.adqualitysdk.sdk.i.hf.b
                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                public final void mo1836(hf hfVar, MediaPlayer mediaPlayer) {
                    dsVar.m2097(duVar, cqVar, cw.m1805(listM1853, new Object[]{this, hfVar, mediaPlayer}));
                }
            };
            int i10 = f1537 + 99;
            f1532 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                return bVar;
            }
            int i11 = 28 / 0;
            return bVar;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1807("滛綴⒵峀콈ꃲ￤㶜\uda1d沌ᬞᓥ폳璤摦ቴ㭼霜\uf0f7ǩᘧ㴘ꔝ流ⴢ顶\u2067ꄝ\u0cff햼ꑡ섟뺇쒰霟\uf332ᛕ沪꺌埦ゝ씴뫜ꂎ鐼\uefe3", (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetAfter("", 0), "䃎ザ㭜퓓").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m1818(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            hj.c cVar = new hj.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.18
                @Override // com.ironsource.adqualitysdk.sdk.i.hj.c
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo1837(hj hjVar, MediaPlayer mediaPlayer) {
                    dsVar.m2097(duVar, cqVar, cw.m1805(listM1853, new Object[]{this, hjVar, mediaPlayer}));
                }
            };
            int i10 = f1537 + 53;
            f1532 = i10 % 128;
            int i11 = i10 % 2;
            return cVar;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1807("\ue224叓쳘\uf0e5叀Ђ䷴ꔒ⛔팈鯽᧽쯶\uece1ᶷ\udff7閭흥⚿ɡᬅ臦䞠ᷱ鼌똕㘈❘ꍗꖀǡ킶䉹갥뀀\uf38c⯗ᄎ㏁훞⧿蚂盂냸\udec9鏰䕤頰", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumFlingVelocity() >> 16, "ኼ䍹鱗뫳").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final io m1820(final cq cqVar, List<Object> list, final du duVar) {
        final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
        final ArrayList arrayList = new ArrayList();
        if ((list.size() > 1 ? '<' : (char) 24) == '<') {
            int i10 = f1537 + 3;
            f1532 = i10 % 128;
            if (i10 % 2 == 0) {
            }
            arrayList.addAll((Collection) cz.m1851(list, 1, List.class));
        }
        if (dsVar != null) {
            return new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.5
                @Override // com.ironsource.adqualitysdk.sdk.i.io
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo1839() {
                    arrayList.add(0, this);
                    dsVar.m2097(duVar, cqVar, arrayList);
                    arrayList.remove(0);
                }
            };
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1825(List<Object> list) {
        int i10 = f1532 + 7;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        View view = (View) cz.m1851(list, 0, View.class);
        final hd.d dVar = (hd.d) cz.m1851(list, 1, hd.d.class);
        if (!(m1806(list, 2) ? false : true)) {
            ju.m2741(view, dVar);
            int i12 = f1537 + 101;
            f1532 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            ju.m2741(view, new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.14
                @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo1834(final hd hdVar, final View view2) {
                    t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.14.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            dVar.mo1834(hdVar, view2);
                        }
                    });
                }
            });
        }
        int i14 = f1537 + 49;
        f1532 = i14 % 128;
        if ((i14 % 2 == 0 ? 'Z' : (char) 1) == 1) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1827(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            hd.d dVar = new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.9
                @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                /* JADX INFO: renamed from: ﾒ */
                public final void mo1834(hd hdVar, View view) {
                    dsVar.m2097(duVar, cqVar, cw.m1805(listM1853, new Object[]{this, hdVar, view}));
                }
            };
            int i10 = f1532 + 113;
            f1537 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                return dVar;
            }
            throw null;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1807("ﻖ胅厬슼廴찯Ჴ퉕懜幙Ɔ퀂漃ᇚ\uf024캹⛠䞾ඥ\uf652謐ꪠ䯍柵婢雪뭲꣩Ԍܵ\udc86当웺鈰", (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", ViewConfiguration.getLongPressTimeout() >> 16, "Կ鍻ꮪඹ").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static WebChromeClient m1795(List<Object> list) {
        int i10 = f1532 + 17;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        WebChromeClient webChromeClientM2898 = ki.m2898((WebView) cz.m1851(list, 0, WebView.class));
        int i12 = f1532 + 17;
        f1537 = i12 % 128;
        int i13 = i12 % 2;
        return webChromeClientM2898;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static WebViewClient m1796(List<Object> list) {
        int i10 = f1532 + 21;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        WebViewClient webViewClientM2907 = ki.m2907((WebView) cz.m1851(list, 0, WebView.class));
        int i12 = f1537 + 75;
        f1532 = i12 % 128;
        int i13 = i12 % 2;
        return webViewClientM2907;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static js m1797(List<Object> list) {
        int i10 = f1532 + 5;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        js jsVarM2717 = js.m2717((WebView) cz.m1851(list, 0, WebView.class), m1810(new int[]{109, 9, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", false).intern());
        int i12 = f1532 + 39;
        f1537 = i12 % 128;
        if ((i12 % 2 != 0 ? 'L' : ']') != 'L') {
            return jsVarM2717;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static boolean m1798(List<Object> list) {
        int i10 = f1537 + 81;
        f1532 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        return ka.m2832(cz.m1851(list, 0, Object.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r4 != null ? '8' : '-') != '-') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r4 = r4.mo742();
        r0 = com.ironsource.adqualitysdk.sdk.i.cw.f1537 + 83;
        com.ironsource.adqualitysdk.sdk.i.cw.f1532 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.cw.f1537 + 35;
        com.ironsource.adqualitysdk.sdk.i.cw.f1532 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m1799(java.util.List<java.lang.Object> r4) {
        /*
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hg> r0 = com.ironsource.adqualitysdk.sdk.i.hg.class
            int r1 = com.ironsource.adqualitysdk.sdk.i.cw.f1532
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1537 = r2
            int r1 = r1 % 2
            r2 = 72
            if (r1 == 0) goto L13
            r1 = 12
            goto L14
        L13:
            r1 = r2
        L14:
            r3 = 0
            if (r1 == r2) goto L28
            java.lang.Object r4 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r4, r3, r0)
            com.ironsource.adqualitysdk.sdk.i.hg r4 = (com.ironsource.adqualitysdk.sdk.i.hg) r4
            r0 = 45
            if (r4 == 0) goto L24
            r1 = 56
            goto L25
        L24:
            r1 = r0
        L25:
            if (r1 == r0) goto L3f
            goto L30
        L28:
            java.lang.Object r4 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r4, r3, r0)
            com.ironsource.adqualitysdk.sdk.i.hg r4 = (com.ironsource.adqualitysdk.sdk.i.hg) r4
            if (r4 == 0) goto L3f
        L30:
            java.lang.Object r4 = r4.mo742()
            int r0 = com.ironsource.adqualitysdk.sdk.i.cw.f1537
            int r0 = r0 + 83
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1532 = r1
            int r0 = r0 % 2
            return r4
        L3f:
            r4 = 0
            int r0 = com.ironsource.adqualitysdk.sdk.i.cw.f1537
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1532 = r1
            int r0 = r0 % 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cw.m1799(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static Object m1800(List<Object> list) {
        int i10 = f1532 + 29;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        ((js) cz.m1851(list, 0, js.class)).m2719();
        int i12 = f1537 + 3;
        f1532 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static Object m1801(List<Object> list) {
        int i10 = f1537 + 103;
        f1532 = i10 % 128;
        int i11 = i10 % 2;
        ((js) cz.m1851(list, 0, js.class)).m2723();
        int i12 = f1537 + 39;
        f1532 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((m1806(r6, 2) ? '\'' : '%') != '%') goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (m1806(r6, 2) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1537 + 93;
        com.ironsource.adqualitysdk.sdk.i.cw.f1532 = r6 % 128;
        r6 = r6 % 2;
        com.ironsource.adqualitysdk.sdk.i.ju.m2745(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ju.m2745(r1, new com.ironsource.adqualitysdk.sdk.i.cw.AnonymousClass12());
        r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1532 + 123;
        com.ironsource.adqualitysdk.sdk.i.cw.f1537 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1823(java.util.List<java.lang.Object> r6) {
        /*
            r5 = this;
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hh$c> r0 = com.ironsource.adqualitysdk.sdk.i.hh.c.class
            int r1 = com.ironsource.adqualitysdk.sdk.i.cw.f1537
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1532 = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r4
        L13:
            if (r1 == 0) goto L32
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r6, r3, r1)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r6, r4, r0)
            com.ironsource.adqualitysdk.sdk.i.hh$c r0 = (com.ironsource.adqualitysdk.sdk.i.hh.c) r0
            boolean r6 = m1806(r6, r2)
            r3 = 37
            if (r6 == 0) goto L2e
            r6 = 39
            goto L2f
        L2e:
            r6 = r3
        L2f:
            if (r6 == r3) goto L53
            goto L46
        L32:
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r6, r4, r1)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m1851(r6, r4, r0)
            com.ironsource.adqualitysdk.sdk.i.hh$c r0 = (com.ironsource.adqualitysdk.sdk.i.hh.c) r0
            boolean r6 = m1806(r6, r2)
            if (r6 == 0) goto L53
        L46:
            int r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1537
            int r6 = r6 + 93
            int r3 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1532 = r3
            int r6 = r6 % r2
            com.ironsource.adqualitysdk.sdk.i.ju.m2745(r1, r0)
            goto L64
        L53:
            com.ironsource.adqualitysdk.sdk.i.cw$12 r6 = new com.ironsource.adqualitysdk.sdk.i.cw$12
            r6.<init>()
            com.ironsource.adqualitysdk.sdk.i.ju.m2745(r1, r6)
            int r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1532
            int r6 = r6 + 123
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1537 = r0
            int r6 = r6 % r2
        L64:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cw.m1823(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m1811(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final ds dsVar2 = (ds) cz.m1851(list, 1, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 2);
            final boolean zM1806 = m1806(list, 3);
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.1

                /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                private static int f1538 = 0;

                /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                private static boolean f1539 = true;

                /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                private static int f1540 = 1;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static boolean f1541 = true;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static char[] f1542 = {362, 407, 404, 325, 398, 403, 372, 358, 409, 390, 392, 397, 376, 394, 360, 396, 369, 408, 393};

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static int f1543 = 293;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static String m1828(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
                    Object bytes = str2;
                    if (str2 != null) {
                        bytes = str2.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (m.f2988) {
                        char[] cArr2 = f1542;
                        int i11 = f1543;
                        if (f1539) {
                            int length = bArr.length;
                            m.f2990 = length;
                            char[] cArr3 = new char[length];
                            m.f2989 = 0;
                            while (m.f2989 < m.f2990) {
                                int i12 = m.f2989;
                                int i13 = m.f2990 - 1;
                                int i14 = m.f2989;
                                cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                                m.f2989 = i14 + 1;
                            }
                            return new String(cArr3);
                        }
                        if (f1541) {
                            int length2 = cArr.length;
                            m.f2990 = length2;
                            char[] cArr4 = new char[length2];
                            m.f2989 = 0;
                            while (m.f2989 < m.f2990) {
                                int i15 = m.f2989;
                                int i16 = m.f2990 - 1;
                                int i17 = m.f2989;
                                cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                                m.f2989 = i17 + 1;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        m.f2990 = length3;
                        char[] cArr5 = new char[length3];
                        m.f2989 = 0;
                        while (m.f2989 < m.f2990) {
                            int i18 = m.f2989;
                            int i19 = m.f2990 - 1;
                            int i20 = m.f2989;
                            cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                            m.f2989 = i20 + 1;
                        }
                        return new String(cArr5);
                    }
                }

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private void m1829(final ds dsVar3, View view) {
                    int i10 = f1538 + 49;
                    f1540 = i10 % 128;
                    int i11 = i10 % 2;
                    try {
                        final List<Object> listM1805 = cw.m1805(listM1853, new Object[]{this, view});
                        if (!(zM1806)) {
                            t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.1.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    ds dsVar4 = dsVar3;
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    dsVar4.m2097(duVar, cqVar, listM1805);
                                }
                            });
                            int i12 = f1540 + 13;
                            f1538 = i12 % 128;
                            int i13 = i12 % 2;
                            return;
                        }
                        int i14 = f1540 + 67;
                        f1538 = i14 % 128;
                        if ((i14 % 2 != 0 ? '3' : 'H') == 'H') {
                            dsVar3.m2097(duVar, cqVar, listM1805);
                        } else {
                            dsVar3.m2097(duVar, cqVar, listM1805);
                            throw null;
                        }
                    } catch (Throwable th2) {
                        String strM1683 = cqVar.m1683();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m1828(null, TextUtils.indexOf("", "", 0, 0) + 127, null, "\u0084\u008e\u0093\u0085\u0092\u0086\u0085\u0084\u0082\u008e\u0086\u008e\u0089\u0092\u0085\u0091\u008e\u0090\u0086\u008a\u008c\u008f\u008e\u0089\u008a\u0089\u008d\u008c\u008b\u008a\u0089\u0089\u0088\u0086\u0087\u0084\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern());
                        sb2.append(dsVar3.m2098());
                        co.m1623(strM1683, sb2.toString(), th2);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    int i10 = f1540 + 75;
                    f1538 = i10 % 128;
                    int i11 = i10 % 2;
                    m1829(dsVar, view);
                    int i12 = f1540 + 111;
                    f1538 = i12 % 128;
                    if (i12 % 2 == 0) {
                    } else {
                        throw null;
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    int i10 = f1538 + 11;
                    f1540 = i10 % 128;
                    int i11 = i10 % 2;
                    m1829(dsVar2, view);
                    int i12 = f1538 + 109;
                    f1540 = i12 % 128;
                    int i13 = i12 % 2;
                }
            };
            int i10 = f1532 + 63;
            f1537 = i10 % 128;
            if (i10 % 2 == 0) {
                return onAttachStateChangeListener;
            }
            throw null;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1807("㬃䕸\ud8b1沆팽睮퓑\ueafd勒獩쵦뇈熏챍\u0bdaꘛ픧\uf240᚜헵옉蟧\uda5cKⓣ\uecd6랇膪材袓⋳⠅蔋灔蟲턛\ud989\uf69e䠦嶈녢蜕", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 18406), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0), "銐魉\ue679鵇").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1821(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            hh.c cVar = new hh.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.13
                @Override // com.ironsource.adqualitysdk.sdk.i.hh.c
                /* JADX INFO: renamed from: ｋ */
                public final boolean mo1833(hh hhVar, View view, MotionEvent motionEvent) {
                    return dsVar.m2097(duVar, cqVar, cw.m1805(listM1853, new Object[]{this, hhVar, view, motionEvent})).m2091();
                }
            };
            int i10 = f1537 + 7;
            f1532 = i10 % 128;
            if ((i10 % 2 == 0 ? 'C' : ')') == ')') {
                return cVar;
            }
            int i11 = 0 / 0;
            return cVar;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1807("飏\udd55\ude01\u202b咭ꏦ쀅䔃\uec00蕒\uf1dd㺼塥撃❳楒\udf85\ueb64\ud90b佳耲玓嵹꺸仂믟焚栎碴丽㽭ꌈ櫨쭜", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", Color.blue(0), "꽎潿쇕\ude67").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View.OnClickListener m1809(List<Object> list) {
        int i10 = f1532 + 75;
        f1537 = i10 % 128;
        int i11 = i10 % 2;
        View.OnClickListener onClickListenerM2742 = ju.m2742((View) cz.m1851(list, 0, View.class));
        int i12 = f1532 + 45;
        f1537 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return onClickListenerM2742;
        }
        int i13 = 24 / 0;
        return onClickListenerM2742;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1817(List<Object> list) {
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m1851(list, 0, MediaPlayer.class);
        final hj.c cVar = (hj.c) cz.m1851(list, 1, hj.c.class);
        if ((m1806(list, 2) ? 'A' : (char) 2) != 'A') {
            ju.m2744(mediaPlayer, new hj.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.2
                @Override // com.ironsource.adqualitysdk.sdk.i.hj.c
                /* JADX INFO: renamed from: ｋ */
                public final void mo1837(final hj hjVar, final MediaPlayer mediaPlayer2) {
                    t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.2.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            cVar.mo1837(hjVar, mediaPlayer2);
                        }
                    });
                }
            });
            int i10 = f1532 + 81;
            f1537 = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        int i12 = f1532 + 55;
        f1537 = i12 % 128;
        int i13 = i12 % 2;
        ju.m2744(mediaPlayer, cVar);
        return null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m1819(List<Object> list) {
        int i10 = f1537 + 67;
        f1532 = i10 % 128;
        int i11 = i10 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m1851(list, 0, MediaPlayer.class);
        final hc.c cVar = (hc.c) cz.m1851(list, 1, hc.c.class);
        if (!(m1806(list, 2))) {
            ju.m2747(mediaPlayer, new hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.7
                @Override // com.ironsource.adqualitysdk.sdk.i.hc.c
                /* JADX INFO: renamed from: ﻐ */
                public final boolean mo1835(final hc hcVar, final MediaPlayer mediaPlayer2, final int i12, final int i13) {
                    t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.7.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            cVar.mo1835(hcVar, mediaPlayer2, i12, i13);
                        }
                    });
                    return false;
                }
            });
            return null;
        }
        int i12 = f1537 + 7;
        f1532 = i12 % 128;
        boolean z10 = i12 % 2 != 0;
        ju.m2747(mediaPlayer, cVar);
        if (z10) {
            return null;
        }
        int i13 = 41 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1803(List<Object> list) {
        int i10 = f1532 + 117;
        f1537 = i10 % 128;
        jd.m2615().m2625((io) cz.m1851(list, (i10 % 2 != 0 ? (char) 27 : '(') != '(' ? 1 : 0, io.class));
        return null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1813(List<Object> list) {
        int i10 = f1537 + 91;
        f1532 = i10 % 128;
        int i11 = i10 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m1851(list, 0, MediaPlayer.class);
        final he.a aVar = (he.a) cz.m1851(list, 1, he.a.class);
        if ((m1806(list, 2) ? (char) 21 : (char) 5) != 21) {
            ju.m2748(mediaPlayer, new he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.3
                @Override // com.ironsource.adqualitysdk.sdk.i.he.a
                /* JADX INFO: renamed from: ﻐ */
                public final void mo1832(final he heVar, final MediaPlayer mediaPlayer2) {
                    t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.3.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            aVar.mo1832(heVar, mediaPlayer2);
                        }
                    });
                }
            });
        } else {
            int i12 = f1532 + 115;
            f1537 = i12 % 128;
            int i13 = i12 % 2;
            ju.m2748(mediaPlayer, aVar);
        }
        int i14 = f1537 + 81;
        f1532 = i14 % 128;
        if ((i14 % 2 == 0 ? 'a' : '[') == '[') {
            return null;
        }
        int i15 = 33 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1824(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            hc.c cVar = new hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.15
                @Override // com.ironsource.adqualitysdk.sdk.i.hc.c
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final boolean mo1835(hc hcVar, MediaPlayer mediaPlayer, int i10, int i11) {
                    return dsVar.m2097(duVar, cqVar, cw.m1805(listM1853, new Object[]{this, hcVar, mediaPlayer, Integer.valueOf(i10), Integer.valueOf(i11)})).m2091();
                }
            };
            int i10 = f1537 + 79;
            f1532 = i10 % 128;
            if (i10 % 2 != 0) {
                return cVar;
            }
            int i11 = 40 / 0;
            return cVar;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1810(new int[]{0, 40, 48, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", false).intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1826(final cq cqVar, List<Object> list) {
        final String simpleName;
        final boolean zBooleanValue = false;
        Class cls = (Class) cz.m1851(list, 0, Class.class);
        Object objM1851 = cz.m1851(list, 1, Object.class);
        if ((list.size() > 2 ? '2' : '<') != '<') {
            int i10 = f1532 + 117;
            f1537 = i10 % 128;
            int i11 = i10 % 2;
            zBooleanValue = ((Boolean) cz.m1851(list, 2, Boolean.class)).booleanValue();
        }
        if ((list.size() > 3 ? (char) 27 : (char) 22) != 27) {
            simpleName = cls.getSimpleName();
        } else {
            int i12 = f1537 + 123;
            f1532 = i12 % 128;
            int i13 = i12 % 2;
            simpleName = (String) cz.m1851(list, 3, String.class);
        }
        return ka.m2833(cls, objM1851, new ka.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.10

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f1554 = 109;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1555 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static boolean f1556 = true;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1557 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static boolean f1558 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1559 = {155, 178, 223, 220, 141, 214, 219, 227, 216, 212, 218, 210, 225, 213, 209, 217, 224};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m1830(String str, int i14, int[] iArr, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (m.f2988) {
                    char[] cArr2 = f1559;
                    int i15 = f1554;
                    if (f1556) {
                        int length = bArr.length;
                        m.f2990 = length;
                        char[] cArr3 = new char[length];
                        m.f2989 = 0;
                        while (m.f2989 < m.f2990) {
                            int i16 = m.f2989;
                            int i17 = m.f2990 - 1;
                            int i18 = m.f2989;
                            cArr3[i16] = (char) (cArr2[bArr[i17 - i18] + i14] - i15);
                            m.f2989 = i18 + 1;
                        }
                        return new String(cArr3);
                    }
                    if (f1558) {
                        int length2 = cArr.length;
                        m.f2990 = length2;
                        char[] cArr4 = new char[length2];
                        m.f2989 = 0;
                        while (m.f2989 < m.f2990) {
                            int i19 = m.f2989;
                            int i20 = m.f2990 - 1;
                            int i21 = m.f2989;
                            cArr4[i19] = (char) (cArr2[cArr[i20 - i21] - i14] - i15);
                            m.f2989 = i21 + 1;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f2990 = length3;
                    char[] cArr5 = new char[length3];
                    m.f2989 = 0;
                    while (m.f2989 < m.f2990) {
                        int i22 = m.f2989;
                        int i23 = m.f2990 - 1;
                        int i24 = m.f2989;
                        cArr5[i22] = (char) (cArr2[iArr[i23 - i24] - i14] - i15);
                        m.f2989 = i24 + 1;
                    }
                    return new String(cArr5);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ka.e
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1831(Object obj, Method method, Object[] objArr) {
                int i14 = f1557 + 71;
                f1555 = i14 % 128;
                int i15 = i14 % 2;
                if (method != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(simpleName);
                        sb2.append(m1830(null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, "\u0081").intern());
                        sb2.append(method.getName());
                        String string = sb2.toString();
                        List<Object> listM1805 = cw.m1805(objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(hg) obj});
                        ArrayList arrayList = new ArrayList();
                        if (zBooleanValue) {
                            int i16 = f1557 + 25;
                            f1555 = i16 % 128;
                            if ((i16 % 2 != 0 ? '(' : (char) 4) != 4) {
                                arrayList.add(listM1805);
                                try {
                                    throw null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            arrayList.add(listM1805);
                            listM1805 = arrayList;
                        }
                        cqVar.m1684().mo1544(string, listM1805);
                    } catch (Exception e10) {
                        String strM1683 = cqVar.m1683();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m1830(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u0085\u008a\u0087\u0086\u0089\u0084\u0088\u0087\u0086\u0085\u0083\u0084\u0083\u0083\u0082").intern());
                        sb3.append(method.getName());
                        sb3.append(m1830(null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0085\u0087\u0084\u0085\u008f\u0084\u008e\u008d\u008c\u008b\u0085").intern());
                        sb3.append(simpleName);
                        sb3.append(m1830(null, View.MeasureSpec.getMode(0) + 127, null, "\u0083\u008c\u0087\u008c\u008d\u0091\u0086\u0090\u0085").intern());
                        co.m1623(strM1683, sb3.toString(), e10);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1814(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            final boolean zM1806 = m1806(list, 2);
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.6
                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                public static /* synthetic */ void m1840(AnonymousClass6 anonymousClass6, ds dsVar2, du duVar2, cq cqVar2, List list2, Context context, Intent intent) {
                    dsVar2.m2097(duVar2, cqVar2, cw.m1805(list2, new Object[]{anonymousClass6, context, intent}));
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(final Context context, final Intent intent) {
                    if (zM1806) {
                        dsVar.m2097(duVar, cqVar, cw.m1805(listM1853, new Object[]{this, context, intent}));
                    } else {
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.6.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                AnonymousClass6.m1840(anonymousClass6, dsVar, duVar, cqVar, listM1853, context, intent);
                            }
                        });
                    }
                }
            };
            int i10 = f1532 + 91;
            f1537 = i10 % 128;
            if ((i10 % 2 != 0 ? '@' : 'Z') == 'Z') {
                return broadcastReceiver;
            }
            int i11 = 87 / 0;
            return broadcastReceiver;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1810(new int[]{77, 32, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1822(final cq cqVar, List<Object> list, final du duVar) {
        try {
            final ds dsVar = (ds) cz.m1851(list, 0, ds.class);
            final List<Object> listM1853 = cz.m1853(list, 1);
            he.a aVar = new he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.11
                @Override // com.ironsource.adqualitysdk.sdk.i.he.a
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo1832(he heVar, MediaPlayer mediaPlayer) {
                    dsVar.m2097(duVar, cqVar, cw.m1805(listM1853, new Object[]{this, heVar, mediaPlayer}));
                }
            };
            int i10 = f1532 + 113;
            f1537 = i10 % 128;
            int i11 = i10 % 2;
            return aVar;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1807("핝\uf069蚿Ỵ죡\ue1c4粒⇎⍉粞雥ⶸ꩸\ue05d☳♣㚈뒭俟梨巏鴂쒠뒧Ἠ撣鮦⥲\u1ccf\uf3b5㖺\uef14類新ت﹠襯ở偱瓮Ｋ䟟ꤑ⃭", (char) (48125 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumFlingVelocity() >> 16, "㈢㊘ﺸ皻").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<Object> m1808(List<Object> list, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            int i10 = f1532 + 83;
            f1537 = i10 % 128;
            boolean z10 = i10 % 2 == 0;
            arrayList.addAll(list);
            if (!z10) {
                throw null;
            }
        }
        int i11 = f1532 + 23;
        f1537 = i11 % 128;
        int i12 = i11 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1806(List<Object> list, int i10) {
        int i11 = f1537 + 61;
        f1532 = i11 % 128;
        int i12 = i11 % 2;
        if ((list.size() > i10 ? '>' : (char) 7) == 7) {
            return false;
        }
        int i13 = f1532 + 83;
        f1537 = i13 % 128;
        int i14 = i13 % 2;
        return (((Boolean) cz.m1851(list, i10, Boolean.class)).booleanValue() ? '@' : ':') != ':';
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1810(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f1536, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1807(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1533) ^ ((long) f1535)) ^ ((long) f1534));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }
}
