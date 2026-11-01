package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.C4584v2;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/impl/v2;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/appmetrica/analytics/impl/d2;", "converter", "Lio/appmetrica/analytics/impl/y2;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
@TargetApi(28)
public final class C4584v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4584v2 f57785a = new C4584v2();

    public static final C4659y2 a(Context context, final C4129d2 converter) {
        return new C4659y2((EnumC4634x2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new FunctionWithThrowable() { // from class: af.u0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C4584v2.a(converter, (UsageStatsManager) obj);
            }
        }), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, ActivityChooserModel.ATTRIBUTE_ACTIVITY, "getting is background restricted", "activityManager", new FunctionWithThrowable() { // from class: af.v0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C4584v2.a((ActivityManager) obj);
            }
        }));
    }

    private C4584v2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC4634x2 a(C4129d2 c4129d2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c4129d2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return EnumC4634x2.RESTRICTED;
            }
            if (appStandbyBucket == 5) {
                return EnumC4634x2.EXEMPTED;
            }
            if (appStandbyBucket == 10) {
                return EnumC4634x2.ACTIVE;
            }
            if (appStandbyBucket == 30) {
                return EnumC4634x2.FREQUENT;
            }
            if (appStandbyBucket == 20) {
                return EnumC4634x2.WORKING_SET;
            }
            if (appStandbyBucket == 40) {
                return EnumC4634x2.RARE;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
