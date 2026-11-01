package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: NetworkConfigFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class t4 {
    private static final String KEY_NETWORK = "network";
    private static final String KEY_FORMAT = "format";
    private static final String KEY_AD_UNITS = "ad_units";
    private static final String[] PRIVATE_FIELDS = {"network", KEY_FORMAT, KEY_AD_UNITS};

    @Nullable
    public static NetworkConfig create(Context context, @NonNull AdNetwork adNetwork) {
        NetworkConfig networkConfigCreate;
        if (context == null) {
            return null;
        }
        final String name = adNetwork.getName();
        if (TextUtils.isEmpty(name) || (networkConfigCreate = create(context, name, adNetwork.getCustomParamsMap())) == null) {
            return null;
        }
        for (AdNetwork.AdUnit adUnit : adNetwork.getAdUnitsList()) {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(adUnit.getAdFormat());
            if (adsFormatByRemoteName != null) {
                networkConfigCreate.withMediationConfig(adsFormatByRemoteName, adUnit.getCustomParamsMap());
            } else {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.o4
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return t4.lambda$create$0(name);
                    }
                });
            }
        }
        return networkConfigCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$create$0(String str) {
        return String.format("Network (%s) adUnit register fail: %s not provided", str, KEY_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$create$1(String str) {
        return String.format("Network (%s) adUnit register fail: %s not provided", str, KEY_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$create$2(NetworkConfig networkConfig) {
        return String.format("Load network from json config completed successfully: %s", networkConfig.getNetworkKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$create$3(String str) {
        return String.format("Network (%s) load fail!", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$create$4(String str) {
        return String.format("Network (%s) load fail!", str);
    }

    @Nullable
    private static Map<String, String> filterParams(@Nullable Map<String, String> map) {
        if (map != null) {
            try {
                for (String str : PRIVATE_FIELDS) {
                    map.remove(str);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @Nullable
    public static NetworkConfig create(Context context, @NonNull JSONObject jSONObject) {
        final String string;
        if (context == null) {
            return null;
        }
        try {
            string = jSONObject.getString("network");
            try {
                final NetworkConfig networkConfigCreate = create(context, string, Utils.toMap(jSONObject));
                if (networkConfigCreate == null) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_AD_UNITS);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(jSONObject2.getString(KEY_FORMAT));
                    if (adsFormatByRemoteName != null) {
                        networkConfigCreate.withMediationConfig(adsFormatByRemoteName, filterParams(Utils.toMap(jSONObject2)));
                    } else {
                        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.p4
                            @Override // io.bidmachine.utils.lazy.LazyValue
                            public final Object get() {
                                return t4.lambda$create$1(string);
                            }
                        });
                    }
                }
                Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.q4
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return t4.lambda$create$2(networkConfigCreate);
                    }
                });
                return networkConfigCreate;
            } catch (Throwable th2) {
                th = th2;
                Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.r4
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return t4.lambda$create$3(string);
                    }
                });
                Logger.w(th);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            string = null;
        }
    }

    @Nullable
    private static NetworkConfig create(@NonNull Context context, @NonNull final String str, @Nullable Map<String, String> map) {
        n4 networkAssetParams = m4.getNetworkAssetParams(context, str);
        if (networkAssetParams == null) {
            return null;
        }
        try {
            return (NetworkConfig) Class.forName(networkAssetParams.getClasspath()).getConstructor(Map.class).newInstance(filterParams(map));
        } catch (Throwable th2) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.s4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return t4.lambda$create$4(str);
                }
            });
            Logger.w(th2);
            return null;
        }
    }
}
