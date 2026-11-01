package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class PluginErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f58308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f58309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f58310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f58311f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f58312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f58313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f58314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f58315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f58316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f58317f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f58312a, this.f58313b, (List) WrapUtils.getOrDefault(this.f58314c, new ArrayList()), this.f58315d, this.f58316e, (Map) WrapUtils.getOrDefault(this.f58317f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String str) {
            this.f58312a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String str) {
            this.f58313b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String str) {
            this.f58315d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f58317f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.f58314c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String str) {
            this.f58316e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i10) {
        this(str, str2, list, str3, str4, map);
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f58306a = str;
        this.f58307b = str2;
        this.f58308c = new ArrayList(list);
        this.f58309d = str3;
        this.f58310e = str4;
        this.f58311f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }

    @Nullable
    public String getExceptionClass() {
        return this.f58306a;
    }

    @Nullable
    public String getMessage() {
        return this.f58307b;
    }

    @Nullable
    public String getPlatform() {
        return this.f58309d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f58311f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f58308c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.f58310e;
    }
}
