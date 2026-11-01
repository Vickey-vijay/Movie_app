package io.bidmachine;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.utils.BluetoothUtils;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ProtoUtils;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: DeviceParams.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x3 {

    @NonNull
    private final y2 deviceConnectionParams;

    public void build(@NonNull Context context, @NonNull final RequestTokenPayload.Builder builder, @NonNull DataRestrictions dataRestrictions) {
        Device.Builder builderCreateDeviceBuilder = createDeviceBuilder(context, dataRestrictions);
        Objects.requireNonNull(builder);
        Utils.ifNotNull(builderCreateDeviceBuilder, new Executable() { // from class: io.bidmachine.a3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setDeviceData((Device.Builder) obj);
            }
        });
    }

    public x3(@NonNull y2 y2Var) {
        this.deviceConnectionParams = y2Var;
    }

    @Nullable
    private Device.Builder createDeviceBuilder(@NonNull Context context, @NonNull DataRestrictions dataRestrictions) {
        try {
            Device.Builder builderNewBuilder = Device.newBuilder();
            fillDeviceBuilder(context, builderNewBuilder, dataRestrictions);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    private com.explorestack.protobuf.adcom.Context.Device.Builder createDeviceContextBuilder(@NonNull Context context, @NonNull TargetingParams targetingParams, @NonNull TargetingParams targetingParams2, @NonNull DataRestrictions dataRestrictions, @Nullable ConnectionType connectionType) {
        try {
            com.explorestack.protobuf.adcom.Context.Device.Builder builderNewBuilder = com.explorestack.protobuf.adcom.Context.Device.newBuilder();
            fillDeviceContextBuilder(context, builderNewBuilder, targetingParams, targetingParams2, dataRestrictions, connectionType);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void fillDeviceBuilder(@NonNull Context context, @NonNull final Device.Builder builder, @NonNull DataRestrictions dataRestrictions) throws Throwable {
        j2 j2Var = j2.get();
        String ifv = j2Var.getIFV();
        Objects.requireNonNull(builder);
        Utils.ifNotEmpty(ifv, new Executable() { // from class: io.bidmachine.l3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setIfv((String) obj);
            }
        });
        builder.setBmIfv(j2Var.obtainBMIFV(context));
        Set<String> inputLanguageSet = DeviceUtils.getInputLanguageSet(context);
        if (!inputLanguageSet.isEmpty()) {
            builder.addAllInputlanguage(inputLanguageSet);
        }
        Utils.ifNotNull(DeviceUtils.isCharging(context), new Executable() { // from class: io.bidmachine.v3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCharging(((Boolean) obj).booleanValue());
            }
        });
        Utils.ifNotNull(BluetoothUtils.isHeadsetConnected(context), new Executable() { // from class: io.bidmachine.w3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setHeadset(((Boolean) obj).booleanValue());
            }
        });
        Double batteryLevel = DeviceUtils.getBatteryLevel(context);
        if (batteryLevel != null) {
            builder.setBatterylevel(batteryLevel.floatValue());
        }
        Utils.ifNotNull(DeviceUtils.isBatterySaverEnabled(context), new Executable() { // from class: io.bidmachine.b3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setBatterysaver(((Boolean) obj).booleanValue());
            }
        });
        builder.setDarkmode(DeviceUtils.isDarkModeEnabled(context));
        Utils.ifNotNull(DeviceUtils.isAirplaneModeOn(context), new Executable() { // from class: io.bidmachine.c3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setAirplane(((Boolean) obj).booleanValue());
            }
        });
        Utils.ifNotNull(DeviceUtils.isDoNotDisturbOn(context), new Executable() { // from class: io.bidmachine.d3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setDnd(((Boolean) obj).booleanValue());
            }
        });
        if (dataRestrictions.canSendDeviceInfo()) {
            Utils.ifNotEmpty(DeviceUtils.getDeviceName(context), new Executable() { // from class: io.bidmachine.e3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setDevicename((String) obj);
                }
            });
            this.deviceConnectionParams.build(context, builder, DeviceUtils.getConnectionType(context));
        }
        Double screenBrightnessRatio = DeviceUtils.getScreenBrightnessRatio(context);
        if (screenBrightnessRatio != null) {
            builder.setScreenbright(screenBrightnessRatio.floatValue());
        }
        builder.setLastbootup(SystemClock.elapsedRealtime());
        Set<String> connectedHeadsets = BluetoothUtils.getConnectedHeadsets(context);
        if (connectedHeadsets != null && !connectedHeadsets.isEmpty()) {
            Utils.ifNotNull(connectedHeadsets.iterator().next(), new Executable() { // from class: io.bidmachine.f3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setHeadsetname((String) obj);
                }
            });
        }
        builder.setApilevel(Build.VERSION.SDK_INT);
        builder.setTime(TimeManager.currentTimeMillis());
        Utils.ifNotEmpty(TimeManager.getTimezoneId(), new Executable() { // from class: io.bidmachine.g3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setTimezone((String) obj);
            }
        });
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        Long availableDiskSpaceInMB = deviceInfoObtain.getAvailableDiskSpaceInMB();
        if (availableDiskSpaceInMB != null) {
            builder.setDiskspace(availableDiskSpaceInMB.intValue());
        }
        Long totalDiskSpaceInMB = deviceInfoObtain.getTotalDiskSpaceInMB();
        if (totalDiskSpaceInMB != null) {
            builder.setTotaldisk(totalDiskSpaceInMB.intValue());
        }
        builder.setJailbreak(deviceInfoObtain.isDeviceRooted());
        Utils.ifNotNull(deviceInfoObtain.getAudio().isRingMuted(context), new Executable() { // from class: io.bidmachine.h3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setRingmute(((Boolean) obj).booleanValue());
            }
        });
        Float volumeLevel = deviceInfoObtain.getAudio().getVolumeLevel(context);
        if (volumeLevel != null) {
            builder.setAudioContext(com.explorestack.protobuf.adcom.Context.Device.AudioContext.newBuilder().setVolumelevel(volumeLevel.floatValue()).build());
        }
        deviceInfoObtain.updateHwInfo(context);
        Utils.ifNotNull(deviceInfoObtain.getRam().getTotalMemBytes(), new Executable() { // from class: io.bidmachine.p3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setTotalmem(((Long) obj).longValue());
            }
        });
        Utils.ifNotNull(deviceInfoObtain.getRam().getFreeMemBytes(), new Executable() { // from class: io.bidmachine.q3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setFreemem(((Long) obj).longValue());
            }
        });
        Utils.ifNotEmpty(deviceInfoObtain.getCpu().getName(), new Executable() { // from class: io.bidmachine.r3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCpuname((String) obj);
            }
        });
        Utils.ifNotEmpty(deviceInfoObtain.getCpu().getVendor(), new Executable() { // from class: io.bidmachine.s3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setCpuvendor((String) obj);
            }
        });
        Utils.ifNotEmpty(deviceInfoObtain.getGpu().getName(), new Executable() { // from class: io.bidmachine.t3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setGpuname((String) obj);
            }
        });
        Utils.ifNotEmpty(deviceInfoObtain.getGpu().getVendor(), new Executable() { // from class: io.bidmachine.u3
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setGpuvendor((String) obj);
            }
        });
    }

    private void fillDeviceContextBuilder(@NonNull Context context, @NonNull final com.explorestack.protobuf.adcom.Context.Device.Builder builder, @NonNull TargetingParams targetingParams, @NonNull TargetingParams targetingParams2, @NonNull DataRestrictions dataRestrictions, @Nullable ConnectionType connectionType) {
        DeviceType deviceType;
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        if (deviceInfoObtain.isTablet) {
            deviceType = DeviceType.DEVICE_TYPE_TABLET;
        } else {
            deviceType = DeviceType.DEVICE_TYPE_PHONE_DEVICE;
        }
        builder.setType(deviceType);
        builder.setOs(OS.OS_ANDROID);
        builder.setOsv(DeviceUtils.getOsVersion());
        builder.setPxratio(deviceInfoObtain.screenDensity);
        builder.setPpi(deviceInfoObtain.screenDpi);
        Point screenSize = Utils.getScreenSize(context);
        builder.setW(screenSize.x);
        builder.setH(screenSize.y);
        builder.setIfa(AdvertisingDataManager.getAdvertisingId(context, !dataRestrictions.canSendIfa()));
        builder.setLmt(AdvertisingDataManager.isLimitAdTrackingEnabled());
        if (dataRestrictions.canSendDeviceInfo()) {
            if (connectionType == null) {
                connectionType = DeviceUtils.getConnectionType(context);
            }
            builder.setContype(connectionType);
            builder.setMake(DeviceUtils.getManufacturer());
            Utils.ifNotEmpty(UserAgentManager.getUserAgent(context), new Executable() { // from class: io.bidmachine.i3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setUa((String) obj);
                }
            });
            Utils.ifNotNull(deviceInfoObtain.model, new Executable() { // from class: io.bidmachine.j3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setModel((String) obj);
                }
            });
            Utils.ifNotNull(deviceInfoObtain.getHWV(), new Executable() { // from class: io.bidmachine.k3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setHwv((String) obj);
                }
            });
            Utils.ifNotEmpty(Locale.getDefault().getLanguage(), new Executable() { // from class: io.bidmachine.m3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setLang((String) obj);
                }
            });
            Utils.ifNotEmpty(deviceInfoObtain.phoneMCCMNC, new Executable() { // from class: io.bidmachine.n3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setMccmnc((String) obj);
                }
            });
            Utils.ifNotEmpty(deviceInfoObtain.phoneCarrier, new Executable() { // from class: io.bidmachine.o3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builder.setCarrier((String) obj);
                }
            });
            this.deviceConnectionParams.build(context, builder, connectionType);
        }
        if (dataRestrictions.canSendGeoPosition()) {
            builder.setGeo(ProtoUtils.createGeoBuilderWithLocation(context, targetingParams.getDeviceLocation(), targetingParams2.getDeviceLocation(), true));
        }
    }

    public void build(@NonNull Context context, @NonNull com.explorestack.protobuf.adcom.Context.Builder builder, @NonNull TargetingParams targetingParams, @NonNull TargetingParams targetingParams2, @NonNull DataRestrictions dataRestrictions, @Nullable ConnectionType connectionType) {
        com.explorestack.protobuf.adcom.Context.Device.Builder builderCreateDeviceContextBuilder = createDeviceContextBuilder(context, targetingParams, targetingParams2, dataRestrictions, connectionType);
        if (builderCreateDeviceContextBuilder != null) {
            Device.Builder builderCreateDeviceBuilder = createDeviceBuilder(context, dataRestrictions);
            if (builderCreateDeviceBuilder != null) {
                builderCreateDeviceContextBuilder.addExtProto(Any.pack(builderCreateDeviceBuilder.build()));
            }
            builder.setDevice(builderCreateDeviceContextBuilder);
        }
    }
}
