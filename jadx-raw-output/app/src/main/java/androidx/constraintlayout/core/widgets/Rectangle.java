package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3786y;

    public boolean contains(int i10, int i11) {
        int i12;
        int i13 = this.f3785x;
        return i10 >= i13 && i10 < i13 + this.width && i11 >= (i12 = this.f3786y) && i11 < i12 + this.height;
    }

    public int getCenterX() {
        return (this.f3785x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f3786y + this.height) / 2;
    }

    public void grow(int i10, int i11) {
        this.f3785x -= i10;
        this.f3786y -= i11;
        this.width += i10 * 2;
        this.height += i11 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i10;
        int i11;
        int i12 = this.f3785x;
        int i13 = rectangle.f3785x;
        return i12 >= i13 && i12 < i13 + rectangle.width && (i10 = this.f3786y) >= (i11 = rectangle.f3786y) && i10 < i11 + rectangle.height;
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f3785x = i10;
        this.f3786y = i11;
        this.width = i12;
        this.height = i13;
    }
}
