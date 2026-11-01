package o6;

/* JADX INFO: compiled from: DecodedInformation.java */
/* JADX INFO: loaded from: classes11.dex */
public final class n extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f65100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f65101d;

    public n(int i10, String str) {
        super(i10);
        this.f65099b = str;
        this.f65101d = false;
        this.f65100c = 0;
    }

    public String b() {
        return this.f65099b;
    }

    public int c() {
        return this.f65100c;
    }

    public boolean d() {
        return this.f65101d;
    }

    public n(int i10, String str, int i11) {
        super(i10);
        this.f65101d = true;
        this.f65100c = i11;
        this.f65099b = str;
    }
}
