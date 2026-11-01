package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29879a = "do_not_sell";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29880b = "is_child_directed";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29881c = "is_deviceid_optout";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29882d = "google_family_self_certified_sdks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29883e = "iiqf";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29884f = "is_test_suite";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f29885g = "true";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f29886h = "false";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f29887i = "google_water_mark";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f29888j = "enable";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<String> f29889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set<String> f29890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set<String> f29891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f29892n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f29880b, f29881c, f29884f, f29882d, f29883e));
        f29889k = hashSet;
        f29890l = new HashSet(Arrays.asList(f29881c, f29882d, f29884f, f29883e));
        HashSet hashSet2 = new HashSet(hashSet);
        f29891m = hashSet2;
        hashSet2.add(f29879a);
    }
}
