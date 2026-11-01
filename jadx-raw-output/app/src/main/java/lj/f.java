package lj;

import java.util.EventListener;
import javax.servlet.http.HttpSessionEvent;

/* JADX INFO: compiled from: HttpSessionActivationListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f extends EventListener {
    void sessionDidActivate(HttpSessionEvent httpSessionEvent);

    void sessionWillPassivate(HttpSessionEvent httpSessionEvent);
}
