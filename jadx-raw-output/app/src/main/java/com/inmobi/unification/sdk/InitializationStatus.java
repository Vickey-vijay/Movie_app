package com.inmobi.unification.sdk;

import androidx.annotation.Keep;
import com.inmobi.media.C2803da;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Retention(RetentionPolicy.RUNTIME)
public @interface InitializationStatus {
    public static final C2803da Companion = C2803da.f24230a;
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final String SUCCESS = "Success";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
