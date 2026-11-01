package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public abstract class fz2 extends az2 implements s43 {
    public fz2() {
        super(new w43[2], new x43[2]);
        g();
    }

    public abstract r43 a(byte[] bArr, int i10, boolean z10);

    @Override // yads.s43
    public final void a(long j10) {
    }

    @Override // yads.az2
    public final t43 a(sa0 sa0Var, ua0 ua0Var, boolean z10) {
        w43 w43Var = (w43) sa0Var;
        x43 x43Var = (x43) ua0Var;
        try {
            ByteBuffer byteBuffer = w43Var.f82568d;
            byteBuffer.getClass();
            r43 r43VarA = a(byteBuffer.array(), byteBuffer.limit(), z10);
            long j10 = w43Var.f82570f;
            long j11 = w43Var.f84104j;
            x43Var.f83403c = j10;
            x43Var.f84450d = r43VarA;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            x43Var.f84451e = j10;
            x43Var.f82731b &= Integer.MAX_VALUE;
            return null;
        } catch (t43 e10) {
            return e10;
        }
    }

    @Override // yads.az2
    public final w43 c() {
        return new w43();
    }

    @Override // yads.az2
    public final ez2 d() {
        return new ez2(this);
    }
}
