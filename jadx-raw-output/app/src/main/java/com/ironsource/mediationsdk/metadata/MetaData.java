package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f29876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f29877c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f29875a = str;
        this.f29876b = list;
        this.f29877c = list2;
    }

    public String getMetaDataKey() {
        return this.f29875a;
    }

    public List<String> getMetaDataValue() {
        return this.f29876b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f29877c;
    }

    public MetaData(String str, List<String> list) {
        this.f29875a = str;
        this.f29876b = list;
        this.f29877c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f29877c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }
}
