package tl;

import hj.c;
import ii.k;
import ii.m;
import ii.n;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: RxBus.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f72427c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Object> f72428a = PublishSubject.d().b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f72429b = new ConcurrentHashMap();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: tl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RxBus.java */
    public class C0753a<T> implements n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f72430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f72431b;

        public C0753a(Class cls, Object obj) {
            this.f72430a = cls;
            this.f72431b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ii.n
        public void subscribe(m<T> mVar) throws Exception {
            mVar.onNext(this.f72430a.cast(this.f72431b));
        }
    }

    public static a a() {
        if (f72427c == null) {
            synchronized (a.class) {
                if (f72427c == null) {
                    f72427c = new a();
                }
            }
        }
        return f72427c;
    }

    public void b(Object obj) {
        this.f72428a.onNext(obj);
    }

    public void c(Object obj) {
        synchronized (this.f72429b) {
            this.f72429b.put(obj.getClass(), obj);
        }
        b(obj);
    }

    public <T> k<T> d(Class<T> cls) {
        return (k<T>) this.f72428a.ofType(cls);
    }

    public <T> k<T> e(Class<T> cls) {
        synchronized (this.f72429b) {
            k<T> kVar = (k<T>) this.f72428a.ofType(cls);
            Object obj = this.f72429b.get(cls);
            if (obj == null) {
                return kVar;
            }
            return k.merge(kVar, k.create(new C0753a(cls, obj)));
        }
    }
}
