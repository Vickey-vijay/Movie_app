package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class sz2 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u30 f82841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r33 f82842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f82843c;

    @Override // yads.bg1
    public final void b() {
    }

    @Override // yads.bg1
    public final void a() {
        int i10;
        r33 r33Var;
        byte[] bArr;
        r33 r33Var2 = this.f82842b;
        r33Var2.f82097b = 0L;
        try {
            r33Var2.a(this.f82841a);
            do {
                i10 = (int) this.f82842b.f82097b;
                byte[] bArr2 = this.f82843c;
                if (bArr2 == null) {
                    this.f82843c = new byte[1024];
                } else if (i10 == bArr2.length) {
                    this.f82843c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                r33Var = this.f82842b;
                bArr = this.f82843c;
            } while (r33Var.read(bArr, i10, bArr.length - i10) != -1);
        } finally {
            s30.a(this.f82842b);
        }
    }

    public sz2(p30 p30Var, u30 u30Var) {
        vf1.a();
        this.f82841a = u30Var;
        this.f82842b = new r33(p30Var);
    }
}
