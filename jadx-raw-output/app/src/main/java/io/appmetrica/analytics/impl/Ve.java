package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class Ve implements Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56025c;

    public final Ve a(Context context, String str, String str2) {
        return new Ve(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ve)) {
            return false;
        }
        Ve ve2 = (Ve) obj;
        return ck.p.e(this.f56023a, ve2.f56023a) && ck.p.e(this.f56024b, ve2.f56024b) && ck.p.e(this.f56025c, ve2.f56025c);
    }

    public final int hashCode() {
        return this.f56025c.hashCode() + ((this.f56024b.hashCode() + (this.f56023a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f56023a + ", prefName=" + this.f56024b + ", prefValueName=" + this.f56025c + ')';
    }

    public static Ve a(Ve ve2, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = ve2.f56023a;
        }
        if ((i10 & 2) != 0) {
            str = ve2.f56024b;
        }
        if ((i10 & 4) != 0) {
            str2 = ve2.f56025c;
        }
        ve2.getClass();
        return new Ve(context, str, str2);
    }

    public Ve(Context context, String str, String str2) {
        this.f56023a = context;
        this.f56024b = str;
        this.f56025c = str2;
    }

    @Override // io.appmetrica.analytics.impl.Sc
    public final String a() {
        String string = this.f56023a.getSharedPreferences(this.f56024b, 0).getString(this.f56025c, "");
        return string == null ? "" : string;
    }
}
