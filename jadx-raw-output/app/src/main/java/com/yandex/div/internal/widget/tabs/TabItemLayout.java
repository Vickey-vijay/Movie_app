package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yandex.div.R$id;

/* JADX INFO: compiled from: TabItemLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TabItemLayout extends LinearLayout {
    public TabItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(R$id.div_tabbed_tab_title_item);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(0);
    }

    public /* synthetic */ TabItemLayout(Context context, AttributeSet attributeSet, int i10, ck.i iVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
