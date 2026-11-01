package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NetworkConfig {
    public static final String CONFIG_SKIP_INITIALIZATION = "skip_initialization";

    @Nullable
    private Map<String, String> baseMediationConfig;

    @Nullable
    private AdsType[] mergedAdsTypes;

    @NonNull
    private final String networkKey;

    @Nullable
    private AdsType[] supportedAdsTypes;

    @Nullable
    private EnumMap<AdsFormat, List<Map<String, String>>> typedMediationConfigs;

    @NonNull
    private final NetworkConfigParams networkConfigParams = new a();

    @NonNull
    private final Map<String, String> networkParams = new HashMap();

    public class a implements NetworkConfigParams {
        @Override // io.bidmachine.NetworkConfigParams
        @Nullable
        public EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr) {
            ArrayList arrayList;
            List list;
            if (adsFormatArr == null || adsFormatArr.length <= 0) {
                return null;
            }
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = null;
            for (AdsFormat adsFormat : adsFormatArr) {
                if (NetworkConfig.this.typedMediationConfigs == null || (list = (List) NetworkConfig.this.typedMediationConfigs.get(adsFormat)) == null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        Map map = (Map) list.get(i10);
                        Map<String, String> mapPrepareTypedMediationConfig = map != null ? NetworkConfig.this.prepareTypedMediationConfig(map) : null;
                        if (mapPrepareTypedMediationConfig != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(mapPrepareTypedMediationConfig);
                        }
                    }
                }
                if (arrayList != null) {
                    if (enumMap == null) {
                        enumMap = new EnumMap<>(AdsFormat.class);
                    }
                    enumMap.put(adsFormat, arrayList);
                }
            }
            return enumMap;
        }

        public a() {
        }

        @Override // io.bidmachine.NetworkConfigParams
        @Nullable
        public String getFromNetworkParams(@NonNull String str) {
            return (String) NetworkConfig.this.networkParams.get(str);
        }

        @Override // io.bidmachine.NetworkConfigParams
        @NonNull
        public Map<String, String> obtainNetworkParams() {
            return new HashMap(NetworkConfig.this.networkParams);
        }

        @Override // io.bidmachine.NetworkConfigParams
        @Nullable
        public String removeFromNetworkParams(@NonNull String str) {
            return (String) NetworkConfig.this.networkParams.remove(str);
        }
    }

    private boolean contains(@NonNull Object[] objArr, @NonNull Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public abstract NetworkAdapter createNetworkAdapter();

    public boolean useNetworkParamsAsMediationBase() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withMediationConfig(@NonNull AdsFormat adsFormat, @Nullable Map<String, String> map) {
        if (map == null) {
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
            if (enumMap != null) {
                enumMap.remove(adsFormat);
            }
        } else {
            if (this.typedMediationConfigs == null) {
                this.typedMediationConfigs = new EnumMap<>(AdsFormat.class);
            }
            List<Map<String, String>> arrayList = this.typedMediationConfigs.get(adsFormat);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.typedMediationConfigs.put(adsFormat, arrayList);
            }
            arrayList.add(map);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<String, String> prepareTypedMediationConfig(@NonNull Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (useNetworkParamsAsMediationBase()) {
            map2.putAll(this.networkParams);
        }
        Map<String, String> map3 = this.baseMediationConfig;
        if (map3 != null) {
            map2.putAll(map3);
        }
        map2.putAll(map);
        return map2;
    }

    @NonNull
    public <T extends UnifiedAdRequestParams> List<NetworkAdUnit> createNetworkAdUnitList(@NonNull AdsType adsType, @NonNull T t10, @NonNull AdContentType adContentType, @NonNull NetworkAdapter networkAdapter) {
        List list;
        ArrayList arrayList = new ArrayList();
        EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
        if (enumMap != null) {
            Iterator it = enumMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AdsFormat adsFormat = (AdsFormat) entry.getKey();
                if (adsFormat.isMatch(adsType, t10, adContentType) && (list = (List) entry.getValue()) != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new NetworkAdUnit(networkAdapter, adsFormat, prepareTypedMediationConfig((Map) it2.next())));
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return getNetworkKey().equals(((NetworkConfig) obj).getNetworkKey());
    }

    public NetworkConfig forAdTypes(@NonNull AdsType... adsTypeArr) {
        this.supportedAdsTypes = adsTypeArr;
        return this;
    }

    @NonNull
    public NetworkConfigParams getNetworkConfigParams() {
        return this.networkConfigParams;
    }

    @NonNull
    public String getNetworkKey() {
        return this.networkKey;
    }

    @NonNull
    public AdsType[] getSupportedAdsTypes(@NonNull NetworkAdapter networkAdapter) {
        if (this.mergedAdsTypes == null) {
            ArrayList arrayList = new ArrayList();
            for (AdsType adsType : networkAdapter.getSupportedTypes()) {
                AdsType[] adsTypeArr = this.supportedAdsTypes;
                if (adsTypeArr == null || contains(adsTypeArr, adsType)) {
                    arrayList.add(adsType);
                }
            }
            this.mergedAdsTypes = (AdsType[]) arrayList.toArray(new AdsType[0]);
        }
        return this.mergedAdsTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setBaseMediationParam(@NonNull String str, @NonNull String str2) {
        if (this.baseMediationConfig == null) {
            this.baseMediationConfig = new HashMap();
        }
        this.baseMediationConfig.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setNetworkParam(@NonNull String str, @NonNull String str2) {
        this.networkParams.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withBaseMediationConfig(@Nullable Map<String, String> map) {
        this.baseMediationConfig = map;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withNetworkParams(@Nullable Map<String, String> map) {
        this.networkParams.clear();
        if (map != null) {
            this.networkParams.putAll(map);
        }
        return this;
    }

    public NetworkConfig(@NonNull String str, @Nullable Map<String, String> map) {
        this.networkKey = str;
        withNetworkParams(map);
    }

    public int hashCode() {
        return getNetworkKey().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T internalSetSkipInitialization(boolean z10) {
        setNetworkParam(CONFIG_SKIP_INITIALIZATION, String.valueOf(z10));
        return this;
    }

    @Deprecated
    public <T extends NetworkConfig> T withMediationConfig(@NonNull AdsFormat adsFormat, @Nullable Map<String, String> map, @Nullable Orientation orientation) {
        Logger.w("The parameter 'orientation' is no longer supported and has no effect.");
        return (T) withMediationConfig(adsFormat, map);
    }
}
