package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4457q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f57529a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC4432p enumC4432p) {
        if (activity != null && this.f57529a.get(activity) == enumC4432p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f57529a.put(activity, enumC4432p);
        return true;
    }
}
