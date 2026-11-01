package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.C4253hn;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4253hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4682z0 f56924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Io f56925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4407o f56926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xk f56927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F5 f56928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4137da f56929f;

    public C4253hn(C4682z0 c4682z0, Io io2, C4407o c4407o, Xk xk2, F5 f10, C4137da c4137da) {
        this.f56924a = c4682z0;
        this.f56925b = io2;
        this.f56926c = c4407o;
        this.f56927d = xk2;
        this.f56928e = f10;
        this.f56929f = c4137da;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", ActivityChooserModel.ATTRIBUTE_ACTIVITY, new FunctionWithThrowable() { // from class: af.g0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C4253hn.b((Activity) obj);
            }
        });
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C4253hn(C4682z0 c4682z0, Io io2) {
        this(c4682z0, io2, C4105c4.l().a(), C4105c4.l().o(), C4105c4.l().h(), C4105c4.l().k());
    }
}
