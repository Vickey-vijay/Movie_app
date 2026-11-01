package co;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import on.a;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.registry.RegistrationException;
import un.a;
import yn.j;
import yn.s;
import yn.z;

/* JADX INFO: compiled from: RegistryItems.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f<D extends un.a, S extends on.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<e<z, D>> f6181b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<e<String, S>> f6182c = new HashSet();

    public void a(S s10) {
        this.f6182c.add(new e<>(s10.I(), s10, s10.t()));
    }

    public Collection<D> b() {
        HashSet hashSet = new HashSet();
        Iterator<e<z, D>> it = this.f6181b.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        return hashSet;
    }

    public Collection<D> c(j jVar) {
        HashSet hashSet = new HashSet();
        Iterator<e<z, D>> it = this.f6181b.iterator();
        while (it.hasNext()) {
            un.a[] aVarArrF = it.next().b().f(jVar);
            if (aVarArrF != null) {
                hashSet.addAll(Arrays.asList(aVarArrF));
            }
        }
        return hashSet;
    }

    public Collection<D> d(s sVar) {
        HashSet hashSet = new HashSet();
        Iterator<e<z, D>> it = this.f6181b.iterator();
        while (it.hasNext()) {
            un.a[] aVarArrG = it.next().b().g(sVar);
            if (aVarArrG != null) {
                hashSet.addAll(Arrays.asList(aVarArrG));
            }
        }
        return hashSet;
    }

    public D e(z zVar, boolean z10) {
        D d10;
        for (e<z, D> eVar : this.f6181b) {
            D dB = eVar.b();
            if (dB.r().b().equals(zVar)) {
                return dB;
            }
            if (!z10 && (d10 = (D) eVar.b().e(zVar)) != null) {
                return d10;
            }
        }
        return null;
    }

    public Set<e<z, D>> f() {
        return this.f6181b;
    }

    public S g(String str) {
        for (e<String, S> eVar : this.f6182c) {
            if (eVar.c().equals(str)) {
                return eVar.b();
            }
        }
        return null;
    }

    public wn.c[] getResources(un.a aVar) throws RegistrationException {
        try {
            return this.f6180a.I().getNamespace().getResources(aVar);
        } catch (ValidationException e10) {
            throw new RegistrationException("Resource discover error: " + e10.toString(), e10);
        }
    }

    public Set<e<String, S>> h() {
        return this.f6182c;
    }

    public boolean i(S s10) {
        return this.f6182c.remove(new e(s10.I()));
    }

    public f(d dVar) {
        this.f6180a = dVar;
    }

    public boolean j(S s10) {
        if (i(s10)) {
            a(s10);
            return true;
        }
        return false;
    }
}
