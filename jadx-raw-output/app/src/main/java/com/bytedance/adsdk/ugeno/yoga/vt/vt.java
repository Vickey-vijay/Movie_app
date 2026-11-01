package com.bytedance.adsdk.ugeno.yoga.vt;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.cf;
import com.bytedance.adsdk.ugeno.yoga.ra;
import com.bytedance.adsdk.ugeno.yoga.tlj;

/* JADX INFO: loaded from: classes2.dex */
public final class vt extends ViewGroup {
    public final tlj getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof vt) {
            throw null;
        }
        cf cfVar = new cf();
        lh.ouw(new lh.ouw(layoutParams), cfVar, view);
        cfVar.ouw(view);
        cfVar.ouw((ra) new lh.vt());
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof lh.ouw;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new lh.ouw(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new lh.ouw(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
