package kotlinx.coroutines.flow;

import qk.c;
import qk.t;
import qk.u;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0564a f63151a = C0564a.f63152a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    public static final class C0564a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0564a f63152a = new C0564a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f63153b = new t();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f63154c = new StartedLazily();

        public final a a() {
            return f63153b;
        }

        public final a b() {
            return f63154c;
        }
    }

    c<SharingCommand> a(u<Integer> uVar);
}
