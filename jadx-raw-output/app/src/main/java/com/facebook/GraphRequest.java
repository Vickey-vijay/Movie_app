package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.graphics.drawable.IconCompat;
import androidx.exifinterface.media.ExifInterface;
import ck.i;
import ck.p;
import ck.w;
import com.facebook.GraphRequest;
import com.facebook.internal.a0;
import com.facebook.internal.g0;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.vungle.ads.internal.ui.AdActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import lk.c;
import me.goldze.mvvmhabit.base.ContainerActivity;
import nj.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.d0;
import q1.f0;
import q1.t;
import q1.x;
import q1.y;
import q1.z;

/* JADX INFO: compiled from: GraphRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u00052\u00020\u0001:\b\u001d$,37;mCBQ\b\u0017\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010[\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bk\u0010lJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J$\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u00020\u0004H\u0016R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R$\u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\"\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010P\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010S\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\bQ\u0010'\"\u0004\bR\u0010)R.\u0010U\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR.\u0010b\u001a\u0004\u0018\u00010[2\b\u0010\\\u001a\u0004\u0018\u00010[8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010<R\u0018\u0010d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0016\u0010f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010'R\u0011\u0010h\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bg\u0010'R\u0011\u0010j\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bi\u0010'¨\u0006n"}, d2 = {"Lcom/facebook/GraphRequest;", "", "Lmj/r;", "i", "", "n", "p", "baseUrl", "", "isBatch", "j", VastAttributes.VERTICAL_POSITION, "I", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z", "Lorg/json/JSONArray;", "batch", "", "Lcom/facebook/GraphRequest$a;", "attachments", "B", "forceOverride", "D", "Lq1/z;", CampaignEx.JSON_KEY_AD_K, "Lq1/x;", "l", "toString", "Lcom/facebook/AccessToken;", "a", "Lcom/facebook/AccessToken;", InneractiveMediationDefs.GENDER_MALE, "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "accessToken", "b", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "setGraphPath", "(Ljava/lang/String;)V", "graphPath", "Lorg/json/JSONObject;", "c", "Lorg/json/JSONObject;", "q", "()Lorg/json/JSONObject;", ExifInterface.LONGITUDE_EAST, "(Lorg/json/JSONObject;)V", "graphObject", "d", "getBatchEntryName", "setBatchEntryName", "batchEntryName", "e", "getBatchEntryDependsOn", "setBatchEntryDependsOn", "batchEntryDependsOn", InneractiveMediationDefs.GENDER_FEMALE, "Z", "getBatchEntryOmitResultOnSuccess", "()Z", "setBatchEntryOmitResultOnSuccess", "(Z)V", "batchEntryOmitResultOnSuccess", "Landroid/os/Bundle;", "g", "Landroid/os/Bundle;", "u", "()Landroid/os/Bundle;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Landroid/os/Bundle;)V", "parameters", "h", "Ljava/lang/Object;", "w", "()Ljava/lang/Object;", "H", "(Ljava/lang/Object;)V", "tag", "getVersion", "setVersion", "version", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest$b;", "o", "()Lcom/facebook/GraphRequest$b;", "C", "(Lcom/facebook/GraphRequest$b;)V", "Lcom/facebook/HttpMethod;", "value", "Lcom/facebook/HttpMethod;", "t", "()Lcom/facebook/HttpMethod;", "F", "(Lcom/facebook/HttpMethod;)V", "httpMethod", "forceApplicationRequest", "overriddenURL", "s", "graphPathWithVersion", "v", "relativeUrlForBatchedRequest", VastAttributes.HORIZONTAL_POSITION, "urlForSingleRequest", "<init>", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$b;Ljava/lang/String;)V", "ParcelableResourceWithMimeType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class GraphRequest {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f14091o = GraphRequest.class.getSimpleName();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f14092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f14093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f14094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile String f14095s;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public AccessToken accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String graphPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public JSONObject graphObject;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String batchEntryName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String batchEntryDependsOn;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean batchEntryOmitResultOnSuccess;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Bundle parameters;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Object tag;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public String version;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public b callback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public HttpMethod httpMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean forceApplicationRequest;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public String overriddenURL;

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u0011*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "Lmj/r;", "writeToParcel", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "mimeType", "Landroid/os/Parcelable;", "d", "()Landroid/os/Parcelable;", "resource", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "source", "(Landroid/os/Parcel;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String mimeType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final RESOURCE resource;
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new a();

        /* JADX INFO: compiled from: GraphRequest.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?> createFromParcel(Parcel source) {
                p.j(source, "source");
                return new ParcelableResourceWithMimeType<>(source, (i) null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType<?>[] newArray(int size) {
                return new ParcelableResourceWithMimeType[size];
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, i iVar) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        public final RESOURCE d() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            p.j(parcel, "out");
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i10);
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(t.l().getClassLoader());
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/facebook/GraphRequest$a;", "", "Lcom/facebook/GraphRequest;", "a", "Lcom/facebook/GraphRequest;", "()Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final GraphRequest request;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Object value;

        public a(GraphRequest graphRequest, Object obj) {
            p.j(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
            this.request = graphRequest;
            this.value = obj;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GraphRequest getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$b;", "", "Lq1/z;", "response", "Lmj/r;", "b", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface b {
        void b(z zVar);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequest$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0082\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J:\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J(\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\bH\u0002J \u0010'\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010&\u001a\u00020%H\u0002J$\u0010+\u001a\u00020\f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u001c\u001a\u00020$H\u0002J2\u0010.\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020$2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0,2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0-H\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u0006H\u0002J\u0012\u00101\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u00102\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u00103\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J\u001c\u00108\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0007J0\u0010;\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001042\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u00107\u001a\u0004\u0018\u00010:H\u0007J0\u0010=\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001042\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010<\u001a\u0004\u0018\u00010\"2\b\u00107\u001a\u0004\u0018\u00010:H\u0007J&\u0010>\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001042\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u00107\u001a\u0004\u0018\u00010:H\u0007J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010A\u001a\u00020@2\u0006\u0010&\u001a\u00020%H\u0007J)\u0010D\u001a\b\u0012\u0004\u0012\u00020@0C2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0B\"\u00020%H\u0007¢\u0006\u0004\bD\u0010EJ\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020@0C2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0,H\u0007J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020@0C2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J#\u0010I\u001a\u00020H2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0B\"\u00020%H\u0007¢\u0006\u0004\bI\u0010JJ\u0016\u0010K\u001a\u00020H2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0,H\u0007J\u0010\u0010L\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001e\u0010M\u001a\b\u0012\u0004\u0012\u00020@0C2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J%\u0010O\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010N\u001a\b\u0012\u0004\u0012\u00020@0CH\u0001¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001e\u0010X\u001a\u0004\u0018\u00010\u00168B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010VR\u0014\u0010[\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010YR\u0014\u0010\\\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010YR\u0014\u0010]\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010YR\u0014\u0010^\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010YR\u0014\u0010_\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010YR\u0014\u0010`\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010YR\u0014\u0010a\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010YR\u0014\u0010b\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010YR\u0014\u0010c\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010YR\u0014\u0010d\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010YR\u0014\u0010e\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010YR\u0014\u0010f\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010YR\u0014\u0010g\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010YR\u0014\u0010h\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010YR\u0014\u0010i\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010YR\u0014\u0010j\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010YR\u0014\u0010k\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010YR\u0014\u0010l\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010YR\u0014\u0010m\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010YR\u0014\u0010n\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010YR\u0014\u0010o\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010YR\u0014\u0010p\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010YR\u0014\u0010q\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010YR\u0014\u0010r\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\br\u0010YR\u0014\u0010s\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bs\u0010YR\u0014\u0010t\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u0010YR\u0014\u0010u\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bu\u0010YR\u0014\u0010v\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010+R\u0014\u0010w\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bw\u0010YR\u0014\u0010x\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010YR\u0014\u0010y\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\by\u0010YR\u0014\u0010z\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010YR\u0014\u0010{\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b{\u0010YR\u0014\u0010|\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010YR\u0014\u0010}\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010YR\u0014\u0010~\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010YR&\u0010\u0080\u0001\u001a\n \u007f*\u0004\u0018\u00010\u00160\u00168\u0000X\u0081\u0004¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010Y\u0012\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010YR\u0016\u0010\u0084\u0001\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010YR\u0016\u0010\u0085\u0001\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010YR\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010YR!\u0010\u0088\u0001\u001a\f \u007f*\u0005\u0018\u00010\u0087\u00010\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/facebook/GraphRequest$c;", "", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "g", "Lq1/y;", "requests", "", "s", "connection", "shouldUseGzip", "Lmj/r;", "M", "t", "Lcom/facebook/internal/a0;", "logger", "", "numRequests", "Ljava/io/OutputStream;", "outputStream", "F", "", "path", "u", "Lorg/json/JSONObject;", "graphObject", "Lcom/facebook/GraphRequest$e;", "serializer", "D", C3426d4.i.W, "value", "passByValue", ExifInterface.LONGITUDE_EAST, "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "J", "", "Lcom/facebook/GraphRequest$a;", "attachments", "I", "", "", "K", "batch", "p", "v", "w", "C", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$d;", "callback", VastAttributes.VERTICAL_POSITION, "graphPath", "Lcom/facebook/GraphRequest$b;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "parameters", "B", VastAttributes.HORIZONTAL_POSITION, "N", "Lq1/z;", "h", "", "", CampaignEx.JSON_KEY_AD_K, "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "i", "j", "Lq1/x;", "n", "([Lcom/facebook/GraphRequest;)Lq1/x;", "l", InneractiveMediationDefs.GENDER_MALE, "o", "responses", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Lq1/y;Ljava/util/List;)V", "O", "(Lq1/y;)V", "L", "(Lq1/y;Ljava/net/HttpURLConnection;)V", "q", "()Ljava/lang/String;", "mimeContentType", "userAgent", "Ljava/lang/String;", "r", "ACCEPT_LANGUAGE_HEADER", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", "SEARCH", "kotlin.jvm.PlatformType", "TAG", "getTAG$facebook_core_release$annotations", "()V", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "Ljava/util/regex/Pattern;", "versionPattern", "Ljava/util/regex/Pattern;", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static final void H(ArrayList arrayList, y yVar) {
            p.j(arrayList, "$callbacks");
            p.j(yVar, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                p.i(obj, "pair.second");
                bVar.b((z) obj);
            }
            Iterator<y.a> it2 = yVar.p().iterator();
            while (it2.hasNext()) {
                it2.next().b(yVar);
            }
        }

        public static final void z(d dVar, z zVar) {
            p.j(zVar, "response");
            if (dVar == null) {
                return;
            }
            dVar.a(zVar.getGraphObject(), zVar);
        }

        public final GraphRequest A(AccessToken accessToken, String graphPath, JSONObject graphObject, b callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, graphPath, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.E(graphObject);
            return graphRequest;
        }

        public final GraphRequest B(AccessToken accessToken, String graphPath, Bundle parameters, b callback) {
            return new GraphRequest(accessToken, graphPath, parameters, HttpMethod.POST, callback, null, 32, null);
        }

        public final String C(Object value) {
            if (value instanceof String) {
                return (String) value;
            }
            if ((value instanceof Boolean) || (value instanceof Number)) {
                return value.toString();
            }
            if (!(value instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) value);
            p.i(str, "iso8601DateFormat.format(value)");
            return str;
        }

        public final void F(y yVar, a0 a0Var, int i10, URL url, OutputStream outputStream, boolean z10) throws JSONException, IOException {
            g gVar = new g(outputStream, a0Var, z10);
            if (i10 != 1) {
                String strP = p(yVar);
                if (strP.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                gVar.a("batch_app_id", strP);
                HashMap map = new HashMap();
                K(gVar, yVar, map);
                if (a0Var != null) {
                    a0Var.b("  Attachments:\n");
                }
                I(map, gVar);
                return;
            }
            GraphRequest graphRequestM = yVar.get(0);
            HashMap map2 = new HashMap();
            for (String str : graphRequestM.getParameters().keySet()) {
                Object obj = graphRequestM.getParameters().get(str);
                if (v(obj)) {
                    p.i(str, C3426d4.i.W);
                    map2.put(str, new a(graphRequestM, obj));
                }
            }
            if (a0Var != null) {
                a0Var.b("  Parameters:\n");
            }
            J(graphRequestM.getParameters(), gVar, graphRequestM);
            if (a0Var != null) {
                a0Var.b("  Attachments:\n");
            }
            I(map2, gVar);
            JSONObject graphObject = graphRequestM.getGraphObject();
            if (graphObject != null) {
                String path = url.getPath();
                p.i(path, "url.path");
                D(graphObject, path, gVar);
            }
        }

        public final void G(final y requests, List<z> responses) {
            p.j(requests, "requests");
            p.j(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    GraphRequest graphRequestM = requests.get(i10);
                    if (graphRequestM.getCallback() != null) {
                        arrayList.add(new Pair(graphRequestM.getCallback(), responses.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: q1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.H(arrayList, requests);
                    }
                };
                Handler handlerO = requests.getCallbackHandler();
                if ((handlerO == null ? null : Boolean.valueOf(handlerO.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        public final void K(g gVar, Collection<GraphRequest> collection, Map<String, a> map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = collection.iterator();
            while (it.hasNext()) {
                it.next().B(jSONArray, map);
            }
            gVar.l("batch", jSONArray, collection);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00f2  */
        public final void L(y requests, HttpURLConnection connection) throws Throwable {
            OutputStream gZIPOutputStream;
            p.j(requests, "requests");
            p.j(connection, "connection");
            a0 a0Var = new a0(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean zT = t(requests);
            OutputStream outputStream = null;
            HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            M(connection, zT);
            URL url = connection.getURL();
            a0Var.b("Request:\n");
            a0Var.d("Id", requests.getId());
            p.i(url, "url");
            a0Var.d("URL", url);
            Object requestMethod = connection.getRequestMethod();
            p.i(requestMethod, "connection.requestMethod");
            a0Var.d("Method", requestMethod);
            Object requestProperty = connection.getRequestProperty("User-Agent");
            p.i(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            a0Var.d("User-Agent", requestProperty);
            Object requestProperty2 = connection.getRequestProperty("Content-Type");
            p.i(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            a0Var.d("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.getTimeoutInMilliseconds());
            connection.setReadTimeout(requests.getTimeoutInMilliseconds());
            if (!(httpMethod == HttpMethod.POST)) {
                a0Var.e();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (zT) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = bufferedOutputStream;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    if (s(requests)) {
                        d0 d0Var = new d0(requests.getCallbackHandler());
                        F(requests, null, size, url, d0Var, zT);
                        gZIPOutputStream = new f0(gZIPOutputStream, requests, d0Var.k(), d0Var.getMaxProgress());
                    }
                    F(requests, a0Var, size, url, gZIPOutputStream, zT);
                    gZIPOutputStream.close();
                    a0Var.e();
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = gZIPOutputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        public final HttpURLConnection N(y requests) throws Throwable {
            p.j(requests, "requests");
            O(requests);
            try {
                HttpURLConnection httpURLConnectionG = null;
                try {
                    httpURLConnectionG = g(requests.size() == 1 ? new URL(requests.get(0).x()) : new URL(g0.h()));
                    L(requests, httpURLConnectionG);
                    return httpURLConnectionG;
                } catch (IOException e10) {
                    j0.q(httpURLConnectionG);
                    throw new FacebookException("could not construct request body", e10);
                } catch (JSONException e11) {
                    j0.q(httpURLConnectionG);
                    throw new FacebookException("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new FacebookException("could not construct URL for request", e12);
            }
        }

        public final void O(y requests) {
            p.j(requests, "requests");
            for (GraphRequest graphRequest : requests) {
                if (HttpMethod.GET == graphRequest.getHttpMethod()) {
                    j0 j0Var = j0.f14425a;
                    if (j0.X(graphRequest.getParameters().getString("fields"))) {
                        a0.Companion companion = a0.INSTANCE;
                        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GET requests for /");
                        String graphPath = graphRequest.getGraphPath();
                        if (graphPath == null) {
                            graphPath = "";
                        }
                        sb2.append(graphPath);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        companion.a(loggingBehavior, 5, "Request", sb2.toString());
                    }
                }
            }
        }

        public final z h(GraphRequest request) {
            p.j(request, AdActivity.REQUEST_KEY_EXTRA);
            List<z> listK = k(request);
            if (listK.size() == 1) {
                return listK.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        public final List<z> i(Collection<GraphRequest> requests) {
            p.j(requests, "requests");
            return j(new y(requests));
        }

        public final List<z> j(y requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionN;
            List<z> listO;
            p.j(requests, "requests");
            k0.j(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionN = N(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnectionN = null;
            } catch (Throwable th2) {
                th = th2;
                j0.q(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionN != null) {
                    listO = o(httpURLConnectionN, requests);
                } else {
                    List<z> listA = z.INSTANCE.a(requests.r(), null, new FacebookException(exc));
                    G(requests, listA);
                    listO = listA;
                }
                j0.q(httpURLConnectionN);
                return listO;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnectionN;
                j0.q(httpURLConnection);
                throw th;
            }
        }

        public final List<z> k(GraphRequest... requests) {
            p.j(requests, "requests");
            return i(n.q0(requests));
        }

        public final x l(Collection<GraphRequest> requests) {
            p.j(requests, "requests");
            return m(new y(requests));
        }

        public final x m(y requests) {
            p.j(requests, "requests");
            k0.j(requests, "requests");
            x xVar = new x(requests);
            xVar.executeOnExecutor(t.t(), new Void[0]);
            return xVar;
        }

        public final x n(GraphRequest... requests) {
            p.j(requests, "requests");
            return l(n.q0(requests));
        }

        public final List<z> o(HttpURLConnection connection, y requests) {
            p.j(connection, "connection");
            p.j(requests, "requests");
            List<z> listF = z.INSTANCE.f(connection, requests);
            j0.q(connection);
            int size = requests.size();
            if (size == listF.size()) {
                G(requests, listF);
                q1.f.INSTANCE.e().h();
                return listF;
            }
            w wVar = w.f6066a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listF.size()), Integer.valueOf(size)}, 2));
            p.i(str, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(str);
        }

        public final String q() {
            w wVar = w.f6066a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f14092p}, 1));
            p.i(str, "java.lang.String.format(format, *args)");
            return str;
        }

        public final boolean v(Object value) {
            return (value instanceof Bitmap) || (value instanceof byte[]) || (value instanceof Uri) || (value instanceof ParcelFileDescriptor) || (value instanceof ParcelableResourceWithMimeType);
        }

        public final boolean w(Object value) {
            return (value instanceof String) || (value instanceof Boolean) || (value instanceof Number) || (value instanceof Date);
        }

        public final GraphRequest x(AccessToken accessToken, String graphPath, b callback) {
            return new GraphRequest(accessToken, graphPath, null, null, callback, null, 32, null);
        }

        public final GraphRequest y(AccessToken accessToken, final d callback) {
            return new GraphRequest(accessToken, "me", null, null, new b() { // from class: q1.w
                @Override // com.facebook.GraphRequest.b
                public final void b(z zVar) {
                    GraphRequest.Companion.z(callback, zVar);
                }
            }, null, 32, null);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        public final void D(JSONObject jSONObject, String str, e eVar) {
            boolean z10;
            boolean z11;
            if (u(str)) {
                int iL0 = lk.a0.l0(str, StringUtils.PROCESS_POSTFIX_DELIMITER, 0, false, 6, null);
                int iL1 = lk.a0.l0(str, "?", 0, false, 6, null);
                if (iL0 > 3 && (iL1 == -1 || iL0 < iL1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (z10 && lk.x.E(next, "image", true)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p.i(next, C3426d4.i.W);
                p.i(objOpt, "value");
                E(next, objOpt, eVar, z11);
            }
        }

        public final void E(String str, Object obj, e eVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        w wVar = w.f6066a;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        p.i(str2, "java.lang.String.format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        p.i(objOpt, "jsonObject.opt(propertyName)");
                        E(str2, objOpt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    p.i(strOptString, "jsonObject.optString(\"id\")");
                    E(str, strOptString, eVar, z10);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    p.i(strOptString2, "jsonObject.optString(\"url\")");
                    E(str, strOptString2, eVar, z10);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        p.i(string, "jsonObject.toString()");
                        E(str, string, eVar, z10);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        w wVar2 = w.f6066a;
                        String str3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                        p.i(str3, "java.lang.String.format(locale, format, *args)");
                        Object objOpt2 = jSONArray.opt(i10);
                        p.i(objOpt2, "jsonArray.opt(i)");
                        E(str3, objOpt2, eVar, z10);
                        if (i11 < length) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                    if (Date.class.isAssignableFrom(cls)) {
                        String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                        p.i(str4, "iso8601DateFormat.format(date)");
                        eVar.a(str, str4);
                        return;
                    }
                    j0 j0Var = j0.f14425a;
                    j0.e0(GraphRequest.f14091o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                    return;
                }
                eVar.a(str, obj.toString());
            }
        }

        public final void I(Map<String, a> map, g gVar) throws IOException {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (GraphRequest.INSTANCE.v(entry.getValue().getValue())) {
                    gVar.j(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }

        public final void J(Bundle bundle, g gVar, GraphRequest graphRequest) throws IOException {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (w(obj)) {
                    p.i(str, C3426d4.i.W);
                    gVar.j(str, obj, graphRequest);
                }
            }
        }

        public final HttpURLConnection g(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestProperty("User-Agent", r());
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        public final String p(y batch) {
            String strN = batch.getBatchApplicationId();
            boolean z10 = true;
            if (strN != null && (!batch.isEmpty())) {
                return strN;
            }
            Iterator<GraphRequest> it = batch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.f14093q;
            if (str != null) {
                if (str.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    return str;
                }
            }
            return t.m();
        }

        public final String r() {
            if (GraphRequest.f14095s == null) {
                w wVar = w.f6066a;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "15.2.0"}, 2));
                p.i(str, "java.lang.String.format(format, *args)");
                GraphRequest.f14095s = str;
                String strA = com.facebook.internal.x.a();
                if (!j0.X(strA)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f14095s, strA}, 2));
                    p.i(str2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.f14095s = str2;
                }
            }
            return GraphRequest.f14095s;
        }

        public final boolean s(y requests) {
            Iterator<y.a> it = requests.p().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof y.c) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = requests.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean t(y requests) {
            for (GraphRequest graphRequest : requests) {
                Iterator<String> it = graphRequest.getParameters().keySet().iterator();
                while (it.hasNext()) {
                    if (v(graphRequest.getParameters().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean u(String path) {
            Matcher matcher = GraphRequest.f14094r.matcher(path);
            if (matcher.matches()) {
                path = matcher.group(1);
                p.i(path, "matcher.group(1)");
            }
            if (lk.x.R(path, "me/", false, 2, null) || lk.x.R(path, "/me/", false, 2, null)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$d;", "", "Lorg/json/JSONObject;", IconCompat.EXTRA_OBJ, "Lq1/z;", "response", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface d {
        void a(JSONObject jSONObject, z zVar);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$e;", "", "", C3426d4.i.W, "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface e {
        void a(String str, String str2);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$f;", "Lcom/facebook/GraphRequest$b;", "", VideoLookHistoryEntry.CURRNET, "max", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface f extends b {
        void a(long j10, long j11);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010*\u001a\u00020(\u0012\b\u0010.\u001a\u0004\u0018\u00010+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b7\u00108J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J \u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u001d\u001a\u00020\bJ$\u0010!\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002J-\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0016\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040#\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J-\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0016\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040#\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00100R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\u0018\u00106\u001a\u000603j\u0002`48BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u00105¨\u00069"}, d2 = {"Lcom/facebook/GraphRequest$g;", "Lcom/facebook/GraphRequest$e;", "", C3426d4.i.W, "", "value", "Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "Lmj/r;", "j", "Lorg/json/JSONArray;", "requestJsonArray", "", "requests", "l", "a", "Landroid/graphics/Bitmap;", "bitmap", "d", "", "bytes", "e", "Landroid/net/Uri;", "contentUri", "mimeType", "g", "Landroid/os/ParcelFileDescriptor;", "descriptor", "h", CampaignEx.JSON_KEY_AD_K, "name", "filename", "contentType", InneractiveMediationDefs.GENDER_FEMALE, "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", "i", "Ljava/io/OutputStream;", "Ljava/io/OutputStream;", "outputStream", "Lcom/facebook/internal/a0;", "b", "Lcom/facebook/internal/a0;", "logger", "", "Z", "firstWrite", "useUrlEncode", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()Ljava/lang/RuntimeException;", "invalidTypeError", "<init>", "(Ljava/io/OutputStream;Lcom/facebook/internal/a0;Z)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final OutputStream outputStream;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final a0 logger;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean firstWrite;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean useUrlEncode;

        public g(OutputStream outputStream, a0 a0Var, boolean z10) {
            p.j(outputStream, "outputStream");
            this.outputStream = outputStream;
            this.logger = a0Var;
            this.firstWrite = true;
            this.useUrlEncode = z10;
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String str, String str2) throws IOException {
            p.j(str, C3426d4.i.W);
            p.j(str2, "value");
            f(str, null, null);
            i("%s", str2);
            k();
            a0 a0Var = this.logger;
            if (a0Var == null) {
                return;
            }
            a0Var.d(p.s("    ", str), str2);
        }

        public final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void c(String format, Object... args) throws IOException {
            p.j(format, "format");
            p.j(args, "args");
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                w wVar = w.f6066a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                p.i(str, "java.lang.String.format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str, "UTF-8");
                p.i(strEncode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(c.f63591b);
                p.i(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.firstWrite) {
                OutputStream outputStream2 = this.outputStream;
                Charset charset = c.f63591b;
                byte[] bytes2 = "--".getBytes(charset);
                p.i(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.outputStream;
                String str2 = GraphRequest.f14092p;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str2.getBytes(charset);
                p.i(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.outputStream;
                byte[] bytes4 = "\r\n".getBytes(charset);
                p.i(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.firstWrite = false;
            }
            OutputStream outputStream5 = this.outputStream;
            w wVar2 = w.f6066a;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str3 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            p.i(str3, "java.lang.String.format(format, *args)");
            Charset charset2 = c.f63591b;
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes5 = str3.getBytes(charset2);
            p.i(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String str, Bitmap bitmap) throws IOException {
            p.j(str, C3426d4.i.W);
            p.j(bitmap, "bitmap");
            f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            i("", new Object[0]);
            k();
            a0 a0Var = this.logger;
            if (a0Var == null) {
                return;
            }
            a0Var.d(p.s("    ", str), "<Image>");
        }

        public final void e(String str, byte[] bArr) throws IOException {
            p.j(str, C3426d4.i.W);
            p.j(bArr, "bytes");
            f(str, str, "content/unknown");
            this.outputStream.write(bArr);
            i("", new Object[0]);
            k();
            a0 a0Var = this.logger;
            if (a0Var == null) {
                return;
            }
            String strS = p.s("    ", str);
            w wVar = w.f6066a;
            String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            p.i(str2, "java.lang.String.format(locale, format, *args)");
            a0Var.d(strS, str2);
        }

        public final void f(String str, String str2, String str3) throws IOException {
            if (!this.useUrlEncode) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.outputStream;
            w wVar = w.f6066a;
            String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            p.i(str4, "java.lang.String.format(format, *args)");
            Charset charset = c.f63591b;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str4.getBytes(charset);
            p.i(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void g(String str, Uri uri, String str2) throws IOException {
            int iP;
            p.j(str, C3426d4.i.W);
            p.j(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.outputStream instanceof d0) {
                ((d0) this.outputStream).f(j0.x(uri));
                iP = 0;
            } else {
                InputStream inputStreamOpenInputStream = t.l().getContentResolver().openInputStream(uri);
                j0 j0Var = j0.f14425a;
                iP = j0.p(inputStreamOpenInputStream, this.outputStream) + 0;
            }
            i("", new Object[0]);
            k();
            a0 a0Var = this.logger;
            if (a0Var == null) {
                return;
            }
            String strS = p.s("    ", str);
            w wVar = w.f6066a;
            String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iP)}, 1));
            p.i(str3, "java.lang.String.format(locale, format, *args)");
            a0Var.d(strS, str3);
        }

        public final void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int iP;
            p.j(str, C3426d4.i.W);
            p.j(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof d0) {
                ((d0) outputStream).f(parcelFileDescriptor.getStatSize());
                iP = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                j0 j0Var = j0.f14425a;
                iP = j0.p(autoCloseInputStream, this.outputStream) + 0;
            }
            i("", new Object[0]);
            k();
            a0 a0Var = this.logger;
            if (a0Var == null) {
                return;
            }
            String strS = p.s("    ", str);
            w wVar = w.f6066a;
            String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iP)}, 1));
            p.i(str3, "java.lang.String.format(locale, format, *args)");
            a0Var.d(strS, str3);
        }

        public final void i(String format, Object... args) throws IOException {
            p.j(format, "format");
            p.j(args, "args");
            c(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(String str, Object obj, GraphRequest graphRequest) throws IOException {
            p.j(str, C3426d4.i.W);
            Closeable closeable = this.outputStream;
            if (closeable instanceof q1.g0) {
                ((q1.g0) closeable).a(graphRequest);
            }
            Companion companion = GraphRequest.INSTANCE;
            if (companion.w(obj)) {
                a(str, companion.C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable parcelableD = parcelableResourceWithMimeType.d();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (parcelableD instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) parcelableD, mimeType);
            } else {
                if (!(parcelableD instanceof Uri)) {
                    throw b();
                }
                g(str, (Uri) parcelableD, mimeType);
            }
        }

        public final void k() throws IOException {
            if (!this.useUrlEncode) {
                i("--%s", GraphRequest.f14092p);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = C3426d4.j.f28584c.getBytes(c.f63591b);
            p.i(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws JSONException, IOException {
            p.j(str, C3426d4.i.W);
            p.j(jSONArray, "requestJsonArray");
            p.j(collection, "requests");
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof q1.g0)) {
                String string = jSONArray.toString();
                p.i(string, "requestJsonArray.toString()");
                a(str, string);
                return;
            }
            q1.g0 g0Var = (q1.g0) closeable;
            f(str, null, null);
            c(C3426d4.j.f28586d, new Object[0]);
            int i10 = 0;
            for (GraphRequest graphRequest : collection) {
                int i11 = i10 + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                g0Var.a(graphRequest);
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c(C3426d4.j.f28588e, new Object[0]);
            a0 a0Var = this.logger;
            if (a0Var == null) {
                return;
            }
            String strS = p.s("    ", str);
            String string2 = jSONArray.toString();
            p.i(string2, "requestJsonArray.toString()");
            a0Var.d(strS, string2);
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/GraphRequest$h", "Lcom/facebook/GraphRequest$e;", "", C3426d4.i.W, "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f14118a;

        public h(ArrayList<String> arrayList) {
            this.f14118a = arrayList;
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String str, String str2) throws IOException {
            p.j(str, C3426d4.i.W);
            p.j(str2, "value");
            ArrayList<String> arrayList = this.f14118a;
            w wVar = w.f6066a;
            String str3 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            p.i(str3, "java.lang.String.format(locale, format, *args)");
            arrayList.add(str3);
        }
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, b bVar, String str2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : accessToken, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : httpMethod, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        p.i(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        if (iNextInt > 0) {
            int i10 = 0;
            do {
                i10++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i10 < iNextInt);
        }
        String string = sb2.toString();
        p.i(string, "buffer.toString()");
        f14092p = string;
        f14094r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, b bVar, String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        C(bVar);
        F(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = t.w();
        }
    }

    public static final void b(b bVar, z zVar) {
        p.j(zVar, "response");
        JSONObject jSONObjectC = zVar.getGraphObject();
        JSONObject jSONObjectOptJSONObject = jSONObjectC == null ? null : jSONObjectC.optJSONObject("__debug__");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("messages");
        if (jSONArrayOptJSONArray != null) {
            int i10 = 0;
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    String strOptString = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("message");
                    String strOptString2 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("type");
                    String strOptString3 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("link");
                    if (strOptString != null && strOptString2 != null) {
                        LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                        if (p.e(strOptString2, "warning")) {
                            loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!j0.X(strOptString3)) {
                            strOptString = ((Object) strOptString) + " Link: " + ((Object) strOptString3);
                        }
                        a0.Companion companion = a0.INSTANCE;
                        String str = f14091o;
                        p.i(str, "TAG");
                        companion.b(loggingBehavior, str, strOptString);
                    }
                    if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.b(zVar);
    }

    public final void B(JSONArray jSONArray, Map<String, a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strV = v();
        jSONObject.put("relative_url", strV);
        jSONObject.put("method", this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            a0.INSTANCE.d(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.parameters.get(it.next());
            if (INSTANCE.v(obj)) {
                w wVar = w.f6066a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{C3426d4.i.f28530b, Integer.valueOf(map.size())}, 2));
                p.i(str3, "java.lang.String.format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(StringUtils.COMMA, arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            INSTANCE.D(jSONObject2, strV, new h(arrayList2));
            jSONObject.put("body", TextUtils.join(C3426d4.j.f28584c, arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public final void C(final b bVar) {
        t tVar = t.f66343a;
        if (t.H(LoggingBehavior.GRAPH_API_DEBUG_INFO) || t.H(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new b() { // from class: q1.u
                @Override // com.facebook.GraphRequest.b
                public final void b(z zVar) {
                    GraphRequest.b(bVar, zVar);
                }
            };
        } else {
            this.callback = bVar;
        }
    }

    public final void D(boolean z10) {
        this.forceApplicationRequest = z10;
    }

    public final void E(JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final void F(HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    public final void G(Bundle bundle) {
        p.j(bundle, "<set-?>");
        this.parameters = bundle;
    }

    public final void H(Object obj) {
        this.tag = obj;
    }

    public final void i() {
        Bundle bundle = this.parameters;
        if (I()) {
            bundle.putString("access_token", p());
        } else {
            String strN = n();
            if (strN != null) {
                bundle.putString("access_token", strN);
            }
        }
        if (!bundle.containsKey("access_token")) {
            j0 j0Var = j0.f14425a;
            if (j0.X(t.r())) {
                Log.w(f14091o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        t tVar = t.f66343a;
        if (t.H(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (t.H(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    public final String j(String baseUrl, boolean isBatch) {
        if (!isBatch && this.httpMethod == HttpMethod.POST) {
            return baseUrl;
        }
        Uri.Builder builderBuildUpon = Uri.parse(baseUrl).buildUpon();
        for (String str : this.parameters.keySet()) {
            Object obj = this.parameters.get(str);
            if (obj == null) {
                obj = "";
            }
            Companion companion = INSTANCE;
            if (companion.w(obj)) {
                builderBuildUpon.appendQueryParameter(str, companion.C(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                w wVar = w.f6066a;
                String str2 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                p.i(str2, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(str2);
            }
        }
        String string = builderBuildUpon.toString();
        p.i(string, "uriBuilder.toString()");
        return string;
    }

    public final z k() {
        return INSTANCE.h(this);
    }

    public final x l() {
        return INSTANCE.n(this);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final String n() {
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey("access_token")) {
                String token = accessToken.getToken();
                a0.INSTANCE.d(token);
                return token;
            }
        } else if (!this.parameters.containsKey("access_token")) {
            return p();
        }
        return this.parameters.getString("access_token");
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final b getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getGraphPath() {
        return this.graphPath;
    }

    public final String s() {
        if (f14094r.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        w wVar = w.f6066a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
        p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.graphPath);
        sb2.append(", graphObject: ");
        sb2.append(this.graphObject);
        sb2.append(", httpMethod: ");
        sb2.append(this.httpMethod);
        sb2.append(", parameters: ");
        sb2.append(this.parameters);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        String string = sb2.toString();
        p.i(string, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Bundle getParameters() {
        return this.parameters;
    }

    public final String v() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String strY = y(g0.h());
        i();
        Uri uri = Uri.parse(j(strY, true));
        w wVar = w.f6066a;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Object getTag() {
        return this.tag;
    }

    public final String x() {
        String strI;
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        if (this.httpMethod == HttpMethod.POST && str2 != null && lk.x.D(str2, "/videos", false, 2, null)) {
            strI = g0.j();
        } else {
            g0 g0Var = g0.f14401a;
            strI = g0.i(t.x());
        }
        String strY = y(strI);
        i();
        return j(strY, false);
    }

    public final boolean z() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(t.m());
        sb2.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb2.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    public final boolean A() {
        if (!p.e(t.x(), "instagram.com")) {
            return true;
        }
        return !z();
    }

    public final boolean I() {
        boolean zX;
        boolean z10;
        String strN = n();
        if (strN == null) {
            zX = false;
        } else {
            zX = lk.a0.X(strN, ImpressionLog.Q, false, 2, null);
        }
        if (strN != null && lk.x.R(strN, "IG", false, 2, null) && !zX) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && z()) {
            return true;
        }
        if (A() || zX) {
            return false;
        }
        return true;
    }

    public final String p() {
        boolean z10;
        String strM = t.m();
        String strR = t.r();
        boolean z11 = true;
        if (strM.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (strR.length() <= 0) {
                z11 = false;
            }
            if (z11) {
                return strM + '|' + strR;
            }
        }
        j0 j0Var = j0.f14425a;
        j0.e0(f14091o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    public final String y(String baseUrl) {
        if (!A()) {
            baseUrl = g0.f();
        }
        w wVar = w.f6066a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{baseUrl, s()}, 2));
        p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }
}
