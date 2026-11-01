package com.unity3d.services.core.misc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JsonFlattenerRules {
    public List<String> _reduceKeys;
    public List<String> _skipKeys;
    public List<String> _topLevelToInclude;

    public List<String> getReduceKeys() {
        return this._reduceKeys;
    }

    public List<String> getSkipKeys() {
        return this._skipKeys;
    }

    public List<String> getTopLevelToInclude() {
        return this._topLevelToInclude;
    }

    public JsonFlattenerRules(List<String> list, List<String> list2, List<String> list3) {
        this._topLevelToInclude = list;
        this._reduceKeys = list2;
        this._skipKeys = list3;
    }
}
