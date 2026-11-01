package com.bytedance.adsdk.vt.lh.ouw;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lh extends jg<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> {
    private static List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> ouw(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu> ouwVar = list.get(i10);
            com.bytedance.adsdk.vt.lh.vt.yu yuVar = ouwVar.vt;
            com.bytedance.adsdk.vt.lh.vt.yu yuVar2 = ouwVar.f11336lh;
            if (yuVar != null && yuVar2 != null) {
                float[] fArr = yuVar.ouw;
                int length = fArr.length;
                float[] fArr2 = yuVar2.ouw;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f11 = fArr3[i12];
                        if (f11 != f10) {
                            fArr3[i11] = f11;
                            i11++;
                            f10 = fArr3[i12];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(yuVar.ouw(fArrCopyOfRange), yuVar2.ouw(fArrCopyOfRange));
                }
            }
            list.set(i10, ouwVar);
        }
        return list;
    }

    public lh(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> list) {
        super(ouw(list));
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.jg, com.bytedance.adsdk.vt.lh.ouw.mwh
    public final /* bridge */ /* synthetic */ List lh() {
        return super.lh();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.jg
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.jg, com.bytedance.adsdk.vt.lh.ouw.mwh
    public final /* bridge */ /* synthetic */ boolean vt() {
        return super.vt();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ouw() {
        return new com.bytedance.adsdk.vt.ouw.vt.fkw(this.ouw);
    }
}
