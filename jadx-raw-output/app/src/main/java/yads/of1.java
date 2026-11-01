package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class of1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f81026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cw0 f81027b = new cw0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81029d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || of1.class != obj.getClass()) {
            return false;
        }
        return this.f81026a.equals(((of1) obj).f81026a);
    }

    public final int hashCode() {
        return this.f81026a.hashCode();
    }

    public of1(Object obj) {
        this.f81026a = obj;
    }
}
