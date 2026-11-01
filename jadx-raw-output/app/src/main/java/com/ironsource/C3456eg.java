package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3456eg implements InterfaceC3420cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3456eg f28795a = new C3456eg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mj.g f28796b = kotlin.b.a(a.f28797a);

    /* JADX INFO: renamed from: com.ironsource.eg$a */
    public static final class a extends Lambda implements bk.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28797a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object objInvoke = UnityAds.class.getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                IronLog.INTERNAL.warning(th2.getMessage());
                return null;
            }
        }
    }

    @Override // com.ironsource.InterfaceC3420cg
    public String a() {
        return (String) f28796b.getValue();
    }

    private C3456eg() {
    }
}
