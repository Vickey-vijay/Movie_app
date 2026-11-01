package io.appmetrica.analytics.modulesapi.internal.common;

import ck.i;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0003#$\"J\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002J\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002J\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent;", "", "", "", "getEnvironment", "", "getExtras", "getAttributes", "toString", "", "a", "I", "getType", "()I", "type", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "getValue", "value", "d", "Ljava/lang/Integer;", "getServiceDataReporterType", "()Ljava/lang/Integer;", "serviceDataReporterType", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "e", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "getCategory", "()Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "category", VastTagName.COMPANION, "Builder", "Category", "modules-api_release"}, k = 1, mv = {1, 6, 0})
public final class InternalModuleEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer serviceDataReporterType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Category category;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f58182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f58183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f58184h;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001c\u0010\u000f\u001a\u00020\u00002\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rJ\u001c\u0010\u0012\u001a\u00020\u00002\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rJ\u001c\u0010\u0014\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rJ\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u001a\u0010\u001b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106¨\u0006?"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Builder;", "", "", "name", "withName", "value", "withValue", "", "serviceDataReporterType", "withServiceDataReporterType", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "category", "withCategory", "", "environment", "withEnvironment", "", "extras", "withExtras", "attributes", "withAttributes", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent;", BillingClientBuilderBridgeCommon.buildMethodName, "a", "I", "getType$modules_api_release", "()I", "type", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "c", "getValue", "setValue", "d", "Ljava/lang/Integer;", "getServiceDataReporterType", "()Ljava/lang/Integer;", "setServiceDataReporterType", "(Ljava/lang/Integer;)V", "e", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "getCategory", "()Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "setCategory", "(Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;)V", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/Map;", "getEnvironment", "()Ljava/util/Map;", "setEnvironment", "(Ljava/util/Map;)V", "g", "getExtras", "setExtras", "h", "getAttributes", "setAttributes", "<init>", "(I)V", "modules-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String value;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Integer serviceDataReporterType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Category category;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Map environment;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Map extras;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Map attributes;

        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        public final Category getCategory() {
            return this.category;
        }

        public final Map<String, Object> getEnvironment() {
            return this.environment;
        }

        public final Map<String, byte[]> getExtras() {
            return this.extras;
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getServiceDataReporterType() {
            return this.serviceDataReporterType;
        }

        /* JADX INFO: renamed from: getType$modules_api_release, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public final void setAttributes(Map<String, ? extends Object> map) {
            this.attributes = map;
        }

        public final void setCategory(Category category) {
            this.category = category;
        }

        public final void setEnvironment(Map<String, ? extends Object> map) {
            this.environment = map;
        }

        public final void setExtras(Map<String, byte[]> map) {
            this.extras = map;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setServiceDataReporterType(Integer num) {
            this.serviceDataReporterType = num;
        }

        public final void setValue(String str) {
            this.value = str;
        }

        public final Builder withAttributes(Map<String, ? extends Object> attributes) {
            if (attributes != null) {
                this.attributes = new HashMap(attributes);
            }
            return this;
        }

        public final Builder withCategory(Category category) {
            this.category = category;
            return this;
        }

        public final Builder withEnvironment(Map<String, ? extends Object> environment) {
            if (environment != null) {
                this.environment = new HashMap(environment);
            }
            return this;
        }

        public final Builder withExtras(Map<String, byte[]> extras) {
            if (extras != null) {
                this.extras = new HashMap(extras);
            }
            return this;
        }

        public final Builder withName(String name) {
            this.name = name;
            return this;
        }

        public final Builder withValue(String value) {
            this.value = value;
            return this;
        }

        public Builder(int i10) {
            this.type = i10;
        }

        public final Builder withServiceDataReporterType(int serviceDataReporterType) {
            this.serviceDataReporterType = Integer.valueOf(serviceDataReporterType);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Category;", "", "GENERAL", "SYSTEM", "modules-api_release"}, k = 1, mv = {1, 6, 0})
    public enum Category {
        GENERAL,
        SYSTEM
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Companion;", "", "", "type", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent$Builder;", "newBuilder", "modules-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private Companion() {
        }

        public final Builder newBuilder(int type) {
            return new Builder(type);
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, i iVar) {
        this(builder);
    }

    public static final Builder newBuilder(int i10) {
        return INSTANCE.newBuilder(i10);
    }

    private InternalModuleEvent(Builder builder) {
        this.type = builder.getType();
        this.name = builder.getName();
        this.value = builder.getValue();
        this.serviceDataReporterType = builder.getServiceDataReporterType();
        this.category = builder.getCategory();
        this.f58182f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f58183g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f58184h = CollectionUtils.getListFromMap(builder.getAttributes());
    }

    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f58184h);
    }

    public final Category getCategory() {
        return this.category;
    }

    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f58182f);
    }

    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f58183g);
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getServiceDataReporterType() {
        return this.serviceDataReporterType;
    }

    public final int getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.type + ", name='" + this.name + "', value='" + this.value + "', serviceDataReporterType=" + this.serviceDataReporterType + ", category=" + this.category + ", environment=" + this.f58182f + ", extras=" + this.f58183g + ", attributes=" + this.f58184h + '}';
    }
}
