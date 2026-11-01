package yads;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f81844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.a f81845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.l f81846c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return ck.p.e(this.f81844a, qf0Var.f81844a) && ck.p.e(this.f81845b, qf0Var.f81845b) && ck.p.e(this.f81846c, qf0Var.f81846c);
    }

    public final int hashCode() {
        return this.f81846c.hashCode() + ((this.f81845b.hashCode() + (this.f81844a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.f81844a + ", onLaunchSucceed=" + this.f81845b + ", onLaunchFailed=" + this.f81846c + ")";
    }

    public qf0(Intent intent, sf0 sf0Var, tf0 tf0Var) {
        this.f81844a = intent;
        this.f81845b = sf0Var;
        this.f81846c = tf0Var;
    }
}
