package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC4162ea {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56666a;

    public static EnumC4162ea a(Integer num) {
        if (num != null) {
            for (EnumC4162ea enumC4162ea : values()) {
                if (enumC4162ea.f56666a == num.intValue()) {
                    return enumC4162ea;
                }
            }
        }
        return UNKNOWN;
    }

    EnumC4162ea(int i10) {
        this.f56666a = i10;
    }
}
