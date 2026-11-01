package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2136fw implements InterfaceC1708Xn {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<R0> A00;

    public C2136fw(R0 r10) {
        this.A00 = new WeakReference<>(r10);
    }

    private void A00(R0 r10) {
        C1953cw c1953cwA07 = r10.A07();
        if (c1953cwA07 != null && r10.A04() != null) {
            r10.A04().bringChildToFront(c1953cwA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1708Xn
    public void A3w(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        R0 r10 = this.A00.get();
        if (r10 != null && r10.A04() != null) {
            r10.A04().addView(view, i10, layoutParams);
            A00(r10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1708Xn
    public void A3x(View view, RelativeLayout.LayoutParams layoutParams) {
        R0 r10 = this.A00.get();
        if (r10 != null && r10.A04() != null) {
            r10.A04().addView(view, layoutParams);
            A00(r10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1708Xn
    public void A4b(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1708Xn
    public void A4c(String str, C1598Td c1598Td) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c1598Td);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1708Xn
    public void AAf(String str, N9 n10) {
        if (this.A00.get() != null) {
            WeakReference<R0> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, n10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1708Xn
    public void ACf(int i10) {
        R0 activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}
