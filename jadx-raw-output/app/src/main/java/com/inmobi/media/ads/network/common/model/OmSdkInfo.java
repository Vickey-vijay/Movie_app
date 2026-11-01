package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.List;
import nj.s;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public final class OmSdkInfo {
    private final byte impressionType;
    private final boolean isolateVerificationScripts;
    private final boolean omidEnabled;
    private final String customReferenceData = "";
    private final HashMap<String, String> macros = new HashMap<>();
    private final List<AdVerification> adVerifications = s.k();

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    public final List<AdVerification> getAdVerifications() {
        return this.adVerifications;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final byte getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final HashMap<String, String> getMacros() {
        return this.macros;
    }

    public final boolean getOmidEnabled() {
        return this.omidEnabled;
    }
}
