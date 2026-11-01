package com.fyber.inneractive.sdk.cache.session;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14953a;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.cache.session.enums.a.values().length];
        f14953a = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.cache.session.enums.a.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14953a[com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14953a[com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
