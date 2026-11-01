package me.goldze.mvvmhabit.crash;

import android.app.Activity;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class CaocConfig implements Serializable {
    public static final int BACKGROUND_MODE_CRASH = 2;
    public static final int BACKGROUND_MODE_SHOW_CUSTOM = 1;
    public static final int BACKGROUND_MODE_SILENT = 0;
    private int backgroundMode = 1;
    private boolean enabled = true;
    private boolean showErrorDetails = true;
    private boolean showRestartButton = true;
    private boolean trackActivities = false;
    private int minTimeBetweenCrashesMs = 3000;
    private Integer errorDrawable = null;
    private Class<? extends Activity> errorActivityClass = null;
    private Class<? extends Activity> restartActivityClass = null;
    private CustomActivityOnCrash.EventListener eventListener = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CaocConfig f64445a;

        @NonNull
        public static a c() {
            a aVar = new a();
            CaocConfig caocConfigS = CustomActivityOnCrash.s();
            CaocConfig caocConfig = new CaocConfig();
            caocConfig.backgroundMode = caocConfigS.backgroundMode;
            caocConfig.enabled = caocConfigS.enabled;
            caocConfig.showErrorDetails = caocConfigS.showErrorDetails;
            caocConfig.showRestartButton = caocConfigS.showRestartButton;
            caocConfig.trackActivities = caocConfigS.trackActivities;
            caocConfig.minTimeBetweenCrashesMs = caocConfigS.minTimeBetweenCrashesMs;
            caocConfig.errorDrawable = caocConfigS.errorDrawable;
            caocConfig.errorActivityClass = caocConfigS.errorActivityClass;
            caocConfig.restartActivityClass = caocConfigS.restartActivityClass;
            caocConfig.eventListener = caocConfigS.eventListener;
            aVar.f64445a = caocConfig;
            return aVar;
        }

        public void a() {
            CustomActivityOnCrash.J(this.f64445a);
        }

        @NonNull
        public a b(int i10) {
            this.f64445a.backgroundMode = i10;
            return this;
        }

        @NonNull
        public a d(boolean z10) {
            this.f64445a.enabled = z10;
            return this;
        }

        @NonNull
        public a e(@Nullable @DrawableRes Integer num) {
            this.f64445a.errorDrawable = num;
            return this;
        }

        @NonNull
        public a f(int i10) {
            this.f64445a.minTimeBetweenCrashesMs = i10;
            return this;
        }

        @NonNull
        public a g(boolean z10) {
            this.f64445a.showErrorDetails = z10;
            return this;
        }

        @NonNull
        public a h(boolean z10) {
            this.f64445a.showRestartButton = z10;
            return this;
        }

        @NonNull
        public a i(boolean z10) {
            this.f64445a.trackActivities = z10;
            return this;
        }
    }

    public int getBackgroundMode() {
        return this.backgroundMode;
    }

    @Nullable
    public Class<? extends Activity> getErrorActivityClass() {
        return this.errorActivityClass;
    }

    @Nullable
    @DrawableRes
    public Integer getErrorDrawable() {
        return this.errorDrawable;
    }

    @Nullable
    public CustomActivityOnCrash.EventListener getEventListener() {
        return this.eventListener;
    }

    public int getMinTimeBetweenCrashesMs() {
        return this.minTimeBetweenCrashesMs;
    }

    @Nullable
    public Class<? extends Activity> getRestartActivityClass() {
        return this.restartActivityClass;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isShowErrorDetails() {
        return this.showErrorDetails;
    }

    public boolean isShowRestartButton() {
        return this.showRestartButton;
    }

    public boolean isTrackActivities() {
        return this.trackActivities;
    }

    public void setBackgroundMode(int i10) {
        this.backgroundMode = i10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setErrorActivityClass(@Nullable Class<? extends Activity> cls) {
        this.errorActivityClass = cls;
    }

    public void setErrorDrawable(@Nullable @DrawableRes Integer num) {
        this.errorDrawable = num;
    }

    public void setEventListener(@Nullable CustomActivityOnCrash.EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void setMinTimeBetweenCrashesMs(int i10) {
        this.minTimeBetweenCrashesMs = i10;
    }

    public void setRestartActivityClass(@Nullable Class<? extends Activity> cls) {
        this.restartActivityClass = cls;
    }

    public void setShowErrorDetails(boolean z10) {
        this.showErrorDetails = z10;
    }

    public void setShowRestartButton(boolean z10) {
        this.showRestartButton = z10;
    }

    public void setTrackActivities(boolean z10) {
        this.trackActivities = z10;
    }
}
