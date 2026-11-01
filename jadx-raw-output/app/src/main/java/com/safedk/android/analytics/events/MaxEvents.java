package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class MaxEvents extends ArrayList<MaxEvent> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44642a = "MaxEvents";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44643b;

    private MaxEvents() {
        this.f44643b = 10;
    }

    public MaxEvents(int capacity) {
        this.f44643b = 10;
        this.f44643b = capacity;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(MaxEvent maxEvent) {
        if (size() >= this.f44643b) {
            remove(0);
        }
        return super.add(maxEvent);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, MaxEvent maxEvent) {
        super.add(i10, maxEvent);
    }

    public ArrayList<Bundle> a() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Iterator<MaxEvent> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        Logger.d(f44642a, "MaxEvents toBundle : " + arrayList.toString());
        return arrayList;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<MaxEvent> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString() + StringUtils.COMMA);
        }
        return sb2.toString();
    }
}
