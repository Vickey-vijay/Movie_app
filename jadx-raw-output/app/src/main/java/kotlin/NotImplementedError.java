package kotlin;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public NotImplementedError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String str) {
        super(str);
        p.j(str, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i10, i iVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
