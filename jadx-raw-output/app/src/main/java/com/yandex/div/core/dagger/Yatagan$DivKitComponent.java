package com.yandex.div.core.dagger;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedArrayMutationHandler;
import com.yandex.div.core.actions.DivActionTypedClearFocusHandler;
import com.yandex.div.core.actions.DivActionTypedCopyToClipboardHandler;
import com.yandex.div.core.actions.DivActionTypedDictSetValueHandler;
import com.yandex.div.core.actions.DivActionTypedFocusElementHandler;
import com.yandex.div.core.actions.DivActionTypedHandler;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.actions.DivActionTypedHideTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedScrollHandler;
import com.yandex.div.core.actions.DivActionTypedSetStateHandler;
import com.yandex.div.core.actions.DivActionTypedSetStoredValueHandler;
import com.yandex.div.core.actions.DivActionTypedSetVariableHandler;
import com.yandex.div.core.actions.DivActionTypedShowTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedSubmitHandler;
import com.yandex.div.core.actions.DivActionTypedTimerHandler;
import com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler;
import com.yandex.div.core.actions.DivActionTypedVideoHandler;
import com.yandex.div.core.actions.DivAnimatorTypedActionHandler;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.tooltip.DivTooltipViewBuilder;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ReportingSafeDrawingPassOverrideStrategy;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivValidator;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.ViewVisibilityCalculator;
import com.yandex.div.core.view2.animations.DivAnimatorController;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivLayoutParamsBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.state.DivStateCache;
import com.yandex.div.storage.DivStorageComponent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    public final Context mApplicationContext;
    private volatile Object mDivActionTypedHandlerCombinerInstance;
    public final DivKitConfiguration mDivKitConfiguration;
    private volatile Object mDivParsingHistogramReporterInstance;
    private volatile Object mDivStorageComponentInstance;
    private volatile Object mHistogramColdTypeCheckerInstance;
    private volatile Object mHistogramRecorderInstance;
    private volatile Object mSendBeaconManagerInstance;
    private volatile Object mViewCreatorInstance;

    /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
    public static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        private Context mApplicationContext;
        private DivKitConfiguration mConfiguration;

        private ComponentFactoryImpl() {
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder applicationContext(Context context) {
            this.mApplicationContext = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.mApplicationContext, this.mConfiguration);
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder configuration(DivKitConfiguration divKitConfiguration) {
            this.mConfiguration = divKitConfiguration;
            return this;
        }
    }

    /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
    public static final class Div2ComponentImpl implements Div2Component {
        private Object mAccessibilityStateProviderInstance;
        public final ContextThemeWrapper mBaseContext;
        private Object mBitmapEffectHelperInstance;
        private Object mDiv2BuilderInstance;
        private Object mDivActionBeaconSenderInstance;
        private Object mDivActionBinderInstance;
        private Object mDivBaseBinderInstance;
        private Object mDivBinderInstance;
        public final DivConfiguration mDivConfiguration;
        public final DivCreationTracker mDivCreationTracker;
        private Object mDivExtensionControllerInstance;
        private Object mDivImageLoaderInstance;
        private Object mDivImagePreloaderInstance;
        public final Yatagan$DivKitComponent mDivKitComponent;
        private Object mDivPatchCacheInstance;
        private Object mDivPatchManagerInstance;
        private Object mDivPlaceholderLoaderInstance;
        private Object mDivPreloaderInstance;
        private Object mDivRuntimeVisitorInstance;
        private Object mDivStateManagerInstance;
        private Object mDivTimerEventDispatcherProviderInstance;
        private Object mDivTooltipControllerInstance;
        private Object mDivTypefaceResolverInstance;
        private Object mDivValidatorInstance;
        public final DivVariableController mDivVariableController;
        private Object mDivVideoActionHandlerInstance;
        private Object mDivVideoViewMapperInstance;
        private Object mDivViewCreatorInstance;
        private Object mDivViewDataPreloaderInstance;
        private Object mDivViewIdProviderInstance;
        private Object mDivVisibilityActionDispatcherInstance;
        private Object mDivVisibilityActionTrackerInstance;
        private Object mErrorCollectorsInstance;
        private Object mHistogramReporterInstance;
        private Object mJavaxInjectNamedValueThemedContextContextInstance;
        private Object mPagerIndicatorConnectorInstance;
        private Object mPerformanceDependentSessionProfilerInstance;
        private Object mReleaseManagerInstance;
        private Object mRuntimeStoreProviderInstance;
        private Object mStoredValuesControllerInstance;
        private Object mTabsStateCacheInstance;
        private Object mTemporaryDivStateCacheInstance;
        public final Integer mThemeId;
        private Object mTwoWayIntegerVariableBinderInstance;
        private Object mTwoWayStringVariableBinderInstance;
        private Object mViewPoolInstance;
        private Object mViewPreCreationProfileRepositoryInstance;

        /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
        public static final class ComponentFactoryImpl implements Div2Component.Builder {
            public Yatagan$DivKitComponent fDivKitComponent;
            private ContextThemeWrapper mBaseContext;
            private DivConfiguration mConfiguration;
            private DivCreationTracker mDivCreationTracker;
            private DivVariableController mDivVariableController;
            private Integer mThemeId;

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder baseContext(ContextThemeWrapper contextThemeWrapper) {
                this.mBaseContext = contextThemeWrapper;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component build() {
                return new Div2ComponentImpl(this.fDivKitComponent, this.mBaseContext, this.mConfiguration, this.mThemeId, this.mDivCreationTracker, this.mDivVariableController);
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder configuration(DivConfiguration divConfiguration) {
                this.mConfiguration = divConfiguration;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divCreationTracker(DivCreationTracker divCreationTracker) {
                this.mDivCreationTracker = divCreationTracker;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divVariableController(DivVariableController divVariableController) {
                this.mDivVariableController = divVariableController;
                return this;
            }

            public ComponentFactoryImpl(Yatagan$DivKitComponent yatagan$DivKitComponent) {
                this.fDivKitComponent = yatagan$DivKitComponent;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder themeId(int i10) {
                this.mThemeId = Integer.valueOf(i10);
                return this;
            }
        }

        /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
        public static final class Div2ViewComponentImpl implements Div2ViewComponent {
            public final Div2ComponentImpl mDiv2Component;
            private Object mDivAnimatorControllerInstance;
            private Object mDivStateSwitcherInstance;
            private Object mDivStateTransitionHolderInstance;
            private Object mDivTransitionBuilderInstance;
            public final Div2View mDivView;
            private Object mErrorVisualMonitorInstance;
            private Object mInputFocusTrackerInstance;
            private Object mMediaReleaseViewVisitorInstance;
            private Object mReleaseViewVisitorInstance;
            private Object mReportingSafeDrawingPassOverrideStrategyInstance;
            private Object mViewBindingProviderInstance;

            /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
            public static final class CachingProviderImpl implements qe.a {
                private final Div2ViewComponentImpl mDelegate;
                private final int mIndex;
                private Object mValue;

                @Override // jj.a
                public Object get() {
                    Object obj = this.mValue;
                    if (obj != null) {
                        return obj;
                    }
                    re.b.a();
                    Object objSwitch$$access = this.mDelegate.switch$$access(this.mIndex);
                    this.mValue = objSwitch$$access;
                    return objSwitch$$access;
                }

                public CachingProviderImpl(Div2ViewComponentImpl div2ViewComponentImpl, int i10) {
                    this.mDelegate = div2ViewComponentImpl;
                    this.mIndex = i10;
                }
            }

            /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
            public static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
                public Div2ComponentImpl fDiv2Component;
                private Div2View mDivView;

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.fDiv2Component, this.mDivView);
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent.Builder divView(Div2View div2View) {
                    this.mDivView = div2View;
                    return this;
                }

                public ComponentFactoryImpl(Div2ComponentImpl div2ComponentImpl) {
                    this.fDiv2Component = div2ComponentImpl;
                }
            }

            public DivAnimatorController cacheDivAnimatorController() {
                Object divAnimatorController = this.mDivAnimatorControllerInstance;
                if (divAnimatorController == null) {
                    re.b.a();
                    divAnimatorController = new DivAnimatorController(this.mDivView);
                    this.mDivAnimatorControllerInstance = divAnimatorController;
                }
                return (DivAnimatorController) divAnimatorController;
            }

            public DivStateSwitcher cacheDivStateSwitcher() {
                Object objB = this.mDivStateSwitcherInstance;
                if (objB == null) {
                    re.b.a();
                    objB = re.a.b(Div2ViewModule.provideStateSwitcher(((Boolean) re.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isMultipleStateChangeEnabled()))).booleanValue(), new CachingProviderImpl(this, 0), new CachingProviderImpl(this, 1)));
                    this.mDivStateSwitcherInstance = objB;
                }
                return (DivStateSwitcher) objB;
            }

            public DivStateTransitionHolder cacheDivStateTransitionHolder() {
                Object divStateTransitionHolder = this.mDivStateTransitionHolderInstance;
                if (divStateTransitionHolder == null) {
                    re.b.a();
                    divStateTransitionHolder = new DivStateTransitionHolder(this.mDivView);
                    this.mDivStateTransitionHolderInstance = divStateTransitionHolder;
                }
                return (DivStateTransitionHolder) divStateTransitionHolder;
            }

            public DivTransitionBuilder cacheDivTransitionBuilder() {
                Object divTransitionBuilder = this.mDivTransitionBuilderInstance;
                if (divTransitionBuilder == null) {
                    re.b.a();
                    Div2ComponentImpl div2ComponentImpl = this.mDiv2Component;
                    divTransitionBuilder = new DivTransitionBuilder(div2ComponentImpl.mBaseContext, div2ComponentImpl.cacheDivViewIdProvider());
                    this.mDivTransitionBuilderInstance = divTransitionBuilder;
                }
                return (DivTransitionBuilder) divTransitionBuilder;
            }

            public ErrorVisualMonitor cacheErrorVisualMonitor() {
                Object errorVisualMonitor = this.mErrorVisualMonitorInstance;
                if (errorVisualMonitor == null) {
                    re.b.a();
                    errorVisualMonitor = new ErrorVisualMonitor(this.mDiv2Component.cacheErrorCollectors(), this.mDivView, ((Boolean) re.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue(), ((Boolean) re.a.b(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isPermanentDebugPanelEnabled()))).booleanValue(), cacheViewBindingProvider(), (DivTypefaceProvider) re.a.b(this.mDiv2Component.mDivConfiguration.getTypefaceProvider()));
                    this.mErrorVisualMonitorInstance = errorVisualMonitor;
                }
                return (ErrorVisualMonitor) errorVisualMonitor;
            }

            public InputFocusTracker cacheInputFocusTracker() {
                Object inputFocusTracker = this.mInputFocusTrackerInstance;
                if (inputFocusTracker == null) {
                    re.b.a();
                    inputFocusTracker = new InputFocusTracker(this.mDivView);
                    this.mInputFocusTrackerInstance = inputFocusTracker;
                }
                return (InputFocusTracker) inputFocusTracker;
            }

            public MediaReleaseViewVisitor cacheMediaReleaseViewVisitor() {
                Object mediaReleaseViewVisitor = this.mMediaReleaseViewVisitorInstance;
                if (mediaReleaseViewVisitor == null) {
                    re.b.a();
                    mediaReleaseViewVisitor = new MediaReleaseViewVisitor();
                    this.mMediaReleaseViewVisitorInstance = mediaReleaseViewVisitor;
                }
                return (MediaReleaseViewVisitor) mediaReleaseViewVisitor;
            }

            public ReleaseViewVisitor cacheReleaseViewVisitor() {
                Object releaseViewVisitor = this.mReleaseViewVisitorInstance;
                if (releaseViewVisitor == null) {
                    re.b.a();
                    releaseViewVisitor = new ReleaseViewVisitor(this.mDivView, (DivCustomContainerViewAdapter) re.a.b(this.mDiv2Component.mDivConfiguration.getDivCustomContainerViewAdapter()), this.mDiv2Component.cacheDivExtensionController());
                    this.mReleaseViewVisitorInstance = releaseViewVisitor;
                }
                return (ReleaseViewVisitor) releaseViewVisitor;
            }

            public ReportingSafeDrawingPassOverrideStrategy cacheReportingSafeDrawingPassOverrideStrategy() {
                Object reportingSafeDrawingPassOverrideStrategy = this.mReportingSafeDrawingPassOverrideStrategyInstance;
                if (reportingSafeDrawingPassOverrideStrategy == null) {
                    re.b.a();
                    reportingSafeDrawingPassOverrideStrategy = new ReportingSafeDrawingPassOverrideStrategy(this.mDivView, (Div2Logger) re.a.b(this.mDiv2Component.mDivConfiguration.getDiv2Logger()));
                    this.mReportingSafeDrawingPassOverrideStrategyInstance = reportingSafeDrawingPassOverrideStrategy;
                }
                return (ReportingSafeDrawingPassOverrideStrategy) reportingSafeDrawingPassOverrideStrategy;
            }

            public ViewBindingProvider cacheViewBindingProvider() {
                Object viewBindingProvider = this.mViewBindingProviderInstance;
                if (viewBindingProvider == null) {
                    re.b.a();
                    viewBindingProvider = new ViewBindingProvider();
                    this.mViewBindingProviderInstance = viewBindingProvider;
                }
                return (ViewBindingProvider) viewBindingProvider;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTooltipController getDivTooltipController() {
                return this.mDiv2Component.cacheDivTooltipController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorCollectors getErrorCollectors() {
                return this.mDiv2Component.cacheErrorCollectors();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivRuntimeVisitor getRuntimeVisitor() {
                return this.mDiv2Component.cacheDivRuntimeVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivViewIdProvider getViewIdProvider() {
                return this.mDiv2Component.cacheDivViewIdProvider();
            }

            public Object switch$$access(int i10) {
                if (i10 == 0) {
                    return new DivJoinedStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                if (i10 == 1) {
                    return new DivMultipleStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                throw new AssertionError();
            }

            public Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, Div2View div2View) {
                this.mDiv2Component = div2ComponentImpl;
                this.mDivView = (Div2View) re.a.a(div2View);
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivAnimatorController getAnimatorController() {
                return cacheDivAnimatorController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ViewBindingProvider getBindingProvider() {
                return cacheViewBindingProvider();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DrawingPassOverrideStrategy getDrawingPassOverrideStrategy() {
                return cacheReportingSafeDrawingPassOverrideStrategy();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorVisualMonitor getErrorMonitor() {
                return cacheErrorVisualMonitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public InputFocusTracker getInputFocusTracker() {
                return cacheInputFocusTracker();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public MediaReleaseViewVisitor getMediaReleaseViewVisitor() {
                return cacheMediaReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ReleaseViewVisitor getReleaseViewVisitor() {
                return cacheReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateSwitcher getStateSwitcher() {
                return cacheDivStateSwitcher();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateTransitionHolder getStateTransitionHolder() {
                return cacheDivStateTransitionHolder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTransitionBuilder getTransitionBuilder() {
                return cacheDivTransitionBuilder();
            }
        }

        /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
        public static final class ProviderImpl implements qe.a {
            private final Div2ComponentImpl mDelegate;
            private final int mIndex;

            @Override // jj.a
            public Object get() {
                return this.mDelegate.switch$$access(this.mIndex);
            }

            public ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i10) {
                this.mDelegate = div2ComponentImpl;
                this.mIndex = i10;
            }
        }

        public AccessibilityStateProvider cacheAccessibilityStateProvider() {
            Object accessibilityStateProvider = this.mAccessibilityStateProviderInstance;
            if (accessibilityStateProvider == null) {
                re.b.a();
                accessibilityStateProvider = new AccessibilityStateProvider(((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue());
                this.mAccessibilityStateProviderInstance = accessibilityStateProvider;
            }
            return (AccessibilityStateProvider) accessibilityStateProvider;
        }

        public BitmapEffectHelper cacheBitmapEffectHelper() {
            Object objB = this.mBitmapEffectHelperInstance;
            if (objB == null) {
                re.b.a();
                objB = re.a.b(Div2Module.provideBitmapEffectHelper(this.mBaseContext, ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isRenderEffectEnabled()))).booleanValue()));
                this.mBitmapEffectHelperInstance = objB;
            }
            return (BitmapEffectHelper) objB;
        }

        public Div2Builder cacheDiv2Builder() {
            Object div2Builder = this.mDiv2BuilderInstance;
            if (div2Builder == null) {
                re.b.a();
                div2Builder = new Div2Builder(cacheDivViewCreator(), cacheDivBinder(), cacheDivRuntimeVisitor());
                this.mDiv2BuilderInstance = div2Builder;
            }
            return (Div2Builder) div2Builder;
        }

        public DivActionBeaconSender cacheDivActionBeaconSender() {
            Object divActionBeaconSender = this.mDivActionBeaconSenderInstance;
            if (divActionBeaconSender == null) {
                re.b.a();
                divActionBeaconSender = new DivActionBeaconSender(new ProviderImpl(this.mDivKitComponent, 3), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isTapBeaconsEnabled()))).booleanValue(), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isVisibilityBeaconsEnabled()))).booleanValue(), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isSwipeOutBeaconsEnabled()))).booleanValue());
                this.mDivActionBeaconSenderInstance = divActionBeaconSender;
            }
            return (DivActionBeaconSender) divActionBeaconSender;
        }

        public DivActionBinder cacheDivActionBinder() {
            Object divActionBinder = this.mDivActionBinderInstance;
            if (divActionBinder == null) {
                re.b.a();
                divActionBinder = new DivActionBinder((DivActionHandler) re.a.b(this.mDivConfiguration.getActionHandler()), (Div2Logger) re.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivActionBeaconSender(), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isLongtapActionsPassToChild()))).booleanValue(), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isContextMenuHandlerOverridden()))).booleanValue());
                this.mDivActionBinderInstance = divActionBinder;
            }
            return (DivActionBinder) divActionBinder;
        }

        public DivBaseBinder cacheDivBaseBinder() {
            Object divBaseBinder = this.mDivBaseBinderInstance;
            if (divBaseBinder == null) {
                re.b.a();
                divBaseBinder = new DivBaseBinder(new DivBackgroundBinder(cacheDivImageLoader()), cacheDivTooltipController(), new DivFocusBinder(cacheDivActionBinder()), new DivAccessibilityBinder(((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue(), cacheAccessibilityStateProvider()), new DivLayoutParamsBinder(cacheErrorCollectors()));
                this.mDivBaseBinderInstance = divBaseBinder;
            }
            return (DivBaseBinder) divBaseBinder;
        }

        public DivBinder cacheDivBinder() {
            Object divBinder = this.mDivBinderInstance;
            if (divBinder == null) {
                re.b.a();
                divBinder = new DivBinder(cacheDivValidator(), new DivTextBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), new SpannedTextBuilder(cacheDivTypefaceResolver(), cacheDivImageLoader()), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isHyphenationSupported()))).booleanValue()), new DivContainerBinder(cacheDivBaseBinder(), new ProviderImpl(this, 2), cacheDivPatchManager(), new ProviderImpl(this, 0), cacheErrorCollectors()), new DivSeparatorBinder(cacheDivBaseBinder()), new DivImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGifImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGridBinder(cacheDivBaseBinder(), cacheDivPatchManager(), new ProviderImpl(this, 0), new ProviderImpl(this, 2)), new DivGalleryBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), ((Float) re.a.b(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue()), new DivPagerBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), cacheDivActionBinder(), cachePagerIndicatorConnector(), cacheAccessibilityStateProvider()), new DivTabsBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheViewPool(), (TabTextStyleProvider) re.a.b(Div2Module.provideTabTextStyleProvider((DivTypefaceProvider) re.a.b(this.mDivConfiguration.getTypefaceProvider()))), cacheDivActionBinder(), (Div2Logger) re.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivImageLoader(), cacheDivVisibilityActionTracker(), cacheDivPatchCache(), cacheJavaxInjectNamedValueThemedContextContext(), cacheDivRuntimeVisitor(), cacheTabsStateCache()), new DivStateBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), (DivStateCache) re.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheDivActionBinder(), cacheDivActionBeaconSender(), cacheDivPatchManager(), cacheDivPatchCache(), (Div2Logger) re.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivVisibilityActionTracker(), cacheErrorCollectors(), cacheTwoWayStringVariableBinder(), cacheDivRuntimeVisitor()), new DivCustomBinder(cacheDivBaseBinder(), (DivCustomContainerViewAdapter) re.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), cacheDivExtensionController(), new ProviderImpl(this, 0)), new DivIndicatorBinder(cacheDivBaseBinder(), cachePagerIndicatorConnector()), new DivSliderBinder(cacheDivBaseBinder(), (Div2Logger) re.a.b(this.mDivConfiguration.getDiv2Logger()), cacheDivTypefaceResolver(), cacheTwoWayIntegerVariableBinder(), cacheErrorCollectors(), ((Float) re.a.b(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue(), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue()), new DivInputBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheDivActionBinder(), cacheAccessibilityStateProvider(), cacheErrorCollectors()), new DivSelectBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheErrorCollectors()), new DivVideoBinder(cacheDivBaseBinder(), cacheTwoWayIntegerVariableBinder(), cacheDivActionBinder(), cacheDivVideoViewMapper(), (ExecutorService) re.a.b(this.mDivKitComponent.mDivKitConfiguration.executorService()), (DivPlayerFactory) re.a.b(this.mDivConfiguration.getDivPlayerFactory())), cacheDivExtensionController(), cachePagerIndicatorConnector(), new DivSwitchBinder(cacheDivBaseBinder(), new TwoWayBooleanVariableBinder(cacheErrorCollectors())));
                this.mDivBinderInstance = divBinder;
            }
            return (DivBinder) divBinder;
        }

        public DivExtensionController cacheDivExtensionController() {
            Object divExtensionController = this.mDivExtensionControllerInstance;
            if (divExtensionController == null) {
                re.b.a();
                divExtensionController = new DivExtensionController((List) re.a.b(this.mDivConfiguration.getExtensionHandlers()));
                this.mDivExtensionControllerInstance = divExtensionController;
            }
            return (DivExtensionController) divExtensionController;
        }

        public DivImageLoader cacheDivImageLoader() {
            Object objB = this.mDivImageLoaderInstance;
            if (objB == null) {
                re.b.a();
                objB = re.a.b(Div2Module.provideDivImageLoader((DivImageLoader) re.a.b(this.mDivConfiguration.getImageLoader()), this.mBaseContext));
                this.mDivImageLoaderInstance = objB;
            }
            return (DivImageLoader) objB;
        }

        public DivImagePreloader cacheDivImagePreloader() {
            Object divImagePreloader = this.mDivImagePreloaderInstance;
            if (divImagePreloader == null) {
                re.b.a();
                divImagePreloader = new DivImagePreloader(cacheDivImageLoader());
                this.mDivImagePreloaderInstance = divImagePreloader;
            }
            return (DivImagePreloader) divImagePreloader;
        }

        public DivPatchCache cacheDivPatchCache() {
            Object divPatchCache = this.mDivPatchCacheInstance;
            if (divPatchCache == null) {
                re.b.a();
                divPatchCache = new DivPatchCache();
                this.mDivPatchCacheInstance = divPatchCache;
            }
            return (DivPatchCache) divPatchCache;
        }

        public DivPatchManager cacheDivPatchManager() {
            Object divPatchManager = this.mDivPatchManagerInstance;
            if (divPatchManager == null) {
                re.b.a();
                divPatchManager = new DivPatchManager(cacheDivPatchCache(), new ProviderImpl(this, 1));
                this.mDivPatchManagerInstance = divPatchManager;
            }
            return (DivPatchManager) divPatchManager;
        }

        public DivPlaceholderLoader cacheDivPlaceholderLoader() {
            Object divPlaceholderLoader = this.mDivPlaceholderLoaderInstance;
            if (divPlaceholderLoader == null) {
                re.b.a();
                divPlaceholderLoader = new DivPlaceholderLoader((Div2ImageStubProvider) re.a.b(this.mDivConfiguration.getDiv2ImageStubProvider()), (ExecutorService) re.a.b(this.mDivKitComponent.mDivKitConfiguration.executorService()));
                this.mDivPlaceholderLoaderInstance = divPlaceholderLoader;
            }
            return (DivPlaceholderLoader) divPlaceholderLoader;
        }

        public DivPreloader cacheDivPreloader() {
            Object objB = this.mDivPreloaderInstance;
            if (objB == null) {
                re.b.a();
                objB = re.a.b(Div2Module.provideDivPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) re.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) re.a.b(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivPreloaderInstance = objB;
            }
            return (DivPreloader) objB;
        }

        public DivRuntimeVisitor cacheDivRuntimeVisitor() {
            Object divRuntimeVisitor = this.mDivRuntimeVisitorInstance;
            if (divRuntimeVisitor == null) {
                re.b.a();
                divRuntimeVisitor = new DivRuntimeVisitor((DivStateCache) re.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheTabsStateCache());
                this.mDivRuntimeVisitorInstance = divRuntimeVisitor;
            }
            return (DivRuntimeVisitor) divRuntimeVisitor;
        }

        public DivStateManager cacheDivStateManager() {
            Object divStateManager = this.mDivStateManagerInstance;
            if (divStateManager == null) {
                re.b.a();
                divStateManager = new DivStateManager((DivStateCache) re.a.b(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache());
                this.mDivStateManagerInstance = divStateManager;
            }
            return (DivStateManager) divStateManager;
        }

        public DivTimerEventDispatcherProvider cacheDivTimerEventDispatcherProvider() {
            Object divTimerEventDispatcherProvider = this.mDivTimerEventDispatcherProviderInstance;
            if (divTimerEventDispatcherProvider == null) {
                re.b.a();
                divTimerEventDispatcherProvider = new DivTimerEventDispatcherProvider(cacheDivActionBinder(), cacheErrorCollectors());
                this.mDivTimerEventDispatcherProviderInstance = divTimerEventDispatcherProvider;
            }
            return (DivTimerEventDispatcherProvider) divTimerEventDispatcherProvider;
        }

        public DivTooltipController cacheDivTooltipController() {
            Object divTooltipController = this.mDivTooltipControllerInstance;
            if (divTooltipController == null) {
                re.b.a();
                divTooltipController = new DivTooltipController((DivTooltipRestrictor) re.a.b(this.mDivConfiguration.getTooltipRestrictor()), cacheDivVisibilityActionTracker(), cacheDivPreloader(), new DivTooltipViewBuilder(new ProviderImpl(this, 1)), cacheAccessibilityStateProvider(), cacheErrorCollectors());
                this.mDivTooltipControllerInstance = divTooltipController;
            }
            return (DivTooltipController) divTooltipController;
        }

        public DivTypefaceResolver cacheDivTypefaceResolver() {
            Object divTypefaceResolver = this.mDivTypefaceResolverInstance;
            if (divTypefaceResolver == null) {
                re.b.a();
                divTypefaceResolver = new DivTypefaceResolver((Map) re.a.b(this.mDivConfiguration.getAdditionalTypefaceProviders()), (DivTypefaceProvider) re.a.b(this.mDivConfiguration.getTypefaceProvider()));
                this.mDivTypefaceResolverInstance = divTypefaceResolver;
            }
            return (DivTypefaceResolver) divTypefaceResolver;
        }

        public DivValidator cacheDivValidator() {
            Object divValidator = this.mDivValidatorInstance;
            if (divValidator == null) {
                re.b.a();
                divValidator = new DivValidator();
                this.mDivValidatorInstance = divValidator;
            }
            return (DivValidator) divValidator;
        }

        public DivVideoActionHandler cacheDivVideoActionHandler() {
            Object divVideoActionHandler = this.mDivVideoActionHandlerInstance;
            if (divVideoActionHandler == null) {
                re.b.a();
                divVideoActionHandler = new DivVideoActionHandler(cacheDivVideoViewMapper());
                this.mDivVideoActionHandlerInstance = divVideoActionHandler;
            }
            return (DivVideoActionHandler) divVideoActionHandler;
        }

        public DivVideoViewMapper cacheDivVideoViewMapper() {
            Object divVideoViewMapper = this.mDivVideoViewMapperInstance;
            if (divVideoViewMapper == null) {
                re.b.a();
                divVideoViewMapper = new DivVideoViewMapper();
                this.mDivVideoViewMapperInstance = divVideoViewMapper;
            }
            return (DivVideoViewMapper) divVideoViewMapper;
        }

        public DivViewCreator cacheDivViewCreator() {
            Object divViewCreator = this.mDivViewCreatorInstance;
            if (divViewCreator == null) {
                re.b.a();
                divViewCreator = new DivViewCreator(cacheJavaxInjectNamedValueThemedContextContext(), cacheViewPool(), cacheDivValidator(), (ViewPreCreationProfile) re.a.b(this.mDivConfiguration.getViewPreCreationProfile()), cacheViewPreCreationProfileRepository());
                this.mDivViewCreatorInstance = divViewCreator;
            }
            return (DivViewCreator) divViewCreator;
        }

        public DivViewDataPreloader cacheDivViewDataPreloader() {
            Object objB = this.mDivViewDataPreloaderInstance;
            if (objB == null) {
                re.b.a();
                objB = re.a.b(Div2Module.provideDivViewDataPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) re.a.b(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) re.a.b(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivViewDataPreloaderInstance = objB;
            }
            return (DivViewDataPreloader) objB;
        }

        public DivViewIdProvider cacheDivViewIdProvider() {
            Object divViewIdProvider = this.mDivViewIdProviderInstance;
            if (divViewIdProvider == null) {
                re.b.a();
                divViewIdProvider = new DivViewIdProvider();
                this.mDivViewIdProviderInstance = divViewIdProvider;
            }
            return (DivViewIdProvider) divViewIdProvider;
        }

        public DivVisibilityActionDispatcher cacheDivVisibilityActionDispatcher() {
            Object divVisibilityActionDispatcher = this.mDivVisibilityActionDispatcherInstance;
            if (divVisibilityActionDispatcher == null) {
                re.b.a();
                divVisibilityActionDispatcher = new DivVisibilityActionDispatcher((Div2Logger) re.a.b(this.mDivConfiguration.getDiv2Logger()), (List) re.a.b(this.mDivConfiguration.getDivVisibilityChangeListeners()), (DivActionHandler) re.a.b(this.mDivConfiguration.getActionHandler()), cacheDivActionBeaconSender());
                this.mDivVisibilityActionDispatcherInstance = divVisibilityActionDispatcher;
            }
            return (DivVisibilityActionDispatcher) divVisibilityActionDispatcher;
        }

        public DivVisibilityActionTracker cacheDivVisibilityActionTracker() {
            Object divVisibilityActionTracker = this.mDivVisibilityActionTrackerInstance;
            if (divVisibilityActionTracker == null) {
                re.b.a();
                divVisibilityActionTracker = new DivVisibilityActionTracker(new ViewVisibilityCalculator(), cacheDivVisibilityActionDispatcher());
                this.mDivVisibilityActionTrackerInstance = divVisibilityActionTracker;
            }
            return (DivVisibilityActionTracker) divVisibilityActionTracker;
        }

        public ErrorCollectors cacheErrorCollectors() {
            Object errorCollectors = this.mErrorCollectorsInstance;
            if (errorCollectors == null) {
                re.b.a();
                errorCollectors = new ErrorCollectors();
                this.mErrorCollectorsInstance = errorCollectors;
            }
            return (ErrorCollectors) errorCollectors;
        }

        public HistogramReporter cacheHistogramReporter() {
            Object objB = this.mHistogramReporterInstance;
            if (objB == null) {
                re.b.a();
                objB = re.a.b(DivHistogramsModule.INSTANCE.provideHistogramReporter(this.mDivKitComponent.accessHistogramReporterDelegate()));
                this.mHistogramReporterInstance = objB;
            }
            return (HistogramReporter) objB;
        }

        public Context cacheJavaxInjectNamedValueThemedContextContext() {
            Object objB = this.mJavaxInjectNamedValueThemedContextContextInstance;
            if (objB == null) {
                re.b.a();
                objB = re.a.b(Div2Module.provideThemedContext(this.mBaseContext, this.mThemeId.intValue(), ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isResourceCacheEnabled()))).booleanValue()));
                this.mJavaxInjectNamedValueThemedContextContextInstance = objB;
            }
            return (Context) objB;
        }

        public PagerIndicatorConnector cachePagerIndicatorConnector() {
            Object pagerIndicatorConnector = this.mPagerIndicatorConnectorInstance;
            if (pagerIndicatorConnector == null) {
                re.b.a();
                pagerIndicatorConnector = new PagerIndicatorConnector();
                this.mPagerIndicatorConnectorInstance = pagerIndicatorConnector;
            }
            return (PagerIndicatorConnector) pagerIndicatorConnector;
        }

        public PerformanceDependentSessionProfiler cachePerformanceDependentSessionProfiler() {
            Object performanceDependentSessionProfiler = this.mPerformanceDependentSessionProfilerInstance;
            if (performanceDependentSessionProfiler == null) {
                re.b.a();
                performanceDependentSessionProfiler = new PerformanceDependentSessionProfiler(((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isDebuggingViewPoolOptimization()))).booleanValue());
                this.mPerformanceDependentSessionProfilerInstance = performanceDependentSessionProfiler;
            }
            return (PerformanceDependentSessionProfiler) performanceDependentSessionProfiler;
        }

        public ReleaseManager cacheReleaseManager() {
            Object releaseManager = this.mReleaseManagerInstance;
            if (releaseManager == null) {
                re.b.a();
                releaseManager = new ReleaseManager(cacheRuntimeStoreProvider());
                this.mReleaseManagerInstance = releaseManager;
            }
            return (ReleaseManager) releaseManager;
        }

        public RuntimeStoreProvider cacheRuntimeStoreProvider() {
            Object runtimeStoreProvider = this.mRuntimeStoreProviderInstance;
            if (runtimeStoreProvider == null) {
                re.b.a();
                runtimeStoreProvider = new RuntimeStoreProvider(new ExpressionsRuntimeProvider(this.mDivVariableController, cacheDivActionBinder(), (Div2Logger) re.a.b(this.mDivConfiguration.getDiv2Logger()), cacheStoredValuesController()), cacheErrorCollectors());
                this.mRuntimeStoreProviderInstance = runtimeStoreProvider;
            }
            return (RuntimeStoreProvider) runtimeStoreProvider;
        }

        public StoredValuesController cacheStoredValuesController() {
            Object storedValuesController = this.mStoredValuesControllerInstance;
            if (storedValuesController == null) {
                re.b.a();
                storedValuesController = new StoredValuesController(new ProviderImpl(this.mDivKitComponent, 1));
                this.mStoredValuesControllerInstance = storedValuesController;
            }
            return (StoredValuesController) storedValuesController;
        }

        public TabsStateCache cacheTabsStateCache() {
            Object tabsStateCache = this.mTabsStateCacheInstance;
            if (tabsStateCache == null) {
                re.b.a();
                tabsStateCache = new TabsStateCache();
                this.mTabsStateCacheInstance = tabsStateCache;
            }
            return (TabsStateCache) tabsStateCache;
        }

        public TemporaryDivStateCache cacheTemporaryDivStateCache() {
            Object temporaryDivStateCache = this.mTemporaryDivStateCacheInstance;
            if (temporaryDivStateCache == null) {
                re.b.a();
                temporaryDivStateCache = new TemporaryDivStateCache();
                this.mTemporaryDivStateCacheInstance = temporaryDivStateCache;
            }
            return (TemporaryDivStateCache) temporaryDivStateCache;
        }

        public TwoWayIntegerVariableBinder cacheTwoWayIntegerVariableBinder() {
            Object twoWayIntegerVariableBinder = this.mTwoWayIntegerVariableBinderInstance;
            if (twoWayIntegerVariableBinder == null) {
                re.b.a();
                twoWayIntegerVariableBinder = new TwoWayIntegerVariableBinder(cacheErrorCollectors());
                this.mTwoWayIntegerVariableBinderInstance = twoWayIntegerVariableBinder;
            }
            return (TwoWayIntegerVariableBinder) twoWayIntegerVariableBinder;
        }

        public TwoWayStringVariableBinder cacheTwoWayStringVariableBinder() {
            Object twoWayStringVariableBinder = this.mTwoWayStringVariableBinderInstance;
            if (twoWayStringVariableBinder == null) {
                re.b.a();
                twoWayStringVariableBinder = new TwoWayStringVariableBinder(cacheErrorCollectors());
                this.mTwoWayStringVariableBinderInstance = twoWayStringVariableBinder;
            }
            return (TwoWayStringVariableBinder) twoWayStringVariableBinder;
        }

        public ViewPool cacheViewPool() {
            Object objB = this.mViewPoolInstance;
            if (objB == null) {
                re.b.a();
                objB = re.a.b(Div2Module.provideViewPool(((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isViewPoolEnabled()))).booleanValue(), (ExternalOptional) re.a.b(Div2Module.provideViewPoolProfiler(((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isViewPoolProfilingEnabled()))).booleanValue(), (ViewPoolProfiler.Reporter) re.a.b(this.mDivConfiguration.getViewPoolReporter()))), cachePerformanceDependentSessionProfiler(), this.mDivKitComponent.cacheViewCreator()));
                this.mViewPoolInstance = objB;
            }
            return (ViewPool) objB;
        }

        public ViewPreCreationProfileRepository cacheViewPreCreationProfileRepository() {
            Object viewPreCreationProfileRepository = this.mViewPreCreationProfileRepositoryInstance;
            if (viewPreCreationProfileRepository == null) {
                re.b.a();
                viewPreCreationProfileRepository = new ViewPreCreationProfileRepository(this.mDivKitComponent.mApplicationContext, (ViewPreCreationProfile) re.a.b(this.mDivConfiguration.getViewPreCreationProfile()));
                this.mViewPreCreationProfileRepositoryInstance = viewPreCreationProfileRepository;
            }
            return (ViewPreCreationProfileRepository) viewPreCreationProfileRepository;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionHandler getActionHandler() {
            return (DivActionHandler) re.a.b(this.mDivConfiguration.getActionHandler());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionTypedHandlerCombiner getActionTypedHandlerCombiner() {
            return this.mDivKitComponent.cacheDivActionTypedHandlerCombiner();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Logger getDiv2Logger() {
            return (Div2Logger) re.a.b(this.mDivConfiguration.getDiv2Logger());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCreationTracker getDivCreationTracker() {
            return this.mDivCreationTracker;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCustomContainerChildFactory getDivCustomContainerChildFactory() {
            return new DivCustomContainerChildFactory();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDataChangeListener getDivDataChangeListener() {
            return (DivDataChangeListener) re.a.b(this.mDivConfiguration.getDivDataChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDownloader getDivDownloader() {
            return (DivDownloader) re.a.b(this.mDivConfiguration.getDivDownloader());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateChangeListener getDivStateChangeListener() {
            return (DivStateChangeListener) re.a.b(this.mDivConfiguration.getDivStateChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVariableController getDivVariableController() {
            return this.mDivVariableController;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isBindOnAttachEnabled() {
            return ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isBindOnAttachEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isComplexRebindEnabled() {
            return ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isComplexRebindEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isPagerPageClipEnabled() {
            return ((Boolean) re.a.b(Boolean.valueOf(this.mDivConfiguration.isPagerPageClipEnabled()))).booleanValue();
        }

        public Object switch$$access(int i10) {
            if (i10 == 0) {
                return cacheDivBinder();
            }
            if (i10 == 1) {
                return cacheDiv2Builder();
            }
            if (i10 == 2) {
                return cacheDivViewCreator();
            }
            throw new AssertionError();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2ViewComponent.Builder viewComponent() {
            return new Div2ViewComponentImpl.ComponentFactoryImpl(this);
        }

        public Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, Integer num, DivCreationTracker divCreationTracker, DivVariableController divVariableController) {
            this.mDivKitComponent = yatagan$DivKitComponent;
            this.mBaseContext = (ContextThemeWrapper) re.a.a(contextThemeWrapper);
            this.mDivConfiguration = (DivConfiguration) re.a.a(divConfiguration);
            this.mThemeId = (Integer) re.a.a(num);
            this.mDivCreationTracker = (DivCreationTracker) re.a.a(divCreationTracker);
            this.mDivVariableController = (DivVariableController) re.a.a(divVariableController);
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionBinder getActionBinder() {
            return cacheDivActionBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public BitmapEffectHelper getBitmapEffectHelper() {
            return cacheBitmapEffectHelper();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Builder getDiv2Builder() {
            return cacheDiv2Builder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivBinder getDivBinder() {
            return cacheDivBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTimerEventDispatcherProvider getDivTimersControllerProvider() {
            return cacheDivTimerEventDispatcherProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVideoActionHandler getDivVideoActionHandler() {
            return cacheDivVideoActionHandler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivViewDataPreloader getDivViewDataPreloader() {
            return cacheDivViewDataPreloader();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public HistogramReporter getHistogramReporter() {
            return cacheHistogramReporter();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ReleaseManager getReleaseManager() {
            return cacheReleaseManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public RuntimeStoreProvider getRuntimeStoreProvider() {
            return cacheRuntimeStoreProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateManager getStateManager() {
            return cacheDivStateManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public StoredValuesController getStoredValuesController() {
            return cacheStoredValuesController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public TemporaryDivStateCache getTemporaryDivStateCache() {
            return cacheTemporaryDivStateCache();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTooltipController getTooltipController() {
            return cacheDivTooltipController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVisibilityActionTracker getVisibilityActionTracker() {
            return cacheDivVisibilityActionTracker();
        }
    }

    /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
    public static final class ProviderImpl implements qe.a {
        private final Yatagan$DivKitComponent mDelegate;
        private final int mIndex;

        @Override // jj.a
        public Object get() {
            return this.mDelegate.switch$$access(this.mIndex);
        }

        public ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i10) {
            this.mDelegate = yatagan$DivKitComponent;
            this.mIndex = i10;
        }
    }

    /* JADX INFO: compiled from: Yatagan$DivKitComponent.java */
    public static final class UninitializedLock {
        private UninitializedLock() {
        }
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    public HistogramReporterDelegate accessHistogramReporterDelegate() {
        return (HistogramReporterDelegate) re.a.b(DivKitHistogramsModule.INSTANCE.provideHistogramReporterDelegate((HistogramConfiguration) re.a.b(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 4), new ProviderImpl(this, 5)));
    }

    public DivActionTypedHandlerCombiner cacheDivActionTypedHandlerCombiner() {
        Object divActionTypedHandlerCombiner;
        Object obj = this.mDivActionTypedHandlerCombinerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                divActionTypedHandlerCombiner = this.mDivActionTypedHandlerCombinerInstance;
                if (divActionTypedHandlerCombiner instanceof UninitializedLock) {
                    divActionTypedHandlerCombiner = new DivActionTypedHandlerCombiner(manyOfSetDivActionTypedHandler());
                    this.mDivActionTypedHandlerCombinerInstance = divActionTypedHandlerCombiner;
                }
            }
            obj = divActionTypedHandlerCombiner;
        }
        return (DivActionTypedHandlerCombiner) obj;
    }

    public DivParsingHistogramReporter cacheDivParsingHistogramReporter() {
        Object objB;
        Object obj = this.mDivParsingHistogramReporterInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                objB = this.mDivParsingHistogramReporterInstance;
                if (objB instanceof UninitializedLock) {
                    objB = re.a.b(DivKitHistogramsModule.INSTANCE.provideDivParsingHistogramReporter((HistogramConfiguration) re.a.b(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 0), new ProviderImpl(this, 2)));
                    this.mDivParsingHistogramReporterInstance = objB;
                }
            }
            obj = objB;
        }
        return (DivParsingHistogramReporter) obj;
    }

    public DivStorageComponent cacheDivStorageComponent() {
        Object objB;
        Object obj = this.mDivStorageComponentInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                objB = this.mDivStorageComponentInstance;
                if (objB instanceof UninitializedLock) {
                    objB = re.a.b(DivStorageModule.INSTANCE.provideDivStorageComponent((ExternalOptional) re.a.b(this.mDivKitConfiguration.externalDivStorageComponent()), this.mApplicationContext, accessHistogramReporterDelegate(), cacheDivParsingHistogramReporter()));
                    this.mDivStorageComponentInstance = objB;
                }
            }
            obj = objB;
        }
        return (DivStorageComponent) obj;
    }

    public HistogramColdTypeChecker cacheHistogramColdTypeChecker() {
        Object histogramColdTypeChecker;
        Object obj = this.mHistogramColdTypeCheckerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                histogramColdTypeChecker = this.mHistogramColdTypeCheckerInstance;
                if (histogramColdTypeChecker instanceof UninitializedLock) {
                    histogramColdTypeChecker = new HistogramColdTypeChecker();
                    this.mHistogramColdTypeCheckerInstance = histogramColdTypeChecker;
                }
            }
            obj = histogramColdTypeChecker;
        }
        return (HistogramColdTypeChecker) obj;
    }

    public HistogramRecorder cacheHistogramRecorder() {
        Object objB;
        Object obj = this.mHistogramRecorderInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                objB = this.mHistogramRecorderInstance;
                if (objB instanceof UninitializedLock) {
                    objB = re.a.b(this.mDivKitConfiguration.histogramRecorder());
                    this.mHistogramRecorderInstance = objB;
                }
            }
            obj = objB;
        }
        return (HistogramRecorder) obj;
    }

    public ld.b cacheSendBeaconManager() {
        Object objB;
        Object obj = this.mSendBeaconManagerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                objB = this.mSendBeaconManagerInstance;
                if (objB instanceof UninitializedLock) {
                    DivKitModule divKitModule = DivKitModule.INSTANCE;
                    objB = re.a.b(DivKitModule.provideSendBeaconManager(this.mApplicationContext, (ld.a) re.a.b(this.mDivKitConfiguration.sendBeaconConfiguration())));
                    this.mSendBeaconManagerInstance = objB;
                }
            }
            obj = objB;
        }
        return (ld.b) obj;
    }

    public ViewCreator cacheViewCreator() {
        Object objB;
        Object obj = this.mViewCreatorInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                objB = this.mViewCreatorInstance;
                if (objB instanceof UninitializedLock) {
                    DivKitModule divKitModule = DivKitModule.INSTANCE;
                    objB = re.a.b(DivKitModule.provideViewCreator((CpuUsageHistogramReporter) re.a.b(this.mDivKitConfiguration.cpuUsageHistogramReporter())));
                    this.mViewCreatorInstance = objB;
                }
            }
            obj = objB;
        }
        return (ViewCreator) obj;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public Div2Component.Builder div2Component() {
        return new Div2ComponentImpl.ComponentFactoryImpl(this);
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public HistogramRecordConfiguration getHistogramRecordConfiguration() {
        return (HistogramRecordConfiguration) re.a.b(this.mDivKitConfiguration.histogramRecordConfiguration());
    }

    public Set<DivActionTypedHandler> manyOfSetDivActionTypedHandler() {
        HashSet hashSet = new HashSet(16);
        hashSet.add(new DivAnimatorTypedActionHandler());
        hashSet.add(new DivActionTypedArrayMutationHandler());
        hashSet.add(new DivActionTypedClearFocusHandler());
        hashSet.add(new DivActionTypedCopyToClipboardHandler());
        hashSet.add(new DivActionTypedDictSetValueHandler());
        hashSet.add(new DivActionTypedFocusElementHandler());
        hashSet.add(new DivActionTypedHideTooltipHandler());
        hashSet.add(new DivActionTypedScrollHandler());
        hashSet.add(new DivActionTypedSetStateHandler());
        hashSet.add(new DivActionTypedSetVariableHandler());
        hashSet.add(new DivActionTypedSetStoredValueHandler());
        hashSet.add(new DivActionTypedShowTooltipHandler());
        hashSet.add(new DivActionTypedSubmitHandler((DivRequestExecutor) re.a.b(this.mDivKitConfiguration.divRequestExecutor())));
        hashSet.add(new DivActionTypedTimerHandler());
        hashSet.add(new DivActionTypedVideoHandler());
        hashSet.add(new DivActionTypedUpdateStructureHandler());
        return hashSet;
    }

    public Object switch$$access(int i10) {
        if (i10 == 0) {
            return accessHistogramReporterDelegate();
        }
        if (i10 == 1) {
            return cacheDivStorageComponent();
        }
        if (i10 == 2) {
            return re.a.b(this.mDivKitConfiguration.executorService());
        }
        if (i10 == 3) {
            return cacheSendBeaconManager();
        }
        if (i10 == 4) {
            return cacheHistogramRecorder();
        }
        if (i10 == 5) {
            return cacheHistogramColdTypeChecker();
        }
        throw new AssertionError();
    }

    public Yatagan$DivKitComponent(Context context, DivKitConfiguration divKitConfiguration) {
        this.mDivActionTypedHandlerCombinerInstance = new UninitializedLock();
        this.mDivStorageComponentInstance = new UninitializedLock();
        this.mViewCreatorInstance = new UninitializedLock();
        this.mSendBeaconManagerInstance = new UninitializedLock();
        this.mHistogramRecorderInstance = new UninitializedLock();
        this.mDivParsingHistogramReporterInstance = new UninitializedLock();
        this.mHistogramColdTypeCheckerInstance = new UninitializedLock();
        this.mApplicationContext = (Context) re.a.a(context);
        this.mDivKitConfiguration = (DivKitConfiguration) re.a.a(divKitConfiguration);
    }
}
