package mn;

/* JADX INFO: compiled from: ValidationError.java */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f64645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64647c;

    public Class a() {
        return this.f64645a;
    }

    public String b() {
        return this.f64646b;
    }

    public String toString() {
        return getClass().getSimpleName() + " (Class: " + a().getSimpleName() + ", propertyName: " + b() + "): " + this.f64647c;
    }

    public k(Class cls, String str, String str2) {
        this.f64645a = cls;
        this.f64646b = str;
        this.f64647c = str2;
    }
}
