package com.bytedance.sdk.openadsdk.core.lh;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fkw extends ouw {
    public abstract void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, int i10, int i11, int i12);

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
    public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
        if (ouw(view, z10)) {
            ouw(view, f10, f11, f12, f13, sparseArray, this.fak, this.fvf, this.bs);
        }
        super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
    }

    public fkw(@NonNull Context context, @NonNull vpp vppVar, @NonNull String str, int i10) {
        super(context, vppVar, str, i10);
    }
}
