package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ImpressionTracker.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f35903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f35904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f35905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f35906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f35907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35909g;

    /* JADX INFO: compiled from: ImpressionTracker.java */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImpressionTracker.java */
    public class RunnableC0348c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f35912a;

        public RunnableC0348c(View view) {
            this.f35912a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f35912a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f35903a = new WeakReference(viewTreeObserver);
                if (c.this.f35905c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f35905c);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.java */
    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f35908f = false;
            List<View> list = this.f35904b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f35904b.size(); i10++) {
                View view = this.f35904b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f35906d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f35908f) {
            return;
        }
        Handler handler = this.f35907e;
        if (handler != null) {
            if (this.f35909g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f35908f = true;
    }

    private void c() {
        try {
            b();
        } catch (Throwable th2) {
            q0.b("ImpressionTracker", th2.getMessage(), th2);
        }
        try {
            this.f35905c = new a();
        } catch (Throwable th3) {
            q0.b("ImpressionTracker", th3.getMessage(), th3);
        }
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f35904b = arrayList;
        this.f35905c = null;
        this.f35906d = dVar;
        this.f35907e = handler;
        this.f35909g = i10;
        if (list != null) {
            this.f35904b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    public void a(View view) {
        View view2;
        View viewA = null;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f35904b.add(view);
        } else {
            List<View> list = this.f35904b;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f35904b.size() && ((view2 = this.f35904b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0348c(viewA));
    }

    private boolean b(View view) {
        return !e1.a(view, this.f35909g);
    }

    public void a() {
        try {
            this.f35908f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f35903a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f35903a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f35905c);
                }
                this.f35903a.clear();
            }
            this.f35906d = null;
            this.f35905c = null;
            List<View> list = this.f35904b;
            if (list != null) {
                list.clear();
            }
            this.f35904b = null;
        } catch (Throwable unused) {
        }
    }
}
