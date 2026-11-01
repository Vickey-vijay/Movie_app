package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f54361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f54362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f54363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f54364h;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f54366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f54367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f54368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f54369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap f54370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private HashMap f54371g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private HashMap f54372h;

        public /* synthetic */ Builder(int i10, int i11) {
            this(i10);
        }

        private Builder(int i10) {
            this.f54368d = 1;
            this.f54369e = Category.GENERAL;
            this.f54365a = i10;
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f54372h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f54369e = category;
            return this;
        }

        public Builder withEnvironment(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f54370f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f54371g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(@Nullable String str) {
            this.f54366b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i10) {
            this.f54368d = i10;
            return this;
        }

        public Builder withValue(@Nullable String str) {
            this.f54367c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i10) {
        this(builder);
    }

    private ModuleEvent(Builder builder) {
        this.f54357a = builder.f54365a;
        this.f54358b = builder.f54366b;
        this.f54359c = builder.f54367c;
        this.f54360d = builder.f54368d;
        this.f54361e = builder.f54369e;
        this.f54362f = CollectionUtils.getListFromMap(builder.f54370f);
        this.f54363g = CollectionUtils.getListFromMap(builder.f54371g);
        this.f54364h = CollectionUtils.getListFromMap(builder.f54372h);
    }

    public static Builder newBuilder(int i10) {
        return new Builder(i10, 0);
    }

    @Nullable
    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f54364h);
    }

    public Category getCategory() {
        return this.f54361e;
    }

    @Nullable
    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f54362f);
    }

    @Nullable
    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f54363g);
    }

    @Nullable
    public String getName() {
        return this.f54358b;
    }

    public int getServiceDataReporterType() {
        return this.f54360d;
    }

    public int getType() {
        return this.f54357a;
    }

    @Nullable
    public String getValue() {
        return this.f54359c;
    }

    @NonNull
    public String toString() {
        return "ModuleEvent{type=" + this.f54357a + ", name='" + this.f54358b + "', value='" + this.f54359c + "', serviceDataReporterType=" + this.f54360d + ", category=" + this.f54361e + ", environment=" + this.f54362f + ", extras=" + this.f54363g + ", attributes=" + this.f54364h + '}';
    }
}
