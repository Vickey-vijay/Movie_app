package io.appmetrica.analytics.coreapi.internal.lifecycle;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¨\u0006\b"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityLifecycleListener;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lio/appmetrica/analytics/coreapi/internal/lifecycle/ActivityEvent;", "event", "Lmj/r;", "onEvent", "core-api_release"}, k = 1, mv = {1, 6, 0})
public interface ActivityLifecycleListener {
    @MainThread
    void onEvent(Activity activity, ActivityEvent activityEvent);
}
