package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: SafePopupWindow.kt */
/* JADX INFO: loaded from: classes8.dex */
public class SafePopupWindow extends PopupWindow {
    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }

    public SafePopupWindow(View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
    }
}
