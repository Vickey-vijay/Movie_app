package lj;

import java.util.EventListener;
import javax.servlet.http.HttpSessionBindingEvent;

/* JADX INFO: compiled from: HttpSessionAttributeListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface g extends EventListener {
    void D(HttpSessionBindingEvent httpSessionBindingEvent);

    void a(HttpSessionBindingEvent httpSessionBindingEvent);

    void d(HttpSessionBindingEvent httpSessionBindingEvent);
}
