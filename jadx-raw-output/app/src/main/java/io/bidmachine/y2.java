package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.ConnectionType;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.utils.DeviceUtils;

/* JADX INFO: compiled from: DeviceConnectionParams.java */
/* JADX INFO: loaded from: classes2.dex */
public final class y2 {
    public void build(@NonNull Context context, @NonNull com.explorestack.protobuf.adcom.Context.Device.Builder builder, @NonNull ConnectionType connectionType) {
        builder.setConnection(buildConnection(context, connectionType));
    }

    public void build(@NonNull Context context, @NonNull Device.Builder builder, @NonNull ConnectionType connectionType) {
        builder.setConnection(buildConnection(context, connectionType));
    }

    @NonNull
    private com.explorestack.protobuf.adcom.Context.Device.Connection buildConnection(@NonNull Context context, @NonNull ConnectionType connectionType) {
        com.explorestack.protobuf.adcom.Context.Device.Connection.Builder builderNewBuilder = com.explorestack.protobuf.adcom.Context.Device.Connection.newBuilder();
        builderNewBuilder.setType(connectionType);
        builderNewBuilder.setVpn(DeviceUtils.getVpnStatus(context));
        builderNewBuilder.setProxy(DeviceUtils.getProxyStatus(context));
        return builderNewBuilder.build();
    }
}
