package com.unity3d.mediation;

import android.content.Context;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3459f1;
import com.ironsource.C3565l0;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.l;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayAdSize {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f45309f = 320;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f45310g = 50;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45311h = 320;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f45312i = 90;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45313j = 300;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f45314k = 250;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45316m = 90;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f45320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LevelPlayAdSize f45321e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "BANNER", false, null, 16, null);
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(300, 250, l.f29844g, false, null, 16, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45315l = 728;
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f45315l, 90, l.f29841d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, l.f29839b, false, null, 16, null);

    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        public final LevelPlayAdSize createAdSize$mediationsdk_release(String str) {
            p.j(str, C3426d4.i.O);
            int iHashCode = str.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && str.equals("BANNER")) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (str.equals(l.f29841d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (str.equals(l.f29839b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (str.equals(l.f29844g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            return new C3459f1(new C3565l0()).a(context, num);
        }

        public final LevelPlayAdSize createCustomSize(int i10, int i11) {
            return new LevelPlayAdSize(i10, i11, "CUSTOM", false, null, 16, null);
        }
    }

    public LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize) {
        this.f45317a = i10;
        this.f45318b = i11;
        this.f45319c = str;
        this.f45320d = z10;
        this.f45321e = levelPlayAdSize;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    public static final LevelPlayAdSize createCustomSize(int i10, int i11) {
        return Companion.createCustomSize(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f45317a == levelPlayAdSize.f45317a && this.f45318b == levelPlayAdSize.f45318b && p.e(this.f45319c, levelPlayAdSize.f45319c);
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public final String getDescription() {
        return String.valueOf(this.f45319c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f45321e;
    }

    public final int getHeight() {
        return this.f45318b;
    }

    public final int getWidth() {
        return this.f45317a;
    }

    public int hashCode() {
        int i10 = ((this.f45317a * 31) + this.f45318b) * 31;
        String str = this.f45319c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f45320d;
    }

    public String toString() {
        return this.f45319c + Z7.f27998r + this.f45317a + VastAttributes.HORIZONTAL_POSITION + this.f45318b;
    }

    public /* synthetic */ LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize, int i12, i iVar) {
        this(i10, i11, (i12 & 4) != 0 ? null : str, z10, (i12 & 16) != 0 ? null : levelPlayAdSize);
    }
}
