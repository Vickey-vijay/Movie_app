package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.Configuration;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BidMachineAnalyticsInitializer.java */
/* JADX INFO: loaded from: classes2.dex */
public class w1 {
    @NonNull
    private List<MonitorConfig> mapMonitorConfigList(@NonNull List<Monitor.Configuration> list) {
        ArrayList arrayList = new ArrayList();
        for (Monitor.Configuration configuration : list) {
            boolean value = false;
            if (configuration.hasShouldReport()) {
                value = configuration.getShouldReport().getValue();
            }
            arrayList.add(new MonitorConfig(configuration.getName().getValue(), configuration.getUrl().getValue(), configuration.getBatchSize().getValue(), configuration.getInterval().getValue(), value));
        }
        return arrayList;
    }

    @NonNull
    private List<ReaderConfig> mapReaderConfigList(@NonNull List<Reader.Configuration> list) {
        ArrayList arrayList = new ArrayList();
        for (Reader.Configuration configuration : list) {
            boolean value = true;
            if (configuration.hasUniqueOnly()) {
                value = configuration.getUniqueOnly().getValue();
            }
            arrayList.add(new ReaderConfig(configuration.getName().getValue(), configuration.getUrl().getValue(), configuration.getUpdateInterval().getValue(), value, mapReaderRuleList(configuration.getRulesList())));
        }
        return arrayList;
    }

    @NonNull
    private List<ReaderConfig.Rule> mapReaderRuleList(@NonNull List<Reader.Rule> list) {
        ArrayList arrayList = new ArrayList();
        for (Reader.Rule rule : list) {
            if (rule.hasGeneralRule()) {
                Reader.Rule.GeneralRule generalRule = rule.getGeneralRule();
                arrayList.add(new ReaderConfig.Rule(generalRule.getTag().getValue(), generalRule.getPath().getValue()));
            }
        }
        return arrayList;
    }

    public static void initialize(@NonNull Context context) {
        try {
            BidMachineAnalytics.initialize(context);
        } catch (Throwable unused) {
        }
    }

    public void configure(@NonNull Context context, @NonNull String str, @NonNull InitResponse initResponse, @NonNull String str2) {
        try {
            if (!initResponse.hasSdkAnalyticConfigV2()) {
                return;
            }
            Configuration sdkAnalyticConfigV2 = initResponse.getSdkAnalyticConfigV2();
            List<MonitorConfig> listMapMonitorConfigList = mapMonitorConfigList(sdkAnalyticConfigV2.getMonitorsList());
            List<ReaderConfig> listMapReaderConfigList = mapReaderConfigList(sdkAnalyticConfigV2.getReadersList());
            Struct struct = initResponse.getExtras().getPrivate();
            String value = sdkAnalyticConfigV2.getBpk().getValue();
            BidMachineAnalytics.configure(context, new AnalyticsConfig(str2, listMapMonitorConfigList, listMapReaderConfigList, value, struct));
            if (!str.equals(str2)) {
                BidMachineAnalytics.configure(context, new AnalyticsConfig(str, listMapMonitorConfigList, listMapReaderConfigList, value, struct));
            }
        } catch (Throwable unused) {
        }
    }
}
