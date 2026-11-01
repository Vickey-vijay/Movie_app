package qk;

import kotlinx.coroutines.flow.SharingCommand;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class t implements kotlinx.coroutines.flow.a {
    public String toString() {
        return "SharingStarted.Eagerly";
    }

    @Override // kotlinx.coroutines.flow.a
    public c<SharingCommand> a(u<Integer> uVar) {
        return e.v(SharingCommand.START);
    }
}
