package com.yk.e.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes10.dex */
public class StatusView extends View {
    public final Context IL1Iii;

    public StatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IL1Iii = context;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(ScreenUtil.getScreenWidth(this.IL1Iii), ScreenUtil.getStatusBarHeight(this.IL1Iii));
    }
}
