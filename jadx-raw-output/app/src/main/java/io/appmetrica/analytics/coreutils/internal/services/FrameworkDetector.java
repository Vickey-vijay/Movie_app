package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes11.dex */
public class FrameworkDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54751a = new FrameworkDetector().detectFramework();

    @NonNull
    public static String framework() {
        return f54751a;
    }

    public static boolean isNative() {
        return "native".equals(f54751a);
    }

    @NonNull
    @VisibleForTesting
    public String detectFramework() {
        if (ReflectionUtils.detectClassExists(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME)) {
            return "unity";
        }
        if (ReflectionUtils.detectClassExists("mono.MonoPackageManager")) {
            return PluginErrorDetails.Platform.XAMARIN;
        }
        if (ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin")) {
            return PluginErrorDetails.Platform.CORDOVA;
        }
        if (ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView")) {
            return "react";
        }
        return ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
    }

    @VisibleForTesting
    public FrameworkDetector() {
    }
}
