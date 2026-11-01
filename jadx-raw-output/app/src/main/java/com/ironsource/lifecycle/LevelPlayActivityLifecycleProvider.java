package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayActivityLifecycleProvider extends ContentProvider {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f29417a = new WeakReference<>(null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            p.j(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f29417a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f29417a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f29417a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return 0;
    }

    private final void a(Application application) {
        application.registerActivityLifecycleCallbacks(new b());
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() == null) {
            IronLog.INTERNAL.verbose("context is null");
            return true;
        }
        if (!(getContext() instanceof Application)) {
            IronLog.INTERNAL.verbose("context is not application");
            return true;
        }
        Context context = getContext();
        p.h(context, "null cannot be cast to non-null type android.app.Application");
        a((Application) context);
        return true;
    }
}
