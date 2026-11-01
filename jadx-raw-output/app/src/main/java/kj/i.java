package kj;

import java.io.IOException;
import javax.servlet.ServletException;

/* JADX INFO: compiled from: Servlet.java */
/* JADX INFO: loaded from: classes2.dex */
public interface i {
    void destroy();

    void init(j jVar) throws ServletException;

    void service(p pVar, t tVar) throws ServletException, IOException;
}
