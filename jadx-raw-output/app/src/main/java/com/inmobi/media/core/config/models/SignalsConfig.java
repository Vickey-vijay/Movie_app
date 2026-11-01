package com.inmobi.media.core.config.models;

import android.webkit.URLUtil;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.safedk.android.internal.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj.s;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public final class SignalsConfig extends Config {
    private JSONObject ext;
    private IceConfig ice = new IceConfig();
    private UnifiedIdServiceConfig unifiedIdServiceConfig = new UnifiedIdServiceConfig();
    private NovatiqConfig novatiqConfig = new NovatiqConfig();
    private SessionConfig session = new SessionConfig();
    private PublisherConfig publisher = new PublisherConfig();
    private String kA = "wWFMAWbSEtvl5VxZbQGMK7";
    private int vAK = 1;
    private int lowMemoryFreq = d.f44769a;
    private BootTimeConfig bts = new BootTimeConfig();
    private Purchases purchases = new Purchases();

    @Keep
    public static final class BootTimeConfig {
        private final boolean enabled;
        private final int maxEntries = 3;
        private final int threshold = 120;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getThreshold() {
            return this.threshold;
        }
    }

    @Keep
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z10) {
            this.cce = z10;
        }

        public final void setCof(int i10) {
            this.cof = i10;
        }

        public final void setVce(boolean z10) {
            this.vce = z10;
        }
    }

    @Keep
    public static final class IceConfig {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CellIceConfig f24208c = new CellIceConfig();
        private boolean locationEnabled;
        private boolean sessionEnabled;

        public final int getCellOperatorFlag() {
            return this.f24208c.getCof();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.f24208c.getCce();
        }

        public final boolean isLocationEnabled() {
            return this.locationEnabled;
        }

        public final boolean isSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.f24208c.getVce();
        }

        public final boolean isValid() {
            if (getCellOperatorFlag() >= 0) {
                return true;
            }
            return false;
        }
    }

    @Keep
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;
        private List<String> carrierNames = s.k();
        private String beaconUrl = "https://spadsync.com/sync";

        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        public final boolean isNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setBeaconUrl(String str) {
            p.j(str, "<set-?>");
            this.beaconUrl = str;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setCarrierNames(List<String> list) {
            p.j(list, "<set-?>");
            this.carrierNames = list;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setNovatiqEnabled(boolean z10) {
            this.isNovatiqEnabled = z10;
        }
    }

    @Keep
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;
        private final Map<String, String> generalKeys = new LinkedHashMap();
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = 6000;
        private final AutoInputData auto = new AutoInputData();
        private final ObjInputData obj = new ObjInputData();
        private final DirectInputData direct = new DirectInputData();

        @Keep
        public static final class AutoInputData extends BaseInputData {
            private final Map<String, KeyData> allowedKeys = new LinkedHashMap();
            private final List<String> incompatibleSdkVer = s.k();
            private final String topic = "";

            public final Map<String, KeyData> getAllowedKeys() {
                return this.allowedKeys;
            }

            public final List<String> getIncompatibleSdkVer() {
                return this.incompatibleSdkVer;
            }

            public final String getTopic() {
                return this.topic;
            }
        }

        @Keep
        public static class BaseInputData {
            private final boolean enabled;
            private final int expiry = 604800;
            private final int count = 5;
            private final int precision = 6;
            private final int strLen = 3;
            private final DepthData depth = new DepthData();

            public final int getCount() {
                return this.count;
            }

            public final DepthData getDepth() {
                return this.depth;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getExpiry() {
                return this.expiry;
            }

            public final int getPrecision() {
                return this.precision;
            }

            public final int getStrLen() {
                return this.strLen;
            }
        }

        @Keep
        public static final class DepthData {
            private final boolean enabled;

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        @Keep
        public static final class DirectInputData extends BaseInputData {
            private final Map<String, String> allowedKeys = new LinkedHashMap();

            public final Map<String, String> getAllowedKeys() {
                return this.allowedKeys;
            }
        }

        @Keep
        public static final class KeyData {
            private final String name = "";
            private final String type = "";

            public final String getName() {
                return this.name;
            }

            public final String getType() {
                return this.type;
            }
        }

        @Keep
        public static final class ObjInputData extends BaseInputData {
            private final Map<String, KeyData> allowedKeysAnd = new LinkedHashMap();

            public final Map<String, KeyData> getAllowedKeysAnd() {
                return this.allowedKeysAnd;
            }
        }

        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        public final AutoInputData getAuto() {
            return this.auto;
        }

        public final DirectInputData getDirect() {
            return this.direct;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        public final ObjInputData getObj() {
            return this.obj;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    @Keep
    public static final class Purchases {
        private boolean inapp;
        private List<String> versionList = s.n("7.0.0", "7.1.0", "7.1.1");

        public final boolean getInapp() {
            return this.inapp;
        }

        public final List<String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z10) {
            this.inapp = z10;
        }

        public final void setVersionList(List<String> list) {
            p.j(list, "<set-?>");
            this.versionList = list;
        }
    }

    @Keep
    public static final class SessionConfig {
        private List<Integer> control = s.n(0, 1, 2, 3, 4, 5, 6);

        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    @Keep
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setMaxRetries(int i10) {
            this.maxRetries = i10;
        }

        public final void setRetryInterval(int i10) {
            this.retryInterval = i10;
        }

        public final void setTimeout(int i10) {
            this.timeout = i10;
        }

        public final void setUrl(String str) {
            p.j(str, "<set-?>");
            this.url = str;
        }
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return "signals";
    }

    public final String getAK() {
        return this.kA;
    }

    public final int getAKV() {
        return this.vAK;
    }

    public final BootTimeConfig getBts() {
        return this.bts;
    }

    public final JSONObject getExt() {
        return this.ext;
    }

    public final IceConfig getIceConfig() {
        return this.ice;
    }

    public final int getLowMemoryFreq() {
        return this.lowMemoryFreq;
    }

    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    public final PublisherConfig getPublisherConfig() {
        return this.publisher;
    }

    public final Purchases getPurchases() {
        return this.purchases;
    }

    public final SessionConfig getSessionConfig() {
        return this.session;
    }

    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setBts(BootTimeConfig bootTimeConfig) {
        p.j(bootTimeConfig, "<set-?>");
        this.bts = bootTimeConfig;
    }

    public final void setLowMemoryFreq(int i10) {
        this.lowMemoryFreq = i10;
    }

    public final void setPurchases(Purchases purchases) {
        p.j(purchases, "<set-?>");
        this.purchases = purchases;
    }
}
