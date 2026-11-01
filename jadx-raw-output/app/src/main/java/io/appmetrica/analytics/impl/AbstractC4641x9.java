package io.appmetrica.analytics.impl;

import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4641x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f57918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f57919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet f57920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumSet f57921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumSet f57922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumSet f57923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumSet f57924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumSet f57925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f57926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f57927j;

    static {
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC4112cb enumC4112cb2 = EnumC4112cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC4112cb enumC4112cb3 = EnumC4112cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC4112cb enumC4112cb4 = EnumC4112cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC4112cb enumC4112cb5 = EnumC4112cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC4112cb enumC4112cb6 = EnumC4112cb.EVENT_TYPE_ANR;
        f57918a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC4112cb enumC4112cb7 = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        EnumC4112cb enumC4112cb8 = EnumC4112cb.EVENT_TYPE_PURGE_BUFFER;
        EnumC4112cb enumC4112cb9 = EnumC4112cb.EVENT_TYPE_SEND_REFERRER;
        EnumC4112cb enumC4112cb10 = EnumC4112cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC4112cb enumC4112cb11 = EnumC4112cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC4112cb enumC4112cb12 = EnumC4112cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC4112cb enumC4112cb13 = EnumC4112cb.EVENT_TYPE_SET_SESSION_EXTRA;
        f57919b = EnumSet.of(enumC4112cb7, enumC4112cb8, enumC4112cb9, enumC4112cb10, enumC4112cb11, EnumC4112cb.EVENT_TYPE_ACTIVATION, enumC4112cb12, enumC4112cb5, enumC4112cb13);
        EnumC4112cb enumC4112cb14 = EnumC4112cb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC4112cb enumC4112cb15 = EnumC4112cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f57920c = EnumSet.of(enumC4112cb14, enumC4112cb4, enumC4112cb5, enumC4112cb12, enumC4112cb15);
        EnumC4112cb enumC4112cb16 = EnumC4112cb.EVENT_TYPE_REGULAR;
        f57921d = EnumSet.of(enumC4112cb4, enumC4112cb5, enumC4112cb3, enumC4112cb, enumC4112cb2, enumC4112cb15, enumC4112cb12, enumC4112cb16, EnumC4112cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC4112cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC4112cb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC4112cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC4112cb8, EnumC4112cb.EVENT_TYPE_INIT, EnumC4112cb.EVENT_TYPE_SEND_USER_PROFILE, EnumC4112cb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC4112cb9, enumC4112cb10, enumC4112cb11, EnumC4112cb.EVENT_TYPE_FIRST_ACTIVATION, EnumC4112cb.EVENT_TYPE_START, EnumC4112cb.EVENT_TYPE_APP_OPEN, EnumC4112cb.EVENT_TYPE_APP_UPDATE, enumC4112cb6);
        f57922e = EnumSet.of(enumC4112cb16);
        f57923f = EnumSet.of(enumC4112cb16);
        f57924g = EnumSet.of(enumC4112cb12);
        f57925h = EnumSet.of(EnumC4112cb.EVENT_TYPE_ALIVE, enumC4112cb8, enumC4112cb13, enumC4112cb5, enumC4112cb12);
        f57926i = Arrays.asList(0, 6145, Integer.valueOf(FragmentTransaction.TRANSIT_FRAGMENT_OPEN), 8224);
        f57927j = Arrays.asList(12290);
    }
}
