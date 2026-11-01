package y5;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75276b;

    public int a() {
        return this.f75276b;
    }

    public int b() {
        return this.f75275a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f75275a == cVar.f75275a && this.f75276b == cVar.f75276b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f75275a * 32713) + this.f75276b;
    }

    public String toString() {
        return this.f75275a + VastAttributes.HORIZONTAL_POSITION + this.f75276b;
    }
}
