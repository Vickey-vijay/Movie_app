package ul;

/* JADX INFO: compiled from: BindingCommand.java */
/* JADX INFO: loaded from: classes7.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f72916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<T> f72917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d<Boolean> f72918c;

    public b(a aVar) {
        this.f72916a = aVar;
    }

    public final boolean a() {
        d<Boolean> dVar = this.f72918c;
        if (dVar == null) {
            return true;
        }
        return dVar.call().booleanValue();
    }

    public void b() {
        if (this.f72916a == null || !a()) {
            return;
        }
        this.f72916a.call();
    }

    public void c(T t10) {
        if (this.f72916a != null && a()) {
            this.f72916a.call();
        } else {
            if (this.f72917b == null || !a()) {
                return;
            }
            this.f72917b.call(t10);
        }
    }

    public b(c<T> cVar) {
        this.f72917b = cVar;
    }
}
