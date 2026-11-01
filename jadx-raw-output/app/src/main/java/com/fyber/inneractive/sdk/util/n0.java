package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f18596b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f18595a = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f18597c = new j(16, new i0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f18598d = new j(16, new j0());

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    public final void a(Context context, View view, m0 m0Var) {
        View rootView;
        IAlog.a("%strackView called with context: %s view: %s", "IAVisibilityTracker: ", context, view);
        if (context == null) {
            throw new IllegalStateException("View must be attached to an Activity context");
        }
        Context applicationContext = context.getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) this.f18596b.get(applicationContext);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.f18596b.put(applicationContext, weakHashMap);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.getWindow() != null) {
                    rootView = activity.getWindow().getDecorView();
                } else {
                    rootView = view.getRootView();
                }
            } else {
                rootView = view.getRootView();
            }
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                k0 k0Var = new k0(this, applicationContext);
                viewTreeObserver.addOnPreDrawListener(k0Var);
                this.f18595a.put(applicationContext, new Pair(viewTreeObserver, k0Var));
            }
        }
        weakHashMap.put(view, m0Var);
        b();
    }

    public final void b() {
        for (Context context : this.f18596b.keySet()) {
            IAlog.a("%stracking context: %s", "IAVisibilityTracker: ", context);
            WeakHashMap weakHashMap = (WeakHashMap) this.f18596b.get(context);
            if (weakHashMap != null) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", "IAVisibilityTracker: ", (View) it.next());
                }
            }
        }
    }

    public final void a(View view) {
        IAlog.a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        Map map = (Map) this.f18596b.get(context);
        if (map != null) {
            a(context, map, view);
        } else {
            for (Context context2 : new HashSet(this.f18596b.keySet())) {
                WeakHashMap weakHashMap = (WeakHashMap) this.f18596b.get(context2);
                if (weakHashMap != null) {
                    a(context2, weakHashMap, view);
                }
            }
        }
        b();
    }

    public final void a(Context context, Map map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f18551a <= 2) {
                IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f18596b.remove(context);
                Pair pair = (Pair) this.f18595a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f18595a.remove(context);
                }
            }
        }
    }

    public final void a() {
        this.f18596b.clear();
        Iterator it = this.f18595a.keySet().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) this.f18595a.get((Context) it.next());
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.f18595a.clear();
    }

    public final void a(Context context) {
        WeakHashMap weakHashMap;
        if (context == null || (weakHashMap = (WeakHashMap) this.f18596b.get(context)) == null) {
            return;
        }
        j jVar = this.f18598d;
        Object objPoll = jVar.f18585a.poll();
        if (objPoll == null) {
            objPoll = jVar.f18586b.a();
        }
        HashSet<View> hashSet = (HashSet) objPoll;
        hashSet.addAll(weakHashMap.keySet());
        for (View view : hashSet) {
            m0 m0Var = (m0) weakHashMap.get(view);
            if (m0Var != null) {
                float fWidth = 0.0f;
                j jVar2 = this.f18597c;
                Object objPoll2 = jVar2.f18585a.poll();
                if (objPoll2 == null) {
                    objPoll2 = jVar2.f18586b.a();
                }
                Rect rect = (Rect) objPoll2;
                if (view != null && view.getParent() != null && view.isShown() && view.getGlobalVisibleRect(rect)) {
                    fWidth = (rect.width() * rect.height()) / (view.getWidth() * view.getHeight());
                }
                m0Var.a(fWidth, rect);
                this.f18597c.f18585a.offer(rect);
            }
        }
        hashSet.clear();
        this.f18598d.f18585a.offer(hashSet);
    }
}
