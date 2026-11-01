package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2368jy implements GX {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final InterfaceC1263Gb A04 = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.jz
        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final GX[] A5F() {
            return C2368jy.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1262Ga.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C2367jx A02 = new C2367jx();
    public final C4J A01 = new C4J(16384);

    public static /* synthetic */ GX[] A00() {
        return new GX[]{new C2368jy()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A02.A5U(gy, new C1369Ke(0, 1));
        gy.A6G();
        gy.AIN(new C2438lI(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        int i10 = interfaceC2443lN.read(this.A01.A0l(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i10);
        if (!this.A00) {
            this.A02.AG6(0L, 4);
            this.A00 = true;
        }
        this.A02.A52(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A00 = false;
        this.A02.AIL();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2443lN interfaceC2443lN) throws IOException {
        C4J c4j = new C4J(10);
        int length = 0;
        while (true) {
            byte[] bArrA0l = c4j.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC2443lN.AG9(bArrA0l, 0, 10);
            c4j.A0f(0);
            if (c4j.A0K() != 4801587) {
                interfaceC2443lN.AI1();
                interfaceC2443lN.A3z(length);
                int i10 = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC2443lN.AG9(c4j.A0l(), 0, 7);
                    c4j.A0f(0);
                    int headerPosition = c4j.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC2443lN.AI1();
                        i10++;
                        if (i10 - length >= 8192) {
                            return false;
                        }
                        interfaceC2443lN.A3z(i10);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = GI.A02(c4j.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC2443lN.A3z(headerPosition2 - 7);
                    }
                }
            } else {
                c4j.A0g(3);
                int iA0H = c4j.A0H();
                length += iA0H + 10;
                interfaceC2443lN.A3z(iA0H);
            }
        }
    }
}
