package com.unity3d.ads.beta;

import android.content.Context;
import ck.i;
import ck.p;
import com.unity3d.services.core.log.DeviceLog;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: compiled from: InitializationConfiguration.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class InitializationConfiguration {
    private final Context context;
    private final Map<String, String> extras;
    private final String gameID;
    private final boolean isTestModeEnabled;
    private final DeviceLog.UnityAdsLogLevel logLevel;
    private final MediationInfo mediationInfo;

    /* JADX INFO: compiled from: InitializationConfiguration.kt */
    public static final class Builder {
        private final Context context;
        private Map<String, String> extras;
        private final String gameID;
        private final boolean isTestModeEnabled;
        private DeviceLog.UnityAdsLogLevel logLevel;
        private MediationInfo mediationInfo;

        public Builder(Context context, String str, boolean z10) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "gameID");
            this.context = context;
            this.gameID = str;
            this.isTestModeEnabled = z10;
            this.logLevel = DeviceLog.UnityAdsLogLevel.INFO;
            this.extras = a.j();
        }

        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.context, this.gameID, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        public final Builder withExtras(Map<String, String> map) {
            p.j(map, "extras");
            this.extras = map;
            return this;
        }

        public final Builder withLogLevel(DeviceLog.UnityAdsLogLevel unityAdsLogLevel) {
            p.j(unityAdsLogLevel, "logLevel");
            this.logLevel = unityAdsLogLevel;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public InitializationConfiguration(Context context, String str, boolean z10, DeviceLog.UnityAdsLogLevel unityAdsLogLevel, Map<String, String> map, MediationInfo mediationInfo) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "gameID");
        p.j(unityAdsLogLevel, "logLevel");
        p.j(map, "extras");
        this.context = context;
        this.gameID = str;
        this.isTestModeEnabled = z10;
        this.logLevel = unityAdsLogLevel;
        this.extras = map;
        this.mediationInfo = mediationInfo;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getGameID() {
        return this.gameID;
    }

    public final DeviceLog.UnityAdsLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(Context context, String str, boolean z10, DeviceLog.UnityAdsLogLevel unityAdsLogLevel, Map map, MediationInfo mediationInfo, int i10, i iVar) {
        this(context, str, z10, (i10 & 8) != 0 ? DeviceLog.UnityAdsLogLevel.INFO : unityAdsLogLevel, (i10 & 16) != 0 ? a.j() : map, (i10 & 32) != 0 ? null : mediationInfo);
    }
}
