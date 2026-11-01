package com.facebook.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: InternalSettings.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\nJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0004\u0010\b¨\u0006\r"}, d2 = {"Lcom/facebook/internal/x;", "", "", "a", "b", "Ljava/lang/String;", "customUserAgent", "", "()Z", "isUnityApp$annotations", "()V", "isUnityApp", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f14523a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static volatile String customUserAgent;

    public static final String a() {
        return customUserAgent;
    }

    public static final boolean b() {
        String str = customUserAgent;
        return ck.p.e(str != null ? Boolean.valueOf(lk.x.R(str, "Unity.", false, 2, null)) : null, Boolean.TRUE);
    }
}
