package io.bidmachine;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.Utils;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import mj.r;
import org.json.JSONObject;

/* JADX INFO: compiled from: Debugger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J1\u0010\u000e\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000bH\u0082\bJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\"\u001a\u00020\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#¨\u0006)"}, d2 = {"Lio/bidmachine/Debugger;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", "setup", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lorg/json/JSONObject;", "jsonObject", "", C3426d4.i.W, "Lkotlin/Function1;", "", "action", "applyAndLockIfExists", "json", "setupFromJson$bidmachine_android_sdk_bi_3_3_0", "(Ljava/lang/String;)V", "setupFromJson", "TAG", "Ljava/lang/String;", "DIR_NAME", "FILE_NAME", "PARAMETER_LOGGING_ENABLED", "PARAMETER_TEST_MODE", "PARAMETER_ENDPOINT", "PARAMETER_COPPA", "PARAMETER_US_PRIVACY_STRING", "PARAMETER_SUBJECT_TO_GDPR", "PARAMETER_CONSENT", "PARAMETER_GDPR_STRING", "LOGGING_LOCK", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TEST_MODE_LOCK", "isLoggingLock", "()Z", "isLoggingLock$annotations", "()V", "isTestModeLock", "isTestModeLock$annotations", "<init>", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class Debugger {
    private static final String DIR_NAME = "features";
    private static final String FILE_NAME = "DebugParameters.json";
    private static final String PARAMETER_CONSENT = "consent";
    private static final String PARAMETER_COPPA = "coppa";
    private static final String PARAMETER_ENDPOINT = "endpoint";
    private static final String PARAMETER_GDPR_STRING = "GDPRString";
    private static final String PARAMETER_LOGGING_ENABLED = "loggingEnabled";
    private static final String PARAMETER_SUBJECT_TO_GDPR = "subjectToGDPR";
    private static final String PARAMETER_TEST_MODE = "testMode";
    private static final String PARAMETER_US_PRIVACY_STRING = "usPrivacyString";
    private static final String TAG = "Debugger";
    public static final Debugger INSTANCE = new Debugger();
    private static final AtomicBoolean LOGGING_LOCK = new AtomicBoolean(false);
    private static final AtomicBoolean TEST_MODE_LOCK = new AtomicBoolean(false);

    private Debugger() {
    }

    public static /* synthetic */ void isLoggingLock$annotations() {
    }

    public static /* synthetic */ void isTestModeLock$annotations() {
    }

    @VisibleForTesting
    public final void setupFromJson$bidmachine_android_sdk_bi_3_3_0(String json) {
        if (json == null || lk.a0.n0(json)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(json);
        AtomicBoolean atomicBoolean = LOGGING_LOCK;
        if (jSONObject.has(PARAMETER_LOGGING_ENABLED)) {
            BidMachine.setLoggingEnabled(jSONObject.optBoolean(PARAMETER_LOGGING_ENABLED));
            atomicBoolean.set(true);
        }
        AtomicBoolean atomicBoolean2 = TEST_MODE_LOCK;
        if (jSONObject.has(PARAMETER_TEST_MODE)) {
            BidMachine.setTestMode(jSONObject.optBoolean(PARAMETER_TEST_MODE));
            atomicBoolean2.set(true);
        }
        if (jSONObject.has("endpoint")) {
            String strOptString = jSONObject.optString("endpoint");
            ck.p.i(strOptString, "jsonObject.optString(PARAMETER_ENDPOINT)");
            String string = lk.a0.k1(strOptString).toString();
            if ((string.length() > 0) && Utils.isHttpUrl(string)) {
                BidMachine.setEndpoint(string);
            }
        }
        if (jSONObject.has(PARAMETER_COPPA)) {
            BidMachine.setCoppa(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_COPPA)));
        }
        if (jSONObject.has(PARAMETER_US_PRIVACY_STRING)) {
            BidMachine.setUSPrivacyString(jSONObject.optString(PARAMETER_US_PRIVACY_STRING));
        }
        if (jSONObject.has(PARAMETER_SUBJECT_TO_GDPR)) {
            BidMachine.setSubjectToGDPR(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_SUBJECT_TO_GDPR)));
        }
        if (jSONObject.has("consent")) {
            BidMachine.setConsentConfig(jSONObject.optBoolean("consent"), jSONObject.has(PARAMETER_GDPR_STRING) ? jSONObject.optString(PARAMETER_GDPR_STRING) : null);
        }
    }

    public static final boolean isLoggingLock() {
        return LOGGING_LOCK.get();
    }

    public static final boolean isTestModeLock() {
        return TEST_MODE_LOCK.get();
    }

    public static final void setup(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            File externalDirDirty = FileUtilsKt.getExternalDirDirty(context);
            if (externalDirDirty == null) {
                return;
            }
            File file = new File(externalDirDirty, "features/DebugParameters.json");
            if (file.exists()) {
                Log.d(TAG, "Debug file found");
                INSTANCE.setupFromJson$bidmachine_android_sdk_bi_3_3_0(FileUtilsKt.readSafely(file));
            }
        } catch (Throwable th2) {
            Log.w(TAG, th2);
        }
    }

    private final void applyAndLockIfExists(AtomicBoolean atomicBoolean, JSONObject jSONObject, String str, bk.l<? super Boolean, r> lVar) {
        if (jSONObject.has(str)) {
            lVar.invoke(Boolean.valueOf(jSONObject.optBoolean(str)));
            atomicBoolean.set(true);
        }
    }
}
