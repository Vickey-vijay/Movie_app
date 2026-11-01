package ym;

import java.lang.ref.WeakReference;
import java.util.EventListener;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.jetty.util.LazyList;

/* JADX INFO: compiled from: Container.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zm.c f85796b = zm.b.a(c.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f85797a = new CopyOnWriteArrayList<>();

    /* JADX INFO: compiled from: Container.java */
    public interface b extends EventListener {
        void F(Object obj);

        void c(C0804c c0804c);

        void r(C0804c c0804c);

        void x(Object obj);
    }

    /* JADX INFO: renamed from: ym.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Container.java */
    public static class C0804c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<Object> f85798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<Object> f85799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f85800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f85801d;

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0804c)) {
                return false;
            }
            C0804c c0804c = (C0804c) obj;
            return c0804c.f85798a.get() == this.f85798a.get() && c0804c.f85799b.get() == this.f85799b.get() && c0804c.f85800c.equals(this.f85800c);
        }

        public C0804c(c cVar, Object obj, Object obj2, String str) {
            this.f85801d = cVar;
            this.f85798a = new WeakReference<>(obj);
            this.f85799b = new WeakReference<>(obj2);
            this.f85800c = str;
        }

        public int hashCode() {
            return this.f85798a.hashCode() + this.f85799b.hashCode() + this.f85800c.hashCode();
        }

        public String toString() {
            return this.f85798a + "---" + this.f85800c + "-->" + this.f85799b;
        }
    }

    public void update(Object obj, Object obj2, Object obj3, String str) {
        if (obj2 != null && !obj2.equals(obj3)) {
            c(obj, obj2, str);
        }
        if (obj3 == null || obj3.equals(obj2)) {
            return;
        }
        a(obj, obj3, str);
    }

    public final void a(Object obj, Object obj2, String str) {
        zm.c cVar = f85796b;
        if (cVar.f()) {
            cVar.i("Container " + obj + " + " + obj2 + " as " + str, new Object[0]);
        }
        if (this.f85797a != null) {
            C0804c c0804c = new C0804c(obj, obj2, str);
            for (int i10 = 0; i10 < LazyList.size(this.f85797a); i10++) {
                ((b) LazyList.get(this.f85797a, i10)).r(c0804c);
            }
        }
    }

    public void b(Object obj) {
        if (this.f85797a != null) {
            for (int i10 = 0; i10 < LazyList.size(this.f85797a); i10++) {
                ((b) LazyList.get(this.f85797a, i10)).x(obj);
            }
        }
    }

    public final void c(Object obj, Object obj2, String str) {
        zm.c cVar = f85796b;
        if (cVar.f()) {
            cVar.i("Container " + obj + " - " + obj2 + " as " + str, new Object[0]);
        }
        if (this.f85797a != null) {
            C0804c c0804c = new C0804c(obj, obj2, str);
            for (int i10 = 0; i10 < LazyList.size(this.f85797a); i10++) {
                ((b) LazyList.get(this.f85797a, i10)).c(c0804c);
            }
        }
    }

    public void d(Object obj) {
        if (this.f85797a != null) {
            for (int i10 = 0; i10 < LazyList.size(this.f85797a); i10++) {
                ((b) LazyList.get(this.f85797a, i10)).F(obj);
            }
        }
    }

    public void update(Object obj, Object obj2, Object obj3, String str, boolean z10) {
        if (obj2 != null && !obj2.equals(obj3)) {
            c(obj, obj2, str);
            if (z10) {
                d(obj2);
            }
        }
        if (obj3 == null || obj3.equals(obj2)) {
            return;
        }
        if (z10) {
            b(obj3);
        }
        a(obj, obj3, str);
    }

    public void update(Object obj, Object[] objArr, Object[] objArr2, String str) {
        update(obj, objArr, objArr2, str, false);
    }

    public void update(Object obj, Object[] objArr, Object[] objArr2, String str, boolean z10) {
        Object[] objArr3 = null;
        if (objArr2 != null) {
            Object[] objArr4 = new Object[objArr2.length];
            int length = objArr2.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    break;
                }
                boolean z11 = true;
                if (objArr != null) {
                    int length2 = objArr.length;
                    while (true) {
                        int i11 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        Object obj2 = objArr2[i10];
                        if (obj2 != null && obj2.equals(objArr[i11])) {
                            objArr[i11] = null;
                            z11 = false;
                        }
                        length2 = i11;
                    }
                }
                if (z11) {
                    objArr4[i10] = objArr2[i10];
                }
                length = i10;
            }
            objArr3 = objArr4;
        }
        if (objArr != null) {
            int length3 = objArr.length;
            while (true) {
                int i12 = length3 - 1;
                if (length3 <= 0) {
                    break;
                }
                Object obj3 = objArr[i12];
                if (obj3 != null) {
                    c(obj, obj3, str);
                    if (z10) {
                        d(objArr[i12]);
                    }
                }
                length3 = i12;
            }
        }
        if (objArr3 != null) {
            for (int i13 = 0; i13 < objArr3.length; i13++) {
                Object obj4 = objArr3[i13];
                if (obj4 != null) {
                    if (z10) {
                        b(obj4);
                    }
                    a(obj, objArr3[i13], str);
                }
            }
        }
    }
}
