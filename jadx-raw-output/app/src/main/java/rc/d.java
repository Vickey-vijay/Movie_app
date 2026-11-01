package rc;

/* JADX INFO: compiled from: SignalCallbackListener.java */
/* JADX INFO: loaded from: classes4.dex */
public class d<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public oc.a f66745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f66746b;

    public d(oc.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    public d(oc.a aVar, g<T> gVar, f fVar) {
        this.f66745a = aVar;
        this.f66746b = fVar;
    }

    @Override // rc.a
    public void a(String str, String str2, T t10) {
        this.f66746b.a(str, str2);
        this.f66745a.b();
    }

    @Override // rc.a
    public void onFailure(String str) {
        this.f66746b.d(str);
        this.f66745a.b();
    }
}
