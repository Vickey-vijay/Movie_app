package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3426d4;
import com.ironsource.C3444e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.Regex;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: Utility.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001NB\u000b\b\u0002¢\u0006\u0006\b¹\u0001\u0010²\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002J&\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010'\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010%H\u0007J\u0012\u0010*\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010(H\u0007J\u0012\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0007J\u001c\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001002\u0006\u0010/\u001a\u00020.H\u0007J\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006002\u0006\u0010/\u001a\u00020.H\u0007J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u0006052\u0006\u00104\u001a\u000203H\u0007J&\u00108\u001a\u0004\u0018\u00010\u00012\u0006\u0010/\u001a\u00020.2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109H\u0007J\u001a\u0010?\u001a\u00020>2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010=\u001a\u00020<H\u0007J\u0018\u0010A\u001a\u00020!2\u0006\u0010,\u001a\u00020+2\u0006\u0010@\u001a\u00020\u0006H\u0002J\u0010\u0010B\u001a\u00020!2\u0006\u0010,\u001a\u00020+H\u0007J\"\u0010G\u001a\u00020!2\b\u0010C\u001a\u0004\u0018\u00010\u00062\u000e\u0010F\u001a\n\u0018\u00010Dj\u0004\u0018\u0001`EH\u0007J\u001c\u0010I\u001a\u00020!2\b\u0010C\u001a\u0004\u0018\u00010\u00062\b\u0010H\u001a\u0004\u0018\u00010\u0006H\u0007J&\u0010L\u001a\u00020!2\b\u0010C\u001a\u0004\u0018\u00010\u00062\b\u0010H\u001a\u0004\u0018\u00010\u00062\b\u0010K\u001a\u0004\u0018\u00010JH\u0007J)\u0010F\u001a\u00020\u0004\"\u0004\b\u0000\u0010M2\b\u0010N\u001a\u0004\u0018\u00018\u00002\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\bF\u0010OJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020\u0006052\u0006\u00104\u001a\u000203H\u0007J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060Q2\u0006\u00104\u001a\u000203H\u0007J \u0010T\u001a\u00020\u00062\u0016\u0010S\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000600H\u0007J\u001c\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006002\u0006\u0010U\u001a\u00020\u0006H\u0007J4\u0010\\\u001a\u00020!2\u0006\u0010W\u001a\u00020.2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010\u00062\u0006\u0010[\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0007J\n\u0010]\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010_\u001a\u00020!2\u0006\u0010W\u001a\u00020.2\u0006\u0010^\u001a\u00020+H\u0007JE\u0010f\u001a\u0004\u0018\u00010e2\n\u0010a\u001a\u0006\u0012\u0002\b\u00030`2\u0006\u0010b\u001a\u00020\u00062\u001e\u0010d\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010`0c\"\b\u0012\u0002\b\u0003\u0018\u00010`H\u0007¢\u0006\u0004\bf\u0010gJA\u0010i\u001a\u0004\u0018\u00010e2\u0006\u0010h\u001a\u00020\u00062\u0006\u0010b\u001a\u00020\u00062\u001e\u0010d\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010`0c\"\b\u0012\u0002\b\u0003\u0018\u00010`H\u0007¢\u0006\u0004\bi\u0010jJ;\u0010n\u001a\u0004\u0018\u00010\u00012\b\u0010k\u001a\u0004\u0018\u00010\u00012\u0006\u0010l\u001a\u00020e2\u0016\u0010m\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010c\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\bn\u0010oJ\u0012\u0010K\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0007J\u0012\u0010q\u001a\u00020\u00042\b\u0010p\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010r\u001a\u00020\u00042\b\u0010p\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010s\u001a\u00020\u00042\b\u0010p\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010v\u001a\u00020u2\u0006\u0010t\u001a\u00020\u001bH\u0007J&\u0010y\u001a\u0004\u0018\u00010w2\b\u0010#\u001a\u0004\u0018\u00010\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010x\u001a\u00020wH\u0007J*\u0010|\u001a\u00020!2\u0006\u0010{\u001a\u00020z2\u0018\u0010S\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000100H\u0007J\"\u0010}\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001002\u0006\u0010{\u001a\u00020zH\u0007J&\u0010~\u001a\u00020!2\u0006\u0010{\u001a\u00020z2\u0014\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000100H\u0007J\u001e\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001002\u0006\u0010{\u001a\u00020zH\u0007J\u0014\u0010M\u001a\u00020\u00042\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0007J\u0014\u0010\u0083\u0001\u001a\u00020\u00062\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006H\u0007J\u001c\u0010\u0087\u0001\u001a\u00020!2\u0007\u0010\u0084\u0001\u001a\u00020\u00062\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0007J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010.2\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0007J\u0013\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0006H\u0002J\u0014\u0010\u008c\u0001\u001a\u00020\u00062\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\u000b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\t\u0010\u008e\u0001\u001a\u00020>H\u0002J\u0011\u0010\u008f\u0001\u001a\u00020!2\u0006\u0010^\u001a\u00020+H\u0002J\t\u0010\u0090\u0001\u001a\u00020!H\u0002J\u0011\u0010\u0091\u0001\u001a\u00020!2\u0006\u0010^\u001a\u00020+H\u0002J\t\u0010\u0092\u0001\u001a\u00020\u0004H\u0002J\t\u0010\u0093\u0001\u001a\u00020!H\u0002J\t\u0010\u0094\u0001\u001a\u00020!H\u0002J\u0012\u0010\u0096\u0001\u001a\u00020u2\u0007\u0010\u000e\u001a\u00030\u0095\u0001H\u0002J*\u0010\u0003\u001a\u00020!2\u0006\u0010W\u001a\u00020.2\u0006\u0010Y\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010\u00062\u0006\u0010,\u001a\u00020+H\u0002J!\u0010\u0097\u0001\u001a\u00020!2\u0006\u0010W\u001a\u00020.2\u0006\u0010Y\u001a\u00020X2\u0006\u0010,\u001a\u00020+H\u0002J\u0011\u0010\u0098\u0001\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0002J\u0011\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0099\u0001\u001a\u00020>H\u0007J\u0011\u0010\u009a\u0001\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0007J\u0011\u0010\u009b\u0001\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0007J\u0011\u0010\u009c\u0001\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0007J\u0015\u0010\u009f\u0001\u001a\u00020!2\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u0001H\u0007J\u0011\u0010 \u0001\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0007R\u0018\u0010¡\u0001\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u008c\u0001R\u0018\u0010£\u0001\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0003\u0010¢\u0001R\u0019\u0010¤\u0001\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010¢\u0001R\u0018\u0010¥\u0001\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010¢\u0001R\u0019\u0010§\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010¦\u0001R\u0017\u0010¬\u0001\u001a\u0005\u0018\u00010ª\u00018G¢\u0006\b\u001a\u0006\b¢\u0001\u0010«\u0001R\u0015\u0010®\u0001\u001a\u00030ª\u00018G¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010«\u0001R\u001f\u0010³\u0001\u001a\u00020\u00048FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010¶\u0001\u001a\u0004\u0018\u00010.8G¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0014\u0010¸\u0001\u001a\u00020\u00048G¢\u0006\b\u001a\u0006\b·\u0001\u0010°\u0001¨\u0006º\u0001"}, d2 = {"Lcom/facebook/internal/j0;", "", "", "c", "", "Y", "", "s", "X", "valueIfNullOrEmpty", CampaignEx.JSON_KEY_AD_K, C3426d4.i.W, "h0", "", "bytes", "z0", "A0", "algorithm", "M", "N", "Ljava/security/MessageDigest;", "hash", "L", "authority", "path", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", "g", "queryString", "j0", "b", "value", "Lmj/r;", "l0", ContainerActivity.BUNDLE, "k0", "Ljava/io/Closeable;", "closeable", "j", "Ljava/net/URLConnection;", "connection", "q", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "F", "Lorg/json/JSONObject;", "jsonObject", "", "n", "o", "Lorg/json/JSONArray;", "jsonArray", "", InneractiveMediationDefs.GENDER_MALE, "nonJSONPropertyKey", "K", "Ljava/io/InputStream;", "inputStream", "n0", "Ljava/io/OutputStream;", "outputStream", "", "p", C3426d4.j.D, "h", "i", "tag", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "d0", NotificationCompat.CATEGORY_MESSAGE, "e0", "", "t", "f0", "T", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "b0", "", "a0", "map", "g0", "str", "c0", "params", "Lcom/facebook/internal/b;", "attributionIdentifiers", "anonymousAppDeviceGUID", "limitEventUsage", "x0", "v", "appContext", "y0", "Ljava/lang/Class;", "clazz", "methodName", "", "parameterTypes", "Ljava/lang/reflect/Method;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "H", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "receiver", "method", "args", "O", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "Z", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "contentUri", "", VastAttributes.HORIZONTAL_POSITION, "Ljava/util/Date;", "dateBase", "w", "Landroid/os/Parcel;", "parcel", "C0", "o0", "B0", "m0", "Lcom/facebook/AccessToken;", "token", "tokenGraphDomain", "B", "accessToken", "Lcom/facebook/internal/j0$a;", "callback", "D", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/facebook/GraphRequest;", "C", "graphDomain", "I", "z", "q0", "t0", "u0", "s0", "r", "p0", "v0", "", "l", "d", ExifInterface.LONGITUDE_WEST, "length", "i0", "Q", "R", "Ljava/lang/Runnable;", "runnable", "w0", "u", "numCPUCores", "J", "timestampOfLastCheck", "totalExternalStorageGB", "availableExternalStorageGB", "Ljava/lang/String;", "deviceTimezoneAbbreviation", "deviceTimeZoneName", "carrierName", "Ljava/util/Locale;", "()Ljava/util/Locale;", "resourceLocale", VastAttributes.VERTICAL_POSITION, "currentLocale", "P", "()Z", "isAutoAppLinkSetup$annotations", "()V", "isAutoAppLinkSetup", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lorg/json/JSONObject;", "dataProcessingOptions", "U", "isDataProcessingRestricted", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static int numCPUCores;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f14425a = new j0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static long timestampOfLastCheck = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static long totalExternalStorageGB = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static long availableExternalStorageGB = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static String deviceTimezoneAbbreviation = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static String deviceTimeZoneName = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static String carrierName = "NoCarrier";

    /* JADX INFO: compiled from: Utility.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/facebook/internal/j0$a;", "", "Lorg/json/JSONObject;", "userInfo", "Lmj/r;", "a", "Lcom/facebook/FacebookException;", "error", "b", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a(JSONObject jSONObject);

        void b(FacebookException facebookException);
    }

    public static final boolean P() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            ck.w wVar = ck.w.f6066a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{q1.t.m()}, 1));
            ck.p.i(str, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextL = q1.t.l();
            PackageManager packageManager = contextL.getPackageManager();
            String packageName = contextL.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ck.p.i(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (ck.p.e(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean S(Uri uri) {
        return uri != null && lk.x.E("content", uri.getScheme(), true);
    }

    public static final boolean V(Uri uri) {
        return uri != null && lk.x.E(C3426d4.i.f28530b, uri.getScheme(), true);
    }

    public static final boolean X(String s10) {
        if (s10 != null) {
            if (!(s10.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Z(Uri uri) {
        return uri != null && (lk.x.E("http", uri.getScheme(), true) || lk.x.E("https", uri.getScheme(), true) || lk.x.E("fbstaging", uri.getScheme(), true));
    }

    public static final String n0(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i10 = inputStreamReader.read(cArr);
                        if (i10 == -1) {
                            String string = sb2.toString();
                            ck.p.i(string, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            j(bufferedInputStream);
                            j(inputStreamReader);
                            return string;
                        }
                        sb2.append(cArr, 0, i10);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
        }
    }

    public final boolean W(Context context) {
        Method methodH = H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodH == null) {
            return false;
        }
        Object objO = O(null, methodH, context);
        return (objO instanceof Integer) && ck.p.e(objO, 0);
    }

    public static final JSONObject A() {
        if (i2.a.d(j0.class)) {
            return null;
        }
        try {
            String string = q1.t.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, j0.class);
            return null;
        }
    }

    public static final String A0(String key) {
        if (key == null) {
            return null;
        }
        return f14425a.M("SHA-256", key);
    }

    public static final void B0(Parcel parcel, Map<String, String> map) {
        ck.p.j(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final void C0(Parcel parcel, Map<String, String> map) {
        ck.p.j(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final void D(final String str, final a aVar) {
        ck.p.j(str, "accessToken");
        ck.p.j(aVar, "callback");
        JSONObject jSONObjectA = f0.a(str);
        if (jSONObjectA != null) {
            aVar.a(jSONObjectA);
            return;
        }
        GraphRequest.b bVar = new GraphRequest.b() { // from class: com.facebook.internal.h0
            @Override // com.facebook.GraphRequest.b
            public final void b(q1.z zVar) {
                j0.E(aVar, str, zVar);
            }
        };
        GraphRequest graphRequestC = f14425a.C(str);
        graphRequestC.C(bVar);
        graphRequestC.l();
    }

    public static final void E(a aVar, String str, q1.z zVar) {
        ck.p.j(aVar, "$callback");
        ck.p.j(str, "$accessToken");
        ck.p.j(zVar, "response");
        if (zVar.getError() != null) {
            aVar.b(zVar.getError().getException());
            return;
        }
        f0 f0Var = f0.f14391a;
        JSONObject jSONObjectD = zVar.getJsonObject();
        if (jSONObjectD == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        f0.b(str, jSONObjectD);
        aVar.a(zVar.getJsonObject());
    }

    public static final String F(Context context) {
        k0.k(context, GAMConfig.KEY_CONTEXT);
        return q1.t.m();
    }

    public static final Method G(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        ck.p.j(clazz, "clazz");
        ck.p.j(methodName, "methodName");
        ck.p.j(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method H(String className, String methodName, Class<?>... parameterTypes) {
        ck.p.j(className, "className");
        ck.p.j(methodName, "methodName");
        ck.p.j(parameterTypes, "parameterTypes");
        try {
            Class<?> cls = Class.forName(className);
            ck.p.i(cls, "clazz");
            return G(cls, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object K(JSONObject jsonObject, String key, String nonJSONPropertyKey) throws JSONException {
        ck.p.j(jsonObject, "jsonObject");
        Object objOpt = jsonObject.opt(key);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (nonJSONPropertyKey == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(nonJSONPropertyKey, objOpt);
        return jSONObject;
    }

    public static final Object O(Object receiver, Method method, Object... args) {
        ck.p.j(method, "method");
        ck.p.j(args, "args");
        try {
            return method.invoke(receiver, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean Q(Context context) {
        AutofillManager autofillManager;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static final boolean R(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            ck.p.i(str, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").matches(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean T(AccessToken token) {
        return token != null && ck.p.e(token, AccessToken.INSTANCE.e());
    }

    public static final boolean U() {
        if (i2.a.d(j0.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectA = A();
            if (jSONObjectA == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectA.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        ck.p.i(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        ck.p.i(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (ck.p.e(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 < length) {
                            i10 = i11;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            i2.a.b(th2, j0.class);
            return false;
        }
    }

    public static final boolean Y(Collection<?> c10) {
        return c10 == null || c10.isEmpty();
    }

    public static final Set<String> a0(JSONArray jsonArray) throws JSONException {
        ck.p.j(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                ck.p.i(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    public static final List<String> b0(JSONArray jsonArray) throws JSONException {
        ck.p.j(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jsonArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static final Map<String, String> c0(String str) {
        ck.p.j(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                ck.p.i(next, C3426d4.i.W);
                String string = jSONObject.getString(next);
                ck.p.i(string, "jsonObject.getString(key)");
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final <T> boolean e(T a10, T b10) {
        if (a10 == null) {
            return b10 == null;
        }
        return ck.p.e(a10, b10);
    }

    public static final JSONObject f(String accessToken) {
        ck.p.j(accessToken, "accessToken");
        JSONObject jSONObjectA = f0.a(accessToken);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        q1.z zVarK = f14425a.C(accessToken).k();
        if (zVarK.getError() != null) {
            return null;
        }
        return zVarK.getJsonObject();
    }

    public static final Uri g(String authority, String path, Bundle parameters) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(authority);
        builder.path(path);
        if (parameters != null) {
            for (String str : parameters.keySet()) {
                Object obj = parameters.get(str);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        ck.p.i(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static final String g0(Map<String, String> map) {
        ck.p.j(map, "map");
        String string = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                string = jSONObject.toString();
            } catch (JSONException unused) {
            }
            ck.p.i(string, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return string;
    }

    public static final String h0(String key) {
        ck.p.j(key, C3426d4.i.W);
        return f14425a.M(SameMD5.TAG, key);
    }

    public static final void i(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            j0 j0Var = f14425a;
            j0Var.h(context, "facebook.com");
            j0Var.h(context, ".facebook.com");
            j0Var.h(context, "https://facebook.com");
            j0Var.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final boolean i0(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return Q(context);
    }

    public static final void j(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final Bundle j0(String queryString) {
        Bundle bundle = new Bundle();
        if (!X(queryString)) {
            if (queryString == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Object[] array = lk.a0.N0(queryString, new String[]{C3426d4.j.f28584c}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                Object[] array2 = lk.a0.N0(str, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    d0("FacebookSDK", e10);
                }
            }
        }
        return bundle;
    }

    public static final boolean k0(Bundle bundle, String key, Object value) {
        ck.p.j(bundle, ContainerActivity.BUNDLE);
        if (value == null) {
            bundle.remove(key);
            return true;
        }
        if (value instanceof Boolean) {
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
            return true;
        }
        if (value instanceof boolean[]) {
            bundle.putBooleanArray(key, (boolean[]) value);
            return true;
        }
        if (value instanceof Double) {
            bundle.putDouble(key, ((Number) value).doubleValue());
            return true;
        }
        if (value instanceof double[]) {
            bundle.putDoubleArray(key, (double[]) value);
            return true;
        }
        if (value instanceof Integer) {
            bundle.putInt(key, ((Number) value).intValue());
            return true;
        }
        if (value instanceof int[]) {
            bundle.putIntArray(key, (int[]) value);
            return true;
        }
        if (value instanceof Long) {
            bundle.putLong(key, ((Number) value).longValue());
            return true;
        }
        if (value instanceof long[]) {
            bundle.putLongArray(key, (long[]) value);
            return true;
        }
        if (value instanceof String) {
            bundle.putString(key, (String) value);
            return true;
        }
        if (value instanceof JSONArray) {
            bundle.putString(key, ((JSONArray) value).toString());
            return true;
        }
        if (!(value instanceof JSONObject)) {
            return false;
        }
        bundle.putString(key, ((JSONObject) value).toString());
        return true;
    }

    public static final void l0(Bundle bundle, String str, String str2) {
        ck.p.j(bundle, "b");
        if (X(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final List<String> m(JSONArray jsonArray) {
        ck.p.j(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int length = jsonArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                ck.p.i(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i11 >= length) {
                    return arrayList;
                }
                i10 = i11;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final Map<String, String> m0(Parcel parcel) {
        ck.p.j(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        int i11 = 0;
        if (i10 > 0) {
            do {
                i11++;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    map.put(string, string2);
                }
            } while (i11 < i10);
        }
        return map;
    }

    public static final Map<String, Object> n(JSONObject jsonObject) {
        ck.p.j(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames == null) {
            return map;
        }
        int i10 = 0;
        int length = jSONArrayNames.length();
        if (length > 0) {
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = jSONArrayNames.getString(i10);
                    ck.p.i(string, "keys.getString(i)");
                    Object objN = jsonObject.get(string);
                    if (objN instanceof JSONObject) {
                        objN = n((JSONObject) objN);
                    }
                    ck.p.i(objN, "value");
                    map.put(string, objN);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return map;
    }

    public static final Map<String, String> o(JSONObject jsonObject) {
        ck.p.j(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jsonObject.optString(next);
            if (strOptString != null) {
                ck.p.i(next, C3426d4.i.W);
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final Map<String, String> o0(Parcel parcel) {
        ck.p.j(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        int i11 = 0;
        if (i10 > 0) {
            do {
                i11++;
                map.put(parcel.readString(), parcel.readString());
            } while (i11 < i10);
        }
        return map;
    }

    public static final int p(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ck.p.j(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int i11 = bufferedInputStream2.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i11);
                    i10 += i11;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i10;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final boolean r0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final String s(int length) {
        String string = new BigInteger(length * 5, new Random()).toString(32);
        ck.p.i(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }

    public static final String t(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        ck.p.i(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final String u(Context context) {
        String string;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            String strN = q1.t.n();
            if (strN != null) {
                return strN;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                ck.p.i(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date w(Bundle bundle, String key, Date dateBase) {
        long jLongValue;
        ck.p.j(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(key);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (jLongValue * 1000));
    }

    public static final long x(Uri contentUri) {
        ck.p.j(contentUri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = q1.t.l().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j10 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j10;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public static final void x0(JSONObject jSONObject, b bVar, String str, boolean z10, Context context) throws JSONException {
        ck.p.j(jSONObject, "params");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        FeatureManager featureManager = FeatureManager.f14322a;
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.g(feature)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z10);
        jSONObject.put("advertiser_id_collection_enabled", q1.t.k());
        if (bVar != null) {
            if (FeatureManager.g(feature)) {
                f14425a.c(jSONObject, bVar, str, context);
            }
            if (bVar.getAttributionId() != null) {
                if (FeatureManager.g(feature)) {
                    f14425a.d(jSONObject, bVar, context);
                } else {
                    jSONObject.put(C3444e4.f28728c, bVar.getAttributionId());
                }
            }
            if (bVar.h() != null) {
                jSONObject.put("advertiser_id", bVar.h());
                jSONObject.put("advertiser_tracking_enabled", !bVar.getIsTrackingLimited());
            }
            if (!bVar.getIsTrackingLimited()) {
                String strB = com.facebook.appevents.a0.b();
                if (!(strB.length() == 0)) {
                    jSONObject.put("ud", strB);
                }
            }
            if (bVar.getAndroidInstallerPackage() != null) {
                jSONObject.put("installer_package", bVar.getAndroidInstallerPackage());
            }
        }
    }

    public static final void y0(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i10;
        ck.p.j(jSONObject, "params");
        ck.p.j(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f14425a.t0(context);
        String packageName = context.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i12 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d10 = 0.0d;
        try {
            Object systemService = context.getSystemService("display");
            Display display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i13 = displayMetrics.widthPixels;
                try {
                    i11 = displayMetrics.heightPixels;
                    d10 = displayMetrics.density;
                } catch (Exception unused3) {
                }
                i10 = i11;
                i11 = i13;
            } else {
                i10 = 0;
            }
        } catch (Exception unused4) {
        }
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f14425a.q0());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String z0(byte[] bytes) {
        ck.p.j(bytes, "bytes");
        return f14425a.N(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, bytes);
    }

    public final GraphRequest C(String accessToken) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", I(z()));
        bundle.putString("access_token", accessToken);
        GraphRequest graphRequestY = GraphRequest.INSTANCE.y(null, null);
        graphRequestY.G(bundle);
        graphRequestY.F(HttpMethod.GET);
        return graphRequestY;
    }

    public final String I(String graphDomain) {
        return ck.p.e(graphDomain, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public final String M(String algorithm, String key) {
        Charset charset = lk.c.f63591b;
        if (key == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = key.getBytes(charset);
        ck.p.i(bytes, "(this as java.lang.String).getBytes(charset)");
        return N(algorithm, bytes);
    }

    public final void c(JSONObject jSONObject, b bVar, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !W(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (bVar.getIsTrackingLimited()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public final void d(JSONObject jSONObject, b bVar, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !W(context)) {
            jSONObject.put(C3444e4.f28728c, bVar.getAttributionId());
        } else {
            if (bVar.getIsTrackingLimited()) {
                return;
            }
            jSONObject.put(C3444e4.f28728c, bVar.getAttributionId());
        }
    }

    public final long l(double bytes) {
        return Math.round(bytes / 1.073741824E9d);
    }

    public final int q0() {
        int i10 = numCPUCores;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.i0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return j0.r0(file, str);
                }
            });
            if (fileArrListFiles != null) {
                numCPUCores = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (numCPUCores <= 0) {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    public final void s0(Context context) {
        if (ck.p.e(carrierName, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                ck.p.i(networkOperatorName, "telephonyManager.networkOperatorName");
                carrierName = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public final void t0(Context context) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= 1800000) {
            timestampOfLastCheck = System.currentTimeMillis();
            u0();
            s0(context);
            v0();
            p0();
        }
    }

    public final String z() {
        AccessToken accessTokenE = AccessToken.INSTANCE.e();
        return (accessTokenE == null || accessTokenE.getGraphDomain() == null) ? "facebook" : accessTokenE.getGraphDomain();
    }

    public static final String B(String tokenGraphDomain) {
        String strU = q1.t.u();
        if (tokenGraphDomain == null) {
            return strU;
        }
        if (ck.p.e(tokenGraphDomain, "gaming")) {
            return lk.x.N(strU, "facebook.com", "fb.gg", false, 4, null);
        }
        if (ck.p.e(tokenGraphDomain, "instagram")) {
            return lk.x.N(strU, "facebook.com", "instagram.com", false, 4, null);
        }
        return strU;
    }

    public static final Locale J() {
        try {
            return q1.t.l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void d0(String str, Exception exc) {
        if (q1.t.D() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
        }
    }

    public static final void e0(String str, String str2) {
        if (q1.t.D() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    public static final void f0(String str, String str2, Throwable th2) {
        if (q1.t.D() && !X(str)) {
            Log.d(str, str2, th2);
        }
    }

    public static final String k(String s10, String valueIfNullOrEmpty) {
        if (X(s10)) {
            return valueIfNullOrEmpty;
        }
        return s10;
    }

    public static final String v() {
        Context contextL = q1.t.l();
        if (contextL == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextL.getPackageManager().getPackageInfo(contextL.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final void w0(Runnable runnable) {
        try {
            q1.t.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final Locale y() {
        Locale localeJ = J();
        if (localeJ == null) {
            Locale locale = Locale.getDefault();
            ck.p.i(locale, "getDefault()");
            return locale;
        }
        return localeJ;
    }

    public final String L(MessageDigest hash, byte[] bytes) {
        hash.update(bytes);
        byte[] bArrDigest = hash.digest();
        StringBuilder sb2 = new StringBuilder();
        ck.p.i(bArrDigest, "digest");
        int length = bArrDigest.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArrDigest[i10];
            i10++;
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString((b10 >> 0) & 15));
        }
        String string = sb2.toString();
        ck.p.i(string, "builder.toString()");
        return string;
    }

    public final String N(String algorithm, byte[] bytes) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            ck.p.i(messageDigest, "hash");
            return L(messageDigest, bytes);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final void h(Context context, String str) {
        int i10;
        boolean z10;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = lk.a0.N0(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                String str2 = strArr[i11];
                i11++;
                Object[] array2 = lk.a0.N0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
                        String str3 = strArr2[0];
                        int length2 = str3.length() - 1;
                        int i12 = 0;
                        boolean z11 = false;
                        while (i12 <= length2) {
                            if (!z11) {
                                i10 = i12;
                            } else {
                                i10 = length2;
                            }
                            if (ck.p.l(str3.charAt(i10), 32) <= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z11) {
                                if (!z10) {
                                    z11 = true;
                                } else {
                                    i12++;
                                }
                            } else if (!z10) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        cookieManager.setCookie(str, ck.p.s(str3.subSequence(i12, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void p0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            availableExternalStorageGB = l(availableExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    public final boolean r() {
        return ck.p.e("mounted", Environment.getExternalStorageState());
    }

    public final void u0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            ck.p.i(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            deviceTimezoneAbbreviation = displayName;
            String id2 = timeZone.getID();
            ck.p.i(id2, "tz.id");
            deviceTimeZoneName = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    public final void v0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            totalExternalStorageGB = l(totalExternalStorageGB);
        } catch (Exception unused) {
        }
    }
}
