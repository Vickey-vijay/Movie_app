package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.osn;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class pno extends com.bytedance.sdk.openadsdk.core.lh.ouw {
    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    @Override // com.bytedance.sdk.openadsdk.core.lh.vt
    public final com.bytedance.sdk.openadsdk.core.model.cf ouw(float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray, long j10, long j11, View view, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        float fOuw;
        float fOuw2;
        float fOuw3;
        float fOuw4;
        long j12;
        long j13;
        int[] iArrOuw = osn.ouw(view);
        if (iArrOuw == null || iArrOuw.length != 2) {
            fOuw = f10;
            fOuw2 = f11;
            fOuw3 = f12;
            fOuw4 = f13;
        } else {
            int i12 = iArrOuw[0];
            int i13 = iArrOuw[1];
            if (this.jqy == 0) {
                fOuw = (osn.ouw(this.pno, f10) + i12) - 0.5f;
                fOuw2 = (osn.ouw(this.pno, f11) + i13) - 0.5f;
                fOuw3 = (osn.ouw(this.pno, f12) + i12) - 0.5f;
                fOuw4 = (osn.ouw(this.pno, f13) + i13) - 0.5f;
            } else {
                fOuw = f10;
                fOuw2 = f11;
                fOuw3 = f12;
                fOuw4 = f13;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.ko koVar = this.bly;
        if (koVar != null) {
            j12 = koVar.fkw;
            j13 = koVar.f12765le;
        } else {
            j12 = j10;
            j13 = j11;
        }
        this.jqy = 0;
        com.bytedance.sdk.openadsdk.core.model.cf.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.model.cf.ouw();
        ouwVar.f12738le = fOuw;
        ouwVar.fkw = fOuw2;
        ouwVar.yu = fOuw3;
        ouwVar.f12739lh = fOuw4;
        ouwVar.vt = j12;
        ouwVar.ouw = j13;
        ouwVar.f12740ra = iArrOuw;
        ouwVar.pno = osn.lh(view);
        ouwVar.bly = this.fvf;
        ouwVar.tlj = this.bs;
        ouwVar.f12735cf = this.fak;
        ouwVar.mwh = com.bytedance.sdk.openadsdk.core.bly.ouw().tlj ? 1 : 2;
        ouwVar.ryl = sparseArray;
        ouwVar.zih = str;
        ouwVar.f12736jg = f14;
        ouwVar.f12737ko = i10;
        ouwVar.f12741rn = f15;
        ouwVar.f12743vm = i11;
        ouwVar.f12742th = jSONObject;
        ouwVar.qbp = jSONObject2;
        return ouwVar.ouw();
    }

    public pno(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.vpp vppVar, @NonNull String str, int i10) {
        super(context, vppVar, str, i10);
    }
}
