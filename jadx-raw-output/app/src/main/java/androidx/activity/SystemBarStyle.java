package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final bk.l<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* JADX INFO: compiled from: EdgeToEdge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11) {
            return auto$default(this, i10, i11, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i10, int i11, bk.l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                lVar = new bk.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // bk.l
                    public final Boolean invoke(Resources resources) {
                        ck.p.j(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i10, i11, lVar);
        }

        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, bk.l<? super Resources, Boolean> lVar) {
            ck.p.j(lVar, "detectDarkMode");
            return new SystemBarStyle(i10, i11, 0, lVar, null);
        }

        public final SystemBarStyle dark(@ColorInt int i10) {
            return new SystemBarStyle(i10, i10, 2, new bk.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // bk.l
                public final Boolean invoke(Resources resources) {
                    ck.p.j(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            }, null);
        }

        public final SystemBarStyle light(@ColorInt int i10, @ColorInt int i11) {
            return new SystemBarStyle(i10, i11, 1, new bk.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // bk.l
                public final Boolean invoke(Resources resources) {
                    ck.p.j(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            }, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i10, int i11, int i12, bk.l<? super Resources, Boolean> lVar) {
        this.lightScrim = i10;
        this.darkScrim = i11;
        this.nightMode = i12;
        this.detectDarkMode = lVar;
    }

    public /* synthetic */ SystemBarStyle(int i10, int i11, int i12, bk.l lVar, ck.i iVar) {
        this(i10, i11, i12, lVar);
    }

    public static final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11) {
        return Companion.auto(i10, i11);
    }

    public static final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, bk.l<? super Resources, Boolean> lVar) {
        return Companion.auto(i10, i11, lVar);
    }

    public static final SystemBarStyle dark(@ColorInt int i10) {
        return Companion.dark(i10);
    }

    public static final SystemBarStyle light(@ColorInt int i10, @ColorInt int i11) {
        return Companion.light(i10, i11);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final bk.l<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z10) {
        return z10 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z10) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z10 ? this.darkScrim : this.lightScrim;
    }
}
