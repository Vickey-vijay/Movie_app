package com.yandex.div.core.tooltip;

import android.view.View;
import ck.i;
import com.yandex.div.core.util.SafePopupWindow;

/* JADX INFO: compiled from: DivTooltipWindow.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTooltipWindow extends SafePopupWindow {
    public /* synthetic */ DivTooltipWindow(View view, int i10, int i11, boolean z10, int i12, i iVar) {
        this(view, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z10);
    }

    public DivTooltipWindow(View view, int i10, int i11, boolean z10) {
        super(view, i10, i11, z10);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
