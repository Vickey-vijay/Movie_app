package com.unity3d.ironsourceads;

import ck.i;
import com.ironsource.mediationsdk.l;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes7.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45229c;

    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private Companion() {
        }

        public final AdSize banner() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "BANNER", null);
        }

        public final AdSize large() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, l.f29839b, null);
        }

        public final AdSize leaderboard() {
            return new AdSize(728, 90, l.f29841d, null);
        }

        public final AdSize mediumRectangle() {
            return new AdSize(d.f44769a, 250, l.f29844g, null);
        }
    }

    public /* synthetic */ AdSize(int i10, int i11, String str, i iVar) {
        this(i10, i11, str);
    }

    public static final AdSize banner() {
        return Companion.banner();
    }

    public static final AdSize large() {
        return Companion.large();
    }

    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    private AdSize(int i10, int i11, String str) {
        this.f45227a = i10;
        this.f45228b = i11;
        this.f45229c = str;
    }

    public final int getHeight() {
        return this.f45228b;
    }

    public final String getSizeDescription() {
        return this.f45229c;
    }

    public final int getWidth() {
        return this.f45227a;
    }
}
