package u3;

import g5.t;
import java.io.IOException;
import q3.h;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f72620a = new t(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72621b;

    public final long a(h hVar) throws InterruptedException, IOException {
        int i10 = 0;
        hVar.peekFully(this.f72620a.f53154a, 0, 1);
        int i11 = this.f72620a.f53154a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        hVar.peekFully(this.f72620a.f53154a, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f72620a.f53154a[i10] & 255) + (i14 << 8);
        }
        this.f72621b += i13 + 1;
        return i14;
    }

    public boolean b(h hVar) throws InterruptedException, IOException {
        long length = hVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        hVar.peekFully(this.f72620a.f53154a, 0, 4);
        long jA = this.f72620a.A();
        this.f72621b = 4;
        while (jA != 440786851) {
            int i11 = this.f72621b + 1;
            this.f72621b = i11;
            if (i11 == i10) {
                return false;
            }
            hVar.peekFully(this.f72620a.f53154a, 0, 1);
            jA = ((jA << 8) & (-256)) | ((long) (this.f72620a.f53154a[0] & 255));
        }
        long jA2 = a(hVar);
        long j11 = this.f72621b;
        if (jA2 == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j11 + jA2 >= length) {
            return false;
        }
        while (true) {
            int i12 = this.f72621b;
            long j12 = j11 + jA2;
            if (i12 < j12) {
                if (a(hVar) == Long.MIN_VALUE) {
                    return false;
                }
                long jA3 = a(hVar);
                if (jA3 < 0 || jA3 > 2147483647L) {
                    return false;
                }
                if (jA3 != 0) {
                    int i13 = (int) jA3;
                    hVar.advancePeekPosition(i13);
                    this.f72621b += i13;
                }
            } else {
                if (i12 != j12) {
                    return false;
                }
                return true;
            }
        }
    }
}
