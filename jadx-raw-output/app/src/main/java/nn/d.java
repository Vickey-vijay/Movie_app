package nn;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.InvalidValueException;
import un.l;

/* JADX INFO: compiled from: ActionInvocation.java */
/* JADX INFO: loaded from: classes2.dex */
public class d<S extends l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.fourthline.cling.model.meta.a<S> f64870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vn.a f64871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, b<S>> f64872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, b<S>> f64873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionException f64874e;

    public d(org.fourthline.cling.model.meta.a<S> aVar) {
        this(aVar, null, null, null);
    }

    public d(org.fourthline.cling.model.meta.a<S> aVar, b<S>[] bVarArr, b<S>[] bVarArr2, vn.a aVar2) {
        this.f64872c = new LinkedHashMap();
        this.f64873d = new LinkedHashMap();
        this.f64874e = null;
        if (aVar == null) {
            throw new IllegalArgumentException("Action can not be null");
        }
        this.f64870a = aVar;
        l(bVarArr);
        n(bVarArr2);
        this.f64871b = aVar2;
    }

    public org.fourthline.cling.model.meta.a<S> a() {
        return this.f64870a;
    }

    public vn.a b() {
        return this.f64871b;
    }

    public ActionException c() {
        return this.f64874e;
    }

    public b<S> e(ActionArgument<S> actionArgument) {
        return this.f64872c.get(actionArgument.e());
    }

    public b<S> g(ActionArgument<S> actionArgument) {
        return this.f64873d.get(actionArgument.e());
    }

    public Map<String, b<S>> h() {
        return Collections.unmodifiableMap(this.f64873d);
    }

    public void i(ActionException actionException) {
        this.f64874e = actionException;
    }

    public void j(String str, Object obj) throws InvalidValueException {
        k(new b<>(f(str), obj));
    }

    public void k(b<S> bVar) {
        this.f64872c.put(bVar.d().e(), bVar);
    }

    public void l(b<S>[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (b<S> bVar : bVarArr) {
            this.f64872c.put(bVar.d().e(), bVar);
        }
    }

    public void m(b<S> bVar) {
        this.f64873d.put(bVar.d().e(), bVar);
    }

    public void n(b<S>[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (b<S> bVar : bVarArr) {
            this.f64873d.put(bVar.d().e(), bVar);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + a();
    }

    public b<S> d(String str) {
        return e(f(str));
    }

    public ActionArgument<S> f(String str) {
        ActionArgument<S> actionArgumentB = a().b(str);
        if (actionArgumentB != null) {
            return actionArgumentB;
        }
        throw new IllegalArgumentException("Argument not found: " + str);
    }

    public d(ActionException actionException) {
        this.f64872c = new LinkedHashMap();
        new LinkedHashMap();
        this.f64870a = null;
        this.f64872c = null;
        this.f64873d = null;
        this.f64874e = actionException;
        this.f64871b = null;
    }
}
