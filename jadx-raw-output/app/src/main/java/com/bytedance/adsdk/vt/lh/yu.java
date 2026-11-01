package com.bytedance.adsdk.vt.lh;

import com.bytedance.adsdk.vt.lh.vt.rn;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yu {
    private final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f11231le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final char f11232lh;
    public final List<rn> ouw;
    public final double vt;
    private final double yu;

    public static int ouw(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public final int hashCode() {
        return ouw(this.f11232lh, this.f11231le, this.fkw);
    }

    public yu(List<rn> list, char c10, double d10, double d11, String str, String str2) {
        this.ouw = list;
        this.f11232lh = c10;
        this.yu = d10;
        this.vt = d11;
        this.fkw = str;
        this.f11231le = str2;
    }
}
