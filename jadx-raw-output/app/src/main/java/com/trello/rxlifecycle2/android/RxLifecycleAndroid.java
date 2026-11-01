package com.trello.rxlifecycle2.android;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.OutsideLifecycleException;
import com.trello.rxlifecycle2.RxLifecycle;
import com.trello.rxlifecycle2.internal.Preconditions;
import ii.k;
import oi.o;

/* JADX INFO: loaded from: classes11.dex */
public class RxLifecycleAndroid {
    private static final o<ActivityEvent, ActivityEvent> ACTIVITY_LIFECYCLE = new o<ActivityEvent, ActivityEvent>() { // from class: com.trello.rxlifecycle2.android.RxLifecycleAndroid.1
        @Override // oi.o
        public ActivityEvent apply(ActivityEvent activityEvent) throws Exception {
            switch (AnonymousClass3.$SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent[activityEvent.ordinal()]) {
                case 1:
                    return ActivityEvent.DESTROY;
                case 2:
                    return ActivityEvent.STOP;
                case 3:
                    return ActivityEvent.PAUSE;
                case 4:
                    return ActivityEvent.STOP;
                case 5:
                    return ActivityEvent.DESTROY;
                case 6:
                    throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + activityEvent + " not yet implemented");
            }
        }
    };
    private static final o<FragmentEvent, FragmentEvent> FRAGMENT_LIFECYCLE = new o<FragmentEvent, FragmentEvent>() { // from class: com.trello.rxlifecycle2.android.RxLifecycleAndroid.2
        @Override // oi.o
        public FragmentEvent apply(FragmentEvent fragmentEvent) throws Exception {
            switch (AnonymousClass3.$SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[fragmentEvent.ordinal()]) {
                case 1:
                    return FragmentEvent.DETACH;
                case 2:
                    return FragmentEvent.DESTROY;
                case 3:
                    return FragmentEvent.DESTROY_VIEW;
                case 4:
                    return FragmentEvent.STOP;
                case 5:
                    return FragmentEvent.PAUSE;
                case 6:
                    return FragmentEvent.STOP;
                case 7:
                    return FragmentEvent.DESTROY_VIEW;
                case 8:
                    return FragmentEvent.DESTROY;
                case 9:
                    return FragmentEvent.DETACH;
                case 10:
                    throw new OutsideLifecycleException("Cannot bind to Fragment lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + fragmentEvent + " not yet implemented");
            }
        }
    };

    /* JADX INFO: renamed from: com.trello.rxlifecycle2.android.RxLifecycleAndroid$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent;
        public static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent;

        static {
            int[] iArr = new int[FragmentEvent.values().length];
            $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent = iArr;
            try {
                iArr[FragmentEvent.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.DESTROY_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.DESTROY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$FragmentEvent[FragmentEvent.DETACH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[ActivityEvent.values().length];
            $SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent = iArr2;
            try {
                iArr2[ActivityEvent.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent[ActivityEvent.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent[ActivityEvent.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent[ActivityEvent.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent[ActivityEvent.STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle2$android$ActivityEvent[ActivityEvent.DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    @NonNull
    @CheckResult
    public static <T> LifecycleTransformer<T> bindActivity(@NonNull k<ActivityEvent> kVar) {
        return RxLifecycle.bind(kVar, ACTIVITY_LIFECYCLE);
    }

    @NonNull
    @CheckResult
    public static <T> LifecycleTransformer<T> bindFragment(@NonNull k<FragmentEvent> kVar) {
        return RxLifecycle.bind(kVar, FRAGMENT_LIFECYCLE);
    }

    private RxLifecycleAndroid() {
        throw new AssertionError("No instances");
    }

    @NonNull
    @CheckResult
    public static <T> LifecycleTransformer<T> bindView(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return RxLifecycle.bind(k.create(new ViewDetachesOnSubscribe(view)));
    }
}
