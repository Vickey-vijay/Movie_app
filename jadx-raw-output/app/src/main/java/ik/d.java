package ik;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements e<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f54210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f54211c;

    public boolean a(float f10) {
        return f10 >= this.f54210b && f10 <= this.f54211c;
    }

    @Override // ik.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f54211c);
    }

    @Override // ik.f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f54210b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ik.e
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    public boolean d() {
        return this.f54210b > this.f54211c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (d() && ((d) obj).d()) {
                return true;
            }
            d dVar = (d) obj;
            if (this.f54210b == dVar.f54210b) {
                if (this.f54211c == dVar.f54211c) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return this.f54210b + ".." + this.f54211c;
    }

    public d(float f10, float f11) {
        this.f54210b = f10;
        this.f54211c = f11;
    }

    public int hashCode() {
        if (d()) {
            return -1;
        }
        return (Float.hashCode(this.f54210b) * 31) + Float.hashCode(this.f54211c);
    }
}
