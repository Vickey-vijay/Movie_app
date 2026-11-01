package com.ironsource;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class J3 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26855a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26855a = iArr;
        }
    }

    public final int a(O3 o10) {
        ck.p.j(o10, "cappingType");
        int i10 = a.f26855a[o10.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 3000;
        }
        if (i10 == 3) {
            return 3001;
        }
        throw new NoWhenBranchMatchedException();
    }
}
