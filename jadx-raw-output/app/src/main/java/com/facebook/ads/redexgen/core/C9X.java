package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9X extends AbstractC2659ox implements InterfaceC2568nQ {
    public static byte[] A0n;
    public static String[] A0o = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C2660oy A09;
    public C2643og A0A;
    public C2643og A0B;
    public C2643og A0C;
    public C2638ob A0D;
    public C2636oZ A0E;
    public C2607o4 A0F;
    public C2603o0 A0G;
    public C4N A0H;
    public C9Y A0I;
    public C10416x A0J;
    public C7I A0K;
    public CL A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C2636oZ A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Handler A0Y;
    public final Looper A0Z;
    public final InterfaceC09392z A0a;
    public final C2625oN A0b;
    public final C3T A0c;
    public final C3W A0d;
    public final C2566nO A0e;
    public final C9W A0f;
    public final InterfaceC2557nF A0g;
    public final EK A0h;
    public final EL A0i;
    public final CopyOnWriteArraySet<InterfaceC10125u> A0j;
    public final CopyOnWriteArraySet<InterfaceC09322s> A0k;
    public final boolean A0l;
    public final InterfaceC2564nM[] A0m;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0n, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0n = new byte[]{102, 29, 74, 119, 96, 95, 99, 110, 118, 106, 125, 70, 98, 127, 99, 0, 61, ExifInterface.START_CODE, 21, 41, 36, 60, 32, 55, 9, 44, 39, 106, 119, 107, 125, 107, 116, 70, 97, 102, 123, 47, 71, 123, 118, 110, 114, 101, 55, 126, 100, 55, 118, 116, 116, 114, 100, 100, 114, 115, 55, 120, 121, 55, 99, 127, 114, 55, 96, 101, 120, 121, 112, 55, 99, 127, 101, 114, 118, 115, 57, 29, 84, 98, 101, 101, 114, 121, 99, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 82, 111, 103, 114, 116, 99, 114, 115, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 68, 114, 114, 55, 127, 99, 99, 103, 100, 45, 56, 56, 114, 111, 120, 103, 123, 118, 110, 114, 101, 57, 115, 114, 97, 56, 126, 100, 100, 98, 114, 100, 56, 103, 123, 118, 110, 114, 101, 58, 118, 116, 116, 114, 100, 100, 114, 115, 58, 120, 121, 58, 96, 101, 120, 121, 112, 58, 99, 127, 101, 114, 118, 115, 20, 35, ExifInterface.START_CODE, 35, 39, 53, 35, 102, 122, 86, 43, 80, 99, 98, 92, 96, 109, 117, 105, 126, 95, 120, 109, 120, 105, 79, 100, 109, 98, 107, 105, 104, 93, 75, 75, 69, 122, 65, 14, 71, 73, 64, 65, 92, 75, 74, 14, 76, 75, 77, 79, 91, 93, 75, 14, 79, 64, 14, 79, 74, 14, 71, 93, 14, 94, 66, 79, 87, 71, 64, 73};
    }

    static {
        A06();
    }

    public C9X(InterfaceC2564nM[] interfaceC2564nMArr, EK ek2, C6S c6s, EU eu, C3T c3t) {
        this(interfaceC2564nMArr, ek2, c6s, eu, c3t, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public C9X(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC2564nM[] interfaceC2564nMArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") EK ek2, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") C6S c6s, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") EU eu, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") C3T c3t, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, long j10, boolean z16, int i10, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, InterfaceC09392z interfaceC09392z) {
        InterfaceC09392z interfaceC09392z2 = interfaceC09392z;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(194, 3, 26) + AbstractC09664a.A04 + A04(193, 1, 54));
        this.A0d = new C3W();
        try {
            this.A0M = z22;
            C3M.A08(interfaceC2564nMArr.length > 0);
            this.A0m = (InterfaceC2564nM[]) C3M.A01(interfaceC2564nMArr);
            this.A0h = (EK) C3M.A01(ek2);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C2643og.A0Z;
            this.A0B = C2643og.A0Z;
            this.A0C = C2643og.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C2660oy.A07;
            this.A0W = 0L;
            this.A0k = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC2557nF analyticsCollector = InterfaceC2557nF.A00;
            this.A0g = analyticsCollector;
            this.A0K = C7I.A03;
            this.A06 = 1;
            this.A0e = new C2566nO();
            this.A0i = new EL(new C7G[interfaceC2564nMArr.length], new InterfaceC2464lj[interfaceC2564nMArr.length], C2609o6.A03, null);
            this.A0b = new C2625oN();
            this.A0T = new C09272n().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, ek2.A0Y()).A04();
            this.A0E = new C09272n().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C2603o0.A03;
            this.A0D = C2638ob.A06;
            this.A0Z = Looper.myLooper();
            final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.60
                @Override // android.os.Handler
                public final void handleMessage(Message msg) throws Throwable {
                    if (AbstractC1656Vl.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.A0N(msg);
                    } catch (Throwable th2) {
                        AbstractC1656Vl.A00(th2, this);
                    }
                }
            };
            this.A0c = c3t;
            this.A0a = interfaceC09392z2 == null ? this : interfaceC09392z2;
            this.A0J = new C10416x(Timeline.A02, 0L, C2491mA.A06, this.A0i);
            this.A0f = new C9W(interfaceC2564nMArr, ek2, this.A0i, c6s, eu, this.A0Q, this.A05, this.A0S, this.A0X, c3t, z10, z11, z12, z13, z14, z15, j10, z16, i10, z17, z18, z19, z20, z21, z23, C10567m.A03);
            this.A0F = C2607o4.A06;
            this.A0H = C4N.A03;
            this.A0Y = new Handler(this.A0f.A1B());
            this.A0j = new CopyOnWriteArraySet<>();
        } finally {
            this.A0d.A04();
        }
    }

    private long A00(long j10) {
        long jA01 = AbstractC09121w.A01(j10);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            long positionMs = this.A0b.A0B();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private long A01(Timeline timeline, C2501mL c2501mL, long j10) {
        timeline.A0J(c2501mL.A04, this.A0b);
        return j10 + this.A0b.A0C();
    }

    private C10416x A02(boolean z10, boolean z11, int i10) {
        EL el2;
        if (z10) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7Z();
            this.A01 = A7U();
            this.A08 = A7W();
            this.A07 = A0J();
        }
        Timeline timeline = z11 ? Timeline.A02 : this.A0J.A03;
        C2501mL c2501mL = this.A0J.A05;
        long j10 = this.A0J.A02;
        long j11 = this.A0J.A01;
        C2491mA c2491mA = z11 ? C2491mA.A06 : this.A0J.A06;
        if (z11) {
            el2 = this.A0i;
        } else {
            C10416x c10416x = this.A0J;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            el2 = c10416x.A07;
        }
        return new C10416x(timeline, c2501mL, j10, j11, i10, false, c2491mA, el2, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private AnonymousClass71 A03(AnonymousClass70 anonymousClass70) {
        int iA7Z = A7Z();
        C9W c9w = this.A0f;
        Timeline timeline = this.A0J.A03;
        if (iA7Z == -1) {
            iA7Z = 0;
        }
        return new AnonymousClass71(c9w, anonymousClass70, timeline, iA7Z, this.A0c, this.A0f.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0d.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String strA0n = AbstractC09664a.A0n(A04(38, 147, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0l) {
                Log.w(A04(2, 13, 30), strA0n, this.A0N ? null : new IllegalStateException());
                if (A0o[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0o[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(strA0n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    private void A07(C10416x c10416x, int i10, boolean z10, int i11) {
        int i12;
        C10416x c10416xA06 = c10416x;
        this.A03 -= i10;
        if (this.A03 == 0) {
            if (c10416xA06.A02 == -9223372036854775807L) {
                c10416xA06 = c10416xA06.A06(c10416xA06.A05, 0L, c10416xA06.A01, c10416xA06.A0D);
            }
            C10416x playbackInfo = this.A0J;
            if (playbackInfo.A03.A0N()) {
                boolean z11 = this.A0O;
                String[] strArr = A0o;
                if (strArr[3].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0o[6] = "E7I7Mej0S3DTzUCwep";
                if (z11) {
                    if (c10416xA06.A03.A0N()) {
                        this.A01 = 0;
                        this.A02 = 0;
                        this.A08 = 0L;
                        this.A07 = 0L;
                    }
                }
            } else if (c10416xA06.A03.A0N()) {
                this.A01 = 0;
                this.A02 = 0;
                this.A08 = 0L;
                this.A07 = 0L;
            }
            if (this.A0O) {
                i12 = 0;
            } else {
                i12 = 2;
            }
            boolean z12 = this.A0P;
            this.A0O = false;
            this.A0P = false;
            A08(c10416xA06, z10, i11, i12, z12);
        }
    }

    private void A08(C10416x c10416x, boolean z10, int i10, int i11, boolean z11) {
        Iterator<InterfaceC09322s> it;
        boolean isLoadingChanged = this.A0J.A03 != c10416x.A03;
        int i12 = this.A0J.A00;
        String[] strArr = A0o;
        if (strArr[2].length() == strArr[4].length()) {
            String[] strArr2 = A0o;
            strArr2[7] = "RJsywmu9iXbSHAOSoooup4iB6ctJ9GEd";
            strArr2[0] = "je0JKUsqzBp1pj8TVGEWBsFZVePcLGnq";
            boolean z12 = i12 != c10416x.A00;
            boolean playbackStateChanged = this.A0J.A0A;
            boolean timelineChanged = c10416x.A0A;
            boolean z13 = playbackStateChanged != timelineChanged;
            boolean z14 = this.A0J.A07 != c10416x.A07;
            this.A0J = c10416x;
            if (isLoadingChanged || i11 == 0) {
                Iterator<InterfaceC09322s> it2 = this.A0k.iterator();
                while (timelineChanged) {
                    InterfaceC09322s next = it2.next();
                    Timeline timeline = this.A0J.A03;
                    String[] strArr3 = A0o;
                    if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                        throw new RuntimeException();
                    }
                    A0o[6] = "RAQE2IWZazAhX";
                    next.AFQ(timeline, i11);
                }
            }
            if (z10) {
                Iterator<InterfaceC09322s> it3 = this.A0k.iterator();
                while (timelineChanged) {
                    it3.next();
                }
            }
            if (z14) {
                this.A0h.A0c(this.A0J.A07.A02);
                Iterator<InterfaceC09322s> it4 = this.A0k.iterator();
                while (timelineChanged) {
                    it4.next().AFU(this.A0J.A07.A01);
                }
            }
            if (z13) {
                Iterator<InterfaceC09322s> it5 = this.A0k.iterator();
                while (true) {
                    boolean zHasNext = it5.hasNext();
                    String[] strArr4 = A0o;
                    if (strArr4[2].length() == strArr4[4].length()) {
                        A0o[6] = "XRa";
                        if (!zHasNext) {
                            break;
                        } else {
                            it5.next();
                        }
                    }
                }
            }
            if (z12) {
                CopyOnWriteArraySet<InterfaceC09322s> copyOnWriteArraySet = this.A0k;
                if (A0o[1].charAt(28) != 'y') {
                    String[] strArr5 = A0o;
                    strArr5[3] = "HK22odgNy2pi";
                    strArr5[5] = "HFqBrVui";
                    it = copyOnWriteArraySet.iterator();
                } else {
                    it = copyOnWriteArraySet.iterator();
                }
                while (playbackStateChanged) {
                    InterfaceC09322s next2 = it.next();
                    boolean trackSelectorResultChanged = this.A0R;
                    next2.AEf(trackSelectorResultChanged, this.A0J.A00);
                }
            }
            if (z11) {
                Iterator<InterfaceC09322s> it6 = this.A0k.iterator();
                while (timelineChanged) {
                    it6.next().AFB();
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z10, boolean z11) {
        if (this.A0Q != z10) {
            this.A0Q = z10;
            this.A04++;
            this.A0f.A1G(z10);
            C10416x c10416x = this.A0J;
            if (!z10) {
                this.A0R = z10;
                for (InterfaceC09322s interfaceC09322s : this.A0k) {
                    if (0 != 0) {
                        throw new NullPointerException(A04(197, 20, 29));
                    }
                    interfaceC09322s.AEf(z10, c10416x.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2659ox
    public final void A0H(int i10, long j10) {
        long jA00;
        Timeline timeline = this.A0J.A03;
        if (i10 >= 0) {
            boolean zA0N = timeline.A0N();
            if (A0o[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0o;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (zA0N || i10 < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAU()) {
                    Log.w(A04(2, 13, 30), A04(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i10;
                if (timeline.A0N()) {
                    this.A08 = j10 == -9223372036854775807L ? 0L : j10;
                    this.A01 = 0;
                } else {
                    if (j10 == -9223372036854775807L) {
                        jA00 = timeline.A0K(i10, super.A00).A05();
                    } else {
                        jA00 = AbstractC09121w.A00(j10);
                    }
                    Pair<Object, Long> pairA0D = timeline.A0D(super.A00, this.A0b, i10, jA00);
                    this.A08 = AbstractC09121w.A01(jA00);
                    this.A01 = timeline.A0A(pairA0D.first);
                }
                this.A0f.A1D(timeline, i10, AbstractC09121w.A00(j10));
                Iterator<InterfaceC09322s> it = this.A0k.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C2E(timeline, i10, j10);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7Z(), super.A00).A06();
        }
        long jA0D = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C2625oN c2625oNA0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0b);
            jA0D = c2625oNA0J.A0D(this.A0J.A04.A00);
            if (jA0D == Long.MIN_VALUE) {
                jA0D = c2625oNA0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, jA0D);
        return AbstractC09664a.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j10 = this.A07;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0o[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j10;
        }
        C10416x c10416x = this.A0J;
        if (A0o[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0o[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return AbstractC09121w.A01(c10416x.A0C);
    }

    public final Looper A0K() {
        return this.A0Z;
    }

    public final AnonymousClass71 A0L(AnonymousClass70 anonymousClass70) {
        A05();
        return A03(anonymousClass70);
    }

    public final void A0M() {
        StringBuilder sbAppend = new StringBuilder().append(A04(185, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String strA04 = A04(194, 3, 26);
        Log.i(A04(2, 13, 30), sbAppend.append(strA04).append(AbstractC09664a.A04).append(strA04).append(C2T.A00()).append(A04(193, 1, 54)).toString());
        this.A0L = null;
        this.A0f.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C2603o0.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C10416x) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C2638ob c2638ob = (C2638ob) message.obj;
                C2638ob c2638ob2 = this.A0D;
                String[] strArr = A0o;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0o;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c2638ob2.equals(c2638ob)) {
                        this.A0D = c2638ob;
                        Iterator<InterfaceC09322s> it = this.A0k.iterator();
                        while (it.hasNext()) {
                            it.next().AEb(c2638ob);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                C9Y c9y = (C9Y) message.obj;
                this.A0I = c9y;
                CopyOnWriteArraySet<InterfaceC09322s> copyOnWriteArraySet = this.A0k;
                String[] strArr3 = A0o;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0o;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<InterfaceC09322s> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String[] strArr5 = A0o;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0o[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!zHasNext) {
                            return;
                        }
                    } else if (!zHasNext) {
                        return;
                    }
                    it2.next().AEd(c9y);
                }
                break;
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<InterfaceC09322s> copyOnWriteArraySet2 = this.A0k;
                    if (A0o[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0o;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    for (InterfaceC09322s interfaceC09322s : copyOnWriteArraySet2) {
                        if (this.A0R) {
                            interfaceC09322s.AEf(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<InterfaceC09322s> it3 = this.A0k.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<InterfaceC09322s> copyOnWriteArraySet3 = this.A0k;
                String[] strArr7 = A0o;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0o;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<InterfaceC09322s> it4 = copyOnWriteArraySet3.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(InterfaceC09322s interfaceC09322s) {
        this.A0k.add(interfaceC09322s);
    }

    public final void A0P(CL cl2, boolean z10, boolean z11) {
        this.A0I = null;
        this.A0L = cl2;
        C10416x c10416xA02 = A02(z10, z11, 2);
        this.A0O = true;
        this.A03++;
        this.A0f.A1F(cl2, z10, z11);
        A08(c10416xA02, false, 4, 1, false);
    }

    public final void A0Q(boolean z10) {
        A09(z10, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final long A6z() {
        if (AAU()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return AbstractC09121w.A01(this.A0J.A0B);
            }
            return A7k();
        }
        return A0I();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final long A7L() {
        if (AAU()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            return this.A0b.A0B() + AbstractC09121w.A01(this.A0J.A01);
        }
        return A7W();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final int A7Q() {
        if (AAU()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final int A7R() {
        if (AAU()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7T() {
        A05();
        int iA7Z = A7Z();
        if (iA7Z == -1) {
            return 0;
        }
        return iA7Z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final int A7U() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C2501mL c2501mL = this.A0J.A05;
        String[] strArr = A0o;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0o[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c2501mL.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final long A7W() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return AbstractC09121w.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final Timeline A7Y() {
        return this.A0J.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final int A7Z() {
        if (A0A()) {
            int i10 = this.A02;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i10;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b).A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final long A7k() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAU()) {
            C2501mL c2501mL = this.A0J.A05;
            timeline.A0J(c2501mL.A04, this.A0b);
            return AbstractC09121w.A01(this.A0b.A0E(c2501mL.A00, c2501mL.A01));
        }
        return timeline.A0K(A7Z(), super.A00).A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final long A9B() {
        return Math.max(0L, AbstractC09121w.A01(this.A0J.A0D));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final boolean AAU() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09392z
    public final void AJV(boolean z10) {
        if (z10) {
            this.A0I = null;
            this.A0L = null;
        }
        C10416x c10416xA02 = A02(z10, z10, 1);
        this.A03++;
        this.A0f.A1H(z10);
        A08(c10416xA02, false, 4, 1, false);
        this.A0G = new C2603o0(MetaExoPlayerCustomizedCollections.A01(), c10416xA02.A0C);
    }
}
