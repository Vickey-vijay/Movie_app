package io.bidmachine.analytics.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\n¨\u0006\u001b"}, d2 = {"Lio/bidmachine/analytics/internal/t0;", "", "other", "", "a", "(Lio/bidmachine/analytics/internal/t0;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMajor", "major", "b", "getMinor", "minor", "c", "getPatch", "patch", "<init>", "(III)V", "d", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final /* data */ class t0 implements Comparable<t0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) other;
        return this.major == t0Var.major && this.minor == t0Var.minor && this.patch == t0Var.patch;
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.t0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lio/bidmachine/analytics/internal/t0$a;", "", "", "versionString", "Lio/bidmachine/analytics/internal/t0;", "a", "(Ljava/lang/String;)Lio/bidmachine/analytics/internal/t0;", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public final t0 a(String versionString) {
            Object objM3458constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                if (lk.a0.n0(versionString)) {
                    return null;
                }
                List listN0 = lk.a0.N0(versionString, new String[]{"."}, false, 0, 6, null);
                if (listN0.isEmpty()) {
                    return null;
                }
                int size = listN0.size();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i10 < size && i10 <= 6) {
                    if (i10 == 0) {
                        i11 = Integer.parseInt((String) listN0.get(0));
                    } else if (i10 != 1) {
                        i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt((String) listN0.get(i10)) : Integer.parseInt((String) listN0.get(2));
                    } else {
                        i12 = Integer.parseInt((String) listN0.get(1));
                    }
                    i10++;
                }
                objM3458constructorimpl = Result.m3458constructorimpl(new t0(i11, i12, i13));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            return (t0) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t0 other) {
        int iL = ck.p.l(this.major, other.major);
        if (iL != 0) {
            return iL;
        }
        int iL2 = ck.p.l(this.minor, other.minor);
        return iL2 != 0 ? iL2 : ck.p.l(this.patch, other.patch);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.patch);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    public t0(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
    }
}
