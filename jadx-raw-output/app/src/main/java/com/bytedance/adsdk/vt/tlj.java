package com.bytedance.adsdk.vt;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class tlj {
    public final int[][] bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public Bitmap f11341cf;
    public final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final String f11342le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f11343lh;
    public final int ouw;
    public final String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final List<ouw> f11344ra;
    public final JSONArray tlj;
    public final int vt;
    public final String yu;

    public static class ouw {
        public int fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public int f11345le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11346lh;
        public int ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f11347ra;
        public int vt;
        public String yu;
    }

    public tlj(int i10, int i11, String str, String str2, String str3, String str4, List<ouw> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.ouw = i10;
        this.vt = i11;
        this.f11343lh = str;
        this.yu = str2;
        this.fkw = str3;
        this.f11342le = str4;
        this.f11344ra = list;
        this.pno = str5;
        this.bly = iArr;
        this.tlj = jSONArray;
    }
}
