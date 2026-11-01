package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class h10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f78012a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h10) && Float.compare(this.f78012a, ((h10) obj).f78012a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f78012a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f78012a + ")";
    }

    public h10(float f10) {
        this.f78012a = f10;
    }
}
