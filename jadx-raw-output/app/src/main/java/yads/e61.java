package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class e61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co2 f76936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co2 f76937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co2 f76938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final co2 f76939d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e61)) {
            return false;
        }
        e61 e61Var = (e61) obj;
        return this.f76936a == e61Var.f76936a && this.f76937b == e61Var.f76937b && this.f76938c == e61Var.f76938c && this.f76939d == e61Var.f76939d;
    }

    public final int hashCode() {
        return this.f76939d.hashCode() + ((this.f76938c.hashCode() + ((this.f76937b.hashCode() + (this.f76936a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f76936a + ", impressionTrackingStartReportType=" + this.f76937b + ", impressionTrackingFailureReportType=" + this.f76938c + ", forcedImpressionTrackingFailureReportType=" + this.f76939d + ")";
    }

    public e61(co2 co2Var, co2 co2Var2, co2 co2Var3, co2 co2Var4) {
        this.f76936a = co2Var;
        this.f76937b = co2Var2;
        this.f76938c = co2Var3;
        this.f76939d = co2Var4;
    }
}
