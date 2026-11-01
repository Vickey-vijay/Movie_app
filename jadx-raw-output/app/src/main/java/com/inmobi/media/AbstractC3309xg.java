package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3309xg extends Sn {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f25726l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3309xg(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, InterfaceC3028m9 interfaceC3028m9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b10, interfaceC3028m9);
        C3051n7 c3051n7 = C3126q7.f25145k;
        ck.p.j(c3051n7, "visibilityChecker");
        ck.p.j(c3051n7, "visibilityChecker");
        this.f25726l = viewabilityConfig;
    }
}
