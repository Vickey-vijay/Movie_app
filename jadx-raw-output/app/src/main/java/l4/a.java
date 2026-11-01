package l4;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f63417f = new a(new long[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f63419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0572a[] f63420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63422e;

    /* JADX INFO: renamed from: l4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class C0572a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri[] f63424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f63425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f63426d;

        public C0572a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public int a() {
            return b(-1);
        }

        public int b(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f63425c;
                if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0572a.class != obj.getClass()) {
                return false;
            }
            C0572a c0572a = (C0572a) obj;
            return this.f63423a == c0572a.f63423a && Arrays.equals(this.f63424b, c0572a.f63424b) && Arrays.equals(this.f63425c, c0572a.f63425c) && Arrays.equals(this.f63426d, c0572a.f63426d);
        }

        public C0572a(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
            g5.a.a(iArr.length == uriArr.length);
            this.f63423a = i10;
            this.f63425c = iArr;
            this.f63424b = uriArr;
            this.f63426d = jArr;
        }

        public boolean c() {
            return this.f63423a == -1 || a() < this.f63423a;
        }

        public int hashCode() {
            return (((((this.f63423a * 31) + Arrays.hashCode(this.f63424b)) * 31) + Arrays.hashCode(this.f63425c)) * 31) + Arrays.hashCode(this.f63426d);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f63418a == aVar.f63418a && this.f63421d == aVar.f63421d && this.f63422e == aVar.f63422e && Arrays.equals(this.f63419b, aVar.f63419b) && Arrays.equals(this.f63420c, aVar.f63420c);
    }

    public int a(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f63419b;
            if (i10 >= jArr.length) {
                break;
            }
            long j12 = jArr[i10];
            if (j12 == Long.MIN_VALUE || (j10 < j12 && this.f63420c[i10].c())) {
                break;
            }
            i10++;
        }
        if (i10 < this.f63419b.length) {
            return i10;
        }
        return -1;
    }

    public int b(long j10, long j11) {
        int length = this.f63419b.length - 1;
        while (length >= 0 && c(j10, j11, length)) {
            length--;
        }
        if (length < 0 || !this.f63420c[length].c()) {
            return -1;
        }
        return length;
    }

    public final boolean c(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = this.f63419b[i10];
        if (j12 == Long.MIN_VALUE) {
            return j11 == -9223372036854775807L || j10 < j11;
        }
        return j10 < j12;
    }

    public int hashCode() {
        return (((((((this.f63418a * 31) + ((int) this.f63421d)) * 31) + ((int) this.f63422e)) * 31) + Arrays.hashCode(this.f63419b)) * 31) + Arrays.hashCode(this.f63420c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adResumePositionUs=");
        sb2.append(this.f63421d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f63420c.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f63419b[i10]);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f63420c[i10].f63425c.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f63420c[i10].f63425c[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f63420c[i10].f63426d[i11]);
                sb2.append(')');
                if (i11 < this.f63420c[i10].f63425c.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f63420c.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public a(long... jArr) {
        int length = jArr.length;
        this.f63418a = length;
        this.f63419b = Arrays.copyOf(jArr, length);
        this.f63420c = new C0572a[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.f63420c[i10] = new C0572a();
        }
        this.f63421d = 0L;
        this.f63422e = -9223372036854775807L;
    }
}
