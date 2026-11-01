package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C1977dL c1977dL, final C1620Ua c1620Ua, final AbstractC2252hy abstractC2252hy, final InterfaceC1708Xn interfaceC1708Xn, final Z5 z10, Handler handler, Z6 z11) {
        c1977dL.A0F().AAv(z10.name().toLowerCase(Locale.US));
        return abstractC2252hy.A2F() ? new Z4(c1977dL, handler, z11, abstractC2252hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1977dL c1977dL2 = c1977dL;
                C1620Ua c1620Ua2 = c1620Ua;
                InterfaceC1708Xn interfaceC1708Xn2 = interfaceC1708Xn;
                Z5 z12 = z10;
                AbstractC2252hy abstractC2252hy2 = abstractC2252hy;
                Z9.A04(c1977dL2, c1620Ua2, interfaceC1708Xn2, z12, abstractC2252hy2.A25(), abstractC2252hy2.A23());
            }
        }) : new ZA(c1977dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1977dL c1977dL2 = c1977dL;
                C1620Ua c1620Ua2 = c1620Ua;
                InterfaceC1708Xn interfaceC1708Xn2 = interfaceC1708Xn;
                Z5 z12 = z10;
                AbstractC2252hy abstractC2252hy2 = abstractC2252hy;
                Z9.A04(c1977dL2, c1620Ua2, interfaceC1708Xn2, z12, abstractC2252hy2.A25(), abstractC2252hy2.A23());
            }
        });
    }

    public static ImageView A01(C1977dL c1977dL, C1620Ua c1620Ua, AbstractC2252hy abstractC2252hy, Z5 z10, InterfaceC1708Xn interfaceC1708Xn, Handler handler) {
        return A00(c1977dL, c1620Ua, abstractC2252hy, interfaceC1708Xn, z10, handler, Z6.A03);
    }

    public static void A04(C1977dL c1977dL, C1620Ua c1620Ua, InterfaceC1708Xn interfaceC1708Xn, Z5 z10, String str, N9 n10) {
        if (c1620Ua != null) {
            c1620Ua.A04(UZ.A0A, null);
        }
        c1977dL.A0F().AAu(z10.name().toLowerCase(Locale.US));
        if (O3.A00(c1977dL.A02()).A0O(c1977dL.A02(), true)) {
            interfaceC1708Xn.AAf(str, n10);
        } else {
            if (TextUtils.isEmpty(n10.A00())) {
                return;
            }
            WN.A0O(new WN(), c1977dL, WQ.A00(n10.A00()), str);
        }
    }
}
