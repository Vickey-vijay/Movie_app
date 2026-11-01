package com.mgs.carparking.libutils.statusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import u9.a;

/* JADX INFO: loaded from: classes2.dex */
public class StatusBarHeightView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41071c;

    public StatusBarHeightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusBarHeightView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f41071c = true;
        this.f41070b = a.b(getContext());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        if (this.f41071c) {
            i12 = this.f41070b;
        } else {
            i12 = 0;
        }
        setMeasuredDimension(defaultSize, i12);
    }
}
