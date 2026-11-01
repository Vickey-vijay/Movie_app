package com.yandex.div.core.state;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: UpdateStateChangePageCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UpdateStateChangePageCallback extends ViewPager2.OnPageChangeCallback {
    private final String mBlockId;
    private final DivViewState mDivViewState;

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i10) {
        if (i10 != -1) {
            this.mDivViewState.putBlockState(this.mBlockId, new PagerState(i10));
        }
    }

    public UpdateStateChangePageCallback(String str, DivViewState divViewState) {
        this.mBlockId = str;
        this.mDivViewState = divViewState;
    }
}
