package zk;

import ck.i;
import ck.p;
import ck.s;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f86475a = new a();

        public a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f86476a = new b();

        public b() {
            super(null);
        }
    }

    public g() {
    }

    public /* synthetic */ g(i iVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String strI = s.b(getClass()).i();
        p.g(strI);
        return strI;
    }
}
