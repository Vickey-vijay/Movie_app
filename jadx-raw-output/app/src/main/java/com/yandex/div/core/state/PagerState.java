package com.yandex.div.core.state;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PagerState implements DivViewState.BlockState {
    private final int currentPageIndex;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagerState) && this.currentPageIndex == ((PagerState) obj).currentPageIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentPageIndex);
    }

    public String toString() {
        return "PagerState(currentPageIndex=" + this.currentPageIndex + ')';
    }

    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public PagerState(int i10) {
        this.currentPageIndex = i10;
    }
}
