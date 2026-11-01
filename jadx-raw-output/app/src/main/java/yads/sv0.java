package yads;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class sv0 extends tp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(final bw0 bw0Var, int i10, long j10, long j11) {
        super(new qp() { // from class: cp.y9
            @Override // yads.qp
            public final long a(long j12) {
                return bw0Var.a(j12);
            }
        }, new rv0(i10, bw0Var), bw0Var.b(), bw0Var.f75990j, j10, j11, bw0Var.a(), Math.max(6, bw0Var.f75983c));
        Objects.requireNonNull(bw0Var);
    }
}
