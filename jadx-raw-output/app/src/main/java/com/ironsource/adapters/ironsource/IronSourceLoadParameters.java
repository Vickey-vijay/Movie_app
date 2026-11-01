package com.ironsource.adapters.ironsource;

import ck.i;
import ck.p;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface IronSourceLoadParameters {

    public static final class Base implements IronSourceLoadParameters {
        private final JSONObject loadConfig;
        private final String serverData;

        public Base(JSONObject jSONObject, String str) {
            p.j(jSONObject, "loadConfig");
            this.loadConfig = jSONObject;
            this.serverData = str;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i10, i iVar) {
            this(jSONObject, (i10 & 2) != 0 ? null : str);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> map = new HashMap<>();
            map.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String strA = d.b().a(this.serverData);
                p.i(strA, "getInstance().getAdmFromServerData(serverData)");
                map.put("adm", strA);
                map.putAll(d.b().b(this.serverData));
            }
            return map;
        }
    }

    public static final class WithLog implements IronSourceLoadParameters {
        private final IronSourceLoadParameters loadParameters;

        public WithLog(IronSourceLoadParameters ironSourceLoadParameters) {
            p.j(ironSourceLoadParameters, "loadParameters");
            this.loadParameters = ironSourceLoadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public HashMap<String, String> value() {
            HashMap<String, String> mapValue = this.loadParameters.value();
            if (!mapValue.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : mapValue.keySet()) {
                    IronLog.ADAPTER_API.verbose(str + "=" + ((Object) mapValue.get(str)));
                }
            }
            return mapValue;
        }
    }

    JSONObject config();

    boolean demandOnly();

    HashMap<String, String> value();

    public static final class Constants {
        public static final String ADM_KEY = "adm";
        public static final String DEMAND_ONLY = "demandOnly";
        public static final Constants INSTANCE = new Constants();
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }
}
