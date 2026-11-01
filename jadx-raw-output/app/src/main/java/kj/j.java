package kj;

import java.util.Enumeration;

/* JADX INFO: compiled from: ServletConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public interface j {
    String getInitParameter(String str);

    Enumeration<String> getInitParameterNames();

    k getServletContext();

    String getServletName();
}
