package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3742v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C3742v2 f31444a;

    public static C3742v2 a() {
        C3742v2 c3742v2 = f31444a;
        return c3742v2 == null ? new C3742v2() : c3742v2;
    }

    /* JADX INFO: renamed from: com.ironsource.v2$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31445a;

        static {
            int[] iArr = new int[C3714t8.a.values().length];
            f31445a = iArr;
            try {
                iArr[C3714t8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31445a[C3714t8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31445a[C3714t8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean a(Activity activity) {
        if (a.f31445a[C3486ga.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) S9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
