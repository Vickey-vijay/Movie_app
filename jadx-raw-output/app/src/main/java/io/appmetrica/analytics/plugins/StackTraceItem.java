package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f58319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f58320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f58321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f58322e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f58323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f58324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f58325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f58326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f58327e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f58323a, this.f58324b, this.f58325c, this.f58326d, this.f58327e, 0);
        }

        @NonNull
        public Builder withClassName(@Nullable String str) {
            this.f58323a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer num) {
            this.f58326d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String str) {
            this.f58324b = str;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer num) {
            this.f58325c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String str) {
            this.f58327e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i10) {
        this(str, str2, num, num2, str3);
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f58318a = str;
        this.f58319b = str2;
        this.f58320c = num;
        this.f58321d = num2;
        this.f58322e = str3;
    }

    @Nullable
    public String getClassName() {
        return this.f58318a;
    }

    @Nullable
    public Integer getColumn() {
        return this.f58321d;
    }

    @Nullable
    public String getFileName() {
        return this.f58319b;
    }

    @Nullable
    public Integer getLine() {
        return this.f58320c;
    }

    @Nullable
    public String getMethodName() {
        return this.f58322e;
    }
}
