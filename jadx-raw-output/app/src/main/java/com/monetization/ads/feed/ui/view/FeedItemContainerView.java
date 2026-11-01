package com.monetization.ads.feed.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.AttrRes;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedItemContainerView extends RelativeLayout {
    public FeedItemContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedItemContainerView(Context context, AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(1.0f);
    }
}
