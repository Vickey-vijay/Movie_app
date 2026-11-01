package com.facebook.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: compiled from: ServerProtocol.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\u0002H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0007J\b\u0010\u000b\u001a\u00020\u0002H\u0007J\b\u0010\f\u001a\u00020\u0002H\u0007J\b\u0010\r\u001a\u00020\u0002H\u0007J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007R\u001c\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/internal/g0;", "", "", "a", "", "d", "e", "c", "b", "g", CampaignEx.JSON_KEY_AD_K, "h", "j", InneractiveMediationDefs.GENDER_FEMALE, "subdomain", "i", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f14401a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = g0.class.getName();

    public static final String a() {
        return "v15.0";
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final String b() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{q1.t.u()}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final Collection<String> d() {
        return nj.s.n("service_disabled", "AndroidAuthKillSwitchException");
    }

    public static final Collection<String> e() {
        return nj.s.n("access_denied", "OAuthAccessDeniedException");
    }

    public static final String f() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{q1.t.u()}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String g() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("%s", Arrays.copyOf(new Object[]{q1.t.v()}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String h() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{q1.t.x()}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String i(String subdomain) {
        ck.p.j(subdomain, "subdomain");
        ck.w wVar = ck.w.f6066a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String j() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{q1.t.x()}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String k() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{q1.t.y()}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }
}
