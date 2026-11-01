package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.events.CrashEvent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4066ah implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f56373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f56374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4365m7 f56375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ib f56376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f56377e;

    public C4066ah(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ib());
    }

    public final void a(@NonNull C4365m7 c4365m7) {
        this.f56375c = c4365m7;
    }

    public C4066ah(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ib ib2) {
        this.f56373a = advIdWithLimitedAppender;
        this.f56374b = networkTaskForSendingDataParamsAppender;
        this.f56376d = ib2;
    }

    public final void a(long j10) {
        this.f56377e = j10;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C4350lh c4350lh) {
        builder.path(CrashEvent.f44624e);
        this.f56374b.appendEncryptedData(builder);
        C4365m7 c4365m7 = this.f56375c;
        if (c4365m7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c4365m7.f57251a, c4350lh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f56375c.f57252b, c4350lh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f56375c.f57253c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f56375c.f57256f, c4350lh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f56375c.f57258h, c4350lh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f56375c.f57259i, c4350lh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f56375c.f57260j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f56375c.f57254d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f56375c.f57255e);
            a(builder, "app_debuggable", this.f56375c.f57257g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f56375c.f57261k, c4350lh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f56375c.f57262l, c4350lh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f56375c.f57263m, c4350lh.getAppFramework()));
            a(builder, "attribution_id", this.f56375c.f57264n);
        }
        builder.appendQueryParameter("api_key_128", c4350lh.f57209m);
        builder.appendQueryParameter("app_id", c4350lh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c4350lh.getAppPlatform());
        builder.appendQueryParameter("model", c4350lh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c4350lh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c4350lh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c4350lh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c4350lh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c4350lh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c4350lh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c4350lh.f57212p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c4350lh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c4350lh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f56373a;
        this.f56376d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C4418oa.I.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f56377e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
