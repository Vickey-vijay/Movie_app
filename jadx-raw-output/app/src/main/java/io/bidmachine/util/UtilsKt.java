package io.bidmachine.util;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.hardware.SensorManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.TypedValue;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresPermission;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import bk.a;
import bk.l;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.Ne;
import com.ironsource.Y5;
import com.ironsource.Z3;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import ek.b;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.bidmachine.util.conversion.BooleanTypeConversion;
import io.bidmachine.util.conversion.DoubleTypeConversion;
import io.bidmachine.util.conversion.FloatTypeConversion;
import io.bidmachine.util.conversion.IntTypeConversion;
import io.bidmachine.util.conversion.LongTypeConversion;
import io.bidmachine.util.conversion.StringTypeConversion;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.Regex;
import lk.c;
import lk.i;
import lk.x;
import mj.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yj.k;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0005\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u001a!\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019*\u00020\u0018\u001a\u0016\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u001c*\u00020\u001b\u001a\u000e\u0010\u001e\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u0019\u001a\u0012\u0010\u001f\u001a\u00020\u001b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c\u001a&\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"\u001a&\u0010&\u001a\u00020$\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"\u001a8\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010(*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c\u001a8\u0010*\u001a\u00020$\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010(*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c\u001a\n\u0010+\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010,\u001a\u00020\u0001*\u00020\u0001\u001a/\u00100\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010 *\u0004\u0018\u00010-*\b\u0012\u0004\u0012\u00028\u00000.2\b\u0010/\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b0\u00101\u001a\f\u00103\u001a\u0004\u0018\u00010\u0001*\u000202\u001a\u0012\u00106\u001a\u00020\u000f*\u0002022\u0006\u00105\u001a\u000204\u001a\f\u00108\u001a\u00020$*\u0004\u0018\u000107\u001a\f\u0010:\u001a\u00020$*\u0004\u0018\u000109\u001a\f\u0010<\u001a\u00020$*\u0004\u0018\u00010;\u001a\u000e\u0010>\u001a\u0004\u0018\u00010=*\u00020\u0000H\u0007\u001a\f\u0010@\u001a\u0004\u0018\u00010?*\u00020\u0000\u001a\f\u0010B\u001a\u0004\u0018\u00010A*\u00020\u0000\u001a\f\u0010D\u001a\u0004\u0018\u00010C*\u00020\u0000\u001a\f\u0010F\u001a\u0004\u0018\u00010E*\u00020\u0000\u001a\f\u0010H\u001a\u0004\u0018\u00010G*\u00020\u0000\u001a\f\u0010J\u001a\u0004\u0018\u00010I*\u00020\u0000\u001a\f\u0010L\u001a\u0004\u0018\u00010K*\u00020\u0000\u001a\f\u0010N\u001a\u0004\u0018\u00010M*\u00020\u0000\u001a\f\u0010P\u001a\u0004\u0018\u00010O*\u00020\u0000\u001a\f\u0010R\u001a\u0004\u0018\u00010Q*\u00020\u0000\u001a\f\u0010T\u001a\u0004\u0018\u00010S*\u00020\u0000\u001a&\u0010V\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010 \u0018\u0001*\u00020\u00002\u0006\u0010U\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\bV\u0010W\u001a\u001a\u0010Z\u001a\u00020\f*\u00020\u00002\u0006\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010[\u001a\u00020\f*\u00020\u00002\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010\\\u001a\u00020\f*\u00020\u00002\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010]\u001a\u00020\f*\u00020\u00002\u0006\u0010Y\u001a\u00020\u0012\u001a\u0014\u0010_\u001a\u00020\f*\u00020\u00002\b\b\u0001\u0010^\u001a\u00020\f\u001a\u0014\u0010c\u001a\u0004\u0018\u00010b*\u00020\u00002\u0006\u0010a\u001a\u00020`\u001a\u001e\u0010f\u001a\u0004\u0018\u00010b*\u00020\u00002\u0006\u0010e\u001a\u00020d2\u0006\u0010a\u001a\u00020`H\u0007\u001a\n\u0010g\u001a\u00020\u0001*\u00020\u0007\u001a\u0014\u0010i\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010h\u001a\u00020\u0001\u001a\u0014\u0010l\u001a\u0004\u0018\u00010\u0001*\u00020j2\u0006\u0010k\u001a\u00020\u0001\u001a\u0016\u0010n\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010o\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010n\u001a\u0004\u0018\u00010\u0005*\u00020\u00052\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010p\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\b\b\u0002\u0010m\u001a\u00020\f\u001a\u0016\u0010p\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\b\b\u0002\u0010m\u001a\u00020\f\u001a+\u0010t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010q2\u000e\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000rH\u0086\bø\u0001\u0000¢\u0006\u0004\bt\u0010u\u001a;\u0010t\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010q*\u00028\u00002\u0014\u0010s\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010vH\u0086\bø\u0001\u0000¢\u0006\u0004\bt\u0010w\u001a#\u0010z\u001a\u00020\u0015\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0015¢\u0006\u0004\bz\u0010{\u001a#\u0010z\u001a\u00020\u0012\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0012¢\u0006\u0004\bz\u0010|\u001a#\u0010}\u001a\u00020\u0015\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0015¢\u0006\u0004\b}\u0010{\u001a#\u0010}\u001a\u00020\u0012\"\b\b\u0000\u0010 *\u00020x*\u00028\u00002\u0006\u0010y\u001a\u00020\u0012¢\u0006\u0004\b}\u0010|\"\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001\"\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0090\u0001"}, d2 = {"Landroid/content/Context;", "", "permission", "", "isPermissionGranted", "", "applyMD5", "", "fallback", "toStringOrDefault", "toBooleanOrDefault", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "", "toIntOrDefault", "(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "toLongOrDefault", "(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;", "", "toFloatOrDefault", "(Ljava/lang/Object;Ljava/lang/Float;)Ljava/lang/Float;", "", "toDoubleOrDefault", "(Ljava/lang/Object;Ljava/lang/Double;)Ljava/lang/Double;", "Lorg/json/JSONArray;", "", "toList", "Lorg/json/JSONObject;", "", "toMap", "toJsonArray", "toJsonObject", "T", "", "", TypedValues.TransitionType.S_FROM, "Lmj/r;", "setSafely", "addAllSafely", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "putAllSafely", "toUnderScore", "toCamelCase", "Lio/bidmachine/util/KeyHolder;", "", C3426d4.i.W, "find", "([Lio/bidmachine/util/KeyHolder;Ljava/lang/String;)Lio/bidmachine/util/KeyHolder;", "Ljava/io/InputStream;", "readSafely", "Ljava/io/File;", C3426d4.i.f28530b, "readIntoFile", "Ljava/io/Closeable;", "closeSafely", "Ljava/io/Flushable;", "flushSafely", "Ljava/io/OutputStream;", "finalize", "Landroid/location/Location;", "getLocation", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "Landroid/view/WindowManager;", "getWindowManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "Landroid/media/AudioManager;", "getAudioManager", "Landroid/os/PowerManager;", "getPowerManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "Landroid/location/LocationManager;", "getLocationManager", "Landroid/bluetooth/BluetoothManager;", "getBluetoothManager", "Landroid/app/DownloadManager;", "getDownloadManager", "Landroid/content/ClipboardManager;", "getClipboardManager", "Landroid/hardware/SensorManager;", "getSensorManager", "name", "getTypedSystemService", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", Ne.f27158n1, "value", "unitToPx", "spToPx", "dpToPx", "pxToDp", "id", "getColorCompat", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Intent;", "registerSystemReceiver", "Landroid/content/BroadcastReceiver;", "receiver", "registerBroadcastReceiver", "createHexHashCode", "defaultValue", "notEmptyOrDefault", "Landroid/content/res/AssetManager;", Y5.c.f27928b, "readAssetFile", "flags", "decodeBase64", "encodeToStringBase64", "decodeBase64ToString", "R", "Lkotlin/Function0;", "block", "letSafely", "(Lbk/a;)Ljava/lang/Object;", "Lkotlin/Function1;", "(Ljava/lang/Object;Lbk/l;)Ljava/lang/Object;", "", "max", "toRatio", "(Ljava/lang/Number;D)D", "(Ljava/lang/Number;F)F", "fromRatio", "Lio/bidmachine/util/conversion/StringTypeConversion;", "STRING_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/StringTypeConversion;", "Lio/bidmachine/util/conversion/BooleanTypeConversion;", "BOOLEAN_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/BooleanTypeConversion;", "Lio/bidmachine/util/conversion/IntTypeConversion;", "INT_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/IntTypeConversion;", "Lio/bidmachine/util/conversion/LongTypeConversion;", "LONG_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/LongTypeConversion;", "Lio/bidmachine/util/conversion/FloatTypeConversion;", "FLOAT_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/FloatTypeConversion;", "Lio/bidmachine/util/conversion/DoubleTypeConversion;", "DOUBLE_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/DoubleTypeConversion;", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class UtilsKt {
    private static final StringTypeConversion STRING_TYPE_CONVERSION = new StringTypeConversion();
    private static final BooleanTypeConversion BOOLEAN_TYPE_CONVERSION = new BooleanTypeConversion();
    private static final IntTypeConversion INT_TYPE_CONVERSION = new IntTypeConversion();
    private static final LongTypeConversion LONG_TYPE_CONVERSION = new LongTypeConversion();
    private static final FloatTypeConversion FLOAT_TYPE_CONVERSION = new FloatTypeConversion();
    private static final DoubleTypeConversion DOUBLE_TYPE_CONVERSION = new DoubleTypeConversion();

    public static final byte[] decodeBase64(String str, int i10) {
        p.j(str, "<this>");
        try {
            byte[] bytes = str.getBytes(c.f63591b);
            p.i(bytes, "this as java.lang.String).getBytes(charset)");
            return decodeBase64(bytes, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] decodeBase64$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64(str, i10);
    }

    public static final String decodeBase64ToString(byte[] bArr, int i10) {
        p.j(bArr, "<this>");
        byte[] bArrDecodeBase64 = decodeBase64(bArr, i10);
        if (bArrDecodeBase64 != null) {
            return new String(bArrDecodeBase64, c.f63591b);
        }
        return null;
    }

    public static /* synthetic */ String decodeBase64ToString$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(bArr, i10);
    }

    public static final <T extends Number> double fromRatio(T t10, double d10) {
        p.j(t10, "<this>");
        return (d10 * t10.doubleValue()) / 1.0d;
    }

    public static final <R> R letSafely(a<? extends R> aVar) {
        p.j(aVar, "block");
        try {
            return aVar.invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> void setSafely(Collection<T> collection, Collection<? extends T> collection2) {
        p.j(collection, "<this>");
        collection.clear();
        addAllSafely(collection, collection2);
    }

    public static final <T extends Number> double toRatio(T t10, double d10) {
        p.j(t10, "<this>");
        return ((double) b.b((t10.doubleValue() / d10) * ((double) 100))) / 100.0d;
    }

    public static final <T> void addAllSafely(Collection<T> collection, Collection<? extends T> collection2) {
        p.j(collection, "<this>");
        if (collection2 == null) {
            return;
        }
        collection.addAll(collection2);
    }

    public static final byte[] applyMD5(byte[] bArr) {
        p.j(bArr, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void closeSafely(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final String createHexHashCode(Object obj) {
        p.j(obj, "<this>");
        String hexString = Integer.toHexString(obj.hashCode());
        p.i(hexString, "toHexString(hashCode())");
        return hexString;
    }

    public static final byte[] decodeBase64(byte[] bArr, int i10) {
        p.j(bArr, "<this>");
        try {
            return Base64.decode(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] decodeBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64(bArr, i10);
    }

    public static final String decodeBase64ToString(String str, int i10) {
        p.j(str, "<this>");
        byte[] bytes = str.getBytes(c.f63591b);
        p.i(bytes, "this as java.lang.String).getBytes(charset)");
        return decodeBase64ToString(bytes, i10);
    }

    public static /* synthetic */ String decodeBase64ToString$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(str, i10);
    }

    public static final int dpToPx(Context context, float f10) {
        p.j(context, "<this>");
        return unitToPx(context, 1, f10);
    }

    public static final String encodeToStringBase64(byte[] bArr, int i10) {
        p.j(bArr, "<this>");
        try {
            return Base64.encodeToString(bArr, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String encodeToStringBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return encodeToStringBase64(bArr, i10);
    }

    public static final <T extends KeyHolder> T find(T[] tArr, String str) {
        String lowerCase;
        String key;
        p.j(tArr, "<this>");
        if (str == null || str.length() == 0) {
            return null;
        }
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault()");
        String lowerCase2 = str.toLowerCase(locale);
        p.i(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        for (T t10 : tArr) {
            if (t10 == null || (key = t10.getKey()) == null) {
                lowerCase = null;
            } else {
                Locale locale2 = Locale.getDefault();
                p.i(locale2, "getDefault()");
                lowerCase = key.toLowerCase(locale2);
                p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            if (x.F(lowerCase, lowerCase2, false, 2, null)) {
                return t10;
            }
        }
        return null;
    }

    public static final void flushSafely(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final <T extends Number> float fromRatio(T t10, float f10) {
        p.j(t10, "<this>");
        return (f10 * t10.floatValue()) / 1.0f;
    }

    public static final AudioManager getAudioManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            return (AudioManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final BluetoothManager getBluetoothManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService(Z3.f27969d);
            if (!(systemService instanceof BluetoothManager)) {
                systemService = null;
            }
            return (BluetoothManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final ClipboardManager getClipboardManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            return (ClipboardManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int getColorCompat(Context context, @ColorRes int i10) {
        p.j(context, "<this>");
        return context.getColor(i10);
    }

    public static final ConnectivityManager getConnectivityManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final DownloadManager getDownloadManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService(NativeAdPresenter.DOWNLOAD);
            if (!(systemService instanceof DownloadManager)) {
                systemService = null;
            }
            return (DownloadManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final InputMethodManager getInputMethodManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            return (InputMethodManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_COARSE_LOCATION")
    public static final Location getLocation(Context context) {
        LocationManager locationManager;
        Location lastKnownLocation;
        p.j(context, "<this>");
        try {
            if (!isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION") || (locationManager = getLocationManager(context)) == null) {
                return null;
            }
            String bestProvider = Build.VERSION.SDK_INT >= 34 ? GplLibraryWrapper.FUSED_PROVIDER : locationManager.getBestProvider(new Criteria(), false);
            if (bestProvider == null) {
                return null;
            }
            Location lastKnownLocation2 = locationManager.getLastKnownLocation(bestProvider);
            if (lastKnownLocation2 != null) {
                return lastKnownLocation2;
            }
            List<String> allProviders = locationManager.getAllProviders();
            p.i(allProviders, "locationManager.allProviders");
            if (allProviders.size() <= 1) {
                return null;
            }
            for (String str : allProviders) {
                if (str != null && !p.e(str, bestProvider) && (lastKnownLocation = locationManager.getLastKnownLocation(str)) != null) {
                    return lastKnownLocation;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final LocationManager getLocationManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final PowerManager getPowerManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("power");
            if (!(systemService instanceof PowerManager)) {
                systemService = null;
            }
            return (PowerManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final SensorManager getSensorManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("sensor");
            if (!(systemService instanceof SensorManager)) {
                systemService = null;
            }
            return (SensorManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final TelephonyManager getTelephonyManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final WindowManager getWindowManager(Context context) {
        p.j(context, "<this>");
        try {
            Object systemService = context.getSystemService("window");
            if (!(systemService instanceof WindowManager)) {
                systemService = null;
            }
            return (WindowManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        Boolean boolValueOf;
        p.j(context, "<this>");
        boolean z10 = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return p.e(boolValueOf, Boolean.TRUE);
    }

    public static final <T, R> R letSafely(T t10, l<? super T, ? extends R> lVar) {
        p.j(lVar, "block");
        try {
            return lVar.invoke(t10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String notEmptyOrDefault(String str, String str2) {
        p.j(str2, "defaultValue");
        return str == null || str.length() == 0 ? str2 : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void putAllSafely(Map<K, V> map, Map<K, ? extends V> map2) {
        p.j(map, "<this>");
        if (map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    public static final int pxToDp(Context context, float f10) {
        p.j(context, "<this>");
        return Utils.pxToDp(DeviceUtilsKt.getScreenDensity(context), f10);
    }

    public static final String readAssetFile(AssetManager assetManager, String str) {
        p.j(assetManager, "<this>");
        p.j(str, Y5.c.f27928b);
        try {
            InputStream inputStreamOpen = assetManager.open(str);
            p.i(inputStreamOpen, "open(fileName)");
            return readSafely(inputStreamOpen);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final long readIntoFile(InputStream inputStream, File file) throws Throwable {
        p.j(inputStream, "<this>");
        p.j(file, C3426d4.i.f28530b);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long jB = yj.a.b(inputStream, fileOutputStream, 0, 2, null);
                yj.b.a(fileOutputStream, null);
                yj.b.a(inputStream, null);
                return jB;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    yj.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                yj.b.a(inputStream, th4);
                throw th5;
            }
        }
    }

    public static final String readSafely(InputStream inputStream) {
        p.j(inputStream, "<this>");
        try {
            try {
                Reader inputStreamReader = new InputStreamReader(inputStream, c.f63591b);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String strE = k.e(bufferedReader);
                    yj.b.a(bufferedReader, null);
                    yj.b.a(inputStream, null);
                    return strE;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yj.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                yj.b.a(inputStream, th4);
                throw th5;
            }
        }
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public static final Intent registerBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        p.j(context, "<this>");
        p.j(broadcastReceiver, "receiver");
        p.j(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static final Intent registerSystemReceiver(Context context, IntentFilter intentFilter) {
        p.j(context, "<this>");
        p.j(intentFilter, "intentFilter");
        return Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(null, intentFilter, 4) : context.registerReceiver(null, intentFilter);
    }

    public static final int spToPx(Context context, float f10) {
        p.j(context, "<this>");
        return unitToPx(context, 2, f10);
    }

    public static final Boolean toBooleanOrDefault(Object obj, Boolean bool) {
        return BOOLEAN_TYPE_CONVERSION.toOrDefault(obj, bool);
    }

    public static /* synthetic */ Boolean toBooleanOrDefault$default(Object obj, Boolean bool, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        return toBooleanOrDefault(obj, bool);
    }

    public static final String toCamelCase(String str) {
        p.j(str, "<this>");
        String strReplace = new Regex("_([a-z])").replace(str, new l<i, CharSequence>() { // from class: io.bidmachine.util.UtilsKt.toCamelCase.1
            @Override // bk.l
            public final CharSequence invoke(i iVar) {
                p.j(iVar, "it");
                String upperCase = iVar.b().get(1).toUpperCase(Locale.ROOT);
                p.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            }
        });
        if (!(strReplace.length() > 0)) {
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = strReplace.charAt(0);
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault()");
        sb2.append((Object) lk.a.d(cCharAt, locale));
        String strSubstring = strReplace.substring(1);
        p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    public static final Double toDoubleOrDefault(Object obj, Double d10) {
        return DOUBLE_TYPE_CONVERSION.toOrDefault(obj, d10);
    }

    public static /* synthetic */ Double toDoubleOrDefault$default(Object obj, Double d10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        return toDoubleOrDefault(obj, d10);
    }

    public static final Float toFloatOrDefault(Object obj, Float f10) {
        return FLOAT_TYPE_CONVERSION.toOrDefault(obj, f10);
    }

    public static /* synthetic */ Float toFloatOrDefault$default(Object obj, Float f10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        return toFloatOrDefault(obj, f10);
    }

    public static final Integer toIntOrDefault(Object obj, Integer num) {
        return INT_TYPE_CONVERSION.toOrDefault(obj, num);
    }

    public static /* synthetic */ Integer toIntOrDefault$default(Object obj, Integer num, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        return toIntOrDefault(obj, num);
    }

    public static final JSONArray toJsonArray(List<?> list) {
        p.j(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object objFromObjectToJsonElementOrNull = Utils.fromObjectToJsonElementOrNull(it.next());
            if (objFromObjectToJsonElementOrNull != null) {
                jSONArray.put(objFromObjectToJsonElementOrNull);
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    public static final JSONObject toJsonObject(Map<?, ?> map) throws JSONException {
        boolean z10;
        Object objFromObjectToJsonElementOrNull;
        p.j(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String string = key != null ? key.toString() : null;
            Object value = entry.getValue();
            if (string != null) {
                z10 = string.length() > 0;
            }
            if (z10 && value != null && (objFromObjectToJsonElementOrNull = Utils.fromObjectToJsonElementOrNull(value)) != null) {
                jSONObject.put(string, objFromObjectToJsonElementOrNull);
            }
        }
        return jSONObject;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        p.j(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objFromJsonElementToObjectOrNull = Utils.fromJsonElementToObjectOrNull(jSONArray.opt(i10));
            if (objFromJsonElementToObjectOrNull != null) {
                arrayList.add(objFromJsonElementToObjectOrNull);
            }
        }
        return arrayList;
    }

    public static final Long toLongOrDefault(Object obj, Long l10) {
        return LONG_TYPE_CONVERSION.toOrDefault(obj, l10);
    }

    public static /* synthetic */ Long toLongOrDefault$default(Object obj, Long l10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return toLongOrDefault(obj, l10);
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        p.j(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        p.i(itKeys, "keys()");
        for (String str : kk.r.g(itKeys)) {
            Object objFromJsonElementToObjectOrNull = Utils.fromJsonElementToObjectOrNull(jSONObject.opt(str));
            if (objFromJsonElementToObjectOrNull != null) {
                p.i(str, C3426d4.i.W);
                linkedHashMap.put(str, objFromJsonElementToObjectOrNull);
            }
        }
        return linkedHashMap;
    }

    public static final <T extends Number> float toRatio(T t10, float f10) {
        p.j(t10, "<this>");
        return b.c((t10.floatValue() / f10) * 100) / 100.0f;
    }

    public static final String toStringOrDefault(Object obj, String str) {
        return STRING_TYPE_CONVERSION.toOrDefault(obj, str);
    }

    public static /* synthetic */ String toStringOrDefault$default(Object obj, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return toStringOrDefault(obj, str);
    }

    public static final String toUnderScore(String str) {
        p.j(str, "<this>");
        String strReplace = new Regex("(?<=.)[A-Z]").replace(str, "_$0");
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault()");
        String lowerCase = strReplace.toLowerCase(locale);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final int unitToPx(Context context, int i10, float f10) {
        p.j(context, "<this>");
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) TypedValue.applyDimension(i10, f10, DeviceUtilsKt.getDisplayMetrics(context));
    }

    public static final void finalize(OutputStream outputStream) {
        flushSafely(outputStream);
        closeSafely(outputStream);
    }

    private static final /* synthetic */ <T> T getTypedSystemService(Context context, String str) {
        try {
            T t10 = (T) context.getSystemService(str);
            p.p(2, "T");
            return t10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <K, V> void setSafely(Map<K, V> map, Map<K, ? extends V> map2) {
        p.j(map, "<this>");
        map.clear();
        putAllSafely(map, map2);
    }
}
