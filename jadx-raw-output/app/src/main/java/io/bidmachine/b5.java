package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.TextFormat;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProtoLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class b5 {
    private static final String[] PROTO_KNOWN_PACKAGES = {"io.bidmachine", "com.explorestack"};

    private static void append(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$log$0(String str, MessageOrBuilder messageOrBuilder) {
        return String.format("[%s] %s", str, toJsonObject(messageOrBuilder));
    }

    private static JSONObject map(@NonNull Map<Descriptors.FieldDescriptor, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            append(jSONObject, key.getName(), map(key, entry.getValue()));
        }
        return jSONObject;
    }

    /* JADX INFO: compiled from: ProtoLogger.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static void append(@NonNull JSONArray jSONArray, @NonNull Object obj) {
        jSONArray.put(obj);
    }

    @NonNull
    private static String byteToString(@NonNull Object obj) {
        return obj instanceof ByteString ? TextFormat.escapeBytes((ByteString) obj) : TextFormat.escapeBytes((byte[]) obj);
    }

    public static void log(@NonNull final String str, @Nullable final MessageOrBuilder messageOrBuilder) {
        if (messageOrBuilder != null) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.a5
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return b5.lambda$log$0(str, messageOrBuilder);
                }
            });
        }
    }

    @NonNull
    private static JSONArray toJsonArray(@NonNull Descriptors.FieldDescriptor fieldDescriptor, @NonNull List<?> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            append(jSONArray, map(fieldDescriptor, it.next()));
        }
        return jSONArray;
    }

    @NonNull
    private static JSONObject toJsonObject(@NonNull MessageOrBuilder messageOrBuilder) {
        return messageOrBuilder instanceof Any ? map((Any) messageOrBuilder) : map(messageOrBuilder.getAllFields());
    }

    @NonNull
    private static Object map(@NonNull Descriptors.FieldDescriptor fieldDescriptor, @NonNull Object obj) {
        try {
            if (fieldDescriptor.isRepeated() && (obj instanceof List)) {
                return toJsonArray(fieldDescriptor, (List) obj);
            }
            switch (a.$SwitchMap$com$explorestack$protobuf$Descriptors$FieldDescriptor$JavaType[fieldDescriptor.getJavaType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return obj;
                case 7:
                    return byteToString(obj);
                case 8:
                    return ((Descriptors.GenericDescriptor) obj).getName();
                case 9:
                    return toJsonObject((MessageOrBuilder) obj);
                default:
                    return "Unsupported type";
            }
        } catch (Throwable unused) {
            return "Parsing error";
        }
    }

    @NonNull
    private static JSONObject map(@NonNull Any any) {
        String[] strArrSplit = any.getTypeUrl().split("/");
        String str = strArrSplit[strArrSplit.length - 1];
        for (String str2 : PROTO_KNOWN_PACKAGES) {
            try {
                return toJsonObject(any.unpack(Class.forName(str2 + str.substring(str.indexOf(".")))));
            } catch (Exception unused) {
            }
        }
        return new JSONObject();
    }
}
