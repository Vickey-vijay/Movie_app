package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: ImmLeaksCleaner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static final Companion Companion = new Companion(null);
    private static final mj.g<Cleaner> cleaner$delegate = kotlin.b.a(new bk.a<Cleaner>() { // from class: androidx.activity.ImmLeaksCleaner$Companion$cleaner$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ImmLeaksCleaner.Cleaner invoke() {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                ck.p.i(declaredField3, "hField");
                ck.p.i(declaredField, "servedViewField");
                ck.p.i(declaredField2, "nextServedViewField");
                return new ImmLeaksCleaner.ValidCleaner(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return ImmLeaksCleaner.FailedInitialization.INSTANCE;
            }
        }
    });
    private final Activity activity;

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    public static abstract class Cleaner {
        private Cleaner() {
        }

        public /* synthetic */ Cleaner(ck.i iVar) {
            this();
        }

        public abstract boolean clearNextServedView(InputMethodManager inputMethodManager);

        public abstract Object getLock(InputMethodManager inputMethodManager);

        public abstract View getServedView(InputMethodManager inputMethodManager);
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    public static final class FailedInitialization extends Cleaner {
        public static final FailedInitialization INSTANCE = new FailedInitialization();

        private FailedInitialization() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(InputMethodManager inputMethodManager) {
            ck.p.j(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            ck.p.j(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            ck.p.j(inputMethodManager, "<this>");
            return null;
        }
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    public static final class ValidCleaner extends Cleaner {
        private final Field hField;
        private final Field nextServedViewField;
        private final Field servedViewField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidCleaner(Field field, Field field2, Field field3) {
            super(null);
            ck.p.j(field, "hField");
            ck.p.j(field2, "servedViewField");
            ck.p.j(field3, "nextServedViewField");
            this.hField = field;
            this.servedViewField = field2;
            this.nextServedViewField = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(InputMethodManager inputMethodManager) {
            ck.p.j(inputMethodManager, "<this>");
            try {
                this.nextServedViewField.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public Object getLock(InputMethodManager inputMethodManager) {
            ck.p.j(inputMethodManager, "<this>");
            try {
                return this.hField.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public View getServedView(InputMethodManager inputMethodManager) {
            ck.p.j(inputMethodManager, "<this>");
            try {
                return (View) this.servedViewField.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final Cleaner getCleaner() {
            return (Cleaner) ImmLeaksCleaner.cleaner$delegate.getValue();
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.activity = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ck.p.j(lifecycleOwner, "source");
        ck.p.j(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        Object systemService = this.activity.getSystemService("input_method");
        ck.p.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Cleaner cleaner = Companion.getCleaner();
        Object lock = cleaner.getLock(inputMethodManager);
        if (lock == null) {
            return;
        }
        synchronized (lock) {
            View servedView = cleaner.getServedView(inputMethodManager);
            if (servedView == null) {
                return;
            }
            if (servedView.isAttachedToWindow()) {
                return;
            }
            boolean zClearNextServedView = cleaner.clearNextServedView(inputMethodManager);
            if (zClearNextServedView) {
                inputMethodManager.isActive();
            }
        }
    }
}
