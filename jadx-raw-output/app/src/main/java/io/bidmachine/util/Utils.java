package io.bidmachine.util;

import android.app.DownloadManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresPermission;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.exifinterface.media.ExifInterface;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.Ne;
import com.ironsource.Y5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import lk.x;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007J \u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u0004\u0018\u00010#2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b&\u0010'J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010)\u001a\u00020(H\u0007J\u001c\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010.2\u0006\u0010-\u001a\u00020,H\u0007J\u0014\u00100\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007J\u0014\u00102\u001a\u00020(2\n\u00101\u001a\u0006\u0012\u0002\b\u00030*H\u0007J\u0018\u00104\u001a\u00020,2\u000e\u00103\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030.H\u0007J\u0014\u00105\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007J,\u0010<\u001a\u00020;\"\u0004\b\u0000\u001062\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000109H\u0007J,\u0010=\u001a\u00020;\"\u0004\b\u0000\u001062\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000109H\u0007J>\u0010<\u001a\u00020;\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010?2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010.H\u0007J>\u0010A\u001a\u00020;\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010?2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010.H\u0007J;\u0010F\u001a\u00020;\"\u0006\b\u0000\u00106\u0018\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000B2\u001a\u0010E\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010Cj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`DH\u0087\bJ\u0010\u0010G\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010H\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010I\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J5\u0010M\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u00106*\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0007¢\u0006\u0004\bM\u0010NJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u00042\u0006\u0010P\u001a\u00020OH\u0007J\"\u0010U\u001a\u00020\u00192\u0006\u0010P\u001a\u00020O2\u0006\u0010S\u001a\u00020R2\b\b\u0002\u0010T\u001a\u00020\u0014H\u0007J\u0018\u0010X\u001a\u00020\u00192\u0006\u0010P\u001a\u00020O2\u0006\u0010W\u001a\u00020VH\u0007J\u0012\u0010[\u001a\u00020;2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0007J\u0012\u0010^\u001a\u00020;2\b\u0010]\u001a\u0004\u0018\u00010\\H\u0007J\u0012\u0010_\u001a\u00020;2\b\u0010S\u001a\u0004\u0018\u00010RH\u0007J\b\u0010a\u001a\u00020`H\u0007J\u0010\u0010c\u001a\u00020\u00062\u0006\u0010b\u001a\u00020\u0004H\u0007J\u0012\u0010f\u001a\u00020\u00062\b\u0010e\u001a\u0004\u0018\u00010dH\u0007J\u0012\u0010g\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010i\u001a\u0004\u0018\u00010\u00042\b\u0010h\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010j\u001a\u0004\u0018\u00010d2\b\u0010h\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010n\u001a\u0004\u0018\u00010m2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010p\u001a\u0004\u0018\u00010o2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010r\u001a\u0004\u0018\u00010q2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010t\u001a\u0004\u0018\u00010s2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010v\u001a\u0004\u0018\u00010u2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010z\u001a\u0004\u0018\u00010y2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010|\u001a\u0004\u0018\u00010{2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0013\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001d\u0010\u0086\u0001\u001a\u00020\u001e2\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010\u0085\u0001\u001a\u00030\u0083\u0001H\u0007J\"\u0010\u0088\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0087\u0001\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u001eH\u0007J\u0019\u0010\u0089\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001eH\u0007J\u0019\u0010\u008a\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001eH\u0007J\u0019\u0010\u008b\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001eH\u0007J\u001a\u0010\u008b\u0001\u001a\u00020\u00142\u0007\u0010\u008c\u0001\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001eH\u0007J\u001c\u0010\u008e\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\t\b\u0001\u0010\u008d\u0001\u001a\u00020\u0014H\u0007J\u001e\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0007J(\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0007J\u0011\u0010\u0096\u0001\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0001H\u0007J\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J3\u0010\u009c\u0001\u001a\u00020;\"\u0004\b\u0000\u001062\t\u0010\u0099\u0001\u001a\u0004\u0018\u00018\u00002\u000e\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009a\u0001H\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010\u009f\u0001\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u009e\u0001\u001a\u00020\u0004H\u0007J\u001f\u0010¡\u0001\u001a\u0004\u0018\u00010\u00142\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001e\u0010¦\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010¤\u0001\u001a\u00030£\u00012\u0007\u0010¥\u0001\u001a\u00020\u0004H\u0007J\u001f\u0010©\u0001\u001a\u0004\u0018\u00010\t2\u0007\u0010§\u0001\u001a\u00020\u00042\t\b\u0002\u0010¨\u0001\u001a\u00020\u0014H\u0007J\u001e\u0010ª\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\t\b\u0002\u0010¨\u0001\u001a\u00020\u0014H\u0007J\u001e\u0010©\u0001\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\t\b\u0002\u0010¨\u0001\u001a\u00020\u0014H\u0007J\u001e\u0010«\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\t\b\u0002\u0010¨\u0001\u001a\u00020\u0014H\u0007J\u001f\u0010«\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010¬\u0001\u001a\u00020\u00042\t\b\u0002\u0010¨\u0001\u001a\u00020\u0014H\u0007J\u0012\u0010\u00ad\u0001\u001a\u00020\u001e2\u0007\u0010 \u0001\u001a\u00020\u0014H\u0007J\u0012\u0010®\u0001\u001a\u00020\u001e2\u0007\u0010 \u0001\u001a\u00020\u0014H\u0007J\u0012\u0010¯\u0001\u001a\u00020\u001e2\u0007\u0010 \u0001\u001a\u00020\u0014H\u0007R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010²\u0001¨\u0006¶\u0001"}, d2 = {"Lio/bidmachine/util/Utils;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "permission", "", "isPermissionGranted", "isExternalMemoryAvailable", "", "bytes", "applyMD5", "value", "toStringOrNull", "fallback", "toStringOrDefault", "toBooleanOrNull", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "toBooleanOrDefault", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "", "toIntOrNull", "(Ljava/lang/Object;)Ljava/lang/Integer;", "toIntOrDefault", "(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "toLongOrNull", "(Ljava/lang/Object;)Ljava/lang/Long;", "toLongOrDefault", "(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;", "", "toFloatOrNull", "(Ljava/lang/Object;)Ljava/lang/Float;", "toFloatOrDefault", "(Ljava/lang/Object;Ljava/lang/Float;)Ljava/lang/Float;", "", "toDoubleOrNull", "(Ljava/lang/Object;)Ljava/lang/Double;", "toDoubleOrDefault", "(Ljava/lang/Object;Ljava/lang/Double;)Ljava/lang/Double;", "Lorg/json/JSONArray;", "jsonArray", "", "toList", "Lorg/json/JSONObject;", "jsonObject", "", "toMap", "fromJsonElementToObjectOrNull", "list", "toJsonArray", "map", "toJsonObject", "fromObjectToJsonElementOrNull", "T", "", TypedValues.TransitionType.S_TO, "", TypedValues.TransitionType.S_FROM, "Lmj/r;", "set", "addAll", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "putAll", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sort", "capitalize", "toUnderScore", "toCamelCase", "Lio/bidmachine/util/KeyHolder;", C3426d4.i.W, "", "find", "(Ljava/lang/String;[Lio/bidmachine/util/KeyHolder;)Lio/bidmachine/util/KeyHolder;", "Ljava/io/InputStream;", "inputStream", "readSafely", "Ljava/io/OutputStream;", "outputStream", "bufferSize", "write", "Ljava/io/File;", C3426d4.i.f28530b, "readIntoFile", "Ljava/io/Closeable;", "closeable", "closeSafely", "Ljava/io/Flushable;", "flushable", "flushSafely", "finalize", "Landroid/os/Handler;", "createHandlerWithMyOrMainLooper", "url", "isHttpUrl", "Landroid/net/Uri;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "isHttpUri", "isUrlValid", "urlString", "getValidUrl", "getValidUri", "Landroid/location/Location;", "getLocation", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "Landroid/view/WindowManager;", "getWindowManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "Landroid/media/AudioManager;", "getAudioManager", "Landroid/os/PowerManager;", "getPowerManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "Landroid/location/LocationManager;", "getLocationManager", "Landroid/bluetooth/BluetoothManager;", "getBluetoothManager", "Landroid/app/DownloadManager;", "getDownloadManager", "Landroid/content/ClipboardManager;", "getClipboardManager", "Landroid/hardware/SensorManager;", "getSensorManager", "Landroid/graphics/Rect;", "mainRect", "coverRect", "getNotOverlappedAreaPercent", Ne.f27158n1, "unitToPx", "spToPx", "dpToPx", "pxToDp", "density", "id", "getColorCompat", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Intent;", "registerSystemReceiver", "Landroid/content/BroadcastReceiver;", "receiver", "registerBroadcastReceiver", "createHexHashCode", "toHexString", "toSignatureHexString", IconCompat.EXTRA_OBJ, "Lio/bidmachine/util/Executable;", "action", "ifNotNull", "(Ljava/lang/Object;Lio/bidmachine/util/Executable;)V", "defaultValue", "notEmptyOrDefault", "color", "parseColorSafely", "(Ljava/lang/String;)Ljava/lang/Integer;", "Landroid/content/res/AssetManager;", "assetManager", Y5.c.f27928b, "readAssetFile", "base64", "flags", "decodeBase64", "encodeToStringBase64", "decodeBase64ToString", "data", "redToRatio", "greenToRatio", "blueToRatio", "", "HEX_ARRAY", "[C", "UPPER_HEX_ARRAY", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class Utils {
    private static final char[] HEX_ARRAY;
    public static final Utils INSTANCE = new Utils();
    private static final char[] UPPER_HEX_ARRAY;

    private Utils() {
    }

    public static final byte[] decodeBase64(String str) {
        p.j(str, "base64");
        return decodeBase64$default(str, 0, 2, (Object) null);
    }

    public static final byte[] decodeBase64(String base64, int flags) {
        p.j(base64, "base64");
        return UtilsKt.decodeBase64(base64, flags);
    }

    public static final byte[] decodeBase64(byte[] bArr) {
        p.j(bArr, "bytes");
        return decodeBase64$default(bArr, 0, 2, (Object) null);
    }

    public static /* synthetic */ byte[] decodeBase64$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64(str, i10);
    }

    public static final String decodeBase64ToString(String str) {
        p.j(str, "data");
        return decodeBase64ToString$default(str, 0, 2, (Object) null);
    }

    public static final String decodeBase64ToString(byte[] bArr) {
        p.j(bArr, "bytes");
        return decodeBase64ToString$default(bArr, 0, 2, (Object) null);
    }

    public static final String decodeBase64ToString(byte[] bytes, int flags) {
        p.j(bytes, "bytes");
        return UtilsKt.decodeBase64ToString(bytes, flags);
    }

    public static /* synthetic */ String decodeBase64ToString$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(bArr, i10);
    }

    public static final String encodeToStringBase64(byte[] bArr) {
        p.j(bArr, "bytes");
        return encodeToStringBase64$default(bArr, 0, 2, null);
    }

    public static /* synthetic */ String encodeToStringBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return encodeToStringBase64(bArr, i10);
    }

    public static final Object fromJsonElementToObjectOrNull(Object value) {
        if (value != null && !p.e(value, JSONObject.NULL)) {
            if (value instanceof JSONObject) {
                return UtilsKt.toMap((JSONObject) value);
            }
            return value instanceof JSONArray ? UtilsKt.toList((JSONArray) value) : value;
        }
        return null;
    }

    public static final boolean isUrlValid(String url) {
        Boolean bool;
        if (url == null || url.length() == 0) {
            return false;
        }
        try {
            new URL(url);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.e(bool, Boolean.TRUE);
    }

    public static final int pxToDp(float density, float value) {
        return (int) ((value / density) + 0.5f);
    }

    public static final <T> void set(Collection<T> collection, Collection<? extends T> collection2) {
        p.j(collection, TypedValues.TransitionType.S_TO);
        UtilsKt.setSafely(collection, collection2);
    }

    public static final Boolean toBooleanOrNull(Object value) {
        return toBooleanOrDefault(value, null);
    }

    public static final Double toDoubleOrNull(Object value) {
        return toDoubleOrDefault(value, null);
    }

    public static final Float toFloatOrNull(Object value) {
        return toFloatOrDefault(value, null);
    }

    public static final Integer toIntOrNull(Object value) {
        return toIntOrDefault(value, null);
    }

    public static final Long toLongOrNull(Object value) {
        return toLongOrDefault(value, null);
    }

    public static final String toStringOrNull(Object value) {
        return toStringOrDefault(value, null);
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        p.i(charArray, "this as java.lang.String).toCharArray()");
        HEX_ARRAY = charArray;
        char[] charArray2 = "0123456789ABCDEF".toCharArray();
        p.i(charArray2, "this as java.lang.String).toCharArray()");
        UPPER_HEX_ARRAY = charArray2;
    }

    public static final <T> void addAll(Collection<T> collection, Collection<? extends T> collection2) {
        p.j(collection, TypedValues.TransitionType.S_TO);
        UtilsKt.addAllSafely(collection, collection2);
    }

    public static final byte[] applyMD5(byte[] bytes) {
        p.j(bytes, "bytes");
        return UtilsKt.applyMD5(bytes);
    }

    public static final String capitalize(String value) {
        p.j(value, "value");
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = value.substring(0, 1);
        p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault()");
        String upperCase = strSubstring.toUpperCase(locale);
        p.i(upperCase, "this as java.lang.String).toUpperCase(locale)");
        sb2.append(upperCase);
        String strSubstring2 = value.substring(1);
        p.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
        Locale locale2 = Locale.getDefault();
        p.i(locale2, "getDefault()");
        String lowerCase = strSubstring2.toLowerCase(locale2);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase);
        return sb2.toString();
    }

    public static final Handler createHandlerWithMyOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    public static final String createHexHashCode(Object value) {
        p.j(value, "value");
        return UtilsKt.createHexHashCode(value);
    }

    public static final byte[] decodeBase64(byte[] bytes, int flags) {
        p.j(bytes, "bytes");
        return UtilsKt.decodeBase64(bytes, flags);
    }

    public static /* synthetic */ byte[] decodeBase64$default(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64(bArr, i10);
    }

    public static final String decodeBase64ToString(String data, int flags) {
        p.j(data, "data");
        return UtilsKt.decodeBase64ToString(data, flags);
    }

    public static /* synthetic */ String decodeBase64ToString$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return decodeBase64ToString(str, i10);
    }

    public static final int dpToPx(Context context, float value) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, value);
    }

    public static final String encodeToStringBase64(byte[] bytes, int flags) {
        p.j(bytes, "bytes");
        return UtilsKt.encodeToStringBase64(bytes, flags);
    }

    public static final <T extends KeyHolder> T find(String key, T[] from) {
        p.j(from, TypedValues.TransitionType.S_FROM);
        return (T) UtilsKt.find(from, key);
    }

    public static final Object fromObjectToJsonElementOrNull(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof List) {
            return UtilsKt.toJsonArray((List) value);
        }
        return value instanceof Map ? UtilsKt.toJsonObject((Map) value) : value;
    }

    public static final AudioManager getAudioManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getAudioManager(context);
    }

    public static final BluetoothManager getBluetoothManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getBluetoothManager(context);
    }

    public static final ClipboardManager getClipboardManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getClipboardManager(context);
    }

    public static final int getColorCompat(Context context, @ColorRes int id2) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getColorCompat(context, id2);
    }

    public static final ConnectivityManager getConnectivityManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getConnectivityManager(context);
    }

    public static final DownloadManager getDownloadManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getDownloadManager(context);
    }

    public static final InputMethodManager getInputMethodManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getInputMethodManager(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_COARSE_LOCATION")
    public static final Location getLocation(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getLocation(context);
    }

    public static final LocationManager getLocationManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getLocationManager(context);
    }

    public static final float getNotOverlappedAreaPercent(Rect mainRect, Rect coverRect) {
        p.j(mainRect, "mainRect");
        p.j(coverRect, "coverRect");
        int iWidth = mainRect.width() * mainRect.height();
        if (iWidth == 0) {
            return 0.0f;
        }
        return (iWidth - (((int) Math.max(0.0d, ((int) Math.min(mainRect.right, coverRect.right)) - ((int) Math.max(mainRect.left, coverRect.left)))) * ((int) Math.max(0.0d, ((int) Math.min(mainRect.bottom, coverRect.bottom)) - ((int) Math.max(mainRect.top, coverRect.top)))))) / iWidth;
    }

    public static final PowerManager getPowerManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getPowerManager(context);
    }

    public static final SensorManager getSensorManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getSensorManager(context);
    }

    public static final TelephonyManager getTelephonyManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getTelephonyManager(context);
    }

    public static final String getValidUrl(String urlString) {
        if (urlString == null || urlString.length() == 0) {
            return null;
        }
        if (isUrlValid(urlString)) {
            return urlString;
        }
        try {
            return URLDecoder.decode(urlString, "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return urlString;
        }
    }

    public static final WindowManager getWindowManager(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.getWindowManager(context);
    }

    public static final <T> void ifNotNull(T obj, Executable<T> action) {
        p.j(action, "action");
        if (obj != null) {
            action.execute(obj);
        }
    }

    public static final boolean isHttpUri(Uri uri) {
        if (uri != null) {
            String string = uri.toString();
            p.i(string, "uri.toString()");
            if (isHttpUrl(string)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isHttpUrl(String url) {
        p.j(url, "url");
        return x.R(url, "http://", false, 2, null) || x.R(url, "https://", false, 2, null);
    }

    public static final boolean isPermissionGranted(Context context, String permission) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.isPermissionGranted(context, permission);
    }

    public static final String notEmptyOrDefault(String value, String defaultValue) {
        p.j(defaultValue, "defaultValue");
        return UtilsKt.notEmptyOrDefault(value, defaultValue);
    }

    public static final Integer parseColorSafely(String color) {
        if (color == null || color.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(color));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <K, V> void putAll(Map<K, V> map, Map<K, ? extends V> map2) {
        p.j(map, TypedValues.TransitionType.S_TO);
        UtilsKt.putAllSafely(map, map2);
    }

    public static final int pxToDp(Context context, float value) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.pxToDp(context, value);
    }

    public static final String readAssetFile(AssetManager assetManager, String fileName) {
        p.j(assetManager, "assetManager");
        p.j(fileName, Y5.c.f27928b);
        return UtilsKt.readAssetFile(assetManager, fileName);
    }

    public static final long readIntoFile(InputStream inputStream, File file) {
        p.j(inputStream, "inputStream");
        p.j(file, C3426d4.i.f28530b);
        return UtilsKt.readIntoFile(inputStream, file);
    }

    public static final String readSafely(InputStream inputStream) {
        p.j(inputStream, "inputStream");
        return UtilsKt.readSafely(inputStream);
    }

    public static final Intent registerBroadcastReceiver(BroadcastReceiver receiver, Context context, IntentFilter intentFilter) {
        p.j(receiver, "receiver");
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(intentFilter, "intentFilter");
        return UtilsKt.registerBroadcastReceiver(context, receiver, intentFilter);
    }

    public static final Intent registerSystemReceiver(Context context, IntentFilter intentFilter) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(intentFilter, "intentFilter");
        return UtilsKt.registerSystemReceiver(context, intentFilter);
    }

    public static final <K, V> void set(Map<K, V> map, Map<K, ? extends V> map2) {
        p.j(map, TypedValues.TransitionType.S_TO);
        UtilsKt.setSafely(map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void sort(CopyOnWriteArrayList<T> copyOnWriteArrayList, Comparator<T> comparator) {
        p.j(copyOnWriteArrayList, "list");
        p.p(0, "T?");
        Object[] array = copyOnWriteArrayList.toArray(new Object[0]);
        Arrays.sort(array, comparator);
        int length = array.length;
        for (int i10 = 0; i10 < length; i10++) {
            copyOnWriteArrayList.set(i10, array[i10]);
        }
    }

    public static final int spToPx(Context context, float value) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.spToPx(context, value);
    }

    public static /* synthetic */ Boolean toBooleanOrDefault$default(Object obj, Boolean bool, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return toBooleanOrDefault(obj, bool);
    }

    public static final String toCamelCase(String value) {
        p.j(value, "value");
        return UtilsKt.toCamelCase(value);
    }

    public static /* synthetic */ Double toDoubleOrDefault$default(Object obj, Double d10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        return toDoubleOrDefault(obj, d10);
    }

    public static /* synthetic */ Float toFloatOrDefault$default(Object obj, Float f10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        return toFloatOrDefault(obj, f10);
    }

    public static final String toHexString(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        if (bytes.length == 0) {
            return "";
        }
        char[] cArr = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bytes[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static /* synthetic */ Integer toIntOrDefault$default(Object obj, Integer num, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return toIntOrDefault(obj, num);
    }

    public static final JSONArray toJsonArray(List<?> list) {
        p.j(list, "list");
        return UtilsKt.toJsonArray(list);
    }

    public static final JSONObject toJsonObject(Map<?, ?> map) {
        p.j(map, "map");
        return UtilsKt.toJsonObject(map);
    }

    public static final List<Object> toList(JSONArray jsonArray) {
        p.j(jsonArray, "jsonArray");
        return UtilsKt.toList(jsonArray);
    }

    public static /* synthetic */ Long toLongOrDefault$default(Object obj, Long l10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        return toLongOrDefault(obj, l10);
    }

    public static final Map<String, Object> toMap(JSONObject jsonObject) {
        p.j(jsonObject, "jsonObject");
        return UtilsKt.toMap(jsonObject);
    }

    public static final String toSignatureHexString(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        if (bytes.length == 0) {
            return "";
        }
        char[] cArr = new char[(bytes.length * 3) - 1];
        int length = bytes.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = bytes[i11] & 255;
            int i13 = i10 + 1;
            char[] cArr2 = UPPER_HEX_ARRAY;
            cArr[i10] = cArr2[i12 >>> 4];
            i10 = i13 + 1;
            cArr[i13] = cArr2[i12 & 15];
            if (i11 < bytes.length - 1) {
                cArr[i10] = ':';
                i10++;
            }
        }
        return new String(cArr);
    }

    public static /* synthetic */ String toStringOrDefault$default(Object obj, String str, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return toStringOrDefault(obj, str);
    }

    public static final String toUnderScore(String value) {
        p.j(value, "value");
        return UtilsKt.toUnderScore(value);
    }

    public static final int unitToPx(Context context, int unit, float value) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.unitToPx(context, unit, value);
    }

    public static final long write(InputStream inputStream, OutputStream outputStream, int bufferSize) throws IOException {
        p.j(inputStream, "inputStream");
        p.j(outputStream, "outputStream");
        byte[] bArr = new byte[bufferSize];
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

    public static /* synthetic */ long write$default(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) throws IOException {
        if ((i11 & 4) != 0) {
            i10 = 1024;
        }
        return write(inputStream, outputStream, i10);
    }

    public static final float blueToRatio(int color) {
        return UtilsKt.toRatio(Integer.valueOf(Color.blue(color)), 255.0f);
    }

    public static final void closeSafely(Closeable closeable) {
        UtilsKt.closeSafely(closeable);
    }

    public static final void finalize(OutputStream outputStream) {
        UtilsKt.finalize(outputStream);
    }

    public static final void flushSafely(Flushable flushable) {
        UtilsKt.flushSafely(flushable);
    }

    public static final Uri getValidUri(String urlString) {
        try {
            return Uri.parse(getValidUrl(urlString));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final float greenToRatio(int color) {
        return UtilsKt.toRatio(Integer.valueOf(Color.green(color)), 255.0f);
    }

    public static final boolean isExternalMemoryAvailable() {
        return p.e(Environment.getExternalStorageState(), "mounted");
    }

    public static final float redToRatio(int color) {
        return UtilsKt.toRatio(Integer.valueOf(Color.red(color)), 255.0f);
    }

    public static final Boolean toBooleanOrDefault(Object value, Boolean fallback) {
        return UtilsKt.toBooleanOrDefault(value, fallback);
    }

    public static final Double toDoubleOrDefault(Object value, Double fallback) {
        return UtilsKt.toDoubleOrDefault(value, fallback);
    }

    public static final Float toFloatOrDefault(Object value, Float fallback) {
        return UtilsKt.toFloatOrDefault(value, fallback);
    }

    public static final Integer toIntOrDefault(Object value, Integer fallback) {
        return UtilsKt.toIntOrDefault(value, fallback);
    }

    public static final Long toLongOrDefault(Object value, Long fallback) {
        return UtilsKt.toLongOrDefault(value, fallback);
    }

    public static final String toStringOrDefault(Object value, String fallback) {
        return UtilsKt.toStringOrDefault(value, fallback);
    }
}
