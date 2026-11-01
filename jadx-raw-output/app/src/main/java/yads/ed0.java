package yads;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class ed0 implements tc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f77031a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zc0 f77032b;

    public final void a(Exception exc, boolean z10) {
        this.f77032b = null;
        p51 p51VarA = p51.a((Collection) this.f77031a);
        this.f77031a.clear();
        m51 m51VarListIterator = p51VarA.listIterator(0);
        while (m51VarListIterator.hasNext()) {
            zc0 zc0Var = (zc0) m51VarListIterator.next();
            zc0Var.getClass();
            zc0Var.a(z10 ? 1 : 3, exc);
        }
    }
}
