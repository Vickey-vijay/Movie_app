package kotlinx.coroutines.flow;

import qk.c;
import qk.e;
import qk.u;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StartedLazily implements a {
    public String toString() {
        return "SharingStarted.Lazily";
    }

    @Override // kotlinx.coroutines.flow.a
    public c<SharingCommand> a(u<Integer> uVar) {
        return e.t(new StartedLazily$command$1(uVar, null));
    }
}
