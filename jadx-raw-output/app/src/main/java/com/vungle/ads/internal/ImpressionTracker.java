package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3537j8;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImpressionTracker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 72\u00020\u0001:\u0004789:B-\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b4\u00105B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00106J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\tR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R0\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010$\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010/\u001a\u00060.R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102¨\u0006;"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "setViewTreeObserver", "getTopView", "Lmj/r;", "scheduleVisibilityCheck", "", "minPercentageViewed", C3537j8.f29257k, "Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addView", "removeView", "clear", "destroy", "", "Lcom/vungle/ads/internal/ImpressionTracker$TrackingInfo;", "trackedViews", "Ljava/util/Map;", "Landroid/os/Handler;", "visibilityHandler", "Landroid/os/Handler;", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Rect;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getOnPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getOnPreDrawListener$annotations", "()V", "Ljava/lang/ref/WeakReference;", "Landroid/view/ViewTreeObserver;", "weakViewTreeObserver", "Ljava/lang/ref/WeakReference;", "getWeakViewTreeObserver", "()Ljava/lang/ref/WeakReference;", "setWeakViewTreeObserver", "(Ljava/lang/ref/WeakReference;)V", "getWeakViewTreeObserver$annotations", "Lcom/vungle/ads/internal/ImpressionTracker$VisibilityRunnable;", "visibilityRunnable", "Lcom/vungle/ads/internal/ImpressionTracker$VisibilityRunnable;", "isVisibilityScheduled", "Z", "setViewTreeObserverSucceed", "<init>", "(Landroid/content/Context;Ljava/util/Map;Landroid/os/Handler;)V", "(Landroid/content/Context;)V", VastTagName.COMPANION, "ImpressionListener", "TrackingInfo", "VisibilityRunnable", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, TrackingInfo> trackedViews;
    private final Handler visibilityHandler;
    private final VisibilityRunnable visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    private static final String TAG = ImpressionTracker.class.getSimpleName();

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lmj/r;", "onImpression", "onViewInvisible", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public interface ImpressionListener {
        void onImpression(View view);

        void onViewInvisible(View view);
    }

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker$TrackingInfo;", "", "()V", "impressionListener", "Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", "getImpressionListener", "()Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;", "setImpressionListener", "(Lcom/vungle/ads/internal/ImpressionTracker$ImpressionListener;)V", "minViewablePercent", "", "getMinViewablePercent", "()I", "setMinViewablePercent", "(I)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @VisibleForTesting
    public static final class TrackingInfo {
        private ImpressionListener impressionListener;
        private int minViewablePercent;

        public final ImpressionListener getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(ImpressionListener impressionListener) {
            this.impressionListener = impressionListener;
        }

        public final void setMinViewablePercent(int i10) {
            this.minViewablePercent = i10;
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/ImpressionTracker$VisibilityRunnable;", "Ljava/lang/Runnable;", "Lmj/r;", "run", "Ljava/util/ArrayList;", "Landroid/view/View;", "visibleViews", "Ljava/util/ArrayList;", "invisibleViews", "<init>", "(Lcom/vungle/ads/internal/ImpressionTracker;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @VisibleForTesting
    public final class VisibilityRunnable implements Runnable {
        private final ArrayList<View> visibleViews = new ArrayList<>();
        private final ArrayList<View> invisibleViews = new ArrayList<>();

        public VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImpressionListener impressionListener;
            ImpressionListener impressionListener2;
            ImpressionTracker.this.isVisibilityScheduled = false;
            for (Map.Entry entry : ImpressionTracker.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (ImpressionTracker.this.isVisible(view, ((TrackingInfo) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                } else {
                    this.invisibleViews.add(view);
                }
            }
            for (View view2 : this.visibleViews) {
                TrackingInfo trackingInfo = (TrackingInfo) ImpressionTracker.this.trackedViews.get(view2);
                if (trackingInfo != null && (impressionListener2 = trackingInfo.getImpressionListener()) != null) {
                    impressionListener2.onImpression(view2);
                }
                ImpressionTracker impressionTracker = ImpressionTracker.this;
                p.i(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                impressionTracker.removeView(view2);
            }
            this.visibleViews.clear();
            for (View view3 : this.invisibleViews) {
                TrackingInfo trackingInfo2 = (TrackingInfo) ImpressionTracker.this.trackedViews.get(view3);
                if (trackingInfo2 != null && (impressionListener = trackingInfo2.getImpressionListener()) != null) {
                    impressionListener.onViewInvisible(view3);
                }
            }
            this.invisibleViews.clear();
            if (!(!ImpressionTracker.this.trackedViews.isEmpty()) || ImpressionTracker.this.setViewTreeObserverSucceed) {
                return;
            }
            ImpressionTracker.this.scheduleVisibilityCheck();
        }
    }

    @VisibleForTesting
    public ImpressionTracker(Context context, Map<View, TrackingInfo> map, Handler handler) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(map, "trackedViews");
        p.j(handler, "visibilityHandler");
        this.trackedViews = map;
        this.visibilityHandler = handler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new VisibilityRunnable();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return ImpressionTracker.m3222_init_$lambda0(this.f45424b);
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int minPercentageViewed) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getVisibility() != 0) {
                Logger.INSTANCE.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                return false;
            }
            parent = viewGroup.getParent();
        }
        if (!view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long jHeight = ((long) this.clipRect.height()) * ((long) this.clipRect.width());
        long height = ((long) view.getHeight()) * ((long) view.getWidth());
        return height > 0 && ((long) 100) * jHeight >= ((long) minPercentageViewed) * height;
    }

    private final View getTopView(Context context, View view) {
        Window window;
        View decorView;
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById != null || view == null) {
            return viewFindViewById;
        }
        if (!ViewCompat.isAttachedToWindow(view)) {
            Logger.Companion companion = Logger.INSTANCE;
            String str = TAG;
            p.i(str, "TAG");
            companion.w(str, "Trying to call View#rootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView != null) {
            viewFindViewById = rootView.findViewById(R.id.content);
        }
        return viewFindViewById == null ? rootView : viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            Logger.Companion companion = Logger.INSTANCE;
            String str = TAG;
            p.i(str, "TAG");
            companion.d(str, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        Logger.Companion companion2 = Logger.INSTANCE;
        String str2 = TAG;
        p.i(str2, "TAG");
        companion2.d(str2, "The root view tree observer was not alive");
        return false;
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        p.j(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m3222_init_$lambda0(ImpressionTracker impressionTracker) {
        p.j(impressionTracker, "this$0");
        impressionTracker.scheduleVisibilityCheck();
        return true;
    }

    public final void addView(View view, ImpressionListener impressionListener) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        TrackingInfo trackingInfo = this.trackedViews.get(view);
        if (trackingInfo == null) {
            trackingInfo = new TrackingInfo();
            this.trackedViews.put(view, trackingInfo);
            scheduleVisibilityCheck();
        }
        trackingInfo.setMinViewablePercent(1);
        trackingInfo.setImpressionListener(impressionListener);
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    @VisibleForTesting
    public final void removeView(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.trackedViews.remove(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImpressionTracker(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        p.j(context, GAMConfig.KEY_CONTEXT);
    }
}
