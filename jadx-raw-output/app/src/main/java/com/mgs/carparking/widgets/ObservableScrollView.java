package com.mgs.carparking.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import wa.d;

/* JADX INFO: loaded from: classes.dex */
public class ObservableScrollView extends ScrollView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f42304b;

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42304b = null;
    }

    public void setScrollViewListener(d dVar) {
        this.f42304b = dVar;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42304b = null;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        d dVar = this.f42304b;
        if (dVar != null) {
            dVar.a(this, i10, i11, i12, i13);
        }
    }
}
