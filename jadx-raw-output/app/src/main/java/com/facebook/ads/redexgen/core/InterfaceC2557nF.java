package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC2557nF extends InterfaceC09322s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC2557nF A00 = new InterfaceC2557nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void ACv(C2603o0 c2603o0) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AD6(int i10, C2501mL c2501mL, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADw(int i10, C2501mL c2501mL, CE ce2, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADy(int i10, C2501mL c2501mL, CE ce2, CG cg2, Object obj, Object obj2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AE1(int i10, C2501mL c2501mL, CE ce2, CG cg2, IOException iOException, boolean z10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void AEb(C2638ob c2638ob) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void AEd(C2640od c2640od) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void AEf(boolean z10, int i10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void AFQ(Timeline timeline, int i10) {
            AbstractC09312r.A00(this, timeline, i10);
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC09322s
        public final /* synthetic */ void AFU(C2609o6 c2609o6) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2557nF
        public final void AC5() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2557nF
        public final void AIv(InterfaceC09392z interfaceC09392z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC09392z interfaceC09392z, Looper looper);
}
