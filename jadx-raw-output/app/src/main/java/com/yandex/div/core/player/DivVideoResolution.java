package com.yandex.div.core.player;

/* JADX INFO: compiled from: DivVideoResolution.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivVideoResolution {
    private final int height;
    private final int width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoResolution)) {
            return false;
        }
        DivVideoResolution divVideoResolution = (DivVideoResolution) obj;
        return this.width == divVideoResolution.width && this.height == divVideoResolution.height;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    public String toString() {
        return "DivVideoResolution(width=" + this.width + ", height=" + this.height + ')';
    }

    public DivVideoResolution(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
