package x3;

import com.google.android.exoplayer2.Format;
import g5.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f74311o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f74312n;

    public final long l(byte[] bArr) {
        int i10;
        int i11 = bArr[0] & 255;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = bArr[1] & 63;
        }
        int i14 = i11 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i10 = 2500 << i15;
        } else if (i14 >= 12) {
            i10 = 10000 << (i15 & 1);
        } else {
            i10 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i13) * ((long) i10);
    }

    public final void m(List<byte[]> list, int i10) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i10) * 1000000000) / 48000).array());
    }

    @Override // x3.i
    public long e(t tVar) {
        return b(l(tVar.f53154a));
    }

    @Override // x3.i
    public boolean h(t tVar, long j10, i.b bVar) {
        if (this.f74312n) {
            boolean z10 = tVar.j() == 1332770163;
            tVar.L(0);
            return z10;
        }
        byte[] bArrCopyOf = Arrays.copyOf(tVar.f53154a, tVar.d());
        int i10 = bArrCopyOf[9] & 255;
        int i11 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArrCopyOf);
        m(arrayList, i11);
        m(arrayList, 3840);
        bVar.f74326a = Format.p(null, "audio/opus", null, -1, -1, i10, 48000, arrayList, null, 0, null);
        this.f74312n = true;
        return true;
    }

    public static boolean n(t tVar) {
        int iA = tVar.a();
        byte[] bArr = f74311o;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        tVar.h(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // x3.i
    public void j(boolean z10) {
        super.j(z10);
        if (z10) {
            this.f74312n = false;
        }
    }
}
