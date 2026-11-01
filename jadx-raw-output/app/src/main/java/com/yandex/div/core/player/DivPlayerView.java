package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ck.i;
import com.yandex.div.R$attr;
import com.yandex.div2.DivVideoScale;

/* JADX INFO: compiled from: DivPlayerView.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divImageStyle : i10);
    }

    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return super.getAttachedPlayer();
    }

    public /* bridge */ /* synthetic */ void setScale(DivVideoScale divVideoScale) {
        super.setScale(divVideoScale);
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z10) {
        super.setVisibleOnScreen(z10);
    }

    public DivPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
