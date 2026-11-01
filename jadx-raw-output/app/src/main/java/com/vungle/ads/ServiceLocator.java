package com.vungle.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import com.unity3d.services.core.fid.Constants;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.locale.LocaleInfo;
import com.vungle.ads.internal.locale.SystemLocaleInfo;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.task.JobCreator;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.JobRunnerThreadPriorityHelper;
import com.vungle.ads.internal.task.VungleJobCreator;
import com.vungle.ads.internal.task.VungleJobRunner;
import com.vungle.ads.internal.util.ConcurrencyTimeoutProvider;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mj.g;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J!\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J)\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R,\u0010\u0016\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0002\b\u00030\u0015R\u00020\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/ServiceLocator;", "", "T", "Ljava/lang/Class;", "serviceClass", "getOrBuild", "(Ljava/lang/Class;)Ljava/lang/Object;", "getServiceClass", "Lmj/r;", "buildCreators", "getService", "", "isCreated", NotificationCompat.CATEGORY_SERVICE, "bindService$vungle_ads_release", "(Ljava/lang/Class;Ljava/lang/Object;)V", "bindService", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "", "Lcom/vungle/ads/ServiceLocator$Creator;", "creators", "Ljava/util/Map;", "cache", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", VastTagName.COMPANION, "Creator", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ServiceLocator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ServiceLocator INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, Creator<?>> creators;
    private final Context ctx;

    /* JADX INFO: compiled from: ServiceLocator.kt */
    @Keep
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\bJ\u0006\u0010\n\u001a\u00020\tR*\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/ServiceLocator$Companion;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/ServiceLocator;", Constants.GET_INSTANCE, "T", "Lmj/g;", "inject", "Lmj/r;", "deInit", "INSTANCE", "Lcom/vungle/ads/ServiceLocator;", "getINSTANCE$vungle_ads_release", "()Lcom/vungle/ads/ServiceLocator;", "setINSTANCE$vungle_ads_release", "(Lcom/vungle/ads/ServiceLocator;)V", "getINSTANCE$vungle_ads_release$annotations", "()V", "<init>", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }

        public final synchronized void deInit() {
            setINSTANCE$vungle_ads_release(null);
        }

        public final ServiceLocator getInstance(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            ServiceLocator iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
            if (iNSTANCE$vungle_ads_release == null) {
                synchronized (this) {
                    Companion companion = ServiceLocator.INSTANCE;
                    ServiceLocator iNSTANCE$vungle_ads_release2 = companion.getINSTANCE$vungle_ads_release();
                    if (iNSTANCE$vungle_ads_release2 == null) {
                        iNSTANCE$vungle_ads_release2 = new ServiceLocator(context, null);
                        companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release2);
                    }
                    iNSTANCE$vungle_ads_release = iNSTANCE$vungle_ads_release2;
                }
            }
            return iNSTANCE$vungle_ads_release;
        }

        public final /* synthetic */ <T> g<T> inject(final Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            p.o();
            return kotlin.b.b(lazyThreadSafetyMode, new bk.a<T>() { // from class: com.vungle.ads.ServiceLocator$Companion$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final T invoke() {
                    ServiceLocator companion = ServiceLocator.INSTANCE.getInstance(context);
                    p.p(4, "T");
                    return (T) companion.getService(Object.class);
                }
            });
        }

        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        public final void setINSTANCE$vungle_ads_release(ServiceLocator serviceLocator) {
            ServiceLocator.INSTANCE = serviceLocator;
        }
    }

    /* JADX INFO: compiled from: ServiceLocator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b¢\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/vungle/ads/ServiceLocator$Creator;", "T", "", "isSingleton", "", "(Lcom/vungle/ads/ServiceLocator;Z)V", "()Z", "create", "()Ljava/lang/Object;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public abstract class Creator<T> {
        private final boolean isSingleton;

        public Creator(boolean z10) {
            this.isSingleton = z10;
        }

        public abstract T create();

        public /* synthetic */ Creator(ServiceLocator serviceLocator, boolean z10, int i10, i iVar) {
            this((i10 & 1) != 0 ? true : z10);
        }

        /* JADX INFO: renamed from: isSingleton, reason: from getter */
        public final boolean getIsSingleton() {
            return this.isSingleton;
        }
    }

    private ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        p.i(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }

    public /* synthetic */ ServiceLocator(Context context, i iVar) {
        this(context);
    }

    public final synchronized <T> T getService(Class<T> serviceClass) {
        p.j(serviceClass, "serviceClass");
        return (T) getOrBuild(serviceClass);
    }

    public final synchronized <T> boolean isCreated(Class<T> serviceClass) {
        p.j(serviceClass, "serviceClass");
        return this.cache.containsKey(getServiceClass(serviceClass));
    }

    private final void buildCreators() {
        this.creators.put(JobCreator.class, new Creator<JobCreator>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.1
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobCreator create() {
                return new VungleJobCreator(ServiceLocator.this.ctx, (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class));
            }
        });
        this.creators.put(JobRunner.class, new Creator<JobRunner>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.2
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobRunner create() {
                return new VungleJobRunner((JobCreator) ServiceLocator.this.getOrBuild(JobCreator.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getJOB_EXECUTOR(), new JobRunnerThreadPriorityHelper());
            }
        });
        this.creators.put(VungleApiClient.class, new Creator<VungleApiClient>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.3
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public VungleApiClient create() {
                return new VungleApiClient(ServiceLocator.this.ctx, (Platform) ServiceLocator.this.getOrBuild(Platform.class), (FilePreferences) ServiceLocator.this.getOrBuild(FilePreferences.class));
            }
        });
        this.creators.put(Platform.class, new Creator<Platform>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.4
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Platform create() {
                return new AndroidPlatform(ServiceLocator.this.ctx, ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getUA_EXECUTOR(), null, null, 12, null);
            }
        });
        this.creators.put(Executors.class, new Creator<Executors>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.5
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Executors create() {
                return new SDKExecutors();
            }
        });
        this.creators.put(OMInjector.class, new Creator<OMInjector>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.6
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMInjector create() {
                return new OMInjector(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(OMTracker.Factory.class, new Creator<OMTracker.Factory>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.7
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMTracker.Factory create() {
                return new OMTracker.Factory();
            }
        });
        this.creators.put(FilePreferences.class, new Creator<FilePreferences>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.8
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public FilePreferences create() {
                return FilePreferences.Companion.get$default(FilePreferences.INSTANCE, ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getIO_EXECUTOR(), (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class), null, 4, null);
            }
        });
        this.creators.put(LocaleInfo.class, new Creator<LocaleInfo>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.9
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public LocaleInfo create() {
                return new SystemLocaleInfo();
            }
        });
        this.creators.put(BidTokenEncoder.class, new Creator<BidTokenEncoder>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.10
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public BidTokenEncoder create() {
                return new BidTokenEncoder(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(PathProvider.class, new Creator<PathProvider>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.11
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public PathProvider create() {
                return new PathProvider(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(Downloader.class, new Creator<Downloader>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.12
            {
                super(false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Downloader create() {
                return new AssetDownloader(((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getDOWNLOADER_EXECUTOR(), (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class));
            }
        });
        this.creators.put(ConcurrencyTimeoutProvider.class, new Creator<ConcurrencyTimeoutProvider>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.13
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public ConcurrencyTimeoutProvider create() {
                return new ConcurrencyTimeoutProvider();
            }
        });
        this.creators.put(SignalManager.class, new Creator<SignalManager>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.14
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public SignalManager create() {
                return new SignalManager(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(TpatSender.class, new Creator<TpatSender>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.15
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public TpatSender create() {
                return new TpatSender((VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getIO_EXECUTOR(), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getJOB_EXECUTOR(), (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class), (SignalManager) ServiceLocator.this.getOrBuild(SignalManager.class));
            }
        });
    }

    private final Class<?> getServiceClass(Class<?> serviceClass) {
        for (Class<?> cls : this.creators.keySet()) {
            if (cls.isAssignableFrom(serviceClass)) {
                return cls;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + serviceClass);
    }

    @VisibleForTesting
    public final <T> void bindService$vungle_ads_release(Class<?> serviceClass, T service) {
        p.j(serviceClass, "serviceClass");
        this.cache.put(serviceClass, service);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getOrBuild(Class<T> serviceClass) {
        Class<?> serviceClass2 = getServiceClass(serviceClass);
        T t10 = (T) this.cache.get(serviceClass2);
        if (t10 == null) {
            Creator<?> creator = this.creators.get(serviceClass2);
            if (creator != null) {
                T t11 = (T) creator.create();
                if (creator.getIsSingleton()) {
                    this.cache.put(serviceClass2, t11);
                }
                return t11;
            }
            throw new IllegalArgumentException("Unknown class");
        }
        return t10;
    }
}
