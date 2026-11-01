package io.bidmachine.ads.networks.adaptiverendering;

import ck.p;
import ek.b;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParamsKt;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.CacheType;
import io.bidmachine.rendering.model.EventTaskType;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.model.ScaleType;
import io.bidmachine.rendering.model.SideType;
import io.bidmachine.utils.lazy.LazyValue;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0005H\u0000\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\bH\u0000\u001a\u0010\u0010\t\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0010\f\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u000eH\u0000\u001a\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u0004\u0018\u00010\u0014H\u0000\u001a\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0017H\u0000¨\u0006\u0018"}, d2 = {"getDurationMs", "", "Lio/bidmachine/protobuf/rendering/Rendering$AdaptiveAnimation$Timing;", "toAdElementType", "Lio/bidmachine/rendering/model/AdElementType;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$ViewComponentType;", "toCacheType", "Lio/bidmachine/rendering/model/CacheType;", "Lio/bidmachine/protobuf/rendering/Rendering$CacheType;", "toEventTaskType", "Lio/bidmachine/rendering/model/EventTaskType;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$Task$TaskName;", "toEventType", "Lio/bidmachine/rendering/model/EventType;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$EventName;", "toOrientation", "Lio/bidmachine/rendering/model/Orientation;", "Lio/bidmachine/protobuf/rendering/Rendering$Orientation;", "toScaleType", "Lio/bidmachine/rendering/model/ScaleType;", "Lio/bidmachine/protobuf/rendering/Rendering$Image$ScaleType;", "toSideType", "Lio/bidmachine/rendering/model/SideType;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Layout$Constraint$Anchor;", "bidmachine-android-sdk_bi_3_3_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingParamsKt {

    /* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[Rendering.Orientation.values().length];
            try {
                iArr[Rendering.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rendering.Orientation.ORIENTATION_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rendering.Orientation.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Rendering.CacheType.values().length];
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_FULL_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_PARTIAL_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_STREAM_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Rendering.CacheType.CACHE_TYPE_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Rendering.CacheType.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Rendering.Phase.ViewComponent.ViewComponentType.values().length];
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_MRAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_LABEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_COUNTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[Rendering.Phase.ViewComponent.ViewComponentType.VIEW_COMPONENT_TYPE_PROGRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Rendering.Image.ScaleType.values().length];
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_TO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[Rendering.Image.ScaleType.SCALE_TYPE_ASPECT_FIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[Rendering.Phase.Event.EventName.values().length];
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_NAVIGATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_UNMUTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_PAUSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_RESUME.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SKIP.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_START.ordinal()] = 11;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_FIRST_QUARTILE.ordinal()] = 12;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_MIDPOINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_THIRD_QUARTILE.ordinal()] = 14;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_USE_CUSTOM_CLOSE.ordinal()] = 16;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr6[Rendering.Phase.Event.EventName.EVENT_NAME_ON_SCHEDULED.ordinal()] = 17;
            } catch (NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[Rendering.Phase.Event.Task.TaskName.values().length];
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_MUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNMUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TRACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SKIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_OPEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SHOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_HIDE.ordinal()] = 9;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PROGRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SCHEDULE.ordinal()] = 11;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_LOCK_VISIBILITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNLOCK_VISIBILITY.ordinal()] = 13;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_NOTIFY_OPEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_SIMULATE_CLICK.ordinal()] = 15;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_PRIVACY_SHEET.ordinal()] = 16;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPEAT.ordinal()] = 17;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr7[Rendering.Phase.Event.Task.TaskName.TASK_NAME_TOGGLE_STATE_GROUPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused59) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    public static final AdElementType toAdElementType(final Rendering.Phase.ViewComponent.ViewComponentType viewComponentType) {
        if (viewComponentType == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$2[viewComponentType.ordinal()]) {
            case 1:
                return AdElementType.Mraid;
            case 2:
                return AdElementType.Video;
            case 3:
                return AdElementType.Image;
            case 4:
                return AdElementType.Label;
            case 5:
                return AdElementType.Countdown;
            case 6:
                return AdElementType.Progress;
            default:
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.u
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParamsKt.toAdElementType$lambda$4(viewComponentType);
                    }
                });
                return null;
        }
    }

    public static final CacheType toCacheType(final Rendering.CacheType cacheType) {
        if (cacheType == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[cacheType.ordinal()];
        if (i10 == 1) {
            return CacheType.FullLoad;
        }
        if (i10 == 2) {
            return CacheType.PartialLoad;
        }
        if (i10 == 3) {
            return CacheType.StreamLoad;
        }
        if (i10 == 4 || i10 == 5) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: df.r
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParamsKt.toCacheType$lambda$2(cacheType);
                }
            });
            return null;
        }
        Logger.e((LazyValue<String>) new LazyValue() { // from class: df.s
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdaptiveRenderingParamsKt.toCacheType$lambda$3(cacheType);
            }
        });
        return null;
    }

    public static final EventTaskType toEventTaskType(final Rendering.Phase.Event.Task.TaskName taskName) {
        if (taskName == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$6[taskName.ordinal()]) {
            case 1:
                return EventTaskType.Start;
            case 2:
                return EventTaskType.Mute;
            case 3:
                return EventTaskType.UnMute;
            case 4:
                return EventTaskType.Track;
            case 5:
                return EventTaskType.Close;
            case 6:
                return EventTaskType.Skip;
            case 7:
                return EventTaskType.Open;
            case 8:
                return EventTaskType.Show;
            case 9:
                return EventTaskType.Hide;
            case 10:
                return EventTaskType.Progress;
            case 11:
                return EventTaskType.Schedule;
            case 12:
                return EventTaskType.LockVisibility;
            case 13:
                return EventTaskType.UnlockVisibility;
            case 14:
                return EventTaskType.NotifyOpen;
            case 15:
                return EventTaskType.SimulateClick;
            case 16:
                return EventTaskType.OpenPrivacySheet;
            case 17:
                return EventTaskType.Repeat;
            case 18:
                return EventTaskType.ToggleStateGroups;
            default:
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.x
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParamsKt.toEventTaskType$lambda$8(taskName);
                    }
                });
                return null;
        }
    }

    public static final EventType toEventType(final Rendering.Phase.Event.EventName eventName) {
        if (eventName == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$5[eventName.ordinal()]) {
            case 1:
                return EventType.OnImpression;
            case 2:
                return EventType.OnClick;
            case 3:
                return EventType.OnProgress;
            case 4:
                return EventType.OnNavigate;
            case 5:
                return EventType.OnMute;
            case 6:
                return EventType.OnUnMute;
            case 7:
                return EventType.OnPause;
            case 8:
                return EventType.OnResume;
            case 9:
                return EventType.OnSkip;
            case 10:
                return EventType.OnClose;
            case 11:
                return EventType.OnStart;
            case 12:
                return EventType.OnFirstQuartile;
            case 13:
                return EventType.OnMidpoint;
            case 14:
                return EventType.OnThirdQuartile;
            case 15:
                return EventType.OnComplete;
            case 16:
                return EventType.OnUseCustomClose;
            case 17:
                return EventType.OnScheduled;
            default:
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.y
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParamsKt.toEventType$lambda$7(eventName);
                    }
                });
                return null;
        }
    }

    public static final Orientation toOrientation(final Rendering.Orientation orientation) {
        if (orientation == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            return Orientation.Portrait;
        }
        if (i10 == 2) {
            return Orientation.Landscape;
        }
        if (i10 == 3) {
            return null;
        }
        if (i10 == 4 || i10 == 5) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: df.v
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParamsKt.toOrientation$lambda$0(orientation);
                }
            });
            return null;
        }
        Logger.e((LazyValue<String>) new LazyValue() { // from class: df.w
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdaptiveRenderingParamsKt.toOrientation$lambda$1(orientation);
            }
        });
        return null;
    }

    public static final ScaleType toScaleType(final Rendering.Image.ScaleType scaleType) {
        if (scaleType == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$4[scaleType.ordinal()];
        if (i10 == 1) {
            return ScaleType.None;
        }
        if (i10 == 2) {
            return ScaleType.ToFill;
        }
        if (i10 == 3) {
            return ScaleType.AspectFill;
        }
        if (i10 == 4) {
            return ScaleType.AspectFit;
        }
        Logger.e((LazyValue<String>) new LazyValue() { // from class: df.t
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdaptiveRenderingParamsKt.toScaleType$lambda$6(scaleType);
            }
        });
        return null;
    }

    public static final SideType toSideType(final Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        if (anchor == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$3[anchor.ordinal()];
        if (i10 == 1) {
            return SideType.Left;
        }
        if (i10 == 2) {
            return SideType.Right;
        }
        if (i10 == 3) {
            return SideType.Top;
        }
        if (i10 == 4) {
            return SideType.Bottom;
        }
        Logger.e((LazyValue<String>) new LazyValue() { // from class: df.q
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return AdaptiveRenderingParamsKt.toSideType$lambda$5(anchor);
            }
        });
        return null;
    }

    public static final long getDurationMs(Rendering.AdaptiveAnimation.Timing timing) {
        p.j(timing, "<this>");
        return b.d(timing.getDuration() * ((double) 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toAdElementType$lambda$4(Rendering.Phase.ViewComponent.ViewComponentType viewComponentType) {
        return "Unsupported ViewComponentType - " + viewComponentType.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toCacheType$lambda$2(Rendering.CacheType cacheType) {
        return "Unsupported CacheType - " + cacheType.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toCacheType$lambda$3(Rendering.CacheType cacheType) {
        return "Unsupported CacheType - " + cacheType.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toEventTaskType$lambda$8(Rendering.Phase.Event.Task.TaskName taskName) {
        return "Unsupported TaskName - " + taskName.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toEventType$lambda$7(Rendering.Phase.Event.EventName eventName) {
        return "Unsupported EventName - " + eventName.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toOrientation$lambda$0(Rendering.Orientation orientation) {
        return "Unsupported Orientation - " + orientation.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toOrientation$lambda$1(Rendering.Orientation orientation) {
        return "Unsupported Orientation - " + orientation.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toScaleType$lambda$6(Rendering.Image.ScaleType scaleType) {
        return "Unsupported ScaleType - " + scaleType.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toSideType$lambda$5(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        return "Unsupported Anchor for SideType - " + anchor.name();
    }
}
