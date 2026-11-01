package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.SharedPreferenceUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: IABSharedPreferenceImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public class a4 implements z3 {

    @Nullable
    private String iabGDPRConsentString;

    @Nullable
    private List<Integer> iabGPPIds;

    @Nullable
    private String iabGPPString;

    @Nullable
    private Boolean iabSubjectToGDPR;

    @Nullable
    private Boolean iabTcfGdprApplies;

    @Nullable
    private String iabTcfTcString;

    @Nullable
    private String iabUSPrivacyString;

    @NonNull
    private final SharedPreferences.OnSharedPreferenceChangeListener sharedPreferenceListener = new a();

    /* JADX INFO: compiled from: IABSharedPreferenceImpl.java */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            a4.this.updateMapper(sharedPreferences, str);
        }
    }

    private void updateConsentString(@NonNull SharedPreferences sharedPreferences) {
        this.iabGDPRConsentString = SharedPreferenceUtils.optString(sharedPreferences, z3.IAB_CONSENT_STRING, null);
    }

    private void updateGDPRSubject(@NonNull SharedPreferences sharedPreferences) {
        String strOptString = SharedPreferenceUtils.optString(sharedPreferences, z3.IAB_SUBJECT_TO_GDPR, null);
        this.iabSubjectToGDPR = strOptString != null ? Boolean.valueOf(strOptString.equals("1")) : null;
    }

    private void updateGPPIds(@NonNull SharedPreferences sharedPreferences) {
        String strOptString = SharedPreferenceUtils.optString(sharedPreferences, z3.IAB_GPP_SID, null);
        if (TextUtils.isEmpty(strOptString)) {
            this.iabGPPIds = null;
            return;
        }
        try {
            String[] strArrSplit = strOptString.split("_");
            if (strArrSplit.length == 0) {
                this.iabGPPIds = null;
                return;
            }
            this.iabGPPIds = new ArrayList();
            for (String str : strArrSplit) {
                Integer intOrDefault = Utils.parseIntOrDefault(str, (Integer) null);
                if (intOrDefault != null) {
                    this.iabGPPIds.add(intOrDefault);
                }
            }
        } catch (Throwable th2) {
            Logger.w(th2);
            this.iabGPPIds = null;
        }
    }

    private void updateGPPString(@NonNull SharedPreferences sharedPreferences) {
        this.iabGPPString = SharedPreferenceUtils.optString(sharedPreferences, z3.IAB_GPP_HDR_STRING, null);
    }

    private void updateTcfGdprApplies(@NonNull SharedPreferences sharedPreferences) {
        int iOptInt = SharedPreferenceUtils.optInt(sharedPreferences, "IABTCF_gdprApplies", -1);
        if (iOptInt == 1) {
            this.iabTcfGdprApplies = Boolean.TRUE;
        } else if (iOptInt == 0) {
            this.iabTcfGdprApplies = Boolean.FALSE;
        } else {
            this.iabTcfGdprApplies = null;
        }
    }

    private void updateTcfTcString(@NonNull SharedPreferences sharedPreferences) {
        this.iabTcfTcString = SharedPreferenceUtils.optString(sharedPreferences, "IABTCF_TCString", null);
    }

    private void updateUSPrivacyString(@NonNull SharedPreferences sharedPreferences) {
        this.iabUSPrivacyString = SharedPreferenceUtils.optString(sharedPreferences, z3.IAB_US_PRIVACY_STRING, null);
    }

    @Override // io.bidmachine.z3
    @Nullable
    public String getGDPRConsentString() {
        return this.iabGDPRConsentString;
    }

    @Override // io.bidmachine.z3
    @Nullable
    public List<Integer> getGPPIds() {
        return this.iabGPPIds;
    }

    @Override // io.bidmachine.z3
    @Nullable
    public String getGPPString() {
        return this.iabGPPString;
    }

    @Override // io.bidmachine.z3
    @Nullable
    public Boolean getSubjectToGDPR() {
        return this.iabSubjectToGDPR;
    }

    @Override // io.bidmachine.z3
    @Nullable
    public Boolean getTcfGdprApplies() {
        return this.iabTcfGdprApplies;
    }

    @Override // io.bidmachine.z3
    @Nullable
    public String getTcfTcString() {
        return this.iabTcfTcString;
    }

    @Override // io.bidmachine.z3
    @Nullable
    public String getUSPrivacyString() {
        return this.iabUSPrivacyString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMapper(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "IABTCF_gdprApplies":
                updateTcfGdprApplies(sharedPreferences);
                break;
            case "IABGPP_GppSID":
                updateGPPIds(sharedPreferences);
                break;
            case "IABUSPrivacy_String":
                updateUSPrivacyString(sharedPreferences);
                break;
            case "IABConsent_ConsentString":
                updateConsentString(sharedPreferences);
                break;
            case "IABTCF_TCString":
                updateTcfTcString(sharedPreferences);
                break;
            case "IABConsent_SubjectToGDPR":
                updateGDPRSubject(sharedPreferences);
                break;
            case "IABGPP_HDR_GppString":
                updateGPPString(sharedPreferences);
                break;
        }
    }

    @Override // io.bidmachine.z3
    public void initialize(@NonNull Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.sharedPreferenceListener);
        for (String str : z3.IAB_KEY_ARRAY) {
            updateMapper(defaultSharedPreferences, str);
        }
    }
}
