package com.bytedance.adsdk.vt.ouw.ouw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zin implements lh, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f11288le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f11289lh;
    public final boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final List<com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw> f11290ra = new ArrayList();
    public final com.bytedance.adsdk.vt.lh.vt.th.ouw vt;
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> yu;

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        for (int i10 = 0; i10 < this.f11290ra.size(); i10++) {
            this.f11290ra.get(i10).ouw();
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
    }

    public zin(com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.th thVar) {
        this.f11288le = thVar.ouw;
        this.ouw = thVar.f11216le;
        this.vt = thVar.vt;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = thVar.f11217lh.ouw();
        this.f11289lh = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw2 = thVar.yu.ouw();
        this.yu = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = thVar.fkw.ouw();
        this.fkw = ouwVarOuw3;
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
    }

    public final void ouw(com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw interfaceC0078ouw) {
        this.f11290ra.add(interfaceC0078ouw);
    }
}
