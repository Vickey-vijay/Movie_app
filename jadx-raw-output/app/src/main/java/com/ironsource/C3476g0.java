package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3476g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f28961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f28962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3489gd f28964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Hf f28965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Double f28966f;

    public C3476g0(IronSource.a aVar, UUID uuid, String str, C3489gd c3489gd, Hf hf2, Double d10) {
        ck.p.j(aVar, "adFormat");
        ck.p.j(uuid, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(str, "adUnitId");
        this.f28961a = aVar;
        this.f28962b = uuid;
        this.f28963c = str;
        this.f28964d = c3489gd;
        this.f28965e = hf2;
        this.f28966f = d10;
    }

    public final IronSource.a a() {
        return this.f28961a;
    }

    /* JADX INFO: renamed from: com.ironsource.g0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28967a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28967a = iArr;
        }
    }

    public final void a(C3489gd c3489gd) {
        this.f28964d = c3489gd;
    }

    public final UUID b() {
        return this.f28962b;
    }

    public final String c() {
        return this.f28963c;
    }

    public final Double d() {
        return this.f28966f;
    }

    public final LevelPlay.AdFormat e() {
        int i10 = a.f28967a[this.f28961a.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i10 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3489gd f() {
        return this.f28964d;
    }

    public final Hf g() {
        return this.f28965e;
    }

    public /* synthetic */ C3476g0(IronSource.a aVar, UUID uuid, String str, C3489gd c3489gd, Hf hf2, Double d10, int i10, ck.i iVar) {
        this(aVar, uuid, str, (i10 & 8) != 0 ? null : c3489gd, (i10 & 16) != 0 ? null : hf2, (i10 & 32) != 0 ? null : d10);
    }
}
