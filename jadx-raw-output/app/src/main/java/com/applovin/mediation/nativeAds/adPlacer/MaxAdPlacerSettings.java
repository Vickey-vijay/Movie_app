package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f10373c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10374d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10375e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10376f = 4;

    public void addFixedPosition(int i10) {
        this.f10373c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f10371a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f10373c;
    }

    public int getMaxAdCount() {
        return this.f10375e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f10376f;
    }

    @Nullable
    public String getPlacement() {
        return this.f10372b;
    }

    public int getRepeatingInterval() {
        return this.f10374d;
    }

    public boolean hasValidPositioning() {
        return !this.f10373c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f10374d >= 2;
    }

    public void resetFixedPositions() {
        this.f10373c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f10375e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f10376f = i10;
    }

    public void setPlacement(@Nullable String str) {
        this.f10372b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f10374d = i10;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f10374d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f10371a + "', fixedPositions=" + this.f10373c + ", repeatingInterval=" + this.f10374d + ", maxAdCount=" + this.f10375e + ", maxPreloadedAdCount=" + this.f10376f + '}';
    }

    public MaxAdPlacerSettings(String str) {
        this.f10371a = str;
    }
}
