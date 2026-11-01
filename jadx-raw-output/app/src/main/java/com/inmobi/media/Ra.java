package com.inmobi.media;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;

/* JADX INFO: loaded from: classes7.dex */
public final class Ra extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f23445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23448d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ra)) {
            return false;
        }
        Ra ra2 = (Ra) obj;
        return ck.p.e(this.f23445a, ra2.f23445a) && ck.p.e(this.f23446b, ra2.f23446b) && ck.p.e(this.f23447c, ra2.f23447c) && this.f23448d == ra2.f23448d;
    }

    public Ra(Activity activity, String str, String str2, boolean z10) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(str, "finalUrl");
        ck.p.j(str2, "callerId");
        this.f23445a = activity;
        this.f23446b = str;
        this.f23447c = str2;
        this.f23448d = z10;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23448d) + ((this.f23447c.hashCode() + ((this.f23446b.hashCode() + (this.f23445a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.f23445a + ", finalUrl=" + this.f23446b + ", callerId=" + this.f23447c + ", overlay=" + this.f23448d + ")";
    }
}
