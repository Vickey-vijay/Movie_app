package ho;

import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: compiled from: LastChange.java */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f54004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LastChangeParser f54005b;

    public k(LastChangeParser lastChangeParser, a aVar) {
        this.f54005b = lastChangeParser;
        this.f54004a = aVar;
    }

    public synchronized void a(org.fourthline.cling.model.types.b bVar, b... bVarArr) {
        for (b bVar2 : bVarArr) {
            if (bVar2 != null) {
                this.f54004a.c(bVar, bVar2);
            }
        }
    }

    public synchronized String toString() {
        if (!this.f54004a.b()) {
            return "";
        }
        try {
            return this.f54005b.j(this.f54004a);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public k(LastChangeParser lastChangeParser) {
        this(lastChangeParser, new a());
    }
}
