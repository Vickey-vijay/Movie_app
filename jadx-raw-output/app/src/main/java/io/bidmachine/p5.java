package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.ContextualData;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.utils.time.DateUtils;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: SessionParams.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p5 {
    @Nullable
    private ContextualData.ImpressionData.Builder createImpressionDataBuilder(@NonNull Map<String, Object> map) {
        try {
            final ContextualData.ImpressionData.Builder builderNewBuilder = ContextualData.ImpressionData.newBuilder();
            Integer numConvertToIntOrDefault = Utils.convertToIntOrDefault(map.get("imimd"), null);
            Objects.requireNonNull(builderNewBuilder);
            Utils.ifNotNull(numConvertToIntOrDefault, new Executable() { // from class: io.bidmachine.j5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImimd(((Integer) obj).intValue());
                }
            });
            Utils.ifNotNull(Utils.convertToIntOrDefault(map.get("imd"), null), new Executable() { // from class: io.bidmachine.k5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImd(((Integer) obj).intValue());
                }
            });
            Utils.ifNotNull(Utils.convertToFloatOrDefault(map.get("imwp"), null), new Executable() { // from class: io.bidmachine.l5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImwp(((Float) obj).floatValue());
                }
            });
            Utils.ifNotNull(Utils.convertToFloatOrDefault(map.get("wp"), null), new Executable() { // from class: io.bidmachine.m5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setWp(((Float) obj).floatValue());
                }
            });
            Utils.ifNotNull(map.get("imagency"), new Executable() { // from class: io.bidmachine.n5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    p5.lambda$createImpressionDataBuilder$1(builderNewBuilder, obj);
                }
            });
            Utils.ifNotNull(map.get("agency"), new Executable() { // from class: io.bidmachine.o5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    p5.lambda$createImpressionDataBuilder$2(builderNewBuilder, obj);
                }
            });
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int getAdsTypeId(@Nullable AdsType adsType) {
        if (adsType == null) {
            return 0;
        }
        int i10 = a.$SwitchMap$io$bidmachine$AdsType[adsType.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i11;
    }

    public void build(@NonNull Context context, @NonNull RequestTokenPayload.Builder builder, @Nullable AdsFormat adsFormat) {
        Session.Builder builderCreateSessionBuilder = createSessionBuilder(context, adsFormat != null ? adsFormat.getAdsType() : null);
        if (builderCreateSessionBuilder != null) {
            builder.setSession(builderCreateSessionBuilder);
        }
    }

    /* JADX INFO: compiled from: SessionParams.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$AdsType;

        static {
            int[] iArr = new int[AdsType.values().length];
            $SwitchMap$io$bidmachine$AdsType = iArr;
            try {
                iArr[AdsType.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsType[AdsType.Interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsType[AdsType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$AdsType[AdsType.Native.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Nullable
    private Session.Context.Builder createSessionContextBuilder(@NonNull Context context, @Nullable AdsType adsType) {
        try {
            final Session.Context.Builder retention = Session.Context.newBuilder().setSessionduration(SessionManager.get().getSessionDuration()).setSc(SessionManager.get().getSessionCount()).setRetention(DateUtils.daysBetween(new Date(o2.obtainFirstLaunchTimeMs(context)), new Date(TimeManager.currentTimeMillis())));
            for (Map.Entry<String, Map<String, Object>> entry : BidMachineAnalytics.getImpData(getAdsTypeId(adsType)).entrySet()) {
                ContextualData.Builder builderCreateContextualDataBuilder = createContextualDataBuilder(adsType, entry.getKey(), entry.getValue());
                Objects.requireNonNull(retention);
                Utils.ifNotNull(builderCreateContextualDataBuilder, new Executable() { // from class: io.bidmachine.i5
                    @Override // io.bidmachine.Executable
                    public final void execute(Object obj) {
                        retention.addData((ContextualData.Builder) obj);
                    }
                });
            }
            return retention;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    private ContextualData.Builder createContextualDataBuilder(@Nullable AdsType adsType, @NonNull String str, @NonNull Map<String, Object> map) {
        try {
            final ContextualData.Builder mediatorName = ContextualData.newBuilder().setMediatorName(str);
            Utils.ifNotNull(adsType, new Executable() { // from class: io.bidmachine.g5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    p5.lambda$createContextualDataBuilder$0(mediatorName, (AdsType) obj);
                }
            });
            ContextualData.ImpressionData.Builder builderCreateImpressionDataBuilder = createImpressionDataBuilder(map);
            Objects.requireNonNull(mediatorName);
            Utils.ifNotNull(builderCreateImpressionDataBuilder, new Executable() { // from class: io.bidmachine.h5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    mediatorName.setData((ContextualData.ImpressionData.Builder) obj);
                }
            });
            return mediatorName;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    private Session.Builder createSessionBuilder(@NonNull Context context, @Nullable AdsType adsType) {
        try {
            final Session.Builder sessionId = Session.newBuilder().setSessionId(SessionManager.get().getSessionId());
            Session.Context.Builder builderCreateSessionContextBuilder = createSessionContextBuilder(context, adsType);
            Objects.requireNonNull(sessionId);
            Utils.ifNotNull(builderCreateSessionContextBuilder, new Executable() { // from class: io.bidmachine.f5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    sessionId.setContext((Session.Context.Builder) obj);
                }
            });
            return sessionId;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createContextualDataBuilder$0(ContextualData.Builder builder, AdsType adsType) {
        builder.setPlacement(adsType.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createImpressionDataBuilder$1(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setImagency(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createImpressionDataBuilder$2(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setAgency(obj.toString());
    }

    public void build(@NonNull Context context, @NonNull com.explorestack.protobuf.adcom.Context.User.Builder builder, @Nullable AdsType adsType) {
        Session.Builder builderCreateSessionBuilder = createSessionBuilder(context, adsType);
        if (builderCreateSessionBuilder != null) {
            builder.addExtProto(Any.pack(builderCreateSessionBuilder.build()));
        }
    }
}
