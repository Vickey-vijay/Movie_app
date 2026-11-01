package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MraidResizeProperties {
    public boolean allowOffscreen;

    @NonNull
    public ViewPosition customClosePosition;
    public int height;
    public int offsetX;
    public int offsetY;
    public int width;

    public MraidResizeProperties() {
        this(0, 0, 0, 0, ViewPosition.TopRight, true);
    }

    @NonNull
    public String toString() {
        return "MRAIDResizeProperties{width=" + this.width + ", height=" + this.height + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", customClosePosition=" + this.customClosePosition + ", allowOffscreen=" + this.allowOffscreen + '}';
    }

    public MraidResizeProperties(int i10, int i11, int i12, int i13, @NonNull ViewPosition viewPosition, boolean z10) {
        this.width = i10;
        this.height = i11;
        this.offsetX = i12;
        this.offsetY = i13;
        this.customClosePosition = viewPosition;
        this.allowOffscreen = z10;
    }
}
