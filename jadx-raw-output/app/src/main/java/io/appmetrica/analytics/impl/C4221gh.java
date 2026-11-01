package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4221gh extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f56814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f56820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f56821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f56822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56823j;

    public C4221gh(@NonNull C4437p4 c4437p4) {
        this(c4437p4.f57475a, c4437p4.f57476b, c4437p4.f57478d, c4437p4.f57479e, c4437p4.f57480f, c4437p4.f57481g, c4437p4.f57482h, c4437p4.f57483i, c4437p4.f57484j, c4437p4.f57485k);
    }

    public static C4221gh a() {
        return new C4221gh(null, null, null, null, null, null, null, null, null, null);
    }

    public C4221gh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f56814a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f56815b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f56816c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f56817d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f56818e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f56819f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f56820g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f56821h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f56822i = map;
        this.f56823j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NonNull C4437p4 c4437p4) {
        Map<String, String> map;
        String str;
        Boolean bool = c4437p4.f57476b;
        if (bool != null && this.f56815b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c4437p4.f57478d;
        if (bool2 != null && this.f56816c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c4437p4.f57479e;
        if (num != null && this.f56817d != num.intValue()) {
            return false;
        }
        Integer num2 = c4437p4.f57480f;
        if (num2 != null && this.f56818e != num2.intValue()) {
            return false;
        }
        Integer num3 = c4437p4.f57481g;
        if (num3 != null && this.f56819f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c4437p4.f57482h;
        if (bool3 != null && this.f56820g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c4437p4.f57483i;
        if (bool4 != null && this.f56821h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c4437p4.f57475a;
        if (str2 != null && ((str = this.f56814a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c4437p4.f57484j;
        if (map2 != null && ((map = this.f56822i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c4437p4.f57485k;
        return num4 == null || this.f56823j == num4.intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4221gh mergeFrom(@NonNull C4437p4 c4437p4) {
        return new C4221gh((String) WrapUtils.getOrDefaultNullable(c4437p4.f57475a, this.f56814a), (Boolean) WrapUtils.getOrDefaultNullable(c4437p4.f57476b, Boolean.valueOf(this.f56815b)), (Boolean) WrapUtils.getOrDefaultNullable(c4437p4.f57478d, Boolean.valueOf(this.f56816c)), (Integer) WrapUtils.getOrDefaultNullable(c4437p4.f57479e, Integer.valueOf(this.f56817d)), (Integer) WrapUtils.getOrDefaultNullable(c4437p4.f57480f, Integer.valueOf(this.f56818e)), (Integer) WrapUtils.getOrDefaultNullable(c4437p4.f57481g, Integer.valueOf(this.f56819f)), (Boolean) WrapUtils.getOrDefaultNullable(c4437p4.f57482h, Boolean.valueOf(this.f56820g)), (Boolean) WrapUtils.getOrDefaultNullable(c4437p4.f57483i, Boolean.valueOf(this.f56821h)), (Map) WrapUtils.getOrDefaultNullable(c4437p4.f57484j, this.f56822i), (Integer) WrapUtils.getOrDefaultNullable(c4437p4.f57485k, Integer.valueOf(this.f56823j)));
    }
}
