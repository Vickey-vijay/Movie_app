package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.to;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f25417b;

    public static final WindowInsets a(to toVar, View view, WindowInsets windowInsets) {
        ck.p.j(view, "<unused var>");
        ck.p.j(windowInsets, "windowInsets");
        if (!toVar.f25416a.isEmpty()) {
            Iterator it = toVar.f25416a.iterator();
            while (it.hasNext()) {
                xo xoVar = (xo) ((so) it.next());
                xoVar.getClass();
                ck.p.j(windowInsets, "windowInsets");
                xoVar.f25748a.a(windowInsets);
                xoVar.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public to(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f25416a = new ArrayList();
        this.f25417b = new WeakReference(view);
        C3298x5.f25687a.getClass();
        if (C3298x5.u()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: b7.ma
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return to.a(this.f5062a, view2, windowInsets);
                }
            });
        }
    }

    public final void a() {
        View view;
        this.f25416a.clear();
        C3298x5.f25687a.getClass();
        if (!C3298x5.u() || (view = (View) this.f25417b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
