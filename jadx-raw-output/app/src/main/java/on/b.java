package on;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import un.f;
import un.m;
import xn.d;

/* JADX INFO: compiled from: LocalGENASubscription.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends a<f> implements PropertyChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Logger f65464k = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<URL> f65465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, Long> f65466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, Long> f65467j;

    public synchronized void L(CancelReason cancelReason) {
        try {
            H().q().a().removePropertyChangeListener(this);
        } catch (Exception e10) {
            f65464k.warning("Removal of local service property change listener failed: " + so.a.a(e10));
        }
        M(cancelReason);
    }

    public abstract void M(CancelReason cancelReason);

    public synchronized void N() {
        b();
    }

    public synchronized List<URL> O() {
        return this.f65465h;
    }

    public synchronized void P() {
        this.f65462f.d(true);
    }

    public synchronized Set<String> Q(long j10, Collection<d> collection) {
        HashSet hashSet;
        hashSet = new HashSet();
        for (d dVar : collection) {
            m mVarD = dVar.d();
            String strB = dVar.d().b();
            if (mVarD.a().a() == 0 && mVarD.a().b() == 0) {
                f65464k.finer("Variable is not moderated: " + mVarD);
            } else if (!this.f65466i.containsKey(strB)) {
                f65464k.finer("Variable is moderated but was never sent before: " + mVarD);
            } else if (mVarD.a().a() > 0 && j10 <= this.f65466i.get(strB).longValue() + ((long) mVarD.a().a())) {
                f65464k.finer("Excluding state variable with maximum rate: " + mVarD);
                hashSet.add(strB);
            } else if (mVarD.e() && this.f65467j.get(strB) != null) {
                long jLongValue = Long.valueOf(this.f65467j.get(strB).longValue()).longValue();
                long jLongValue2 = Long.valueOf(dVar.toString()).longValue();
                long jB = mVarD.a().b();
                if (jLongValue2 > jLongValue && jLongValue2 - jLongValue < jB) {
                    f65464k.finer("Excluding state variable with minimum delta: " + mVarD);
                    hashSet.add(strB);
                } else if (jLongValue2 < jLongValue && jLongValue - jLongValue2 < jB) {
                    f65464k.finer("Excluding state variable with minimum delta: " + mVarD);
                    hashSet.add(strB);
                }
            }
        }
        return hashSet;
    }

    public synchronized void R() {
        H().q().a().addPropertyChangeListener(this);
    }

    public synchronized void S(Integer num) {
        int iIntValue = num == null ? 1800 : num.intValue();
        this.f65460d = iIntValue;
        J(iIntValue);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.beans.PropertyChangeListener
    public synchronized void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals("_EventedStateVariables")) {
            f65464k.fine("Eventing triggered, getting state for subscription: " + I());
            long time = new Date().getTime();
            Collection<d> collection = (Collection) propertyChangeEvent.getNewValue();
            Set<String> setQ = Q(time, collection);
            this.f65463g.clear();
            for (d dVar : collection) {
                String strB = dVar.d().b();
                if (!setQ.contains(strB)) {
                    f65464k.fine("Adding state variable value to current values of event: " + dVar.d() + " = " + dVar);
                    this.f65463g.put(dVar.d().b(), (d<S>) dVar);
                    this.f65466i.put(strB, Long.valueOf(time));
                    if (dVar.d().e()) {
                        this.f65467j.put(strB, Long.valueOf(dVar.toString()));
                    }
                }
            }
            if (this.f65463g.size() > 0) {
                f65464k.fine("Propagating new state variable values to subscription: " + this);
                h();
            } else {
                f65464k.fine("No state variable values for event (all moderated out?), not triggering event");
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public b(f fVar, Integer num, List<URL> list) throws Exception {
        super(fVar);
        this.f65466i = new HashMap();
        this.f65467j = new HashMap();
        S(num);
        f65464k.fine("Reading initial state of local service at subscription time");
        long time = new Date().getTime();
        this.f65463g.clear();
        Collection<d> currentState = H().q().getCurrentState();
        f65464k.finer("Got evented state variable values: " + currentState.size());
        for (d dVar : currentState) {
            this.f65463g.put(dVar.d().b(), (d<S>) dVar);
            if (f65464k.isLoggable(Level.FINEST)) {
                f65464k.finer("Read state variable value '" + dVar.d().b() + "': " + dVar.toString());
            }
            this.f65466i.put(dVar.d().b(), Long.valueOf(time));
            if (dVar.d().e()) {
                this.f65467j.put(dVar.d().b(), Long.valueOf(dVar.toString()));
            }
        }
        this.f65459c = "uuid:" + UUID.randomUUID();
        this.f65462f = new org.fourthline.cling.model.types.b(0L);
        this.f65465h = list;
    }
}
