package com.ironsource;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public enum W7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27827b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27832a;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
        public final W7 a(Integer num) {
            for (W7 w10 : W7.values()) {
                int iB = w10.b();
                if (num != null && iB == num.intValue()) {
                    if (w10 == null) {
                        return W7.UnknownProvider;
                    }
                    return w10;
                }
            }
            w10 = null;
            if (w10 == null) {
                return W7.UnknownProvider;
            }
            return w10;
        }

        private a() {
        }

        public final W7 a(String str) {
            ck.p.j(str, "dynamicDemandSourceId");
            List listN0 = lk.a0.N0(str, new String[]{"_"}, false, 0, 6, null);
            return listN0.size() < 2 ? W7.UnknownProvider : a(lk.w.r((String) listN0.get(1)));
        }
    }

    public final int b() {
        return this.f27832a;
    }

    W7(int i10) {
        this.f27832a = i10;
    }
}
