package com.ironsource;

import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: loaded from: classes4.dex */
public enum N3 {
    Day("d", SignalManager.TWENTY_FOUR_HOURS_MILLIS),
    Hour("h", 3600000),
    Second("s", 1000);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27081c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27087b;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final N3 a(String str) {
            for (N3 n10 : N3.values()) {
                if (ck.p.e(n10.f27086a, str)) {
                    return n10;
                }
            }
            return null;
        }
    }

    N3(String str, long j10) {
        this.f27086a = str;
        this.f27087b = j10;
    }

    public final long a(Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.f27087b;
    }

    public static /* synthetic */ long a(N3 n10, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i10 & 1) != 0) {
            num = 1;
        }
        return n10.a(num);
    }
}
