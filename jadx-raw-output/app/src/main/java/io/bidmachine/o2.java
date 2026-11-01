package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.SharedPreferenceUtils;
import io.bidmachine.utils.ThrowableRunnable;
import java.util.UUID;

/* JADX INFO: compiled from: BidMachineSharedPreference.java */
/* JADX INFO: loaded from: classes2.dex */
public class o2 {

    @NonNull
    private static final String KEY_BM_IFV = "bid_machine_ifv";

    @NonNull
    private static final String KEY_FIRST_LAUNCH_TIME = "first_app_launch_ms";

    @NonNull
    private static final String KEY_HW_INFO = "hw_info_";

    @NonNull
    private static final String KEY_INIT_DATA = "initData";

    @NonNull
    private static final String KEY_INIT_DATA_SESSION_ID = "init_data_session_id";

    @NonNull
    private static final String KEY_INIT_EXTRAS = "init_extras";

    @NonNull
    private static final String KEY_SESSION_COUNT = "session_count";

    @NonNull
    private static final String KEY_USER_AGENT = "ua";

    @NonNull
    private static final String KEY_USER_AGENT_DEVICE_OS = "ua_device_os";

    @NonNull
    private static final String KEY_USER_AGENT_EXPIRATION = "ua_exp";

    @NonNull
    private static final String NAME = "BidMachinePref";

    @Nullable
    private static SharedPreferences sharedPreferences;

    @NonNull
    @VisibleForTesting
    public static SharedPreferences getSharedPreferences(@NonNull Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }

    public static void incrementSessionCount(@NonNull final Context context) {
        Utils.runCatching(new ThrowableRunnable() { // from class: io.bidmachine.n2
            @Override // io.bidmachine.utils.ThrowableRunnable
            public final void run() throws Throwable {
                o2.lambda$incrementSessionCount$0(context);
            }
        });
    }

    @NonNull
    public static String obtainBMIFV(@NonNull Context context) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        String string = null;
        try {
            string = sharedPreferences2.getString(KEY_BM_IFV, null);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        sharedPreferences2.edit().putString(KEY_BM_IFV, string2).apply();
        return string2;
    }

    public static long obtainFirstLaunchTimeMs(@NonNull Context context) {
        long j10;
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        try {
            j10 = sharedPreferences2.getLong(KEY_FIRST_LAUNCH_TIME, 0L);
        } catch (Exception unused) {
            j10 = 0;
        }
        if (j10 != 0) {
            return j10;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        sharedPreferences2.edit().putLong(KEY_FIRST_LAUNCH_TIME, jCurrentTimeMillis).apply();
        return jCurrentTimeMillis;
    }

    public static void storeSessionCount(@NonNull final Context context, final int i10) {
        Utils.runCatching(new ThrowableRunnable() { // from class: io.bidmachine.m2
            @Override // io.bidmachine.utils.ThrowableRunnable
            public final void run() throws Throwable {
                o2.lambda$storeSessionCount$1(context, i10);
            }
        });
    }

    @VisibleForTesting
    public static void clear(@NonNull Context context) {
        SharedPreferenceUtils.clear(getSharedPreferences(context));
    }

    public static void clearInitExtras(@NonNull Context context) {
        SharedPreferenceUtils.remove(getSharedPreferences(context), KEY_INIT_EXTRAS);
    }

    @Nullable
    public static String getHwInfo(@NonNull Context context, @NonNull String str) {
        return SharedPreferenceUtils.optString(getSharedPreferences(context), KEY_HW_INFO + str, null);
    }

    @Nullable
    public static Extras getInitExtras(@NonNull Context context) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        try {
            return Extras.parseFrom(Base64.decode(SharedPreferenceUtils.optString(sharedPreferences2, KEY_INIT_EXTRAS, null), 0));
        } catch (Exception unused) {
            SharedPreferenceUtils.remove(sharedPreferences2, KEY_INIT_EXTRAS);
            return null;
        }
    }

    @Nullable
    public static InitResponse getInitResponse(@NonNull Context context) {
        SharedPreferences sharedPreferences2 = getSharedPreferences(context);
        try {
            return InitResponse.parseFrom(Base64.decode(sharedPreferences2.getString(KEY_INIT_DATA, null), 0));
        } catch (Exception unused) {
            SharedPreferenceUtils.remove(sharedPreferences2, KEY_INIT_DATA);
            return null;
        }
    }

    @NonNull
    public static String getInitResponseSessionId(@NonNull Context context) {
        String strOptString = SharedPreferenceUtils.optString(getSharedPreferences(context), KEY_INIT_DATA_SESSION_ID, null);
        if (strOptString != null) {
            return strOptString;
        }
        return "";
    }

    public static int getSessionCount(@NonNull Context context) {
        return SharedPreferenceUtils.optInt(getSharedPreferences(context), KEY_SESSION_COUNT, 0);
    }

    @Nullable
    public static String getUserAgent(@NonNull Context context) {
        return SharedPreferenceUtils.optString(getSharedPreferences(context), "ua", null);
    }

    @Nullable
    public static String getUserAgentDeviceOs(@NonNull Context context) {
        return SharedPreferenceUtils.optString(getSharedPreferences(context), KEY_USER_AGENT_DEVICE_OS, null);
    }

    public static long getUserAgentExpirationMs(@NonNull Context context) {
        return SharedPreferenceUtils.optLong(getSharedPreferences(context), KEY_USER_AGENT_EXPIRATION, -1L);
    }

    @Nullable
    public static String getValidUserAgent(@NonNull Context context) {
        String userAgent = getUserAgent(context);
        if (!TextUtils.isEmpty(userAgent) && DeviceUtils.getOsVersion().equals(getUserAgentDeviceOs(context)) && getUserAgentExpirationMs(context) > System.currentTimeMillis()) {
            return userAgent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$incrementSessionCount$0(Context context) throws Throwable {
        storeSessionCount(context, getSessionCount(context) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$storeSessionCount$1(Context context, int i10) throws Throwable {
        getSharedPreferences(context).edit().putInt(KEY_SESSION_COUNT, i10).apply();
    }

    public static void setHwInfo(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_HW_INFO + str, str2);
    }

    public static void setUserAgent(@NonNull Context context, @Nullable String str) {
        SharedPreferenceUtils.putString(getSharedPreferences(context), "ua", str);
    }

    public static void setUserAgentDeviceOs(@NonNull Context context, @Nullable String str) {
        SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_USER_AGENT_DEVICE_OS, str);
    }

    public static void setUserAgentExpirationMs(@NonNull Context context, long j10) {
        SharedPreferenceUtils.putLong(getSharedPreferences(context), KEY_USER_AGENT_EXPIRATION, Long.valueOf(j10));
    }

    public static void setValidUserAgent(@NonNull Context context, @Nullable String str, long j10) {
        setUserAgent(context, str);
        setUserAgentDeviceOs(context, DeviceUtils.getOsVersion());
        setUserAgentExpirationMs(context, j10);
    }

    public static void storeInitExtras(@NonNull Context context, @NonNull Extras extras) {
        try {
            SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_INIT_EXTRAS, Base64.encodeToString(extras.toByteArray(), 0));
        } catch (Exception unused) {
        }
    }

    public static void storeInitResponse(@NonNull Context context, @NonNull InitResponse initResponse, @NonNull String str) {
        try {
            SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_INIT_DATA, Base64.encodeToString(initResponse.toByteArray(), 0));
            SharedPreferenceUtils.putString(getSharedPreferences(context), KEY_INIT_DATA_SESSION_ID, str);
        } catch (Exception unused) {
        }
    }
}
