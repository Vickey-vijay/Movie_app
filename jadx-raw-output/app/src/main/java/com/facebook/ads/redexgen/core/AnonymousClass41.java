package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.41, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass41<T> {
    public static byte[] A09;
    public static String[] A0A = {"qNhODmuhOGTzTOdNu4k", "7K2GPWa5EHuyy4", "E4NOCJ5RL4hYeLNooPFdkLqGKDRv", "JwlW7s8WNTa19hdGL1amV", "YNjlntyRTdoFHiJHxz0qVC", "VcHvMaXHchlXNA9aE7EYkOxPZlMykCpc", "sHIyzZJD7qVKB1sd9lWDot", "2KMjU5K0FjJgBGqm2h4w3g2sgyG9pwrH"};
    public boolean A00;
    public boolean A01;
    public final C3T A02;
    public final InterfaceC09613v A03;
    public final InterfaceC09653z<T> A04;
    public final Object A05;
    public final ArrayDeque<Runnable> A06;
    public final ArrayDeque<Runnable> A07;
    public final CopyOnWriteArraySet<AnonymousClass40<T>> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AnonymousClass41(CopyOnWriteArraySet<AnonymousClass40<T>> copyOnWriteArraySet, Looper looper, C3T c3t, InterfaceC09653z<T> interfaceC09653z) {
        this.A02 = c3t;
        this.A08 = copyOnWriteArraySet;
        this.A04 = interfaceC09653z;
        this.A05 = new Object();
        this.A06 = new ArrayDeque<>();
        this.A07 = new ArrayDeque<>();
        this.A03 = c3t.A5H(looper, new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.3x
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A05(message);
            }
        });
        this.A01 = true;
        this.A00 = MetaExoPlayerUpgradeConfig.A03(EnumC2253i2.A0E);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{41, 46, 54, 47, 43, 37, 33, 60, 45, 58, 41, 60, 33, 39, 38, 14, 33, 38, 33, 59, 32, 45, 44};
        if (A0A[0].length() == 4) {
            throw new RuntimeException();
        }
        A0A[3] = "KpT";
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3z != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public AnonymousClass41(Looper looper, C3T c3t, InterfaceC09653z<T> interfaceC09653z) {
        this(new CopyOnWriteArraySet(), looper, c3t, interfaceC09653z);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3z != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private final AnonymousClass41<T> A00(Looper looper, C3T c3t, InterfaceC09653z<T> interfaceC09653z) {
        return new AnonymousClass41<>(this.A08, looper, c3t, interfaceC09653z);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private void A02() {
        if (!this.A01) {
            return;
        }
        C3M.A08(Thread.currentThread() == this.A03.A8J().getThread());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.40 != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    public static /* synthetic */ void A04(CopyOnWriteArraySet copyOnWriteArraySet, int i10, InterfaceC09643y interfaceC09643y) {
        Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(0, 6, 102));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.40 != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public boolean A05(Message message) {
        Iterator<AnonymousClass40<T>> it = this.A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(6, 17, 110));
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3z != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final AnonymousClass41<T> A07(Looper looper, InterfaceC09653z<T> interfaceC09653z) {
        return A00(looper, this.A02, interfaceC09653z);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A08() {
        A02();
        if (this.A07.isEmpty()) {
            return;
        }
        if (!this.A03.A9f(0)) {
            this.A03.AIT(this.A03.AC7(0));
        }
        boolean z10 = !this.A06.isEmpty();
        this.A06.addAll(this.A07);
        this.A07.clear();
        if (z10) {
            return;
        }
        while (!recursiveFlushInProgress) {
            Runnable runnablePeekFirst = this.A06.peekFirst();
            String[] strArr = A0A;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "yEp1Grh3pDykJXHd8ndBtu";
            strArr2[6] = "iM1KUlOTpdsgtS4YknLkQB";
            runnablePeekFirst.run();
            this.A06.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3y != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.40 != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A09(final int i10, final InterfaceC09643y<T> interfaceC09643y) {
        A02();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A08);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(0, 6, 102));
            }
            return;
        }
        this.A07.add(new Runnable() { // from class: com.facebook.ads.redexgen.X.3w
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass41.A04(copyOnWriteArraySet, i10, interfaceC09643y);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3y != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.41 != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A0A(int i10, InterfaceC09643y<T> interfaceC09643y) {
        A09(i10, interfaceC09643y);
        A08();
    }
}
