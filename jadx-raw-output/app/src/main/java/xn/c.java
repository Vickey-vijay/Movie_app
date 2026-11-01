package xn;

import mn.j;
import un.f;
import un.m;

/* JADX INFO: compiled from: StateVariableAccessor.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: compiled from: StateVariableAccessor.java */
    public class a implements mn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f75075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f75076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f75077c;

        public a(Object obj, m mVar) {
            this.f75076b = obj;
            this.f75077c = mVar;
        }

        @Override // mn.a
        public void a(j jVar) throws Exception {
            this.f75075a = c.this.b(this.f75076b);
            if (((f) this.f75077c.c()).t(this.f75075a)) {
                this.f75075a = this.f75075a.toString();
            }
        }
    }

    public abstract Class<?> a();

    public abstract Object b(Object obj) throws Exception;

    public d c(m<f> mVar, Object obj) throws Exception {
        a aVar = new a(obj, mVar);
        ((f) mVar.c()).q().b(aVar);
        return new d(mVar, aVar.f75075a);
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
