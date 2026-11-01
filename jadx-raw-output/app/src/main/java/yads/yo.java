package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class yo extends sa0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f85076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f85078l;

    public yo() {
        super(2);
        this.f85078l = 32;
    }

    public final boolean a(sa0 sa0Var) {
        ByteBuffer byteBuffer;
        if (!(!sa0Var.b(1073741824))) {
            throw new IllegalArgumentException();
        }
        if (!(!sa0Var.b(268435456))) {
            throw new IllegalArgumentException();
        }
        if (!(!sa0Var.b(4))) {
            throw new IllegalArgumentException();
        }
        int i10 = this.f85077k;
        if (i10 > 0) {
            if (i10 >= this.f85078l || sa0Var.b(Integer.MIN_VALUE) != b(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = sa0Var.f82568d;
            if (byteBuffer2 != null && (byteBuffer = this.f82568d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.f85077k;
        this.f85077k = i11 + 1;
        if (i11 == 0) {
            this.f82570f = sa0Var.f82570f;
            if (sa0Var.b(1)) {
                this.f82731b = 1;
            }
        }
        if (sa0Var.b(Integer.MIN_VALUE)) {
            this.f82731b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = sa0Var.f82568d;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f82568d.put(byteBuffer3);
        }
        this.f85076j = sa0Var.f82570f;
        return true;
    }

    @Override // yads.sa0
    public final void b() {
        super.b();
        this.f85077k = 0;
    }
}
