package vm;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: HashSessionIdManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map<String, Set<WeakReference<lj.e>>> f73230p = new HashMap();

    @Override // rm.s
    public void F(String str) {
        Set<WeakReference<lj.e>> setRemove;
        synchronized (this) {
            setRemove = this.f73230p.remove(str);
        }
        if (setRemove != null) {
            Iterator<WeakReference<lj.e>> it = setRemove.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next().get();
                if (aVar != null && aVar.v()) {
                    aVar.invalidate();
                }
            }
            setRemove.clear();
        }
    }

    @Override // rm.s
    public boolean M(String str) {
        boolean zContainsKey;
        synchronized (this) {
            zContainsKey = this.f73230p.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // rm.s
    public String E(String str, lj.a aVar) {
        String str2 = aVar == null ? null : (String) aVar.getAttribute("org.eclipse.jetty.ajp.JVMRoute");
        if (str2 != null) {
            return str + '.' + str2;
        }
        if (this.f73211m == null) {
            return str;
        }
        return str + '.' + this.f73211m;
    }

    @Override // rm.s
    public String c0(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    @Override // vm.b, ym.a
    public void e0() throws Exception {
        this.f73230p.clear();
        super.e0();
    }

    @Override // vm.b, ym.a
    public void d0() throws Exception {
        super.d0();
    }

    @Override // rm.s
    public void h(lj.e eVar) {
        String strC0 = c0(eVar.getId());
        WeakReference<lj.e> weakReference = new WeakReference<>(eVar);
        synchronized (this) {
            Set<WeakReference<lj.e>> hashSet = this.f73230p.get(strC0);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f73230p.put(strC0, hashSet);
            }
            hashSet.add(weakReference);
        }
    }

    @Override // rm.s
    public void i(lj.e eVar) {
        String strC0 = c0(eVar.getId());
        synchronized (this) {
            Set<WeakReference<lj.e>> set = this.f73230p.get(strC0);
            if (set != null) {
                Iterator<WeakReference<lj.e>> it = set.iterator();
                while (it.hasNext()) {
                    lj.e eVar2 = it.next().get();
                    if (eVar2 == null) {
                        it.remove();
                    } else if (eVar2 == eVar) {
                        it.remove();
                        break;
                    }
                }
                if (set.isEmpty()) {
                    this.f73230p.remove(strC0);
                }
            }
        }
    }
}
