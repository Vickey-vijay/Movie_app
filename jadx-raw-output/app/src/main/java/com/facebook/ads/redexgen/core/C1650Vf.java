package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1650Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C1650Vf(VN vn2) {
        this.A00 = vn2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6J(C2701pu<UE, UJ> c2701pu, InterfaceC2692pk interfaceC2692pk) {
        switch (interfaceC2692pk.A9M(c2701pu)) {
            case A02:
            case A04:
                this.A00.A02(c2701pu, interfaceC2692pk);
                break;
        }
    }
}
