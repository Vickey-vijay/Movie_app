package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f18163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f18164b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f18163a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f18164b = cls2 != null;
    }

    public static boolean a() {
        return (f18163a == null || f18164b) ? false : true;
    }
}
