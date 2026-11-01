package io.bidmachine.rendering.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class Utils {
    @NonNull
    public static Handler createHandlerWithMyOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    @NonNull
    public static Date getDate(int i10) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, -i10);
        return calendar.getTime();
    }

    @Nullable
    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void set(@NonNull Collection<T> collection, @Nullable Collection<T> collection2) {
        collection.clear();
        if (collection2 != 0) {
            collection.addAll(collection2);
        }
    }

    @Nullable
    public static Boolean toBoolean(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }
        return null;
    }

    @Nullable
    public static Integer toIntOrNull(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static Integer toInteger(@Nullable Object obj) {
        int iIntValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            iIntValue = ((Long) obj).intValue();
        } else if (obj instanceof Float) {
            iIntValue = ((Float) obj).intValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof String) {
                    try {
                        return Integer.valueOf(Integer.parseInt((String) obj));
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            iIntValue = ((Double) obj).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Nullable
    public static Long toLong(@Nullable Object obj) {
        long jLongValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            jLongValue = ((Long) obj).longValue();
        } else if (obj instanceof Integer) {
            jLongValue = ((Integer) obj).longValue();
        } else if (obj instanceof Float) {
            jLongValue = ((Float) obj).longValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            jLongValue = ((Double) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @Nullable
    public static String toString(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    public static long write(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, V> void set(@NonNull Map<T, V> map, @Nullable Map<T, V> map2) {
        map.clear();
        if (map2 != 0) {
            map.putAll(map2);
        }
    }
}
