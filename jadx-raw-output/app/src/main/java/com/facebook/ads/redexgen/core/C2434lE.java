package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2434lE implements GP {
    public static String[] A03 = {"Qzrb2NyX11iip4M0Dun9HjrVhDBjGiaF", "S4lxERGEQHczdoRlIRLlXReEKfWFWSGc", "txU8e6wljbe290bqTydjfEMDFUDvEmx5", "ZB68ibpDVF3DEFIIdRwQIG37zRUG2jhG", "NKfzuQ6LKFKezVni40AKhLW9Qs", "gUOm4cnsv29C5J2bDVOWEpGrIAhYUn7e", "xRx4EoAOCCZ90h8tA3pJ1YmFxzetviZR", "6LlO7okteSZZNTbDPWq3J1SHLhykMwkf"};
    public final int A00;
    public final C1264Gc A01;
    public final C1269Gh A02;

    @Override // com.facebook.ads.redexgen.core.GP
    public final /* synthetic */ void AFA() {
    }

    public C2434lE(C1269Gh c1269Gh, int i10) {
        this.A02 = c1269Gh;
        this.A00 = i10;
        this.A01 = new C1264Gc();
    }

    private long A00(InterfaceC2443lN interfaceC2443lN) throws IOException {
        while (interfaceC2443lN.A8a() < interfaceC2443lN.A8G() - 6 && !AbstractC1265Gd.A09(interfaceC2443lN, this.A02, this.A00, this.A01)) {
            String[] strArr = A03;
            if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "MdA2mB0qiCN7NKRKcBY3aVGEnEzRIKP4";
            strArr2[3] = "Kp5wPJFyOGMB7tBJUi3Fl7WX9iQtExSk";
            interfaceC2443lN.A3z(1);
        }
        if (interfaceC2443lN.A8a() >= interfaceC2443lN.A8G() - 6) {
            interfaceC2443lN.A3z((int) (interfaceC2443lN.A8G() - interfaceC2443lN.A8a()));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final GN AIC(InterfaceC2443lN interfaceC2443lN, long j10) throws IOException {
        long rightFrameFirstSampleNumber = interfaceC2443lN.A8f();
        long leftFrameFirstSampleNumber = A00(interfaceC2443lN);
        long jA8a = interfaceC2443lN.A8a();
        interfaceC2443lN.A3z(Math.max(6, this.A02.A06));
        long searchPosition = A00(interfaceC2443lN);
        long leftFramePosition = interfaceC2443lN.A8a();
        if (leftFrameFirstSampleNumber <= j10 && searchPosition > j10) {
            return GN.A03(jA8a);
        }
        if (searchPosition <= j10) {
            return GN.A05(searchPosition, leftFramePosition);
        }
        return GN.A04(leftFrameFirstSampleNumber, rightFrameFirstSampleNumber);
    }
}
