package lj;

import java.util.Enumeration;

/* JADX INFO: compiled from: HttpSession.java */
/* JADX INFO: loaded from: classes2.dex */
public interface e {
    void a(String str, Object obj);

    Enumeration<String> b();

    Object getAttribute(String str);

    String getId();

    void invalidate();

    void removeAttribute(String str);
}
