package com.yandex.div.core.state;

/* JADX INFO: compiled from: GalleryState.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GalleryState implements DivViewState.BlockState {
    private final int scrollOffset;
    private final int visibleItemIndex;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryState)) {
            return false;
        }
        GalleryState galleryState = (GalleryState) obj;
        return this.visibleItemIndex == galleryState.visibleItemIndex && this.scrollOffset == galleryState.scrollOffset;
    }

    public int hashCode() {
        return (Integer.hashCode(this.visibleItemIndex) * 31) + Integer.hashCode(this.scrollOffset);
    }

    public String toString() {
        return "GalleryState(visibleItemIndex=" + this.visibleItemIndex + ", scrollOffset=" + this.scrollOffset + ')';
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getVisibleItemIndex() {
        return this.visibleItemIndex;
    }

    public GalleryState(int i10, int i11) {
        this.visibleItemIndex = i10;
        this.scrollOffset = i11;
    }
}
