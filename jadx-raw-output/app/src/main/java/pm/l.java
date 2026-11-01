package pm;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import rm.v;

/* JADX INFO: compiled from: UserAuthentication.java */
/* JADX INFO: loaded from: classes7.dex */
public class l implements rm.d.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f66236c;

    @Override // rm.d.h
    public String getAuthMethod() {
        return this.f66235b;
    }

    @Override // rm.d.h
    public v getUserIdentity() {
        return this.f66236c;
    }

    public String toString() {
        return "{User," + getAuthMethod() + StringUtils.COMMA + this.f66236c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public l(String str, v vVar) {
        this.f66235b = str;
        this.f66236c = vVar;
    }
}
