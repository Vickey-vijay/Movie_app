package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import ck.p;
import kotlin.Metadata;
import lk.a0;

/* JADX INFO: compiled from: SplitPairFilter.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;

    /* JADX INFO: renamed from: secondaryActivityIntentAction, reason: from kotlin metadata and from toString */
    private final String secondaryActivityAction;
    private final ComponentName secondaryActivityName;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) other;
        return p.e(this.primaryActivityName, splitPairFilter.primaryActivityName) && p.e(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && p.e(this.secondaryActivityAction, splitPairFilter.secondaryActivityAction);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    public SplitPairFilter(ComponentName componentName, ComponentName componentName2, String str) {
        boolean z10;
        boolean z11;
        Object obj;
        int i10;
        CharSequence charSequence;
        boolean z12;
        String str2;
        boolean z13;
        boolean z14;
        p.j(componentName, "primaryActivityName");
        p.j(componentName2, "secondaryActivityName");
        this.primaryActivityName = componentName;
        this.secondaryActivityName = componentName2;
        this.secondaryActivityAction = str;
        String packageName = componentName.getPackageName();
        p.i(packageName, "primaryActivityName.packageName");
        String className = componentName.getClassName();
        p.i(className, "primaryActivityName.className");
        String packageName2 = componentName2.getPackageName();
        p.i(packageName2, "secondaryActivityName.packageName");
        String className2 = componentName2.getClassName();
        p.i(className2, "secondaryActivityName.className");
        boolean z15 = true;
        if (packageName.length() == 0) {
            z10 = false;
        } else {
            if (packageName2.length() == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (className.length() == 0) {
            z11 = false;
        } else {
            if (className2.length() == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (!z11) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!a0.X(packageName, "*", false, 2, null) || a0.l0(packageName, "*", 0, false, 6, null) == packageName.length() + (-1))) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (a0.X(className, "*", false, 2, null)) {
            obj = null;
            i10 = 2;
            charSequence = "*";
            z12 = false;
            str2 = className2;
            if (a0.l0(className, "*", 0, false, 6, null) != className.length() - 1) {
                z13 = false;
            }
            if (z13) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
            }
            if (a0.X(packageName2, charSequence, z12, i10, obj) || a0.l0(packageName2, "*", 0, false, 6, null) == packageName2.length() - 1) {
                z14 = true;
            } else {
                z14 = z12;
            }
            if (z14) {
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            if (a0.X(str2, charSequence, z12, i10, obj) && a0.l0(str2, "*", 0, false, 6, null) != str2.length() - 1) {
                z15 = z12;
            }
            if (z15) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
            }
        }
        obj = null;
        i10 = 2;
        charSequence = "*";
        z12 = false;
        str2 = className2;
        z13 = true;
        if (z13) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
        if (a0.X(packageName2, charSequence, z12, i10, obj)) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (z14) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (a0.X(str2, charSequence, z12, i10, obj)) {
            z15 = z12;
        }
        if (z15) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    /* JADX INFO: renamed from: getSecondaryActivityIntentAction, reason: from getter */
    public final String getSecondaryActivityAction() {
        return this.secondaryActivityAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int iHashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        p.j(primaryActivity, "primaryActivity");
        p.j(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityAction;
        return str == null || p.e(str, secondaryActivityIntent.getAction());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        boolean z10;
        p.j(primaryActivity, "primaryActivity");
        p.j(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z11 = matcherUtils.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z11;
        }
        if (z11) {
            Intent intent = secondaryActivity.getIntent();
            p.i(intent, "secondaryActivity.intent");
            z10 = matchesActivityIntentPair(primaryActivity, intent);
        }
        return z10;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityAction) + '}';
    }
}
