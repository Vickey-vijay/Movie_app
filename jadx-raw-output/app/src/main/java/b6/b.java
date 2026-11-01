package b6;

/* JADX INFO: compiled from: BinaryShiftToken.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f4817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f4818d;

    @Override // b6.g
    public void c(c6.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f4818d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                aVar.c(31, 5);
                short s11 = this.f4818d;
                if (s11 > 62) {
                    aVar.c(s11 - 31, 16);
                } else if (i10 == 0) {
                    aVar.c(Math.min((int) s11, 31), 5);
                } else {
                    aVar.c(s11 - 31, 5);
                }
            }
            aVar.c(bArr[this.f4817c + i10], 8);
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f4817c);
        sb2.append("::");
        sb2.append((this.f4817c + this.f4818d) - 1);
        sb2.append('>');
        return sb2.toString();
    }

    public b(g gVar, int i10, int i11) {
        super(gVar);
        this.f4817c = (short) i10;
        this.f4818d = (short) i11;
    }
}
