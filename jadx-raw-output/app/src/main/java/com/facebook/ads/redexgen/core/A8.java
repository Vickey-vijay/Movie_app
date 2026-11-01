package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A8 implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public static String[] A09 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC2707q2 A00;
    public InterfaceC2696pp A01;
    public C2683pb A02;
    public final InterfaceC2697pq A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2696pp A03 = new A9(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public A8(ViewpointQeConfig viewpointQeConfig, InterfaceC2707q2 interfaceC2707q2, InterfaceC2697pq interfaceC2697pq) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2707q2;
        this.A04 = interfaceC2697pq;
    }

    public static A8 A01() {
        return new A8(new ViewpointQeConfig(), new AC(), null);
    }

    private void A05(AbstractC2699ps abstractC2699ps, InterfaceC2704px interfaceC2704px, A6 a10) {
        this.A02 = C2683pb.A00(this.A05, abstractC2699ps, interfaceC2704px, a10);
        if (0 != 0) {
            this.A02.A01(null);
        }
        this.A02.A02(this.A03);
        String[] strArr = A09;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A09[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C2705q0 c2705q0) {
        C2683pb c2683pb = this.A02;
        if (c2683pb != null && dspViewableNode != null) {
            if (this.A05.A00 && c2705q0 != null) {
                c2683pb.A04(dspViewableNode, c2705q0);
            } else {
                c2683pb.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2705q0 c2705q0, C2701pu c2701pu) {
        C2683pb c2683pb = this.A02;
        if (c2683pb != null && dspViewableNode != null && c2701pu != null) {
            if (this.A05.A00 && c2705q0 != null) {
                c2701pu.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2701pu.A08 + c2705q0;
                c2683pb.A05(dspViewableNode, c2705q0, c2701pu);
            } else {
                c2683pb.A06(dspViewableNode, c2701pu);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2701pu<?, ?> c2701pu) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2701pu);
    }

    public final void A0A(AbstractC2699ps abstractC2699ps, View view) {
        if (abstractC2699ps != null && view != null) {
            A05(abstractC2699ps, new AA(view, this.A00), new C1H(null));
        }
    }
}
