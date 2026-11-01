package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class bw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f75987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f75988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f75989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f75990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final aw0 f75991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ts1 f75992l;

    public bw0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, aw0 aw0Var, ts1 ts1Var) {
        this.f75981a = i10;
        this.f75982b = i11;
        this.f75983c = i12;
        this.f75984d = i13;
        this.f75985e = i14;
        this.f75986f = b(i14);
        this.f75987g = i15;
        this.f75988h = i16;
        this.f75989i = a(i16);
        this.f75990j = j10;
        this.f75991k = aw0Var;
        this.f75992l = ts1Var;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j10;
        long j11;
        int i10 = this.f75984d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f75983c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f75981a;
            j10 = ((((i11 != this.f75982b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.f75987g)) * ((long) this.f75988h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public final long b() {
        long j10 = this.f75990j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f75985e);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    public final mx0 a(byte[] bArr, ts1 ts1Var) {
        bArr[4] = -128;
        int i10 = this.f75984d;
        if (i10 <= 0) {
            i10 = -1;
        }
        ts1 ts1Var2 = this.f75992l;
        if (ts1Var2 != null) {
            if (ts1Var == null) {
                ts1Var = ts1Var2;
            } else {
                ss1[] ss1VarArr = ts1Var.f83163b;
                if (ss1VarArr.length == 0) {
                    ts1Var = ts1Var2;
                } else {
                    ts1Var = new ts1((ss1[]) ib3.a((Object[]) ts1Var2.f83163b, (Object[]) ss1VarArr));
                }
            }
        }
        lx0 lx0Var = new lx0();
        lx0Var.f79967k = "audio/flac";
        lx0Var.f79968l = i10;
        lx0Var.f79980x = this.f75987g;
        lx0Var.f79981y = this.f75985e;
        lx0Var.f79969m = Collections.singletonList(bArr);
        lx0Var.f79965i = ts1Var;
        return new mx0(lx0Var);
    }

    public bw0(int i10, byte[] bArr) {
        ib2 ib2Var = new ib2(bArr);
        ib2Var.b(i10 * 8);
        this.f75981a = ib2Var.a(16);
        this.f75982b = ib2Var.a(16);
        this.f75983c = ib2Var.a(24);
        this.f75984d = ib2Var.a(24);
        int iA = ib2Var.a(20);
        this.f75985e = iA;
        this.f75986f = b(iA);
        this.f75987g = ib2Var.a(3) + 1;
        int iA2 = ib2Var.a(5) + 1;
        this.f75988h = iA2;
        this.f75989i = a(iA2);
        this.f75990j = ib2Var.f();
        this.f75991k = null;
        this.f75992l = null;
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f75985e)) / 1000000;
        long j12 = this.f75990j - 1;
        int i10 = ib3.f78556a;
        return Math.max(0L, Math.min(j11, j12));
    }
}
