package com.inmobi.ads;

import ck.p;
import com.inmobi.media.R8;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class InMobiAdRequestStatus {
    public static final String AD_ACTIVE_MESSAGE = "The Ad Request could not be submitted as the user is viewing another Ad.";
    public static final R8 Companion = new R8();
    public static final String DEVICE_AUDIO_LEVEL_LOW = "The Ad Request could not be processed as the device volume level is below threshold.";
    public static final String FEATURE_DISABLED = "The Ad Request could not be submitted as the Feature is disabled";
    public static final String REQUEST_INVALID_MESSAGE = "An invalid ad request was sent and was rejected by the Ad Network. Please validate the ad request and try again";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusCode f22274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22275b;

    public enum StatusCode {
        NO_ERROR,
        NETWORK_UNREACHABLE,
        NO_FILL,
        REQUEST_INVALID,
        REQUEST_PENDING,
        REQUEST_TIMED_OUT,
        INTERNAL_ERROR,
        SERVER_ERROR,
        AD_ACTIVE,
        EARLY_REFRESH_REQUEST,
        AD_NO_LONGER_AVAILABLE,
        MISSING_REQUIRED_DEPENDENCIES,
        REPETITIVE_LOAD,
        GDPR_COMPLIANCE_ENFORCED,
        GET_SIGNALS_CALLED_WHILE_LOADING,
        LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING,
        INVALID_RESPONSE_IN_LOAD,
        MONETIZATION_DISABLED,
        CALLED_FROM_WRONG_THREAD,
        CONFIGURATION_ERROR,
        LOW_MEMORY,
        FEATURE_DISABLED,
        DEVICE_AUDIO_LEVEL_LOW;

        private static final /* synthetic */ uj.a $ENTRIES = kotlin.enums.a.a(values());

        public static uj.a<StatusCode> getEntries() {
            return $ENTRIES;
        }
    }

    public final void a() {
        switch (c.f22312a[this.f22274a.ordinal()]) {
            case 1:
                this.f22275b = "The InMobi SDK encountered an internal error.";
                break;
            case 2:
                this.f22275b = "The Internet is unreachable. Please check your Internet connection.";
                break;
            case 3:
                this.f22275b = REQUEST_INVALID_MESSAGE;
                break;
            case 4:
                this.f22275b = "The SDK is pending response to a previous ad request. Please wait for the previous ad request to complete before requesting for another ad.";
                break;
            case 5:
                this.f22275b = "The Ad Request timed out waiting for a response from the network. This can be caused due to a bad network connection. Please try again after a few minutes.";
                break;
            case 6:
                this.f22275b = "The Ad Server encountered an error when processing the ad request. This may be a transient issue. Please try again in a few minutes";
                break;
            case 7:
                this.f22275b = "Ad request successful but no ad served.";
                break;
            case 8:
                this.f22275b = AD_ACTIVE_MESSAGE;
                break;
            case 9:
                this.f22275b = "The Ad Request cannot be done so frequently. Please wait for some time before loading another ad.";
                break;
            case 10:
                this.f22275b = "An ad is no longer available. Please call load() to fetch a fresh ad.";
                break;
            case 11:
                this.f22275b = "The SDK rejected the ad request as one or more required dependencies could not be found. Please ensure you have included the required dependencies.";
                break;
            case 12:
                this.f22275b = "The SDK rejected the ad load request. Multiple load() call on the same object is not allowed if the previous ad request was successful.";
                break;
            case 13:
                this.f22275b = "Network Request dropped as current request is not GDPR compliant.";
                break;
            case 14:
                this.f22275b = "An ad load is already in progress, getSignals() call in this state is not allowed.";
                break;
            case 15:
                this.f22275b = "An ad load is already in progress, load(response) call in this state is not allowed.";
                break;
            case 16:
                this.f22275b = "Null or empty response as parameter is not allowed in load(response).";
                break;
            case 17:
                this.f22275b = "The Ad Request is terminated because monetization is disabled.";
                break;
            case 18:
                this.f22275b = "An API call is made from non-ui thread.";
                break;
            case 19:
                this.f22275b = "InMobi Ad Object is not configured properly Please check if setBannerSize(int widthInDp, int heightInDp) or setLayoutParams(<Layout_Params>) have been configured correctly";
                break;
            case 20:
                this.f22275b = "The app is running low on memory, hence resulting in failure";
                break;
            case 21:
                this.f22275b = FEATURE_DISABLED;
                break;
            case 22:
                this.f22275b = DEVICE_AUDIO_LEVEL_LOW;
                break;
            default:
                p.i("InMobiAdRequestStatus", "TAG");
                Objects.toString(this.f22274a);
                break;
        }
    }

    public final String getMessage() {
        return this.f22275b;
    }

    public final StatusCode getStatusCode() {
        return this.f22274a;
    }

    public final InMobiAdRequestStatus setCustomMessage(String str) {
        if (str != null) {
            this.f22275b = str;
        }
        return this;
    }

    public InMobiAdRequestStatus(StatusCode statusCode) {
        p.j(statusCode, "statusCode");
        this.f22274a = statusCode;
        a();
    }
}
