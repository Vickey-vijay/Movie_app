package rm;

import java.io.IOException;
import javax.servlet.ServletException;

/* JADX INFO: compiled from: Handler.java */
/* JADX INFO: loaded from: classes2.dex */
public interface i extends ym.f, ym.d {
    p b();

    @Override // ym.d
    void destroy();

    void f(p pVar);

    void v(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException;
}
