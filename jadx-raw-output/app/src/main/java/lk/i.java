package lk;

import java.util.List;

/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface i {

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class a {
        public static b a(i iVar) {
            return new b(iVar);
        }
    }

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f63617a;

        public b(i iVar) {
            ck.p.j(iVar, "match");
            this.f63617a = iVar;
        }

        public final i a() {
            return this.f63617a;
        }
    }

    b a();

    List<String> b();

    ik.i c();

    String getValue();

    i next();
}
