package com.bytedance.sdk.openadsdk.yu;

import com.ironsource.C3605n2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class vt {
    public static final String ouw = com.bytedance.sdk.openadsdk.yu.lh.ouw.InterfaceC0157ouw.ouw;
    public static final String vt = com.bytedance.sdk.openadsdk.yu.lh.ouw.InterfaceC0157ouw.vt;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final String f13586lh = com.bytedance.sdk.openadsdk.yu.lh.ouw.InterfaceC0157ouw.f13528lh;
    public static final String yu = com.bytedance.sdk.openadsdk.yu.lh.ouw.InterfaceC0157ouw.yu;
    public static final String fkw = com.bytedance.sdk.openadsdk.yu.lh.ouw.InterfaceC0157ouw.fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public static final String f13585le = com.bytedance.sdk.openadsdk.yu.lh.ouw.InterfaceC0157ouw.f13527le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final Set<String> f13587ra = new HashSet(Arrays.asList("click", C3605n2.f30216v, "insight_log"));

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public static String f13588lh = "direct";
        public static String ouw = "openDetailPage";
        public static String vt = "openAdLandPageLinks";
        public static String yu = "saLandingPageLinks";
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.yu.vt$vt, reason: collision with other inner class name */
    public static class C0161vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public static int f13589lh = 100;
        public static int ouw = 1;
        public static int vt = 2;
    }

    public static boolean ouw(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
