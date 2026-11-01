package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f22687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f22688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f22689c;

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public abstract View c();

    public abstract void d();

    public Fn(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "container");
        this.f22687a = gestureDetectorOnGestureListenerC2785ci;
        this.f22689c = gestureDetectorOnGestureListenerC2785ci.getAdConfig();
    }

    public void a() {
        WeakReference weakReference = this.f22688b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public View b() {
        WeakReference weakReference = this.f22688b;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
