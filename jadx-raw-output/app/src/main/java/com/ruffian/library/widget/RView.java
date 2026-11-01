package com.ruffian.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import wb.a;

/* JADX INFO: loaded from: classes9.dex */
public class RView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f43368b;

    public RView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43368b = new a(context, this, attributeSet);
    }

    public a getHelper() {
        return this.f43368b;
    }
}
