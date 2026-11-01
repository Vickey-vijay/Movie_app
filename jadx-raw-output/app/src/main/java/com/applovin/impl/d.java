package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsController;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    public class a extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f7166a = new WeakReference(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f7167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f7168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f7169d;

        public a(Class cls, b bVar, c cVar) {
            this.f7167b = cls;
            this.f7168c = bVar;
            this.f7169d = cVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f7167b.isInstance(activity) && this.f7166a.get() == null) {
                this.f7166a = new WeakReference(activity);
                this.f7168c.a(activity);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f7167b.isInstance(activity) && !activity.isChangingConfigurations() && this.f7166a.get() == activity) {
                this.f7169d.b(this);
            }
        }
    }

    public interface b {
        void a(Activity activity);
    }

    public static void a(Context context, Class cls, c cVar, b bVar) {
        cVar.a(new a(cls, bVar, cVar));
        a(context, cls);
    }

    public static void b(Activity activity) {
        WindowInsetsController insetsController;
        if (!o0.b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets$Type.statusBars());
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44955a);
        p10.startActivity(p11);
    }

    public static boolean d(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed();
    }

    public static void c(Activity activity) {
        if (o0.b()) {
            WindowInsetsController insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
                insetsController.hide(WindowInsets$Type.systemBars());
                return;
            } else {
                activity.getWindow().getDecorView().setSystemUiVisibility(5894);
                return;
            }
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public static String b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        try {
            return appLovinFullscreenActivity.getPackageManager().getActivityInfo(new ComponentName(appLovinFullscreenActivity, appLovinFullscreenActivity.getClass()), 0).taskAffinity;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity) {
        WindowInsetsController insetsController;
        if (o0.b() && (insetsController = activity.getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets$Type.navigationBars());
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(4866);
        }
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        ComponentName componentName;
        if (!o0.i()) {
            return null;
        }
        try {
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) appLovinFullscreenActivity.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                while (it.hasNext()) {
                    ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                    ComponentName componentName2 = taskInfo.topActivity;
                    String name = appLovinFullscreenActivity.getClass().getName();
                    if (componentName2 != null && componentName2.getClassName().equals(name) && (componentName = taskInfo.baseActivity) != null) {
                        return appLovinFullscreenActivity.getPackageManager().getActivityInfo(componentName, 0).taskAffinity;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
