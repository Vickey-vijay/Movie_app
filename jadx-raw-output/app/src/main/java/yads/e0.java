package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 implements lx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c0 f76854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient q f76855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient d0 f76856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient n f76857e;

    public abstract n a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lx1) {
            return ((i) this).a().equals(((i) ((lx1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f80487d.hashCode();
    }

    public final String toString() {
        return a().f80487d.toString();
    }
}
