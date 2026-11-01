package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TextFormatParseInfoTree {
    private Map<Descriptors.FieldDescriptor, List<TextFormatParseLocation>> locationsFromField;
    public Map<Descriptors.FieldDescriptor, List<TextFormatParseInfoTree>> subtreesFromField;

    public static class Builder {
        private Map<Descriptors.FieldDescriptor, List<TextFormatParseLocation>> locationsFromField;
        private Map<Descriptors.FieldDescriptor, List<Builder>> subtreeBuildersFromField;

        private Builder() {
            this.locationsFromField = new HashMap();
            this.subtreeBuildersFromField = new HashMap();
        }

        public TextFormatParseInfoTree build() {
            return new TextFormatParseInfoTree(this.locationsFromField, this.subtreeBuildersFromField);
        }

        public Builder getBuilderForSubMessageField(Descriptors.FieldDescriptor fieldDescriptor) {
            List<Builder> arrayList = this.subtreeBuildersFromField.get(fieldDescriptor);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.subtreeBuildersFromField.put(fieldDescriptor, arrayList);
            }
            Builder builder = new Builder();
            arrayList.add(builder);
            return builder;
        }

        public Builder setLocation(Descriptors.FieldDescriptor fieldDescriptor, TextFormatParseLocation textFormatParseLocation) {
            List<TextFormatParseLocation> arrayList = this.locationsFromField.get(fieldDescriptor);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.locationsFromField.put(fieldDescriptor, arrayList);
            }
            arrayList.add(textFormatParseLocation);
            return this;
        }
    }

    private TextFormatParseInfoTree(Map<Descriptors.FieldDescriptor, List<TextFormatParseLocation>> map, Map<Descriptors.FieldDescriptor, List<Builder>> map2) {
        HashMap map3 = new HashMap();
        for (Map.Entry<Descriptors.FieldDescriptor, List<TextFormatParseLocation>> entry : map.entrySet()) {
            map3.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        this.locationsFromField = Collections.unmodifiableMap(map3);
        HashMap map4 = new HashMap();
        for (Map.Entry<Descriptors.FieldDescriptor, List<Builder>> entry2 : map2.entrySet()) {
            ArrayList arrayList = new ArrayList();
            Iterator<Builder> it = entry2.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().build());
            }
            map4.put(entry2.getKey(), Collections.unmodifiableList(arrayList));
        }
        this.subtreesFromField = Collections.unmodifiableMap(map4);
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<TextFormatParseLocation> getLocations(Descriptors.FieldDescriptor fieldDescriptor) {
        List<TextFormatParseLocation> list = this.locationsFromField.get(fieldDescriptor);
        return list == null ? Collections.emptyList() : list;
    }

    public List<TextFormatParseInfoTree> getNestedTrees(Descriptors.FieldDescriptor fieldDescriptor) {
        List<TextFormatParseInfoTree> list = this.subtreesFromField.get(fieldDescriptor);
        return list == null ? Collections.emptyList() : list;
    }

    private static <T> T getFromList(List<T> list, int i10, Descriptors.FieldDescriptor fieldDescriptor) {
        String name;
        if (i10 < list.size() && i10 >= 0) {
            return list.get(i10);
        }
        Object[] objArr = new Object[2];
        if (fieldDescriptor == null) {
            name = "<null>";
        } else {
            name = fieldDescriptor.getName();
        }
        objArr[0] = name;
        objArr[1] = Integer.valueOf(i10);
        throw new IllegalArgumentException(String.format("Illegal index field: %s, index %d", objArr));
    }

    public TextFormatParseLocation getLocation(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        return (TextFormatParseLocation) getFromList(getLocations(fieldDescriptor), i10, fieldDescriptor);
    }

    public TextFormatParseInfoTree getNestedTree(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        return (TextFormatParseInfoTree) getFromList(getNestedTrees(fieldDescriptor), i10, fieldDescriptor);
    }
}
