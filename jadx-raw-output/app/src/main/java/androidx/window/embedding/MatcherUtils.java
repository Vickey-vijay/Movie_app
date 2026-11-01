package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.window.core.ExperimentalWindowApi;
import ck.p;
import kotlin.Metadata;
import lk.a0;
import lk.x;

/* JADX INFO: compiled from: MatcherUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u001f\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "()V", "sDebugMatchers", "", "sMatchersTag", "", "areActivityOrIntentComponentsMatching", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "ruleComponent", "Landroid/content/ComponentName;", "areActivityOrIntentComponentsMatching$window_release", "areComponentsMatching", "activityComponent", "areComponentsMatching$window_release", "wildcardMatch", "name", "pattern", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String name, String pattern) {
        if (!a0.X(pattern, "*", false, 2, null)) {
            return false;
        }
        if (p.e(pattern, "*")) {
            return true;
        }
        if (!(a0.l0(pattern, "*", 0, false, 6, null) == a0.r0(pattern, "*", 0, false, 6, null) && x.D(pattern, "*", false, 2, null))) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        String strSubstring = pattern.substring(0, pattern.length() - 1);
        p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return x.R(name, strSubstring, false, 2, null);
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName ruleComponent) {
        ComponentName component;
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    public final boolean areComponentsMatching$window_release(ComponentName activityComponent, ComponentName ruleComponent) {
        boolean z10;
        boolean z11;
        p.j(ruleComponent, "ruleComponent");
        if (activityComponent == null) {
            return p.e(ruleComponent.getPackageName(), "*") && p.e(ruleComponent.getClassName(), "*");
        }
        String string = activityComponent.toString();
        p.i(string, "activityComponent.toString()");
        if (!(!a0.X(string, "*", false, 2, null))) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        if (p.e(activityComponent.getPackageName(), ruleComponent.getPackageName())) {
            z10 = true;
        } else {
            String packageName = activityComponent.getPackageName();
            p.i(packageName, "activityComponent.packageName");
            String packageName2 = ruleComponent.getPackageName();
            p.i(packageName2, "ruleComponent.packageName");
            if (wildcardMatch(packageName, packageName2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (p.e(activityComponent.getClassName(), ruleComponent.getClassName())) {
            z11 = true;
        } else {
            String className = activityComponent.getClassName();
            p.i(className, "activityComponent.className");
            String className2 = ruleComponent.getClassName();
            p.i(className2, "ruleComponent.className");
            if (wildcardMatch(className, className2)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z10 && z11;
    }
}
