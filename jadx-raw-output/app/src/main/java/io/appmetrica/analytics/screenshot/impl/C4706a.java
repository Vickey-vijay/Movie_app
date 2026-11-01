package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C4706a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4706a extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4709d f58411a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4706a(C4709d c4709d) {
        super(0);
        this.f58411a = c4709d;
    }

    public static final void a(C4709d c4709d) {
        ((C4728x) c4709d.f58417b).a("AndroidApiScreenshotCaptor");
    }

    @Override // bk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C4709d c4709d = this.f58411a;
        return new Activity.ScreenCaptureCallback() { // from class: cf.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C4706a.a(c4709d);
            }
        };
    }
}
