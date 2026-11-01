package yads;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class md2 {
    public static final ld2 Companion = new ld2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f80142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f80143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f80144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f80145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f80146e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        md2 md2Var = (md2) obj;
        return ck.p.e(this.f80142a, md2Var.f80142a) && ck.p.e(this.f80143b, md2Var.f80143b) && ck.p.e(this.f80144c, md2Var.f80144c) && ck.p.e(this.f80145d, md2Var.f80145d) && ck.p.e(this.f80146e, md2Var.f80146e);
    }

    public final int hashCode() {
        Integer num = this.f80142a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f80143b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f80144c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f80145d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f80146e;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "PlayBackOptimizationConfig(minBufferMs=" + this.f80142a + ", maxBufferMs=" + this.f80143b + ", bufferForPlaybackMs=" + this.f80144c + ", bufferForPlaybackAfterRebufferMs=" + this.f80145d + ", targetBufferBytes=" + this.f80146e + ")";
    }

    public /* synthetic */ md2(int i10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i10 & 1) == 0) {
            this.f80142a = null;
        } else {
            this.f80142a = num;
        }
        if ((i10 & 2) == 0) {
            this.f80143b = null;
        } else {
            this.f80143b = num2;
        }
        if ((i10 & 4) == 0) {
            this.f80144c = null;
        } else {
            this.f80144c = num3;
        }
        if ((i10 & 8) == 0) {
            this.f80145d = null;
        } else {
            this.f80145d = num4;
        }
        if ((i10 & 16) == 0) {
            this.f80146e = null;
        } else {
            this.f80146e = num5;
        }
    }
}
