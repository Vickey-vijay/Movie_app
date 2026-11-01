package mi;

import bj.i;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;

/* JADX INFO: compiled from: CompositeDisposable.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements b, pi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i<b> f64533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f64534c;

    @Override // pi.a
    public boolean b(b bVar) {
        qi.a.e(bVar, "d is null");
        if (!this.f64534c) {
            synchronized (this) {
                if (!this.f64534c) {
                    i<b> iVar = this.f64533b;
                    if (iVar == null) {
                        iVar = new i<>();
                        this.f64533b = iVar;
                    }
                    iVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    public void c() {
        if (this.f64534c) {
            return;
        }
        synchronized (this) {
            if (this.f64534c) {
                return;
            }
            i<b> iVar = this.f64533b;
            this.f64533b = null;
            d(iVar);
        }
    }

    public void d(i<b> iVar) {
        if (iVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : iVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.d((Throwable) arrayList.get(0));
        }
    }

    @Override // pi.a
    public boolean delete(b bVar) {
        qi.a.e(bVar, "Disposable item is null");
        if (this.f64534c) {
            return false;
        }
        synchronized (this) {
            if (this.f64534c) {
                return false;
            }
            i<b> iVar = this.f64533b;
            if (iVar != null && iVar.e(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // mi.b
    public void dispose() {
        if (this.f64534c) {
            return;
        }
        synchronized (this) {
            if (this.f64534c) {
                return;
            }
            this.f64534c = true;
            i<b> iVar = this.f64533b;
            this.f64533b = null;
            d(iVar);
        }
    }

    public int e() {
        if (this.f64534c) {
            return 0;
        }
        synchronized (this) {
            if (this.f64534c) {
                return 0;
            }
            i<b> iVar = this.f64533b;
            return iVar != null ? iVar.g() : 0;
        }
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f64534c;
    }

    @Override // pi.a
    public boolean a(b bVar) {
        if (delete(bVar)) {
            bVar.dispose();
            return true;
        }
        return false;
    }
}
