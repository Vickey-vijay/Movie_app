package com.caverock.androidsvg;

import com.ironsource.Z7;

/* JADX INFO: loaded from: classes10.dex */
public class PreserveAspectRatio {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PreserveAspectRatio f13705c = new PreserveAspectRatio(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PreserveAspectRatio f13706d = new PreserveAspectRatio(Alignment.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PreserveAspectRatio f13707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PreserveAspectRatio f13708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PreserveAspectRatio f13709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PreserveAspectRatio f13710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final PreserveAspectRatio f13711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PreserveAspectRatio f13712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PreserveAspectRatio f13713k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Alignment f13714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scale f13715b;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.f13714a == preserveAspectRatio.f13714a && this.f13715b == preserveAspectRatio.f13715b;
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        f13707e = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        f13708f = new PreserveAspectRatio(alignment2, scale);
        f13709g = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        f13710h = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        f13711i = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        f13712j = new PreserveAspectRatio(alignment, scale2);
        f13713k = new PreserveAspectRatio(alignment2, scale2);
    }

    public Alignment a() {
        return this.f13714a;
    }

    public Scale b() {
        return this.f13715b;
    }

    public String toString() {
        return this.f13714a + Z7.f27998r + this.f13715b;
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f13714a = alignment;
        this.f13715b = scale;
    }
}
