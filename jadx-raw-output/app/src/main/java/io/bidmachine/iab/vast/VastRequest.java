package io.bidmachine.iab.vast;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.processor.DefaultMediaPicker;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.processor.VastMediaPicker;
import io.bidmachine.iab.vast.processor.VastProcessor;
import io.bidmachine.iab.vast.processor.VastProcessorResult;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class VastRequest {

    @NonNull
    public static final String PARAMS_ERROR_CODE = "params_error_code";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f59435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VastAd f59436d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f59438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VastMediaPicker f59439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private VastVideoLoadedListener f59440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private VastAdMeasurer f59441i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Float f59443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f59444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f59445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f59446n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f59448p;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final VastUrlProcessorRegistry.OnUrlReadyCallback f59432z = new k();
    private static int A = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CacheControl f59434b = CacheControl.FullLoad;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VideoType f59437e = VideoType.NonRewarded;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f59442j = 3.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f59447o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f59449q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f59450r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f59451s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f59452t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f59453u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f59454v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f59455w = 5.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f59456x = new AtomicBoolean(false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f59457y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59433a = UUID.randomUUID().toString();

    public class Builder {
        public Builder() {
        }

        public Builder addExtra(@NonNull String str, @Nullable String str2) {
            VastRequest.this.addExtra(str, str2);
            return this;
        }

        @NonNull
        public VastRequest build() {
            return VastRequest.this;
        }

        public Builder forceUseNativeCloseTime(boolean z10) {
            VastRequest.this.f59445m = z10;
            return this;
        }

        public Builder setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
            VastRequest.this.f59441i = vastAdMeasurer;
            return this;
        }

        public Builder setAutoClose(boolean z10) {
            VastRequest.this.f59448p = z10;
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            VastRequest.this.f59434b = cacheControl;
            return this;
        }

        public Builder setCompanionCloseTime(int i10) {
            VastRequest.this.f59444l = i10;
            return this;
        }

        public Builder setMaxDuration(int i10) {
            VastRequest.this.f59446n = i10;
            return this;
        }

        public Builder setMediaFilePicker(@Nullable VastMediaPicker<MediaFileTag> vastMediaPicker) {
            VastRequest.this.f59439g = vastMediaPicker;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f10) {
            VastRequest.this.f59442j = f10;
            return this;
        }

        public Builder setPreloadCompanion(boolean z10) {
            VastRequest.this.f59451s = z10;
            return this;
        }

        public Builder setUseScreenSizeForCompanionOrientation(boolean z10) {
            VastRequest.this.f59450r = z10;
            return this;
        }

        public Builder setUseScreenSizeForVideoOrientation(boolean z10) {
            VastRequest.this.f59449q = z10;
            return this;
        }

        public Builder setVideoCloseTime(int i10) {
            VastRequest.this.f59443k = Float.valueOf(i10);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59459a;

        static {
            int[] iArr = new int[CacheControl.values().length];
            f59459a = iArr;
            try {
                iArr[CacheControl.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59459a[CacheControl.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59459a[CacheControl.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f59460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f59461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f59462c;

        public b(String str, VastRequestListener vastRequestListener, Context context) {
            this.f59460a = str;
            this.f59461b = vastRequestListener;
            this.f59462c = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new URL(this.f59460a).openStream()));
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line != null) {
                                stringBuffer.append(line);
                                stringBuffer.append(System.getProperty("line.separator"));
                            } else {
                                try {
                                    break;
                                } catch (IOException unused) {
                                }
                            }
                        }
                        bufferedReader2.close();
                        VastRequest.this.loadVideoWithData(this.f59462c, stringBuffer.toString(), this.f59461b);
                    } catch (Exception e10) {
                        e = e10;
                        bufferedReader = bufferedReader2;
                        VastLog.e("VastRequest", e);
                        VastRequest.this.sendVastSpecError(VastSpecError.XML_PARSING);
                        VastRequest.this.a(IabError.throwable("Exception during loading xml by url", e), this.f59461b);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f59464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f59465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f59466c;

        public c(Context context, String str, VastRequestListener vastRequestListener) {
            this.f59464a = context;
            this.f59465b = str;
            this.f59466c = vastRequestListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            VastRequest.this.loadVideoWithDataSync(this.f59464a, this.f59465b, this.f59466c);
        }
    }

    public class d extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f59468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f59469b;

        public d(Context context, VastRequestListener vastRequestListener) {
            this.f59468a = context;
            this.f59469b = vastRequestListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            VastRequest vastRequest = VastRequest.this;
            vastRequest.a(this.f59468a, vastRequest.f59436d, this.f59469b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f59471a;

        public e(VastRequestListener vastRequestListener) {
            this.f59471a = vastRequestListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59471a.onVastLoaded(VastRequest.this);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IabError f59473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f59474b;

        public f(IabError iabError, VastRequestListener vastRequestListener) {
            this.f59473a = iabError;
            this.f59474b = vastRequestListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastRequestListener vastRequestListener;
            VastRequest vastRequest;
            IabError iabErrorExpired;
            if (VastRequest.this.f59441i != null) {
                VastRequest.this.f59441i.onError(this.f59473a);
            }
            if (this.f59474b != null) {
                if (VastRequest.this.f59434b == CacheControl.PartialLoad && VastRequest.this.f59456x.get() && !VastRequest.this.f59457y.get()) {
                    vastRequestListener = this.f59474b;
                    vastRequest = VastRequest.this;
                    iabErrorExpired = IabError.expired(String.format("%s load failed after display - %s", vastRequest.f59434b, this.f59473a));
                } else {
                    vastRequestListener = this.f59474b;
                    vastRequest = VastRequest.this;
                    iabErrorExpired = this.f59473a;
                }
                vastRequestListener.onVastLoadFailed(vastRequest, iabErrorExpired);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastActivityListener f59476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IabError f59477b;

        public g(VastActivityListener vastActivityListener, IabError iabError) {
            this.f59476a = vastActivityListener;
            this.f59477b = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastActivityListener vastActivityListener = this.f59476a;
            if (vastActivityListener != null) {
                vastActivityListener.onVastShowFailed(VastRequest.this, this.f59477b);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastViewListener f59479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VastView f59480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IabError f59481c;

        public h(VastViewListener vastViewListener, VastView vastView, IabError iabError) {
            this.f59479a = vastViewListener;
            this.f59480b = vastView;
            this.f59481c = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VastViewListener vastViewListener = this.f59479a;
            if (vastViewListener != null) {
                vastViewListener.onShowFailed(this.f59480b, VastRequest.this, this.f59481c);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VastAd f59483a;

        public i(VastAd vastAd) {
            this.f59483a = vastAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastRequest.this.f59440h != null) {
                VastRequest.this.f59440h.onSuccess(VastRequest.this, this.f59483a);
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IabError f59485a;

        public j(IabError iabError) {
            this.f59485a = iabError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastRequest.this.f59440h != null) {
                VastRequest.this.f59440h.onError(VastRequest.this, this.f59485a);
            }
        }
    }

    public static class k implements VastUrlProcessorRegistry.OnUrlReadyCallback {
        @Override // io.bidmachine.iab.vast.VastUrlProcessorRegistry.OnUrlReadyCallback
        public void onUrlReady(String str) {
            VastLog.d("VastRequest", "Fire url: %s", str);
            Utils.simpleTrackUrl(str);
        }
    }

    public static class l implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f59487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f59488b;

        public l(File file) {
            this.f59488b = file;
            this.f59487a = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j10 = this.f59487a;
            long j11 = ((l) obj).f59487a;
            if (j10 > j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }
    }

    private VastRequest() {
    }

    public static Builder newBuilder() {
        return new VastRequest().new Builder();
    }

    public static void setCacheSize(int i10) {
        if (i10 > 0) {
            A = i10;
        }
    }

    public void addExtra(String str, String str2) {
        if (this.f59438f == null) {
            this.f59438f = new Bundle();
        }
        this.f59438f.putString(str, str2);
    }

    public boolean canDisplay() {
        return this.f59456x.get() && (this.f59434b != CacheControl.FullLoad || checkFile());
    }

    public boolean checkFile() {
        try {
            Uri uri = this.f59435c;
            return (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(this.f59435c.getPath()).exists()) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void destroy() {
        this.f59440h = null;
        VastRequestManager.a(this);
    }

    public void display(@NonNull Context context, @NonNull VideoType videoType, @Nullable VastActivityListener vastActivityListener) {
        display(context, videoType, vastActivityListener, null, null, null);
    }

    public void fireErrorUrls(@Nullable List<String> list, @Nullable Bundle bundle) {
        fireUrls(list, bundle);
    }

    public void fireUrls(@Nullable List<String> list, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f59438f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            VastUrlProcessorRegistry.processUrls(list, bundle2, f59432z);
        } else {
            VastLog.d("VastRequest", "Url list is null", new Object[0]);
        }
    }

    @NonNull
    public CacheControl getCacheControl() {
        return this.f59434b;
    }

    public float getCompanionCloseTime() {
        return this.f59444l;
    }

    @Nullable
    public Uri getFileUri() {
        return this.f59435c;
    }

    public int getForceOrientation() {
        return this.f59454v;
    }

    public float getFusedVideoCloseTimeSec() {
        return this.f59455w;
    }

    @NonNull
    public String getId() {
        return this.f59433a;
    }

    public int getMaxDurationMillis() {
        return this.f59446n;
    }

    public float getPlaceholderTimeoutSec() {
        return this.f59442j;
    }

    public int getPreferredVideoOrientation() {
        if (!shouldUseScreenSizeForVideoOrientation()) {
            return 0;
        }
        VastAd vastAd = this.f59436d;
        if (vastAd == null) {
            return 2;
        }
        MediaFileTag pickedMediaFileTag = vastAd.getPickedMediaFileTag();
        return Utils.orientationBySize(pickedMediaFileTag.getWidth(), pickedMediaFileTag.getHeight());
    }

    public int getRequestedOrientation() {
        return this.f59447o;
    }

    @Nullable
    public VastAd getVastAd() {
        return this.f59436d;
    }

    @Nullable
    public Float getVideoCloseTime() {
        return this.f59443k;
    }

    @NonNull
    public VideoType getVideoType() {
        return this.f59437e;
    }

    public boolean isAutoClose() {
        return this.f59448p;
    }

    public boolean isForceUseNativeCloseTime() {
        return this.f59445m;
    }

    public boolean isR1() {
        return this.f59452t;
    }

    public boolean isR2() {
        return this.f59453u;
    }

    public void loadVideoWithData(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        IabError iabErrorThrowable;
        VastLog.d("VastRequest", "loadVideoWithData\n%s", str);
        this.f59436d = null;
        if (Utils.isNetworkAvailable(context)) {
            try {
                new c(context, str, vastRequestListener).start();
                return;
            } catch (Exception e10) {
                VastLog.e("VastRequest", e10);
                iabErrorThrowable = IabError.throwable("Exception during creating background thread", e10);
            }
        } else {
            iabErrorThrowable = IabError.NO_NETWORK;
        }
        a(iabErrorThrowable, vastRequestListener);
    }

    public void loadVideoWithDataSync(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        String str2;
        VastMediaPicker defaultMediaPicker = this.f59439g;
        if (defaultMediaPicker == null) {
            defaultMediaPicker = new DefaultMediaPicker(context);
        }
        VastProcessorResult vastProcessorResultProcess = new VastProcessor(this, defaultMediaPicker).process(str);
        VastAd vastAd = vastProcessorResultProcess.getVastAd();
        this.f59436d = vastAd;
        if (vastAd == null) {
            VastSpecError vastSpecError = vastProcessorResultProcess.getVastSpecError();
            if (vastSpecError != null) {
                sendVastSpecError(vastSpecError);
                str2 = String.format("VastAd is null during loadVideoWithDataSync with VastSpecCode - %s", Integer.valueOf(vastSpecError.getCode()));
            } else {
                str2 = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            a(IabError.badContent(str2), vastRequestListener);
            return;
        }
        vastAd.setVastRequest(this);
        AppodealExtensionTag appodealExtension = this.f59436d.getAppodealExtension();
        if (appodealExtension != null) {
            Boolean boolIsAutoRotate = appodealExtension.isAutoRotate();
            if (boolIsAutoRotate != null) {
                if (boolIsAutoRotate.booleanValue()) {
                    this.f59449q = false;
                    this.f59450r = false;
                } else {
                    this.f59449q = true;
                    this.f59450r = true;
                }
            }
            if (appodealExtension.getPostBannerTag().getCloseTimeSec() > 0.0f) {
                this.f59444l = appodealExtension.getPostBannerTag().getCloseTimeSec();
            }
            this.f59452t = appodealExtension.isR1();
            this.f59453u = appodealExtension.isR2();
            Integer forceOrientation = appodealExtension.getForceOrientation();
            if (forceOrientation != null) {
                this.f59454v = forceOrientation.intValue();
            }
        }
        this.f59455w = a(this.f59436d, appodealExtension).floatValue();
        VastAdMeasurer vastAdMeasurer = this.f59441i;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.onVastModelLoaded(this);
        }
        int i10 = a.f59459a[this.f59434b.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                a(vastRequestListener);
                return;
            } else if (i10 != 3) {
                return;
            } else {
                a(vastRequestListener);
            }
        }
        a(context, this.f59436d, vastRequestListener);
    }

    public void loadVideoWithUrl(@NonNull Context context, @NonNull String str, @Nullable VastRequestListener vastRequestListener) {
        IabError iabErrorThrowable;
        VastLog.d("VastRequest", "loadVideoWithUrl - %s", str);
        this.f59436d = null;
        if (Utils.isNetworkAvailable(context)) {
            try {
                new b(str, vastRequestListener, context).start();
                return;
            } catch (Exception e10) {
                VastLog.e("VastRequest", e10);
                iabErrorThrowable = IabError.throwable("Exception during creating background thread", e10);
            }
        } else {
            iabErrorThrowable = IabError.NO_NETWORK;
        }
        a(iabErrorThrowable, vastRequestListener);
    }

    public void performCache(@NonNull Context context, @Nullable VastRequestListener vastRequestListener) {
        if (this.f59436d == null) {
            a(IabError.internal("VastAd is null during performCache"), vastRequestListener);
            return;
        }
        try {
            new d(context, vastRequestListener).start();
        } catch (Exception e10) {
            VastLog.e("VastRequest", e10);
            a(IabError.throwable("Exception during creating background thread", e10), vastRequestListener);
        }
    }

    public void sendVastSpecError(@NonNull VastSpecError vastSpecError) {
        VastLog.d("VastRequest", "sendVastSpecError - %s", vastSpecError);
        try {
            if (this.f59436d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(PARAMS_ERROR_CODE, vastSpecError.getCode());
                fireErrorUrls(this.f59436d.getErrorUrlList(), bundle);
            }
        } catch (Exception e10) {
            VastLog.e("VastRequest", e10);
        }
    }

    public synchronized void setVastVideoLoadedListener(@Nullable VastVideoLoadedListener vastVideoLoadedListener) {
        this.f59440h = vastVideoLoadedListener;
    }

    public boolean shouldPreloadCompanion() {
        return this.f59451s;
    }

    public boolean shouldUseScreenSizeForCompanionOrientation() {
        return this.f59450r;
    }

    public boolean shouldUseScreenSizeForVideoOrientation() {
        return this.f59449q;
    }

    public void display(@NonNull Context context, @NonNull VideoType videoType, @Nullable VastActivityListener vastActivityListener, @Nullable VastView vastView, @Nullable VastPlaybackListener vastPlaybackListener, @Nullable MraidAdMeasurer mraidAdMeasurer) {
        VastLog.d("VastRequest", "display", new Object[0]);
        this.f59457y.set(true);
        if (this.f59436d == null) {
            a(IabError.internal("VastAd is null during display VastActivity"), vastActivityListener);
            return;
        }
        this.f59437e = videoType;
        this.f59447o = context.getResources().getConfiguration().orientation;
        IabError iabErrorDisplay = new VastActivity.Builder().setRequest(this).setListener(vastActivityListener).setVastView(vastView).setPlaybackListener(vastPlaybackListener).setAdMeasurer(this.f59441i).setPostBannerAdMeasurer(mraidAdMeasurer).display(context);
        if (iabErrorDisplay != null) {
            a(iabErrorDisplay, vastActivityListener);
        }
    }

    public void display(@NonNull VastView vastView) {
        this.f59457y.set(true);
        if (this.f59436d == null) {
            a(IabError.internal("VastAd is null during display VastView"), vastView, vastView.getListener());
            return;
        }
        this.f59437e = VideoType.NonRewarded;
        VastRequestManager.store(this);
        vastView.display(this, Boolean.FALSE);
    }

    private String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    private Uri a(Context context, String str) throws IOException {
        String strB = b(context);
        if (strB == null) {
            throw new FileNotFoundException("No dir for caching file");
        }
        File file = new File(strB);
        if (!file.exists()) {
            file.mkdirs();
        }
        int length = 230 - file.getPath().length();
        String str2 = "temp" + System.currentTimeMillis();
        String strReplace = str.substring(0, Math.min(length, str.length())).replace("/", "").replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "");
        File file2 = new File(file, strReplace);
        if (file2.exists()) {
            return Uri.fromFile(file2);
        }
        File file3 = new File(file, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        long contentLength = httpURLConnection.getContentLength();
        long j10 = 0;
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
        fileOutputStream.close();
        if (contentLength != j10) {
            throw new IllegalStateException("The downloaded file size does not match the stated size");
        }
        file3.renameTo(new File(file, strReplace));
        return Uri.fromFile(new File(file, strReplace));
    }

    private void a(Context context) {
        File[] fileArrListFiles;
        try {
            String strB = b(context);
            if (strB == null || (fileArrListFiles = new File(strB).listFiles()) == null || fileArrListFiles.length <= A) {
                return;
            }
            l[] lVarArr = new l[fileArrListFiles.length];
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                lVarArr[i10] = new l(fileArrListFiles[i10]);
            }
            Arrays.sort(lVarArr);
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                fileArrListFiles[i11] = lVarArr[i11].f59488b;
            }
            for (int i12 = A; i12 < fileArrListFiles.length; i12++) {
                if (!Uri.fromFile(fileArrListFiles[i12]).equals(this.f59435c)) {
                    fileArrListFiles[i12].delete();
                }
            }
        } catch (Exception e10) {
            VastLog.e("VastRequest", e10);
        }
    }

    private Float a(VastAd vastAd, VastExtension vastExtension) {
        Float closeTimeSec = vastExtension != null ? vastExtension.getCloseTimeSec() : null;
        if (isForceUseNativeCloseTime()) {
            closeTimeSec = Utils.max(closeTimeSec, getVideoCloseTime());
        }
        Float fMin = Utils.min(closeTimeSec, vastAd.getDurationSec());
        return fMin == null ? Float.valueOf(5.0f) : fMin;
    }

    private synchronized void a(IabError iabError) {
        if (this.f59440h == null) {
            return;
        }
        Utils.onUiThread(new j(iabError));
    }

    private synchronized void a(VastAd vastAd) {
        if (this.f59440h == null) {
            return;
        }
        Utils.onUiThread(new i(vastAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, VastAd vastAd, VastRequestListener vastRequestListener) {
        String str;
        IabError iabErrorBadContent;
        try {
            Uri uriA = a(context, vastAd.getPickedMediaFileTag().getText());
            if (uriA != null && !TextUtils.isEmpty(uriA.getPath()) && new File(uriA.getPath()).exists()) {
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(uriA.getPath(), 1);
                if (bitmapCreateVideoThumbnail != null) {
                    if (bitmapCreateVideoThumbnail.equals(Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), bitmapCreateVideoThumbnail.getConfig()))) {
                        VastLog.d("VastRequest", "Empty thumbnail", new Object[0]);
                        sendVastSpecError(VastSpecError.BAD_FILE);
                        str = "Thumbnail is empty";
                    } else {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(context, uriA);
                            long j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            int i10 = this.f59446n;
                            if (i10 == 0 || j10 <= i10) {
                                this.f59435c = uriA;
                                a(vastAd);
                                a(vastRequestListener);
                            } else {
                                sendVastSpecError(VastSpecError.DURATION);
                                a(IabError.badContent("Estimated duration does not match actual duration"), vastRequestListener);
                            }
                        } catch (Exception e10) {
                            VastLog.e("VastRequest", e10);
                            sendVastSpecError(VastSpecError.BAD_FILE);
                            iabErrorBadContent = IabError.throwable("Exception during metadata retrieval", e10);
                            a(iabErrorBadContent, vastRequestListener);
                        }
                    }
                    a(context);
                    return;
                }
                VastLog.d("VastRequest", "Video file not supported", new Object[0]);
                sendVastSpecError(VastSpecError.BAD_FILE);
                str = "Failed to get thumbnail by file URI";
                iabErrorBadContent = IabError.badContent(str);
                a(iabErrorBadContent, vastRequestListener);
                a(context);
                return;
            }
            VastLog.d("VastRequest", "fileUri is null", new Object[0]);
            sendVastSpecError(VastSpecError.BAD_URI);
            a(IabError.badContent("Can't find video by local URI"), vastRequestListener);
        } catch (Exception e11) {
            VastLog.e("VastRequest", e11);
            sendVastSpecError(VastSpecError.BAD_URI);
            a(IabError.throwable("Exception during caching media file", e11), vastRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError, VastRequestListener vastRequestListener) {
        VastLog.d("VastRequest", "sendLoadFailed - %s", iabError);
        a(iabError);
        Utils.onUiThread(new f(iabError, vastRequestListener));
    }

    private void a(VastRequestListener vastRequestListener) {
        if (this.f59456x.getAndSet(true)) {
            return;
        }
        VastLog.d("VastRequest", "sendLoaded", new Object[0]);
        if (vastRequestListener != null) {
            Utils.onUiThread(new e(vastRequestListener));
        }
    }

    private void a(IabError iabError, VastActivityListener vastActivityListener) {
        VastLog.d("VastRequest", "sendShowFailed - %s", iabError);
        Utils.onUiThread(new g(vastActivityListener, iabError));
    }

    private void a(IabError iabError, VastView vastView, VastViewListener vastViewListener) {
        VastLog.d("VastRequest", "sendShowFailed - %s", iabError);
        Utils.onUiThread(new h(vastViewListener, vastView, iabError));
    }
}
