package bj;

import ii.r;
import io.reactivex.internal.util.NotificationLite;
import oi.q;

/* JADX INFO: compiled from: AppendOnlyLinkedArrayList.java */
/* JADX INFO: loaded from: classes7.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f5359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f5360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5361d;

    /* JADX INFO: renamed from: bj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppendOnlyLinkedArrayList.java */
    public interface InterfaceC0019a<T> extends q<T> {
        @Override // oi.q
        boolean test(T t10);
    }

    public <U> boolean a(r<? super U> rVar) {
        Object[] objArr = this.f5359b;
        int i10 = this.f5358a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr2 = objArr[i11];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, rVar)) {
                    return true;
                }
            }
            objArr = objArr[i10];
        }
    }

    public <U> boolean b(qo.b<? super U> bVar) {
        Object[] objArr = this.f5359b;
        int i10 = this.f5358a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr2 = objArr[i11];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, bVar)) {
                    return true;
                }
            }
            objArr = objArr[i10];
        }
    }

    public void c(T t10) {
        int i10 = this.f5358a;
        int i11 = this.f5361d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f5360c[i10] = objArr;
            this.f5360c = objArr;
            i11 = 0;
        }
        this.f5360c[i11] = t10;
        this.f5361d = i11 + 1;
    }

    public void d(InterfaceC0019a<? super T> interfaceC0019a) {
        int i10 = this.f5358a;
        for (Object[] objArr = this.f5359b; objArr != null; objArr = (Object[]) objArr[i10]) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null) {
                    break;
                } else {
                    if (interfaceC0019a.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public void e(T t10) {
        this.f5359b[0] = t10;
    }

    public a(int i10) {
        this.f5358a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f5359b = objArr;
        this.f5360c = objArr;
    }
}
