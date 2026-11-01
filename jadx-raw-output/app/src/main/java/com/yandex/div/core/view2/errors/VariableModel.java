package com.yandex.div.core.view2.errors;

import ck.p;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes3.dex */
final class VariableModel {
    private final String name;
    private final String path;
    private final String type;
    private final String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariableModel)) {
            return false;
        }
        VariableModel variableModel = (VariableModel) obj;
        return p.e(this.name, variableModel.name) && p.e(this.path, variableModel.path) && p.e(this.type, variableModel.type) && p.e(this.value, variableModel.value);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "VariableModel(name=" + this.name + ", path=" + this.path + ", type=" + this.type + ", value=" + this.value + ')';
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public VariableModel(String str, String str2, String str3, String str4) {
        this.name = str;
        this.path = str2;
        this.type = str3;
        this.value = str4;
    }
}
