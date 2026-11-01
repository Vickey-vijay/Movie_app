package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;

/* JADX INFO: renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2984kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24677a = 0;

    static {
        ck.p.i(AbstractC2984kf.class.getSimpleName(), "getSimpleName(...)");
    }

    public static boolean a(Context context) {
        ck.p.j(context, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            }
            return Omid.isActive();
        } catch (Throwable th2) {
            th2.getStackTrace();
            return false;
        }
    }
}
