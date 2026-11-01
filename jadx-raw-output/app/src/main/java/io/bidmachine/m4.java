package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: NetworkAssetManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class m4 {

    @NonNull
    private static final String BID_MACHINE_ASSET_FILE_EXTENSION = "bmnetwork";

    @NonNull
    private static final String BID_MACHINE_ASSET_PATH = "bm_networks";

    @NonNull
    private static final String KEY_CLASSPATH = "classpath";

    @NonNull
    private static final String KEY_NAME = "name";

    @NonNull
    private static final String KEY_SDK_VERSION = "sdk_version";

    @NonNull
    private static final String KEY_VERSION = "version";

    @NonNull
    @VisibleForTesting
    public static final Map<String, n4> NETWORK_ASSET_PARAMS_MAP = new ConcurrentHashMap();

    @Nullable
    private static n4 createNetworkParams(@NonNull AssetManager assetManager, @NonNull String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String assetByNetworkName = readAssetByNetworkName(assetManager, str);
            if (TextUtils.isEmpty(assetByNetworkName)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(assetByNetworkName);
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString("version");
            String strOptString3 = jSONObject.optString(KEY_CLASSPATH);
            String strOptString4 = jSONObject.optString("sdk_version");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                return new n4(strOptString, strOptString2, strOptString3, strOptString4);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void findNetworks(@NonNull Context context) {
        String[] list;
        if (NETWORK_ASSET_PARAMS_MAP.isEmpty()) {
            try {
                AssetManager assets = context.getAssets();
                if (assets == null || (list = assets.list(BID_MACHINE_ASSET_PATH)) == null) {
                    return;
                }
                for (String str : list) {
                    findNetwork(assets, str);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public static n4 getNetworkAssetParams(@NonNull Context context, @NonNull String str) {
        Map<String, n4> map = NETWORK_ASSET_PARAMS_MAP;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        try {
            AssetManager assets = context.getAssets();
            if (assets == null) {
                return null;
            }
            return findNetwork(assets, str + "." + BID_MACHINE_ASSET_FILE_EXTENSION);
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static Map<String, n4> getNetworkAssetParamsMap(@NonNull Context context) {
        Map<String, n4> map = NETWORK_ASSET_PARAMS_MAP;
        if (!map.isEmpty()) {
            return map;
        }
        findNetworks(context);
        return map;
    }

    @Nullable
    private static String readAssetByNetworkName(@NonNull AssetManager assetManager, @NonNull String str) {
        try {
            return Utils.streamToString(assetManager.open("bm_networks/" + str));
        } catch (Throwable th2) {
            Logger.w(th2);
            return null;
        }
    }

    @VisibleForTesting
    public static void reset() {
        NETWORK_ASSET_PARAMS_MAP.clear();
    }

    @Nullable
    private static n4 findNetwork(@NonNull AssetManager assetManager, @NonNull String str) {
        n4 n4VarCreateNetworkParams = createNetworkParams(assetManager, str);
        if (n4VarCreateNetworkParams != null) {
            NETWORK_ASSET_PARAMS_MAP.put(n4VarCreateNetworkParams.getName(), n4VarCreateNetworkParams);
        }
        return n4VarCreateNetworkParams;
    }
}
