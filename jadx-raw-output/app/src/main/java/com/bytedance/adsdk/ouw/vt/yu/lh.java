package com.bytedance.adsdk.ouw.vt.yu;

import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public enum lh implements fkw {
    QUESTION("?", 0),
    COLON(StringUtils.PROCESS_POSTFIX_DELIMITER, 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR(ImpressionLog.P, 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);


    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final String f10755rn;
    public final int zih;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static final Map<String, lh> f10754vm = new HashMap(128);

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private static final Set<lh> f10753th = new HashSet();

    public static lh ouw(String str) {
        return f10754vm.get(str);
    }

    static {
        for (lh lhVar : values()) {
            f10754vm.put(lhVar.f10755rn, lhVar);
            f10753th.add(lhVar);
        }
    }

    public static boolean ouw(fkw fkwVar) {
        return fkwVar instanceof lh;
    }

    lh(String str, int i10) {
        this.f10755rn = str;
        this.zih = i10;
    }
}
