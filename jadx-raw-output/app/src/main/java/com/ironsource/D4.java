package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class D4 implements A7 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26112a;

        static {
            int[] iArr = new int[EnumC3812z4.values().length];
            try {
                iArr[EnumC3812z4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3812z4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3812z4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3812z4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26112a = iArr;
        }
    }

    @Override // com.ironsource.A7
    public F4 a(Context context, EnumC3812z4 enumC3812z4) {
        C4 c10;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(enumC3812z4, "source");
        int i10 = a.f26112a[enumC3812z4.ordinal()];
        if (i10 == 1) {
            c10 = new C4(context, "supersonic_shared_preferen");
        } else if (i10 == 2) {
            c10 = new C4(context, "unityads-installinfo");
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            c10 = new C4(context, E4.f26438c);
        }
        return c10;
    }
}
