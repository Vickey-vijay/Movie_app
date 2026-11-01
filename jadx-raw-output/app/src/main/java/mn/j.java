package mn;

import java.beans.PropertyChangeSupport;
import java.util.Collection;

/* JADX INFO: compiled from: ServiceManager.java */
/* JADX INFO: loaded from: classes2.dex */
public interface j<T> {
    PropertyChangeSupport a();

    void b(a<T> aVar) throws Exception;

    Collection<xn.d> getCurrentState() throws Exception;

    T getImplementation();
}
