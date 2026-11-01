package io.bidmachine.utils;

import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.EventType;
import com.explorestack.protobuf.adcom.LocationType;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.TrackEventType;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ProtoUtils {
    @Nullable
    public static String encodeToString(@Nullable MessageLite messageLite) {
        if (messageLite == null) {
            return null;
        }
        try {
            return Base64.encodeToString(messageLite.toByteArray(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isEmpty(@Nullable Struct struct) {
        return struct == null || struct.getFieldsCount() <= 0;
    }

    @Nullable
    public static Object toObjectOrNull(@Nullable Value value) {
        if (value == null) {
            return null;
        }
        int i10 = a.$SwitchMap$com$explorestack$protobuf$Value$KindCase[value.getKindCase().ordinal()];
        if (i10 == 1) {
            return Double.valueOf(value.getNumberValue());
        }
        if (i10 == 2) {
            return value.getStringValue();
        }
        if (i10 == 3) {
            return Boolean.valueOf(value.getBoolValue());
        }
        if (i10 == 4) {
            return toMapOrNull(value.getStructValue());
        }
        if (i10 != 5) {
            return null;
        }
        return toListOrNull(value.getListValue());
    }

    @Nullable
    public static Value.Builder toValueBuilderOrNull(@Nullable Object obj) {
        Struct.Builder structBuilderOrNull;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return ((Value) obj).toBuilder();
        }
        if (obj instanceof Value.Builder) {
            return (Value.Builder) obj;
        }
        if (obj instanceof String) {
            return Value.newBuilder().setStringValue((String) obj);
        }
        if (obj instanceof Number) {
            return Value.newBuilder().setNumberValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            ListValue.Builder listValueBuilderOrNull = toListValueBuilderOrNull((List) obj);
            if (listValueBuilderOrNull != null) {
                return Value.newBuilder().setListValue(listValueBuilderOrNull);
            }
        } else if ((obj instanceof Map) && (structBuilderOrNull = toStructBuilderOrNull((Map) obj)) != null) {
            return Value.newBuilder().setStructValue(structBuilderOrNull);
        }
        return null;
    }

    @Nullable
    public static Value toValueOrNull(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return (Value) obj;
        }
        if (obj instanceof Value.Builder) {
            return ((Value.Builder) obj).build();
        }
        Value.Builder valueBuilderOrNull = toValueBuilderOrNull(obj);
        if (valueBuilderOrNull != null) {
            return valueBuilderOrNull.build();
        }
        return null;
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$Value$KindCase;

        static {
            int[] iArr = new int[Value.KindCase.values().length];
            $SwitchMap$com$explorestack$protobuf$Value$KindCase = iArr;
            try {
                iArr[Value.KindCase.NUMBER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.STRING_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.STRUCT_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Value$KindCase[Value.KindCase.LIST_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void fillGeoBuilder(@NonNull Context.Geo.Builder builder, @Nullable Location location, boolean z10) {
        if (z10) {
            builder.setUtcoffset(Utils.getUtcOffsetMinutes());
        }
        if (location != null) {
            builder.setType(getLocationType(location));
            builder.setLat((float) location.getLatitude());
            builder.setLon((float) location.getLongitude());
            builder.setAccur((int) location.getAccuracy());
            builder.setLastfix(location.getTime());
        }
    }

    public static LocationType getLocationType(@Nullable Location location) {
        if (location != null) {
            if ("gps".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_GPS;
            }
            if ("network".equals(location.getProvider()) || "passive".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_IP;
            }
        }
        return LocationType.LOCATION_TYPE_INVALID;
    }

    public static boolean isEmpty(@Nullable ListValue listValue) {
        return listValue == null || listValue.getValuesCount() <= 0;
    }

    public static void prepareEvents(@NonNull Map<TrackEventType, List<String>> map, @Nullable List<Ad.Event> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Ad.Event event : list) {
            TrackEventType trackEventTypeFromNumber = event.getType() == EventType.EVENT_TYPE_IMPRESSION ? TrackEventType.Show : TrackEventType.fromNumber(event.getTypeValue());
            if (trackEventTypeFromNumber != null) {
                addEvent(map, trackEventTypeFromNumber, event.getUrl());
            }
        }
    }

    @Nullable
    public static ListValue.Builder toListValueBuilderOrNull(@Nullable List<?> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Value.Builder valueBuilderOrNull = toValueBuilderOrNull(it.next());
            if (valueBuilderOrNull != null) {
                builderNewBuilder.addValues(valueBuilderOrNull);
            }
        }
        return builderNewBuilder;
    }

    @Nullable
    public static Struct.Builder toStructBuilderOrNull(@Nullable Map<?, ?> map) {
        Value.Builder valueBuilderOrNull;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                String strValueOf = String.valueOf(key);
                if (!TextUtils.isEmpty(strValueOf) && (valueBuilderOrNull = toValueBuilderOrNull(entry.getValue())) != null) {
                    builderNewBuilder.putFields(strValueOf, valueBuilderOrNull.build());
                }
            }
        }
        return builderNewBuilder;
    }

    public static void addEvent(@NonNull Map<TrackEventType, List<String>> map, @NonNull TrackEventType trackEventType, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<String> arrayList = map.get(trackEventType);
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            map.put(trackEventType, arrayList);
        }
        arrayList.add(str);
    }

    @NonNull
    public static Context.Geo.Builder createGeoBuilderWithLocation(@NonNull android.content.Context context, @Nullable Location location, @Nullable Location location2, boolean z10) {
        Context.Geo.Builder builderNewBuilder = Context.Geo.newBuilder();
        fillGeoBuilder(builderNewBuilder, Utils.getBestLocation(context, location, location2), z10);
        return builderNewBuilder;
    }

    public static void fillStructWithPrimitiveValues(@NonNull Struct.Builder builder, @NonNull Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (value.getClass() == String.class) {
                    builder.putFields(key, Value.newBuilder().setStringValue((String) value).build());
                } else if (value.getClass() == Boolean.class) {
                    builder.putFields(key, Value.newBuilder().setBoolValue(((Boolean) value).booleanValue()).build());
                } else if (value instanceof Number) {
                    builder.putFields(key, Value.newBuilder().setNumberValue(((Number) value).doubleValue()).build());
                }
            }
        }
    }

    @Nullable
    public static AdExtension findFirstAdExtension(@NonNull Ad ad2) {
        int extProtoCount = ad2.getExtProtoCount();
        if (extProtoCount > 0) {
            for (int i10 = 0; i10 < extProtoCount; i10++) {
                try {
                    Any extProto = ad2.getExtProto(i10);
                    if (extProto.is(AdExtension.class)) {
                        return (AdExtension) extProto.unpack(AdExtension.class);
                    }
                    continue;
                } catch (Throwable th2) {
                    Logger.w(th2);
                }
            }
            return null;
        }
        return null;
    }

    public static boolean isBannerPlacement(@NonNull Placement placement, @NonNull BannerSize bannerSize) {
        Placement.DisplayPlacement display = placement.getDisplay();
        if (!display.getInstl() && bannerSize.width == display.getW() && bannerSize.height == display.getH()) {
            return true;
        }
        return false;
    }

    public static boolean isInterstitialPlacement(@NonNull Placement placement) {
        if (isRewardedPlacement(placement)) {
            return false;
        }
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display != Placement.DisplayPlacement.getDefaultInstance() && display.getInstl()) {
            return true;
        }
        return isVideoPlacement(placement);
    }

    public static boolean isNativePlacement(@NonNull Placement placement) {
        if (placement.getDisplay().getNativefmt().getAssetCount() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isRewardedPlacement(@NonNull Placement placement) {
        return placement.getReward();
    }

    public static boolean isVideoPlacement(@NonNull Placement placement) {
        if (placement.getVideo() != Placement.VideoPlacement.getDefaultInstance()) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Timestamp msToProtobufTimestamp(long j10) {
        return Timestamp.newBuilder().setSeconds(j10 / 1000).setNanos(((int) (j10 % 1000)) * 1000000).build();
    }

    @NonNull
    public static List<Object> toList(@Nullable ListValue listValue) {
        List<Object> listOrNull = toListOrNull(listValue);
        if (listOrNull == null) {
            return new ArrayList();
        }
        return listOrNull;
    }

    @Nullable
    public static List<Object> toListOrNull(@Nullable ListValue listValue) {
        if (isEmpty(listValue)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Value> it = listValue.getValuesList().iterator();
        while (it.hasNext()) {
            Object objectOrNull = toObjectOrNull(it.next());
            if (objectOrNull != null) {
                arrayList.add(objectOrNull);
            }
        }
        return arrayList;
    }

    @NonNull
    public static Map<String, Object> toMap(@Nullable Struct struct) {
        Map<String, Object> mapOrNull = toMapOrNull(struct);
        if (mapOrNull == null) {
            return new HashMap();
        }
        return mapOrNull;
    }

    @Nullable
    public static Map<String, Object> toMapOrNull(@Nullable Struct struct) {
        Object objectOrNull;
        if (isEmpty(struct)) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, Value> entry : struct.getFieldsMap().entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (objectOrNull = toObjectOrNull(value)) != null) {
                map.put(key, objectOrNull);
            }
        }
        return map;
    }
}
