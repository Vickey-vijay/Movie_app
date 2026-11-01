package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ub1 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83412c;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f83411b;
    }

    public ub1(String str, String str2) {
        super(str);
        this.f83411b = str;
        this.f83412c = str2;
    }
}
