package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2720a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Network f23941a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f23942b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f23943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f23944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f23945e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f23815a.a(AdConfig.class)).getCustomNwValidation();
    }
}
